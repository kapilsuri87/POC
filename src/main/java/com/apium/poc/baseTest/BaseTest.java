package com.apium.poc.baseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	
	
	public static Properties CONFIG;
	protected AndroidDriver<AndroidElement> driver;
	protected String appUrl= System.getProperty("user.dir") +"/src/main/java/com/apium/poc/utilities/";
	
	
	public static String DEVICE_NAME, BROWSER_NAME,PLATFORM_VERSION,APP_PACKAGE,APP_ACTIVITY,APIUM_URL;
	public WebDriverWait wait;
	
	public void setUpEnvironment() throws IOException
	{
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") +"/src/main/java/com/apium/poc/config/config.properties");
		CONFIG= new Properties();
		CONFIG.load(fs);
	}
	
	public void openApplication() throws MalformedURLException
	{
		File appDir = new File(appUrl);
		File app = new File(appDir, CONFIG.getProperty("APP_NAME"));
		
		if(CONFIG.getProperty("OS").equalsIgnoreCase("ANDROID"))
		{
			//Defining APIUM Capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, CONFIG.getProperty("DEVICE_NAME"));
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, CONFIG.getProperty("BROWSER_NAME"));
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, CONFIG.getProperty("PLATFORM_VERSION"));
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, CONFIG.getProperty("APP_PACKAGE"));
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, CONFIG.getProperty("APP_ACTIVITY"));
		
		//To run with emulator
		cap.setCapability("avd", CONFIG.getProperty("EMU_NAME"));
		
		//Initializing Android Driver
		driver = new AndroidDriver<AndroidElement>(new URL(CONFIG.getProperty("APIUM_URL")), cap);
		
		//Implicit wait definition
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(CONFIG.getProperty("TIME_OUT")), TimeUnit.SECONDS);
		}
	}

}
