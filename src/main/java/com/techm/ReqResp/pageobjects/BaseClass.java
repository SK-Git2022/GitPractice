package com.techm.ReqResp.pageobjects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	

	private WebDriver driver;
	
	public BaseClass(WebDriver driver) {
		this.driver=driver;
	}
	
	protected void scrollIntoView(WebElement em) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",em);
	}
	
	protected void waitForElementList(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				by));
	}
	
	protected void waitForElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(
				by));
	}
	
	private void scrollToElement(By by) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(by));	
	}
	
	protected Boolean isElementDisplayed(By by) {
		scrollToElement(by);
		return driver.findElement(by).isDisplayed();
	}
	
	protected void clickElement(By by) {
		scrollToElement(by);
		driver.findElement(by).click();
	}
	
	protected void setText(String city) {
		driver.findElement(By.xpath("//input[@name='query']")).sendKeys(city);
	}
	
	
	

}
