package com.techm.ReqResp.pageobjects;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.techm.ReqResp.utils.RespositoryParser;

public class SupportPage extends BaseClass {
	
	private WebDriver driver;
	
	private RespositoryParser parser;
	
	public SupportPage(WebDriver driver){
		super(driver);
		this.driver=driver;
		try {
			parser=new RespositoryParser("SupportPage.properties");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}			
	
	public void isOneTimeRadioButtonDisplayed() {
		assertTrue(isElementDisplayed(parser.getObjectLocator("supportOneTimeRadioButton")));
		assertTrue(isElementDisplayed(parser.getObjectLocator("labelOneTimeSupport")));		
	}
	
	public void isOneTimeInputBoxDisplayed() {
		assertTrue(isElementDisplayed(parser.getObjectLocator("OneTimeInputBox")));
	}
	
	public void isSupportReqRespButtonDisplayed() {
		assertTrue(isElementDisplayed(parser.getObjectLocator("supportReqRespButton")));
	}
	
	public void isSupportMonthlyRadioButtonDisplayed() {
		assertTrue(isElementDisplayed(parser.getObjectLocator("supportMonthlyRadioButton")));
		assertTrue(isElementDisplayed(parser.getObjectLocator("labelMonthlySupport")));	
	}

}
