package mobileautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
			logger1.info("First name 'Form' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/input'");
			type("cFirstName_Xpath", "cFirstName");
			
            Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/input'");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");
			
			/* Thread.sleep(3000);
			logger1.info("Country code '+44' for country 'UK' is selected");
			WebElement s = findElement("cCountryCode_Xpath");
			Select jobType = new Select(s);
			jobType.selectByVisibleText(AndroidCapabilities.getPropertyValue("cCountryCode"));*/
			
			/*Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div[1]/div/span/span")).click();
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("u", Keys.ENTER);
			*/
			
			/*Thread.sleep(2000);
			logger1.info("cOUNTRY cODE '+44' for country 'UK' is selected '//*//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div[1]/div/span/span/span[3]/i'");
			Select countryCodeSel = new Select(driver.findElement(By.xpath(properties.getProperty("cCountryCode_Xpath"))));
			countryCodeSel.selectByIndex(1);
			type("cCountryCode_Xpath", "cCountryCode");
			jse.executeScript("window.scrollBy(0,100)", "up"); */
            
			//Remove Country Code in the form    
			//Thread.sleep(5000);
			//try {
			//logger1.info("Country code '+91' for country 'India' is selected");
			//MobileElement val = driver.findElement(By.xpath("//*[contains(@name,'PhoneCountryCode')]"));
			//Select valueType = new Select(val);
			//valueType.selectByIndex(1);
			//}catch(Exception e)
			{
				
			}
			// satender sir code   
			//MobileElement countrySelArrow = driver.findElement(By.xpath("//*[contains(@name,'PhoneCountryCode')]//i[@class='selectboxit-arrow selectboxit-default-arrow']"));
			//countrySelArrow.click();
			//Thread.sleep(2000);
			//MobileElement countrySel = driver.findElement(By.xpath("//*[contains(@name,'PhoneCountryCode')]/..//ul/li[2]"));
			//countrySel.click();
			
			Thread.sleep(5000);
			
			/*Thread.sleep(5000);
			MobileElement countrySelArrow = driver.findElement(By.xpath("//*[contains(@name,'PhoneCountryCode')]//i[@class='selectboxit-arrow selectboxit-default-arrow']"));
			countrySelArrow.click();
			Thread.sleep(2000);
			MobileElement countrySel = driver.findElement(By.xpath("//*[contains(@name,'PhoneCountryCode')]/..//ul/li[2]"));
			countrySel.click();
			*/
	
			//logger1.info("Country code '+44' for country 'UK' is selected");
			//MobileElement val = driver.findElement(By.xpath("//*[contains(@name,'PhoneCountryCode')]"));
			//Select valueType = new Select(val);
			//valueType.selectByVisibleText("UK (+44)");
			
			/*
			 WebDriverWait d= new WebDriverWait(driver,20);
			 d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div[1]/div/span/span/span[3]/i")));
			 MobileElement arrow = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div[1]/div/span/span/span[3]/i"));
			 arrow.click();
			 Thread.sleep(3000);
			 d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@name,'PhoneCountryCode')]/..//ul/li[2]")));
					 MobileElement selecttype = driver.findElement(By.xpath("//*[contains(@name,'PhoneCountryCode')]/..//ul/li[2]"));
					 selecttype.click();
			 */
			 
			 
			/*floorselectionWait = WebDriverWait(driver,20).until(EC.presence_of_element_located((By.xpath(""))))
			        floorselection=driver.find_element(By.XPATH,'//*[@id="select_22"]')
			        floorselection.click()
			        flooroptionsWait = WebDriverWait(driver,10).until(EC.presence_of_element_located((By.XPATH,"//DIV[@class='md-text ng-binding'][text()='Level 7']")))
			        optionSelect=driver.find_element(By.XPATH,"//DIV[@class='md-text ng-binding'][text()='Level 7']")
			        optionSelect.click()
			*/
		
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
			 /*
			 Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).click();
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("u", Keys.ENTER);
				jse.executeScript("window.scrollBy(0,100)", "up");
			// xpath of country tab::   //*[@id="global-content"]/div/div[2]/section/div/form/div[6]/span/span
			 */
			 Thread.sleep(2000);
			 logger1.info("Country 'United States' is selected");
			MobileElement val1 = driver.findElement(
					By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			 Select valueType1 = new Select(val1);
			 Thread.sleep(2000);
			 valueType1.selectByValue("United States");
			 jse.executeScript("window.scrollBy(0,100)", "up");
				
			 /*
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).click();
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("a", Keys.ENTER);
				jse.executeScript("window.scrollBy(0,100)", "up");
				//xpath of city tab::  //*[@id="global-content"]/div/div[2]/section/div/form/div[9]/input
				*/
				
			 
			 Thread.sleep(2000);
			 logger1.info("State 'Alabama' is selected");
			 MobileElement val2 = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			 Select valueType2 = new Select(val2);
			 Thread.sleep(2000);
			 valueType2.selectByValue("AL");
			 jse.executeScript("window.scrollBy(0,100)", "up"); 
			 
			
			 
			 Thread.sleep(2000);	
			 logger1.info("City name 'Noida' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
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
				 logger1.info("optional message is written '//*[@id=\"comment\"]'");
				 type("cMessage_Xpath", "cMessage");
				
		     //logger1.info("REASON FOR ENQUIRY 'Job Enquiry'");
			 //type("ReasonForEnquiry","SelectingOption");
			 //Thread.sleep(2000);
			 
			 //jse.executeScript("window.scrollBy(0,100)", "up");
				
				//Thread.sleep(2000);	
				//logger1.info("City name 'Noida' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
				//type("cMessage_Xpath", "cMessage");
				
				//Thread.sleep(2000);
				//JavascriptExecutor jk = (JavascriptExecutor) driver;
				//jk.executeScript("document.getElementByTagname('button').setAttribute('disabled', 'enabled')");
				
				
				//driver.findElement(By.xpath("//form[@name='enquiryform']//button")).isEnabled();
				
				/*Thread.sleep(2000);
				 logger1.info("Contact Us button is selected");
				 WebElement button =driver.findElement(By.tagName("button"));
					JavascriptExecutor jsexec = (JavascriptExecutor)driver;
					jsexec.executeScript("arguments[0].click();", button);
				 click("cContactUsButton_Xpath");*/
				 
				 Thread.sleep(10000);
				 logger1.info("Contact Us button is selected");
				 WebElement button =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
					JavascriptExecutor jsexec = (JavascriptExecutor)driver;
					jsexec.executeScript("arguments[0].click();", button);
					//jsexec.executeScript("document.getElementByTagname('button').click();");
				
				// click("cContactusButton_Xpath");
				
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


