package com.apium.poc.baseTest.utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.apium.poc.baseTest.BaseTest;



public class CommonFunctions extends BaseTest{
	
	String ScreenShot = "screenshot";
	public void HideKeyBoard(AndroidDriver<AndroidElement> driver)
	{
		driver.hideKeyboard();
	}
	
	public String takeScreenshots(){
		File srcFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy__hh-mm-ss");
		new File(ScreenShot).mkdir();
		
		
		String destFile = dateFormat.format(new Date()) +".png";
		
		try {
			FileUtils.copyFile(srcFile, new File(ScreenShot+"/"+destFile));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return destFile;
	}

}
