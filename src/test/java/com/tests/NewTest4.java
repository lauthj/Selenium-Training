package com.tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class NewTest4 {
	
	
	@Test
	public void testHDFC()
	{
		WebDriver driver=DriverUtility.getDriver("chrome");
		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.id("loginsubmit")).click();
		
		String home=driver.getWindowHandle();
		
		Set<String> set=driver.getWindowHandles();
		System.out.println(set.size());
		
		for(String s:set)
		{
			System.out.println(s);
			driver.switchTo().window(s);
		}
		
		driver.findElement(By.xpath("//div[@class='pdtb25 text-center']/a[1]")).click();

		driver.switchTo().frame(driver.findElement(By.name("login_page")));
	
		driver.findElement(By.cssSelector("img[alt='continue']")).click();
		
		if(ExpectedConditions.alertIsPresent()!=null)
		{
			Alert al=driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
		}
		driver.findElement(By.name("fldLoginUserId")).sendKeys("645646");
		
		driver.switchTo().window(home);
		//driver.close();//close the current window instance
		
		driver.quit();//close all the window instance opened by webdriver
	}

}
