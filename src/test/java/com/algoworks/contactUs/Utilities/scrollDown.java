package com.algoworks.contactUs.Utilities;

import org.openqa.selenium.JavascriptExecutor;

import com.algoworks.contactUs.PageObjects.BaseClass;
import com.algoworks.contactUs.PageObjects.contact_page;

public class scrollDown extends BaseClass {

	public static  void scroll()
	{
		contact_page pg=new contact_page();
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",pg.scrollElement());
	 
		
	}
	
}