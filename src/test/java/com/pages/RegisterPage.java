package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	@FindBy(name="register")
	WebElement submit;
	@FindBy(linkText="SIGN-OFF")
	WebElement signoff;
	
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSignOFF()
	{
		signoff.click();
	}
	public void clickSubmit()
	{
		email.sendKeys("mercury");
		password.sendKeys("mercury");
		confirmPassword.sendKeys("mercury");
		submit.click();
	}
	

}
