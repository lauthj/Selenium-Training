package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	
	@Test
	public void testGoogle()
	{
	WebDriver driver=DriverUtility.getDriver("chrome");
	driver.manage().window().maximize();//to maximize the browser window
	driver.get("http://www.google.co.in/");// to launch the Application
	String title=driver.getTitle();
	Assert.assertEquals(title,"Google");
	//driver.findElement(By.linkText("Gmail")).click();
	driver.findElement(By.cssSelector("a[title='Google apps']")).click();
	
	WebElement div= driver.findElement(By.cssSelector("div[aria-label='Google apps']"));
	
	List<WebElement> list=div.findElements(By.tagName("ul"));
	System.out.println(list.size());
	
	for(WebElement e:list)
	{
		List<WebElement> ul=e.findElements(By.tagName("li"));
		System.out.println("No of Apps:"+ul.size());
	}
	
	}

}
