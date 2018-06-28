package com.apium.poc.locators.Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Registration_Page {
	
	AndroidDriver<AndroidElement> driver;

    public Confirm_Registration_Page(AndroidDriver<AndroidElement> driver)

    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), this);
    }
    
    @AndroidFindBy(id="io.selendroid.testapp:id/label_name_data")
    public WebElement NameVerText;
    @AndroidFindBy(id="io.selendroid.testapp:id/label_username_data")
    public WebElement userNameVerText;
    @AndroidFindBy(id="io.selendroid.testapp:id/label_email_data")
    public WebElement emailVerText;
    @AndroidFindBy(id="io.selendroid.testapp:id/label_preferedProgrammingLanguage_data")
    public WebElement progDataVerText;
    @AndroidFindBy(id="io.selendroid.testapp:id/label_acceptAdds_data")
    public WebElement acceptAddsVerText;
    @AndroidFindBy(id="io.selendroid.testapp:id/label_password_data")
    public WebElement passwordVerText;
    
    @AndroidFindBy(id="io.selendroid.testapp:id/buttonRegisterUser")
    public WebElement finalRegisterBttn;

    
    public String getText_nameVerText()
    {
    	return NameVerText.getText();
    }
    public String getText_passwordVerText()
    {
    	return passwordVerText.getText();
    }
    public String getText_userNameVerText()
    {
    	return userNameVerText.getText();
    }
    public String getText_emailVerText()
    {
    	return emailVerText.getText();
    }
    public String getText_langVerText()
    {
    	return progDataVerText.getText();
    }
    public String getText_acceptAddsVerText()
    {
    	return acceptAddsVerText.getText();
    }
    
    
    public Home_Page click_finalRegisterBttn()
    {
    	finalRegisterBttn.click();
    	Home_Page hp= new Home_Page(driver);
    	return hp;
    }

}
