package mobileautomation;

import java.net.MalformedURLException;


import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class FormFilling extends AndroidCapabilities {
	
	static FormFilling fm= new FormFilling();


	public void FirstName() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox ");
		type("fFirstName_Xpath", "fFirstName");
		}
	public void LastName() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath","fLastName");
		}
		
		public void PhoneNumber() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("PhoneNumber '9899928177' is typed in textbox");
		type("fPhoneNumber_Xpath","fPhoneNumber");
		}
		
		public void Email() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
		type("fBusinessEmailAddress_Xpath","fBusinessEmailAddress");
		}
		
		public void CompanyName() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("Company name 'Algoworks' is typed in textbox");
		type("fCompany_Xpath","fCompany");
		}
		
		public void jobTitle() throws InterruptedException{
		    Thread.sleep(2000);
			    logger1.info("Job Title field has been clicked");
			    Select dropdown = new Select(driver.findElement(By.name("jobTitle2")));  
				 dropdown.selectByIndex(0); 
	 }
		
		public void ReasonForInquiry() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Reason for Inquiry field has been clicked");
		    Select dropdown = new Select(driver.findElement(By.name("contactUsReasonforInquiry")));  
			 dropdown.selectByIndex(0); 
	 }
		public void Message() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Message is typed");
			type("fMessage_Xpath","fMessage");
		}
		public void ContactUs() throws InterruptedException{
			Thread.sleep(2000);
		logger1.info("Contact Us button is selected");
		click("fContactUs_Xpath");
		Thread.sleep(5000);
		}
	
		public void Scrolly() throws InterruptedException{
			Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)", "up");
		}

		public void Scroll() throws InterruptedException{
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1500)", "up");
		}
		
		 public void Switchingtoframe() throws InterruptedException{
			 WebDriverWait wait=new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
				  findElement(By.id("drift-widget"))));
		 
				  
				  Thread.sleep(2000); click("dPopupClose_Xpath");
				  
				  driver.switchTo().defaultContent();
		 }
	
//	@BeforeClass
//	public static void init() {
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.navigate().to(properties.getProperty("url"));
//	}

	@Test
	public static void getstarted() throws Exception {
		logger1 = extent.createTest("getstarted");
		try {
			
			fm.Scroll();
			fm.FirstName();
			fm.LastName();
			fm.Email();
			fm.CompanyName();
			//fm.Switchingtoframe();
			fm.Scrolly();
			fm.jobTitle();
			fm.PhoneNumber();
			fm.ReasonForInquiry();
			fm.Message();
			fm.ContactUs();
		} catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");
			throw e;
		}
		Thread.sleep(8000);

		logger1.pass("Testcase FormFilling is Passed");
	}

}
