package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class NewTest7 {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String value)
	{
		driver=DriverUtility.getDriver(value);
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
	@AfterTest
    @Parameters("browser")
	public void afterTest(String value)
	{
		driver.close();
	}
	@DataProvider(name="dp1")
	public Object[][] getData()
	{
		Object[][] obj= {
							{"mercury","mercury"},
                {"lee","lee"},
                {"kim","kim"}
						};
		return obj;
	}
	
	@Test(dataProvider="dp1")
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
}
