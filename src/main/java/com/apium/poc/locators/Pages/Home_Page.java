package com.apium.poc.locators.Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	AndroidDriver<AndroidElement> driver;

    public Home_Page(AndroidDriver<AndroidElement> driver)

    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), this);
    }
   
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/startUserRegistration")
    public WebElement newRegBttn;
    
    @AndroidFindBy(id = "android:id/title")
    public WebElement appTitle;
    
    public New_Registration_Page click_NewRegBttn()
    {
    	newRegBttn.click();
    	New_Registration_Page rp= new New_Registration_Page(driver);
    	return rp;
    }
    
    

}
