package com.techm.ReqResp.stepDefs;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.techm.ReqResp.pageobjects.HomePage;
import com.techm.ReqResp.pageobjects.SupportPage;
import com.techm.ReqResp.utils.DriverSetup;
import com.techm.ReqResp.utils.FileComparison;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;



public class StepDefinition {
		
	private WebDriver driver;	
	
	SupportPage objSupportPage;
	HomePage objHomePage;

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
	
	@When("user calls {string} http request verifies {string} in response as {string}")
	public void user_calls_http_request_verifies_in_response_as(String methodType, String attribute, String value) {
		 
		RestAssured.baseURI = "https://reqres.in";
		JsonPath objJsonPath;
		
	        Response response;
	               
	               if(methodType.equals("get")) {
	            	   response=given()
                       .when()
	                        .get("/api/users/2").then()
	                        .statusCode(200)
	                        .extract().response();           	   
	            	   
	            	   System.out.println(response.asString());
	            	   
	            	   objJsonPath=new JsonPath(response.asString());
	            	   assertEquals(objJsonPath.getString(attribute), String.valueOf(value));	   
	            	   
	            	   
	               } else {
	            	   response=given()
	                          .when()
	                          .body("{\r\n"
	                          		+ " \"name\": \r\n"
	                          		+ "\"morpheus\",\r\n"
	                          		+ " \"job\": \r\n"
	                          		+ "\"leader\"\r\n"
	                          		+ "}\r\n"
	                          		+ "")
	    	                       .post("/api/users")    	                       
	    	                       .then()
	    	                        .statusCode(201)
	    	                        .extract().response(); 
	            	   
	            	   System.out.println(response.asString());
	    	            	   
	    	            	   objJsonPath=new JsonPath(response.asString());
	    	            	   assertEquals(objJsonPath.getString(attribute), String.valueOf(value));
	               }
	                        
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
