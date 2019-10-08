package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest5 {
	WebDriver driver;
	@BeforeTest(groups = {"functional", "positive"})
	@Parameters("browser")
	
	public void beforeTest(@Optional String value)
	{
		System.out.println("in before test");
		driver=DriverUtility.getDriver(value);
		System.out.println(value);
		Assert.assertNotNull(driver);
		driver.manage().window().maximize();
	}
	@AfterTest(groups = {"functional", "positive" })
	public void afterTest()
	{
		System.out.println("in after test");
		driver.close();
	}
	@Test(groups = {"functional", "positive" })
	public void testGoogle()
	{	
		System.out.println("in test google");
		driver.get("http://www.google.co.in/");
	}
	@Test(groups = {"positive"})
	public void testNewTours()
	{
		System.out.println("in test newtours");
		driver.get("http://www.newtours.demoaut.com/");
	}
}
