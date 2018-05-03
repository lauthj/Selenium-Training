package com.tests;

import com.pages.DemoXpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoXpathTest {

    WebDriver driver;
    DemoXpath demoPage;

    @BeforeTest
    @Parameters("browser")
    public void beforeTest(String value)
    {
        driver=DriverUtility.getDriver(value);
        demoPage=PageFactory.initElements(driver, DemoXpath.class);
    }
    @AfterTest
    public void afterTest()
    {
        demoPage=null;
        driver.close();
    }
    @Test
    public void testDemoXpath()
    {
        demoPage.sendURL("http://store.demoqa.com/");
        //demoPage.ClickImage();
        demoPage.ViewRSSFeed();

    }

}
