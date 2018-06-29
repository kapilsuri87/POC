package com.apium.poc.utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.apium.poc.baseTest.BaseTest;

public class CommonFunctions extends BaseTest{
	
	 public CommonFunctions(AndroidDriver<AndroidElement> driver)

	    {
	        this.driver = driver;
	    }
	
	static String ScreenShot = "screenshots";
	String destFile;
	File srcFile;
	static File scrShotDir= new java.io.File("./"+ScreenShot+"//"); 
	
	
	public void HideKeyBoard(AndroidDriver<AndroidElement> driver)
	{
		driver.hideKeyboard();
	}
	
	public String readToastMsg() throws TesseractException
	{
		String imageScrShot= takeScreenshots(driver);
		String result = null;
		File imagefile= new File(scrShotDir,imageScrShot);
		ITesseract instance = new Tesseract();
		
		File TestDataFolder= net.sourceforge.tess4j.util.LoadLibs.extractTessResources("tessdata");
		
		instance.setDatapath(TestDataFolder.getAbsolutePath());
		result=instance.doOCR(imagefile);
		System.out.println(result);
		return result;				
	}
	
	public String takeScreenshots(AndroidDriver<AndroidElement> driver){
		srcFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy__hh-mm-ss");
		new File(ScreenShot).mkdir();
		
		
		destFile = dateFormat.format(new Date()) +".png";
		
		try {
			FileUtils.copyFile(srcFile, new File(ScreenShot+"/"+destFile));
		} catch (IOException e) {
			System.out.println("Image not transferred to Screenshot folder");
			e.printStackTrace();
		}
		return destFile;
	}

}
