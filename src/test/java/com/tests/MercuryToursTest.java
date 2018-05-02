package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.RegisterPage;

public class MercuryToursTest {
	
	WebDriver driver;
	LoginPage loginPage;
	RegisterPage registerPage;
	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String value)
	{
		driver=DriverUtility.getDriver(value);
		loginPage=PageFactory.initElements(driver,LoginPage.class);
		registerPage=PageFactory.initElements(driver,RegisterPage.class);
	}
	@AfterTest
	public void afterTest()
	{
		loginPage=null;
		registerPage=null;
		driver.close();
	}
	@Test
	public void testMercuryTours()
	{
		loginPage.sendURL("http://www.newtours.demoaut.com/");
		loginPage.clickRegister();
		registerPage.clickSubmit();
		registerPage.clickSignOFF();
		String title=loginPage.login();
		Assert.assertTrue(title.contains("Find a Flight"));
	}

}
