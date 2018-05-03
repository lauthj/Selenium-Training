package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class DemoXpath {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[2]/div/div/footer/section[3]/div/ul/li[3]/a")
    WebElement absoluteXpath;

    /*@FindBy(xpath = "//*[@id=\"social-media\"]/ul/li[3]/a")
    WebElement relativeXpath;*/

    @FindBy(xpath = "//*[@id=\"menu-item-53\"]/a")
    WebElement home;

    /*@FindBy(xpath = "//*[contains(@title,'Apple iPhone 4S')]")
    WebElement realtiveFlexibleXpath;*/

    public DemoXpath(WebDriver driver)
    {
        this.driver = driver;
    }

    public void sendURL(String url)
    {
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    public  void ViewRSSFeed()
    {
        long sleepDuration = 5*1000;
        try {
            Thread.sleep(sleepDuration);
            home.click();
            driver.navigate().back();

            Thread.sleep(sleepDuration);
            //relativeXpath.click();
            Thread.sleep(sleepDuration);
            driver.navigate().back();
        } catch ( InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    /*public  void ClickImage()
    {
        realtiveFlexibleXpath.click();
        driver.navigate().back();
    }*/
}
