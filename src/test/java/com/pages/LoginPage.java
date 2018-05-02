package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	@FindBy(name="userName")
	WebElement userName;
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	@FindBy(css="input[value='Login']")
	WebElement signin;
	@FindBy(linkText="REGISTER")
	WebElement register;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String login()
	{
		//connect to excel,xml,db
		userName.sendKeys("mercury");
		password.sendKeys("mercury");
		signin.click();
		
		return driver.getTitle();
		
	}
	
	public String clickRegister()
	{
		register.click();
		return driver.getTitle();
	}
	
	public void sendURL(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	

}
