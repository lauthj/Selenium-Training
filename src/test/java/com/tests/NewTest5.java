package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest5 {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String value)
	{
		System.out.println("in before test");
		driver=DriverUtility.getDriver(value);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("in after test");
		driver.close();
	}
	@Test
	public void testGoogle()
	{	
		System.out.println("in test google");
		driver.get("http://www.google.co.in/");
	}
	@Test
	public void testNewTours()
	{
		System.out.println("in test newtours");
		driver.get("http://www.newtours.demoaut.com/");
	}
}
