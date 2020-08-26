package mobileautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import io.appium.java_client.MobileElement;

public class ContactForm extends AndroidCapabilities{
	

	static ContactForm cm= new ContactForm();


	public void FirstName() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox ");
		type("cFirstNameM_Xpath", "cFirstName");
		}
		
		public void LastName() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("cLastNameM_Xpath","cLastName");
		}
		
		//Thread.sleep(2000);
		//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
		//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
		
		public void PhoneNumber() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("PhoneNumber '9899928177' is typed in textbox");
		type("cPhoneNumberM_Xpath","cPhoneNumber");
		}
		
		public void Email() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
		type("cBusinessEmailAddressM_Xpath","cBusinessEmailAddress");
		}
		
		public void CompanyName() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("Company name 'Algoworks' is typed in textbox");
		type("cCompanyM_Xpath","cCompany");
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
			type("cMessageM_Xpath","cMessage");
		}
		
		
		public void ContactUs() throws InterruptedException{
			Thread.sleep(2000);
		logger1.info("Contact Us button is selected");
		click("cContactUsButtonM_Xpath");
		Thread.sleep(5000);
		}
		public void Scrolly() throws InterruptedException{
			Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)", "up");
		}

		public void Scroll() throws InterruptedException{
			Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,100)", "up");
		}
		
		 public void Switchingtoframe() throws InterruptedException{
			 WebDriverWait wait=new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
				  findElement(By.id("drift-widget"))));
		 
				  Thread.sleep(2000); click("dPopupClose_Xpath");
				  
				  driver.switchTo().defaultContent();
		 }
	@BeforeClass
	public static void init() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("ContactForm_url"));
	}
	@Test()
	public static void contactForm() throws Exception {
		logger1 = extent.createTest("contactForm");	 
		try {                  
			
			cm.Scrolly();
			cm.FirstName();
			cm.LastName();
			cm.Email();
			cm.CompanyName();
			//cm.Switchingtoframe();
			cm.Scrolly();
			cm.jobTitle();
			cm.PhoneNumber();
			//cm.Scrolly();
			cm.ReasonForInquiry();
			cm.Message();
			cm.Switchingtoframe();
			cm.Scroll();
			cm.ContactUs();
						
			 }                                                                                                                                                   

			catch (Exception e) {
				logger1.fail(e);                           
				throw e;
			}

		Thread.sleep(2000);	
		
		logger1.pass("Testcase ContactForm is Passed");
		}


	}


