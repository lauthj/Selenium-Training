package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility {
	
	public static WebDriver getDriver(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty
			("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
			return new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty
			("webdriver.gecko.driver","./src/test/resources/drivers/geckodriver.exe");
			return new FirefoxDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","./src/test/resources/drivers/IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else
		{
			return null;
		}
	}

}
