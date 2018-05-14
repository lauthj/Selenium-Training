package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class NewTest8 {
	WebDriver driver;
	@BeforeTest(groups = {"functional"})
	@Parameters("browser")
	public void beforeTest(String value)
	{
		driver=DriverUtility.getDriver(value);
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
	@AfterTest(groups = {"functional"})
	public void afterTest()
	{
		driver.close();
	}
	@DataProvider(name="dp1")
	public Object[][] getData()
	{
		Object[][] obj= {
							{"mercury","mercury"},
							{"lee","lee"}
						};
		return obj;
	}
	
	@Test(dataProvider="dp1", groups = {"functional"})
	public void testMercuryTours(String uname,String pwd)
	{
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
	
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		if(title.contains("Find a Flight"))
		{
			driver.findElement(By.linkText("SIGN-OFF")).click();
		}
	}

	@Test(groups = {"smoke"})
	public void testSmoke()
	{	System.out.println("Smoke");
	}
}
