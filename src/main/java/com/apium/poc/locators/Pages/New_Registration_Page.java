package com.apium.poc.locators.Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class New_Registration_Page {
	
	AndroidDriver<AndroidElement> driver;

    public New_Registration_Page(AndroidDriver<AndroidElement> driver)

    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), this);
    }
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/inputUsername")
    public WebElement userNameText;
    
    @AndroidFindBy(accessibility = "email of the customer")
    public WebElement emailText;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/inputPassword")
    public WebElement pwdText;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/inputName")
    public WebElement nameText;
    
    @AndroidFindBy(id="io.selendroid.testapp:id/input_adds")
    public WebElement addsCkBox;
    
    @AndroidFindBy(id="io.selendroid.testapp:id/btnRegisterUser")
    public WebElement registerBttn;
    
    public void clearType_userName(String text)
    {
    	userNameText.clear();
    	userNameText.sendKeys(text);
    }
    public void clearType_emailText(String text)
    {
    	emailText.clear();
    	emailText.sendKeys(text);
    }
    public void clearType_pwdText(String text)
    {
    	pwdText.clear();
    	pwdText.sendKeys(text);
    }
    public void clearType_nameText(String text)
    {
    	nameText.clear();
    	nameText.sendKeys(text);
    }
    
    public void selectCkBox_Adds() {
		addsCkBox.click();
	}
    
    public Confirm_Registration_Page click_NewRegBttn()
    {
    	registerBttn.click();
    	Confirm_Registration_Page cp= new Confirm_Registration_Page(driver);
    	return cp;
    }
}
