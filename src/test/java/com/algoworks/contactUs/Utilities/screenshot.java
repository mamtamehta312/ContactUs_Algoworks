package com.algoworks.contactUs.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.algoworks.contactUs.PageObjects.BaseClass;
import com.google.common.io.Files;

public class screenshot extends BaseClass {

	public static String desPath;
	public static String shots(WebDriver driver,String name) throws IOException
	{
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    desPath= screenshotPath+name+".png";
		File des= new File(desPath);
     	Files.copy(src, des);
     	return desPath;
	}

	
}
