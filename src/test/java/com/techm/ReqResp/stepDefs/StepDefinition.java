package com.techm.ReqResp.stepDefs;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.techm.ReqResp.pageobjects.HomePage;
import com.techm.ReqResp.pageobjects.SupportPage;
import com.techm.ReqResp.utils.DriverSetup;
import com.techm.ReqResp.utils.FileComparison;
import com.techm.ReqResp.utils.Payload;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class StepDefinition {
	
	private static final Logger logger = LogManager.getLogger(StepDefinition.class);
	
	private WebDriver driver;	
	static String getUri="/api/users/";
	
	SupportPage objSupportPage;
	HomePage objHomePage;
	RequestSpecification reqSpec;
	ResponseSpecification respSpec;
	Response response;
	
	@Given("AddUserPayload")
	public void adduserpayload() {
	    // Write code here that turns the phrase above into concrete actions
		reqSpec = given().log().all().spec(getRequestSpecBuilder()).body(Payload.addPayload());
	}

	@When("user calls {string} http request")
	public void user_calls_http_request(String string) {
		if(string.equals("get")) {
			response=reqSpec.when().get(getUri);
		} else {
			response=reqSpec.when().post("/api/users");
		}		
	}

	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
		response.then().statusCode(int1);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String attributename, String attributevalue) {	
		JsonPath objJsonPath=new JsonPath(response.body().asString());
		if(attributename.contains("id")) {
			assertEquals(objJsonPath.getString("data."+attributename), attributevalue);
		} else {
			assertEquals(objJsonPath.getString(attributename), attributevalue);		
		}		
	}
	
	@Given("PathParameter {int}")
	public void pathparameter(Integer int1) {
		reqSpec =given().log().all().spec(getRequestSpecBuilder());
		getUri+="2";
	}
	
	public RequestSpecification getRequestSpecBuilder() {
		RequestSpecification objSpecBuiler = null;
		try {
			PrintStream objPrintStream = new PrintStream(new FileOutputStream("logging.txt"));
			objSpecBuiler = new RequestSpecBuilder().setBaseUri("https://reqres.in")
					 .addFilter(RequestLoggingFilter.logRequestTo(objPrintStream))
					.addFilter(ResponseLoggingFilter.logResponseTo(objPrintStream)).setContentType("application/json")
					.build();
			return objSpecBuiler;
		} catch (FileNotFoundException e) {
		}
		return objSpecBuiler;
	}

	@Given("{string} browser is opened")
	public void browser_is_opened(String browser) {
		driver=DriverSetup.getDriver(browser);
	}

	@When("user opens application url in the browser")
	public void user_opens_application_url_in_the_browser() {
		driver.get("https://reqres.in");
		objHomePage=new HomePage(driver);
	}
	
	@Then("user sees Support button is displayed")
	public void user_sees_Support_button_is_displayed() {		
		objHomePage.isSupportReqRespHomePageButton();
	}	

	@Then("user sees different request endpoints")
	public void user_sees_different_request_endpoints() {
	    
	}

	@Then("user click on {string} with {string} http request")
	public void user_click_on_with_http_request(String name, String requestType) {
		objHomePage.clickEachMethodAndVerify(requestType.toLowerCase(),name.trim());
	}	
		

	@Then("users sees {string} and {string} and {string}")
	public void users_sees_and_and(String request, String responseCode, String response) {
		System.out.println("request=>"+request+",requestType=>"+responseCode+"response,"+response+"");
		objHomePage.verifyDetailsForEachMethod(request,responseCode,response);
	}
	
	@Then("user click on SupportReqResp button")
	public void user_click_on_SupportReqResp_button() {
		objHomePage.clickSupportReqRespHomePageButton();
		objSupportPage=new SupportPage(driver);
	}

	@Then("user sees one time support option")
	public void user_sees_one_time_support_option() {
		objSupportPage.isOneTimeRadioButtonDisplayed();
		objSupportPage.isOneTimeInputBoxDisplayed();
	}

	@Then("sees monthlysupport option")
	public void sees_monthlysupport_option() {
		objSupportPage.isSupportMonthlyRadioButtonDisplayed();		
	}

	@Then("sees SupportReqResp button to upgrade")
	public void sees_SupportReqResp_button_to_upgrade() {
		objSupportPage.isSupportReqRespButtonDisplayed();
	}	
	
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
		
	}
	
	
	@Given("Files {string} and {string}")
	public void files_and(String string, String string2) {
	   System.out.println("File=>"+string+" and "+ string2+" are uploaded in /app/in");
	}

	@When("processed in the system")
	public void processed_in_the_system() {
		System.out.println("Files are processed in the system and creates output in /app/out");
	}

	@Then("verify {string} file")
	public void verify_file(String string) {
	   FileComparison.compareTwoFiles();
	}

}
