package mobileautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import io.appium.java_client.MobileElement;

public class ContactForm extends AndroidCapabilities{
	@BeforeClass
	public static void init() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("ContactForm_url"));
	}
	@Test()
	public static void contactForm() throws Exception {
		logger1 = extent.createTest("contactForm");	 
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("First name 'Bob' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/input'");
			type("cFirstName_Xpath", "cFirstName");
			
            Thread.sleep(2000);
			logger1.info("Last name 'Jackson' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/input'");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(5000);
			logger1.info("Country code '+91' for country 'India' is selected");
			MobileElement val = driver.findElement(By.xpath("//*[@id=\'global-content\']/div/div[2]/section/div/form/div[2]/div[1]/div/span/select"));
			Select valueType = new Select(val);
			valueType.selectByVisibleText("UK (+44)");
			//driver.executescript("arguments[0].click()", element);
			//driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")));
	        //JavascriptExecutor jse = (JavascriptExecutor) driver;
			//jse.executeScript("window.scrollBy(0,100)", "up");
            Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[2]/div[2]/div/label'");
			type("cPhoneNumber_Xpath", "cPhoneNumber");
			
			Thread.sleep(2000);
			logger1.info("Business Email Address 'Bob.Jackson@gmail.com' typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/input'");
			type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
			
	         Thread.sleep(2000);
			 logger1.info("Company 'Algoworks' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[4]/input'");
			 type("cCompany_Xpath", "cCompany");
			 
			 Thread.sleep(2000);	
			 logger1.info("Job Title 'Software Test Engineer' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[5]/input'");
			 type("cJobTitle_Xpath", "cJobTitle");
			 
			 Thread.sleep(2000);
			 logger1.info("Country 'United States' is selected");
			 MobileElement val1 = driver.findElement(By.xpath("//*[@id=\'global-content\']/div/div[2]/section/div/form/div[6]/span/select"));
			 Select valueType1 = new Select(val1);
			 Thread.sleep(2000);
			 valueType1.selectByValue("United States");
			 
			 Thread.sleep(2000);
			 logger1.info("State 'NY' is selected");
			 MobileElement val2 = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			 Select valueType2 = new Select(val2);
			 Thread.sleep(2000);
			 valueType2.selectByValue("NY");
			 
			 Thread.sleep(2000);	
			 logger1.info("City name 'Noida' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
		     type("cCity_Xpath", "cCity");
		     
		     Thread.sleep(2000);
		     logger1.info("Partner Inquiry is selected");
		     MobileElement val4 = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
				Select valueType3 = new Select(val4);
				valueType3.selectByVisibleText("Partner Inquiry");
				
		     /*logger1.info("REASON FOR ENQUIRY 'Job Enquiry'");
			 type("ReasonForEnquiry","SelectingOption");
			 Thread.sleep(2000);*/
			 
			 //jse.executeScript("window.scrollBy(0,100)", "up");
				
				Thread.sleep(2000);	
				logger1.info("City name 'Noida' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
				type("cMessage_Xpath", "cMessage");
				
				Thread.sleep(2000);
				 logger1.info("Contact Us button is selected");
				 click("cContactUsButton_Xpath");
				
				jse.executeScript("window.scrollBy(0, -800)", "down");
				Thread.sleep(5000);
				
				Thread.sleep(2000);	
				logger1.pass("Testcase is Passed");
			 }                                                                                                                                                   

			catch (Exception e) {
				logger1.fail(e);                           
				throw e;
			}}

			public static void setAttribute(WebElement element, String attName, String attValue) {
		        driver.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", 
		                element, attName, attValue);
				
			}

	}


