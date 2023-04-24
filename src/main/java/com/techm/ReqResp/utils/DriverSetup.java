package com.techm.ReqResp.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static WebDriver getDriver(String browserType) {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = null;
		
		if(browserType.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options  = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);	    
			
		} else if(browserType.equals("InternetExplorer")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();   
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;		
	}

}
