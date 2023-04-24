package com.techm.ReqResp.pageobjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.techm.ReqResp.utils.RespositoryParser;

import io.restassured.path.json.JsonPath;

public class HomePage extends BaseClass {
	
    private WebDriver driver;
	
	private RespositoryParser parser;
	
	public HomePage(WebDriver driver){
		super(driver);
		this.driver=driver;
		try {
			parser=new RespositoryParser("HomePage.properties");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void isSupportReqRespHomePageButton() {
		assertTrue(isElementDisplayed(parser.getObjectLocator("supportReqRespHomePageButton")));
	}
	
	public void clickSupportReqRespHomePageButton() {
		clickElement(parser.getObjectLocator("supportReqRespHomePageButton"));
	}
	
	public void clickEachMethodAndVerify(String methodType,String value) {
			WebElement linkToBeClicked= driver.findElement(By.xpath("//section[@id='console']//ul//li[@data-http='"+methodType+"']/child::a[contains(text(),'"+value+"')]"));
			scrollIntoView(linkToBeClicked);		
			linkToBeClicked.click();					
			
		}
	
	public void verifyDetailsForEachMethod(String reqUrl,String respStatusCode,String valueToBeVerifiedInResponse) {
		WebElement response= driver.findElement(By.xpath("//div[@class='output']//div[@class='response']//span[@class='response-code']"));
		assertEquals(respStatusCode,response.getText());
		scrollIntoView(response);
		
		WebElement responseJson=driver.findElement(By.xpath("//div[@class='output']//div[@class='response']//pre[@data-key='output-response']"));
		String jsonOutput=responseJson.getText().toString();

		WebElement reqUrlem=driver.findElement(By.xpath("//div[@class='request']//a/span"));
		assertEquals(reqUrl, reqUrlem.getText().trim());		
		
		JsonPath objJsonPath=new JsonPath(jsonOutput);
		
		if(!valueToBeVerifiedInResponse.contains("{}")) {
			assertEquals(String.valueOf(objJsonPath.get(valueToBeVerifiedInResponse.split(",")[0])), valueToBeVerifiedInResponse.split(",")[1]);
		}	
	
	}	
	
	
	

}
