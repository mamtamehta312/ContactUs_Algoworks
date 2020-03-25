package webautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.WebCapabilities;

public class ContactFormNegative extends WebCapabilities {

	@BeforeClass
	public static void init() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("ContactForm_url"));
	}
	
	@Test
	  public static void contactformfirstnamenegative() throws Exception {
		driver.navigate().refresh();
		logger1 = extent.createTest("contactform_negative_firstname");
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,400)", "up");

			Thread.sleep(2000);
			logger1.info("First name 'F' is typed in textbox");
			type("cFirstNameNeg_Xpath", "cFirstNameNeg");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath","cLastName");
			
			Thread.sleep(2000);
			logger1.info("PhoneNumber '9899928177' is typed in textbox");
			type("cPhoneNumber_Xpath","cPhoneNumber");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
			type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company name 'Algoworks' is typed in textbox");
			type("cCompany_Xpath","cCompany");
			
			Thread.sleep(2000);
			logger1.info("JobTitle 'Automation QA' is typed in textbox");
			type("cJobTitle_Xpath","cJobTitle");
			
			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("United States");
			
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City 'Noida' is typed in textbox");
			type("cCity_Xpath", "cCity");
			
			
			Thread.sleep(3000);
			logger1.info("Sales Inquiry is selected");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
		
			Thread.sleep(2000);
			logger1.info("Message 'Type your inquiry here' is entered in textarea");
			type("cMessage_Xpath","cMessage");
			
			Thread.sleep(2000);
			logger1.info("Contact Us button is selected");
			click("cContactUsButton_Xpath");
			Thread.sleep(2000);
			
			JavascriptExecutor jsn = (JavascriptExecutor) driver;
			jsn.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Must contain 2-50 characters.");
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			logger1.info("First name '!' is typed in textbox");
			type("cFirstNamespcl_Xpath", "cFirstNamespcl");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath","cLastName");
			
			Thread.sleep(2000);
			logger1.info("PhoneNumber '9899928177' is typed in textbox");
			type("cPhoneNumber_Xpath","cPhoneNumber");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
			type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company name 'Algoworks' is typed in textbox");
			type("cCompany_Xpath","cCompany");
			
			Thread.sleep(2000);
			logger1.info("JobTitle 'Automation QA' is typed in textbox");
			type("cJobTitle_Xpath","cJobTitle");
			
			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("United States");
			
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City 'Noida' is typed in textbox");
			type("cCity_Xpath", "cCity");
			
			
			Thread.sleep(3000);
			logger1.info("Sales Inquiry is selected");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
		
			Thread.sleep(2000);
			logger1.info("Message 'Type your inquiry here' is entered in textarea");
			type("cMessage_Xpath","cMessage");
			
			Thread.sleep(2000);
			logger1.info("Contact Us button is selected");
			click("cContactUsButton_Xpath");
			Thread.sleep(2000);
			
			JavascriptExecutor jsne = (JavascriptExecutor) driver;
			jsne.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String error = TxtBox.getText();
			Assert.assertEquals(error, "Must contain 2-50 characters.");
			
            driver.navigate().refresh();
			
			Thread.sleep(2000);
			logger1.info("First name 'Form@' is typed in textbox");
			type("cFirstNamespc_Xpath", "cFirstNamespc");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath","cLastName");
			
			Thread.sleep(2000);
			logger1.info("PhoneNumber '9899928177' is typed in textbox");
			type("cPhoneNumber_Xpath","cPhoneNumber");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
			type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company name 'Algoworks' is typed in textbox");
			type("cCompany_Xpath","cCompany");
			
			Thread.sleep(2000);
			logger1.info("JobTitle 'Automation QA' is typed in textbox");
			type("cJobTitle_Xpath","cJobTitle");
			
			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("United States");
			
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City 'Noida' is typed in textbox");
			type("cCity_Xpath", "cCity");
			
			
			Thread.sleep(3000);
			logger1.info("Sales Inquiry is selected");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
		
			Thread.sleep(2000);
			logger1.info("Message 'Type your inquiry here' is entered in textarea");
			type("cMessage_Xpath","cMessage");
			
			Thread.sleep(2000);
			logger1.info("Contact Us button is selected");
			click("cContactUsButton_Xpath");
			Thread.sleep(2000);
			
			JavascriptExecutor scroll = (JavascriptExecutor) driver;
			scroll.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String error_m = TextBox.getText();
			Assert.assertEquals(error_m, "Must contain 2-50 characters.");
			
			
		}
		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}	
			
			@Test
			
			 public static void contactformlastname() throws Exception {
				driver.navigate().refresh();
				logger1 = extent.createTest("contactform_negative_lastname");
				try {
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'T' is typed in textbox");
			type("cLastNameNeg_Xpath","cLastNameNeg");
			
			Thread.sleep(2000);
			logger1.info("PhoneNumber '9899928177' is typed in textbox");
			type("cPhoneNumber_Xpath","cPhoneNumber");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
			type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company name 'Algoworks' is typed in textbox");
			type("cCompany_Xpath","cCompany");
			
			Thread.sleep(2000);
			logger1.info("JobTitle 'Automation QA' is typed in textbox");
			type("cJobTitle_Xpath","cJobTitle");
			
			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("United States");
			
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City 'Noida' is typed in textbox");
			type("cCity_Xpath", "cCity");
			
			
			Thread.sleep(3000);
			logger1.info("Sales Inquiry is selected");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
		
			Thread.sleep(2000);
			logger1.info("Message 'Type your inquiry here' is entered in textarea");
			type("cMessage_Xpath","cMessage");
			
			Thread.sleep(2000);
			logger1.info("Contact Us button is selected");
			click("cContactUsButton_Xpath");
			Thread.sleep(2000);
			
			JavascriptExecutor jsne = (JavascriptExecutor) driver;
			jsne.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String error = TxtBox.getText();
			Assert.assertEquals(error, "Must contain 2-50 characters.");
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name '!' is typed in textbox");
			type("cLastNameNegspcl_Xpath","cLastNameNegspcl");
			
			Thread.sleep(2000);
			logger1.info("PhoneNumber '9899928177' is typed in textbox");
			type("cPhoneNumber_Xpath","cPhoneNumber");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
			type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company name 'Algoworks' is typed in textbox");
			type("cCompany_Xpath","cCompany");
			
			Thread.sleep(2000);
			logger1.info("JobTitle 'Automation QA' is typed in textbox");
			type("cJobTitle_Xpath","cJobTitle");
			
			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("United States");
			
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City 'Noida' is typed in textbox");
			type("cCity_Xpath", "cCity");
			
			
			Thread.sleep(3000);
			logger1.info("Sales Inquiry is selected");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
		
			Thread.sleep(2000);
			logger1.info("Message 'Type your inquiry here' is entered in textarea");
			type("cMessage_Xpath","cMessage");
			
			Thread.sleep(2000);
			logger1.info("Contact Us button is selected");
			click("cContactUsButton_Xpath");
			Thread.sleep(2000);
			
			JavascriptExecutor jsnew = (JavascriptExecutor) driver;
			jsnew.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txt_Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String error_me = Txt_Box.getText();
			Assert.assertEquals(error_me, "Must contain 2-50 characters.");
			
            driver.navigate().refresh();
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing#' is typed in textbox");
			type("cLastNameNegspc_Xpath","cLastNameNegspc");
			
			Thread.sleep(2000);
			logger1.info("PhoneNumber '9899928177' is typed in textbox");
			type("cPhoneNumber_Xpath","cPhoneNumber");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
			type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company name 'Algoworks' is typed in textbox");
			type("cCompany_Xpath","cCompany");
			
			Thread.sleep(2000);
			logger1.info("JobTitle 'Automation QA' is typed in textbox");
			type("cJobTitle_Xpath","cJobTitle");
			
			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("United States");
			
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City 'Noida' is typed in textbox");
			type("cCity_Xpath", "cCity");
			
			
			Thread.sleep(3000);
			logger1.info("Sales Inquiry is selected");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
		
			Thread.sleep(2000);
			logger1.info("Message 'Type your inquiry here' is entered in textarea");
			type("cMessage_Xpath","cMessage");
			
			Thread.sleep(2000);
			logger1.info("Contact Us button is selected");
			click("cContactUsButton_Xpath");
			Thread.sleep(2000);
			
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txtt_Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String error_message = Txtt_Box.getText();
			Assert.assertEquals(error_message, "Must contain 2-50 characters.");
			
			
		}
				
				
			
			catch (Exception e) {
				logger1.fail(e);
				throw e;
			}
			}
				
				@Test
				
				 public static void contactformnumber() throws Exception {
					driver.navigate().refresh();
					logger1 = extent.createTest("contactform_negative_number");
					try {
				
				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("cFirstName_Xpath", "cFirstName");
				
				Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath","cLastName");
				
				Thread.sleep(2000);
				logger1.info("PhoneNumber '123456' is typed in textbox");
				type("cPhoneNumberNeg_Xpath","cPhoneNumberNeg");
				
				Thread.sleep(2000);
				logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
				type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
				
				Thread.sleep(2000);
				logger1.info("Company name 'Algoworks' is typed in textbox");
				type("cCompany_Xpath","cCompany");
				
				Thread.sleep(2000);
				logger1.info("JobTitle 'Automation QA' is typed in textbox");
				type("cJobTitle_Xpath","cJobTitle");
				
				Thread.sleep(2000);
				logger1.info("Country 'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("United States");
				
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City 'Noida' is typed in textbox");
				type("cCity_Xpath", "cCity");
				
				
				Thread.sleep(3000);
				logger1.info("Sales Inquiry is selected");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
			
				Thread.sleep(2000);
				logger1.info("Message 'Type your inquiry here' is entered in textarea");
				type("cMessage_Xpath","cMessage");
				
				Thread.sleep(2000);
				logger1.info("Contact Us button is selected");
				click("cContactUsButton_Xpath");
				Thread.sleep(2000);
				
				JavascriptExecutor jsne = (JavascriptExecutor) driver;
				jsne.executeScript("window.scrollBy(0,-400)", "down");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
				String error = TxtBox.getText();
				Assert.assertEquals(error, "Must contain numerical characters.");
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				
				Thread.sleep(3000);
				logger1.info("First name 'Form' is typed in textbox");
				type("cFirstName_Xpath", "cFirstName");
				
				Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath","cLastName");
				
				Thread.sleep(2000);
				logger1.info("PhoneNumber '12345@' is typed in textbox");
				type("cPhoneNumberNegspcl_Xpath","cPhoneNumberNegspcl");
				
				Thread.sleep(2000);
				logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
				type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
				
				Thread.sleep(2000);
				logger1.info("Company name 'Algoworks' is typed in textbox");
				type("cCompany_Xpath","cCompany");
				
				Thread.sleep(2000);
				logger1.info("JobTitle 'Automation QA' is typed in textbox");
				type("cJobTitle_Xpath","cJobTitle");
				
				Thread.sleep(2000);
				logger1.info("Country 'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("United States");
				
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City 'Noida' is typed in textbox");
				type("cCity_Xpath", "cCity");
				
				
				Thread.sleep(3000);
				logger1.info("Sales Inquiry is selected");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
			
				Thread.sleep(2000);
				logger1.info("Message 'Type your inquiry here' is entered in textarea");
				type("cMessage_Xpath","cMessage");
				
				Thread.sleep(2000);
				logger1.info("Contact Us button is selected");
				click("cContactUsButton_Xpath");
				Thread.sleep(2000);
				
				JavascriptExecutor jscript = (JavascriptExecutor) driver;
				jscript.executeScript("window.scrollBy(0,-400)", "down");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Txt_Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
				String error_message = Txt_Box.getText();
				Assert.assertEquals(error_message, "Must contain numerical characters.");
				Thread.sleep(2000);
				
                driver.navigate().refresh();
				
				Thread.sleep(3000);
				logger1.info("First name 'Form' is typed in textbox");
				type("cFirstName_Xpath", "cFirstName");
				
				Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath","cLastName");
				
				Thread.sleep(2000);
				logger1.info("PhoneNumber '12345678#' is typed in textbox");
				type("cPhoneNumberNegspc_Xpath","cPhoneNumberNegspc");
				
				Thread.sleep(2000);
				logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
				type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
				
				Thread.sleep(2000);
				logger1.info("Company name 'Algoworks' is typed in textbox");
				type("cCompany_Xpath","cCompany");
				
				Thread.sleep(2000);
				logger1.info("JobTitle 'Automation QA' is typed in textbox");
				type("cJobTitle_Xpath","cJobTitle");
				
				Thread.sleep(2000);
				logger1.info("Country 'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("United States");
				
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City 'Noida' is typed in textbox");
				type("cCity_Xpath", "cCity");
				
				
				Thread.sleep(3000);
				logger1.info("Sales Inquiry is selected");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
			
				Thread.sleep(2000);
				logger1.info("Message 'Type your inquiry here' is entered in textarea");
				type("cMessage_Xpath","cMessage");
				
				Thread.sleep(2000);
				logger1.info("Contact Us button is selected");
				click("cContactUsButton_Xpath");
				Thread.sleep(2000);
				
				JavascriptExecutor jscriptt = (JavascriptExecutor) driver;
				jscriptt.executeScript("window.scrollBy(0,-400)", "down");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Text_Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
				String error_mess = Text_Box.getText();
				Assert.assertEquals(error_mess, "Must contain numerical characters.");
				Thread.sleep(2000);

			
		}
					catch (Exception e) {
						logger1.fail(e);
						throw e;
					}
					Thread.sleep(3000);

					logger1.pass("Testcase ContactForm Negative is Passed");
	}
			}
