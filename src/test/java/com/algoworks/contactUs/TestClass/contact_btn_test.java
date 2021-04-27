package com.algoworks.contactUs.TestClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;
import com.algoworks.contactUs.PageObjects.BaseClass;
import com.algoworks.contactUs.PageObjects.contact_btn_page;
import com.algoworks.contactUs.Utilities.screenshot;
import com.algoworks.contactUs.Utilities.scrollDown;
import com.relevantcodes.extentreports.LogStatus;
 

public class contact_btn_test extends BaseClass{
	
	
	 @Test
	 public void contact_Button_Click() throws InterruptedException, IOException
	 { 
		  rlog=extent.startTest("contact_btn_test");
		  contact_btn_page bt = new contact_btn_page(); 
		  driver.get(url);
	      boolean display = bt.contactButton().isDisplayed();
	      boolean enable =  bt.contactButton().isEnabled();
	      AssertJUnit.assertEquals(display,true);
	      
	      rlog.log(LogStatus.INFO, " Contact Us Button is Displayed !");
	      log.info("Contact Us Button is Displayed !");
	      
	      AssertJUnit.assertEquals(enable,true);
	      rlog.log(LogStatus.INFO, " Contact Us Button is Enabled !");
	      log.info("Contact Us Button is Enabled !");
	      rlog.log(LogStatus.INFO, rlog.addScreenCapture( "."+screenshot.shots(driver,"Before_ContactButton_Click")));
			
	      
	      bt.clickContactButton();
	      Thread.sleep(2000);
	      for(String window:driver.getWindowHandles())
			 {
				 if(driver.switchTo().window(window).getTitle().equals("Contact Us - Algoworks"))
				 {
					break;
				 }
			 }
	      AssertJUnit.assertEquals(driver.getTitle(),"Contact Us - Algoworks");
	   
			
	      rlog.log(LogStatus.INFO, "Contact Us Button clicked successfully !");
	      log.info("Contact Us Button clicked successfully !");
	       
	 }
	 }
	 
	 
	
	

