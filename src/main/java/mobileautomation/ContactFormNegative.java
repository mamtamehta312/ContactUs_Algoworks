package mobileautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import io.appium.java_client.MobileElement;


public class ContactFormNegative extends AndroidCapabilities {
	@BeforeClass
	public static void init() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("ContactForm_url"));
	}
	@Test(priority = 1)
	public static void ContactFormFirstNameNegative() throws Exception {
		logger1 = extent.createTest("contactForm_FirstName_negative");	 
		try {                   
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait=new WebDriverWait(driver, 30);
			
			Thread.sleep(2000);
			logger1.info("First name 'F' is typed in textbox");
			type("cFirstNameNeg_Xpath", "cFirstNameNeg");
			
            Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");
			
            Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");
			
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
			
			
	         Thread.sleep(2000);
			 logger1.info("Company 'Algoworks' given in textbox");
			 type("cCompany_Xpath", "cCompany");
			 
			 Thread.sleep(2000);	
			 logger1.info("Job Title 'Automation QA' given in textbox");
			 type("cJobTitle_Xpath", "cJobTitle");
			
			 Thread.sleep(2000);
			 logger1.info("Country 'United States' is selected");
			MobileElement val1 = driver.findElement(
					By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			 Select valueType1 = new Select(val1);
			 Thread.sleep(2000);
			 valueType1.selectByValue("United States");
			 jse.executeScript("window.scrollBy(0,100)", "up");
				
			
			 Thread.sleep(2000);
			 logger1.info("State 'Alabama' is selected");
			 MobileElement val2 = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			 Select valueType2 = new Select(val2);
			 Thread.sleep(2000);
			 valueType2.selectByValue("AL");
			 jse.executeScript("window.scrollBy(0,100)", "up"); 
			 
			
			 
			 Thread.sleep(2000);	
			 logger1.info("City name 'Noida' given in textbox");
		     type("cCity_Xpath", "cCity");
		     jse.executeScript("window.scrollBy(0,100)", "up");
		     
		     Thread.sleep(2000);
		     logger1.info("Partner Inquiry is selected");
		     MobileElement val4 = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
				Select valueType3 = new Select(val4);
				valueType3.selectByVisibleText("Partner Inquiry");
				jse.executeScript("window.scrollBy(0,100)", "up");
				jse.executeScript("window.scrollBy(0,100)", "up");
				
				
				Thread.sleep(2000);
				 logger1.info("optional message is written");
				 type("cMessage_Xpath", "cMessage");
			
				 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
					//driver.switchTo().frame("drift-widget");
				
					
					Thread.sleep(2000);
					click("dPopupClose_Xpath"); 
					
				    driver.switchTo().defaultContent();
				 
				 Thread.sleep(10000);
				 logger1.info("Contact Us button is selected");
				 WebElement button =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
					JavascriptExecutor jsexec = (JavascriptExecutor)driver;
				
				jse.executeScript("window.scrollBy(0, -800)", "down");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Boxes = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
				String bugs = Boxes.getText();
				Assert.assertEquals(bugs, "Must contain 2-50 characters.");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				Thread.sleep(2000);
				logger1.info("First name '@@' is typed in textbox");
				type("cFirstNameSpcl_Xpath", "cFirstNameSpcl");
				
	            Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath", "cLastName");
				jse.executeScript("window.scrollBy(0,100)", "up");
				
	            Thread.sleep(2000);
				logger1.info("Area code+phone is '9899928177' given in textbox");
				type("cPhoneNumber_Xpath", "cPhoneNumber");
				
				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
				
				
		         Thread.sleep(2000);
				 logger1.info("Company 'Algoworks' given in textbox");
				 type("cCompany_Xpath", "cCompany");
				 
				 Thread.sleep(2000);	
				 logger1.info("Job Title 'Automation QA' given in textbox");
				 type("cJobTitle_Xpath", "cJobTitle");
				
				 Thread.sleep(2000);
				 logger1.info("Country 'United States' is selected");
				MobileElement val01 = driver.findElement(
						By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
				 Select valueType01 = new Select(val01);
				 Thread.sleep(2000);
				 valueType01.selectByValue("United States");
				 jse.executeScript("window.scrollBy(0,100)", "up");
					
				
				 Thread.sleep(2000);
				 logger1.info("State 'Alabama' is selected");
				 MobileElement val02 = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
				 Select valueType02 = new Select(val02);
				 Thread.sleep(2000);
				 valueType02.selectByValue("AL");
				 jse.executeScript("window.scrollBy(0,100)", "up"); 
				 
				
				 
				 Thread.sleep(2000);	
				 logger1.info("City name 'Noida' given in textbox");
			     type("cCity_Xpath", "cCity");
			     jse.executeScript("window.scrollBy(0,100)", "up");
			     
			     Thread.sleep(2000);
			     logger1.info("Partner Inquiry is selected");
			     MobileElement val04 = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
					Select valueType03 = new Select(val04);
					valueType03.selectByVisibleText("Partner Inquiry");
					jse.executeScript("window.scrollBy(0,100)", "up");
					jse.executeScript("window.scrollBy(0,100)", "up");
					
					
					Thread.sleep(2000);
					 logger1.info("optional message is written");
					 type("cMessage_Xpath", "cMessage");
				
				/*	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
						//driver.switchTo().frame("drift-widget");
					
						
						Thread.sleep(2000);
						click("dPopupClose_Xpath"); 
						
					    driver.switchTo().defaultContent(); */
					 
					 Thread.sleep(10000);
					 logger1.info("Contact Us button is selected");
					 WebElement buttons =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
						
					
					jse.executeScript("window.scrollBy(0, -800)", "down");
					Thread.sleep(2000);
					
					Thread.sleep(2000);
					logger1.info("Checked error text on submission");
					WebElement Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
					String bug = Box.getText();
					Assert.assertEquals(bug, "Must contain 2-50 characters.");
							
					Thread.sleep(2000);
					driver.navigate().refresh();
					logger1.info("------------------------------------------------------------");
				
			 }                                                                                                                                                   

			catch (Exception e) {
				logger1.fail(e);                           
				throw e;
			}

		Thread.sleep(2000);	
		
		logger1.pass("Testcase ContactForm is Passed");
		}

			public static void setAttribute(WebElement element, String attName, String attValue) {
		        driver.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", 
		                element, attName, attValue);
				
			}

	}

