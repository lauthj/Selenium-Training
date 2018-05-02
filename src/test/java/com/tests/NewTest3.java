package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest3 {
	WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		driver=DriverUtility.getDriver("chrome");
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
	@DataProvider(name="dp1")
	public Object[][] getData()
	{
		Object[][] obj= {
							{"mercury","mercury"},
							{"kim","kim"},
							{"lee","lee"}
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
		
		/*
		Assert.assertTrue(title.contains("Find a Flight"));
		
		driver.findElement(By.cssSelector("input[value='oneway']")).click();
		driver.findElement(By.name("passCount")).sendKeys("4");
		
		//WebElement from=driver.findElement(By.name("fromPort"));
		Select sel1=new Select(driver.findElement(By.name("fromPort")));
		List<WebElement> list=sel1.getOptions();
		Assert.assertEquals(list.size(),10);
		for(WebElement e:list)
		{
			String city=e.getText();
		//	System.out.println(city);
			if(city.equals("Paris"))
			{
				sel1.selectByVisibleText(city);
				break;
			}
		}*/
		
	}

	
	
	
}
