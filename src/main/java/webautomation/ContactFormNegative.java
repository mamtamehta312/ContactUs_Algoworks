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
	
	@Test(priority=1)
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
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name '!!' is typed in textbox");
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
            logger1.info("------------------------------------------------------------");
			
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
			
			
            driver.navigate().refresh();
            logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name '123456' is typed in textbox");
			type("cFirstNameNum_Xpath", "cFirstNameNum");
			
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
			
			JavascriptExecutor scrol = (JavascriptExecutor) driver;
			scrol.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String errors = TBox.getText();
			Assert.assertEquals(errors, "Must contain 2-50 characters.");
			
			
            driver.navigate().refresh();
            logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name '' is typed in textbox");
			type("cFirstNameBlank_Xpath", "cFirstNameBlank");
			
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
			
			JavascriptExecutor scr = (JavascriptExecutor) driver;
			scr.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String err = Box.getText();
			Assert.assertEquals(err, "Must contain 2-50 characters.");
			
			
            driver.navigate().refresh();
            logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form1234' is typed in textbox");
			type("cFirstNameAlphdigit_Xpath", "cFirstNameAlphdigit");
			
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
			
			JavascriptExecutor sc = (JavascriptExecutor) driver;
			sc.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement txtb = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String bug = txtb.getText();
			Assert.assertEquals(bug, "Must contain 2-50 characters.");
			logger1.info("------------------------------------------------------------");
		}
		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}	
			
			@Test(priority = 2)
			
			 public static void contactformlastnamenegative() throws Exception {
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
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name '!!' is typed in textbox");
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
            logger1.info("------------------------------------------------------------");
			
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
			
			
            driver.navigate().refresh();
            logger1.info("------------------------------------------------------------");
            
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name '1234' is typed in textbox");
			type("cLastNameNegNum_Xpath","cLastNameNegNum");
			
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
			
			JavascriptExecutor jexec = (JavascriptExecutor) driver;
			jexec.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String e = Text.getText();
			Assert.assertEquals(e, "Must contain 2-50 characters.");
			
            driver.navigate().refresh();
            logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name '' is typed in textbox");
			type("cLastNameNegBlank_Xpath","cLastNameNegBlank");
			
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
			
			JavascriptExecutor scriptex = (JavascriptExecutor) driver;
			scriptex.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String erro = Txt.getText();
			Assert.assertEquals(erro, "Must contain 2-50 characters.");
			
            driver.navigate().refresh();
            logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing1234' is typed in textbox");
			type("cLastNameNegAlphdigit_Xpath","cLastNameNegAlphdigit");
			
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
			
			JavascriptExecutor s = (JavascriptExecutor) driver;
			s.executeScript("window.scrollBy(0,-400)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement t = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String bugmess = t.getText();
			Assert.assertEquals(bugmess, "Must contain 2-50 characters.");
			logger1.info("------------------------------------------------------------");
			
		}
				
				
			
			catch (Exception e) {
				logger1.fail(e);
				throw e;
			}
			}
				
				@Test(priority=3)
				
				 public static void contactformnumbernegative() throws Exception {
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
				logger1.info("------------------------------------------------------------");
				
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
                logger1.info("------------------------------------------------------------");
				
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
				
                driver.navigate().refresh();
                logger1.info("------------------------------------------------------------");
				
				Thread.sleep(3000);
				logger1.info("First name 'Form' is typed in textbox");
				type("cFirstName_Xpath", "cFirstName");
				
				Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath","cLastName");
				
				Thread.sleep(2000);
				logger1.info("PhoneNumber '' is typed in textbox");
				type("cPhoneNumberNegBlank_Xpath","cPhoneNumberNegBlank");
				
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
				
				JavascriptExecutor jsexc = (JavascriptExecutor) driver;
				jsexc.executeScript("window.scrollBy(0,-400)", "down");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement gettext = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
				String bugs = gettext.getText();
				Assert.assertEquals(bugs, "Must contain numerical characters.");
				Thread.sleep(2000);
				
				 driver.navigate().refresh();
	                logger1.info("------------------------------------------------------------");
					
					Thread.sleep(3000);
					logger1.info("First name 'Form' is typed in textbox");
					type("cFirstName_Xpath", "cFirstName");
					
					Thread.sleep(2000);
					logger1.info("Last name 'Testing' is typed in textbox");
					type("cLastName_Xpath","cLastName");
					
					Thread.sleep(2000);
					logger1.info("PhoneNumber '!@#$%^&*' is typed in textbox");
					type("cPhoneNumberNegAllspc_Xpath","cPhoneNumberNegAllspc");
					
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
					
					JavascriptExecutor up = (JavascriptExecutor) driver;
					up.executeScript("window.scrollBy(0,-400)", "down");
					
					Thread.sleep(2000);
					logger1.info("Checked error text on submission");
					WebElement tb = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
					String bugg = tb.getText();
					Assert.assertEquals(bugg, "Must contain numerical characters.");
					Thread.sleep(2000);
					
					driver.navigate().refresh();
	                logger1.info("------------------------------------------------------------");
					
					Thread.sleep(3000);
					logger1.info("First name 'Form' is typed in textbox");
					type("cFirstName_Xpath", "cFirstName");
					
					Thread.sleep(2000);
					logger1.info("Last name 'Testing' is typed in textbox");
					type("cLastName_Xpath","cLastName");
					
					Thread.sleep(2000);
					logger1.info("PhoneNumber 'abcdefghi' is typed in textbox");
					type("cPhoneNumberNegAllalph_Xpath","cPhoneNumberNegAllalph");
					
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
					
					JavascriptExecutor upp = (JavascriptExecutor) driver;
					upp.executeScript("window.scrollBy(0,-400)", "down");
					
					Thread.sleep(2000);
					logger1.info("Checked error text on submission");
					WebElement txtb = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
					String bug = txtb.getText();
					Assert.assertEquals(bug, "Must contain numerical characters.");
					Thread.sleep(2000);
					
		}
					catch (Exception e) {
						logger1.fail(e);
						throw e;
					}
				}
				
				@Test(priority = 4)
				
				 public static void contactformemail() throws Exception {
					driver.navigate().refresh();
					logger1 = extent.createTest("contactform_negative_email");
					try {
				
				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("cFirstName_Xpath", "cFirstName");
				
				Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath","cLastName");
				
				Thread.sleep(2000);
				logger1.info("PhoneNumber '9899928177' is typed in textbox");
				type("cPhoneNumber_Xpath","cPhoneNumber");
				
				Thread.sleep(2000);
				logger1.info("Email 'dumpings@fake.com' is typed in textbox");
				type("cBusinessEmailAddressFake_Xpath","cBusinessEmailAddressFake");
				
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
				WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
				String error = TextBox.getText();
				Assert.assertEquals(error, "Please enter a valid email address (2-50 characters).");
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				Thread.sleep(3000);
				logger1.info("First name 'Form' is typed in textbox");
				type("cFirstName_Xpath", "cFirstName");
				
				Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath","cLastName");
				
				Thread.sleep(2000);
				logger1.info("PhoneNumber '9899928177' is typed in textbox");
				type("cPhoneNumber_Xpath","cPhoneNumber");
				
				Thread.sleep(2000);
				logger1.info("Email '1234567@fake.com' is typed in textbox");
				type("cBusinessEmailAddressNfake_Xpath","cBusinessEmailAddressNfake");
				
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
				WebElement Txt_Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
				String error_message = Txt_Box.getText();
				Assert.assertEquals(error_message, "Please enter a valid email address (2-50 characters).");
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				Thread.sleep(3000);
				logger1.info("First name 'Form' is typed in textbox");
				type("cFirstName_Xpath", "cFirstName");
				
				Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath","cLastName");
				
				Thread.sleep(2000);
				logger1.info("PhoneNumber '9899928177' is typed in textbox");
				type("cPhoneNumber_Xpath","cPhoneNumber");
				
				Thread.sleep(2000);
				logger1.info("Email '!@#$%^&*@fake.com' is typed in textbox");
				type("cBusinessEmailAddressSfake_Xpath","cBusinessEmailAddressSfake");
				
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
				
				JavascriptExecutor javas = (JavascriptExecutor) driver;
				javas.executeScript("window.scrollBy(0,-400)", "down");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
				String error_mess = TBox.getText();
				Assert.assertEquals(error_mess, "Please enter a valid email address (2-50 characters).");
				Thread.sleep(2000);
				
				
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				Thread.sleep(3000);
				logger1.info("First name 'Form' is typed in textbox");
				type("cFirstName_Xpath", "cFirstName");
				
				Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath","cLastName");
				
				Thread.sleep(2000);
				logger1.info("PhoneNumber '9899928177' is typed in textbox");
				type("cPhoneNumber_Xpath","cPhoneNumber");
				
				Thread.sleep(2000);
				logger1.info("Email 'dumpings125543@fake.com' is typed in textbox");
				type("cBusinessEmailAddressMixfake_Xpath","cBusinessEmailAddressMixfake");
				
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
				
				JavascriptExecutor javasc = (JavascriptExecutor) driver;
				javasc.executeScript("window.scrollBy(0,-400)", "down");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
				String errors = Box.getText();
				Assert.assertEquals(errors, "Please enter a valid email address (2-50 characters).");
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				Thread.sleep(3000);
				logger1.info("First name 'Form' is typed in textbox");
				type("cFirstName_Xpath", "cFirstName");
				
				Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath","cLastName");
				
				Thread.sleep(2000);
				logger1.info("PhoneNumber '9899928177' is typed in textbox");
				type("cPhoneNumber_Xpath","cPhoneNumber");
				
				Thread.sleep(2000);
				logger1.info("Email '123456789' is typed in textbox");
				type("cBusinessEmailAddressNumber_Xpath","cBusinessEmailAddressNumber");
				
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
				
				JavascriptExecutor javascr = (JavascriptExecutor) driver;
				javascr.executeScript("window.scrollBy(0,-400)", "down");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement value = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
				String err = value.getText();
				Assert.assertEquals(err, "Please enter a valid email address (2-50 characters).");
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				Thread.sleep(3000);
				logger1.info("First name 'Form' is typed in textbox");
				type("cFirstName_Xpath", "cFirstName");
				
				Thread.sleep(2000);
				logger1.info("Last name 'Testing' is typed in textbox");
				type("cLastName_Xpath","cLastName");
				
				Thread.sleep(2000);
				logger1.info("PhoneNumber '9899928177' is typed in textbox");
				type("cPhoneNumber_Xpath","cPhoneNumber");
				
				Thread.sleep(2000);
				logger1.info("Email 'Dumpings' is typed in textbox");
				type("cBusinessEmailAddressAlphs_Xpath","cBusinessEmailAddressAlphs");
				
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
				
				JavascriptExecutor javascri = (JavascriptExecutor) driver;
				javascri.executeScript("window.scrollBy(0,-400)", "down");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement values = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
				String errs = values.getText();
				Assert.assertEquals(errs, "Please enter a valid email address (2-50 characters).");
				Thread.sleep(2000);
				
				logger1.info("------------------------------------------------------------");
				
					}
					catch (Exception e) {
						logger1.fail(e);
						throw e;
					}
					
					Thread.sleep(3000);

					logger1.pass("Testcase ContactForm Negative is Passed");
	}
			}
