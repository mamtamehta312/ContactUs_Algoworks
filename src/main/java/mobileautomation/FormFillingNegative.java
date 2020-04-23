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
import org.testng.Assert;
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

public class FormFillingNegative extends AndroidCapabilities {
	@BeforeClass
	public static void init() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("url"));
	}

	@Test(priority =1)
	public static void formFillingfirstnameNegative() throws Exception {
		logger1 = extent.createTest("formFilling_FirstName_Negative");
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1500)", "up");

			Thread.sleep(2000);
			logger1.info("First name 'F' is typed in textbox");
			type("fFirstNameNeg_Xpath", "fFirstNameNeg");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement s1 = findElement("fCountry2_Xpath");
			Select jobType1 = new Select(s1);
			Thread.sleep(2000);
			jobType1.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement s3 = findElement("fJobInquiry_Xpath");
			Select jobType3 = new Select(s3);
			Thread.sleep(2000);
			jobType3.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement button =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", button);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name '@@' is typed in textbox");
			type("fFirstNameSpcl_Xpath", "fFirstNameSpcl");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryValue = findElement("fCountry2_Xpath");
			Select CValueTYpe = new Select(CountryValue);
			Thread.sleep(2000);
			CValueTYpe.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement JobInquiryValue = findElement("fJobInquiry_Xpath");
			Select JinquiryValueType = new Select(JobInquiryValue);
			Thread.sleep(2000);
			JinquiryValueType.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement butto =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", butto);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String presen = TxtBox.getText();
			Assert.assertEquals(presen, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form@' is typed in textbox");
			type("fFirstNameSpc_Xpath", "fFirstNameSpc");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryValu = findElement("fCountry2_Xpath");
			Select CValueTYp = new Select(CountryValu);
			Thread.sleep(2000);
			CValueTYp.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement JobInquiryValu = findElement("fJobInquiry_Xpath");
			Select JinquiryValueTyp = new Select(JobInquiryValu);
			Thread.sleep(2000);
			JinquiryValueTyp.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement butt =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", butt);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String prese = TextBox.getText();
			Assert.assertEquals(prese, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name ' ' is typed in textbox");
			type("fFirstNameBlank_Xpath", "fFirstNameBlank");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryVal = findElement("fCountry2_Xpath");
			Select CValueTY = new Select(CountryVal);
			Thread.sleep(2000);
			CValueTY.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement JobInquiryVal = findElement("fJobInquiry_Xpath");
			Select JinquiryValueTy = new Select(JobInquiryVal);
			Thread.sleep(2000);
			JinquiryValueTy.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement but =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", but);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String pres = Text.getText();
			Assert.assertEquals(pres, "Must contain 2-50 alphabetic characters ..");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name '12345' is typed in textbox");
			type("fFirstNameNum_Xpath", "fFirstNameNum");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryVa = findElement("fCountry2_Xpath");
			Select CValueT = new Select(CountryVa);
			Thread.sleep(2000);
			CValueT.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement JobInquiryVa = findElement("fJobInquiry_Xpath");
			Select JinquiryValueT = new Select(JobInquiryVa);
			Thread.sleep(2000);
			JinquiryValueT.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement bu =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", bu);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String pre = Texts.getText();
			Assert.assertEquals(pre, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form1234' is typed in textbox");
			type("fFirstNameAlphdigit_Xpath", "fFirstNameAlphdigit");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryV = findElement("fCountry2_Xpath");
			Select CValue = new Select(CountryV);
			Thread.sleep(2000);
			CValue.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement JobInquiryV = findElement("fJobInquiry_Xpath");
			Select JinquiryValue = new Select(JobInquiryV);
			Thread.sleep(2000);
			JinquiryValue.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement b =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", b);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement T = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String pr = T.getText();
			Assert.assertEquals(pr, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");	
			
		} catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");
			throw e;
		}
	}
	@Test(priority =2)
	public static void formFillinglastnameNegative() throws Exception {
		logger1 = extent.createTest("formFilling_LastName_Negative");
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1500)", "up");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'T' is typed in textbox");
			type("fLastNameNeg_Xpath", "fLastNameNeg");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement s1 = findElement("fCountry2_Xpath");
			Select jobType1 = new Select(s1);
			Thread.sleep(2000);
			jobType1.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement s3 = findElement("fJobInquiry_Xpath");
			Select jobType3 = new Select(s3);
			Thread.sleep(2000);
			jobType3.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement button =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", button);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name '@@' is typed in textbox");
			type("fLastNameSpcl_Xpath", "fLastNameSpcl");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryValue = findElement("fCountry2_Xpath");
			Select CValueType = new Select(CountryValue);
			Thread.sleep(2000);
			CValueType.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement ReasonInquiryValue = findElement("fJobInquiry_Xpath");
			Select RInquiryType = new Select(ReasonInquiryValue);
			Thread.sleep(2000);
			RInquiryType.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement butto =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", butto);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
			String presen = TxtBox.getText();
			Assert.assertEquals(presen, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing@' is typed in textbox");
			type("fLastNameSpc_Xpath", "fLastNameSpc");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryValu = findElement("fCountry2_Xpath");
			Select CValueTyp = new Select(CountryValu);
			Thread.sleep(2000);
			CValueTyp.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement ReasonInquiryValu = findElement("fJobInquiry_Xpath");
			Select RInquiryTyp = new Select(ReasonInquiryValu);
			Thread.sleep(2000);
			RInquiryTyp.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement butt =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", butt);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBo = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
			String prese = TxtBo.getText();
			Assert.assertEquals(prese, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name '12345' is typed in textbox");
			type("fLastNameNum_Xpath", "fLastNameNum");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryVal = findElement("fCountry2_Xpath");
			Select CValueTy = new Select(CountryVal);
			Thread.sleep(2000);
			CValueTy.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement ReasonInquiryVal = findElement("fJobInquiry_Xpath");
			Select RInquiryTy = new Select(ReasonInquiryVal);
			Thread.sleep(2000);
			RInquiryTy.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement but =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", but);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtB = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
			String pres = TxtB.getText();
			Assert.assertEquals(pres, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name ' ' is typed in textbox");
			type("fLastNameBlank_Xpath", "fLastNameBlank");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryVa = findElement("fCountry2_Xpath");
			Select CValueT = new Select(CountryVa);
			Thread.sleep(2000);
			CValueT.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement ReasonInquiryVa = findElement("fJobInquiry_Xpath");
			Select RInquiryT = new Select(ReasonInquiryVa);
			Thread.sleep(2000);
			RInquiryT.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement bu =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", bu);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
			String pre = Txt.getText();
			Assert.assertEquals(pre, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing1234' is typed in textbox");
			type("fLastNameAlphdigit_Xpath", "fLastNameAlphdigit");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryV = findElement("fCountry2_Xpath");
			Select CValue = new Select(CountryV);
			Thread.sleep(2000);
			CValue.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement ReasonInquiryV = findElement("fJobInquiry_Xpath");
			Select RInquiry = new Select(ReasonInquiryV);
			Thread.sleep(2000);
			RInquiry.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement b =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", b);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
			String pr = Text.getText();
			Assert.assertEquals(pr, "Must contain 2-50 alphabetic characters .");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");		
		}
		catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");
			throw e;
		}
	}
	@Test(priority =3)
	public static void formFillingPhonenumberNegative() throws Exception {
		logger1 = extent.createTest("formFilling_PhoneNumber_Negative");
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1500)", "up");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '12345' given in textbox");
			type("fPhoneNumberNeg_Xpath", "fPhoneNumberNeg");
			
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement s1 = findElement("fCountry2_Xpath");
			Select jobType1 = new Select(s1);
			Thread.sleep(2000);
			jobType1.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement s3 = findElement("fJobInquiry_Xpath");
			Select jobType3 = new Select(s3);
			Thread.sleep(2000);
			jobType3.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement button =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", button);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Must contain 7-15 numerical characters.");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '12345@' given in textbox");
			type("fPhoneNumberSpcl_Xpath", "fPhoneNumberSpcl");
			
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryValue = findElement("fCountry2_Xpath");
			Select CValueType = new Select(CountryValue);
			Thread.sleep(2000);
			CValueType.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement ReasonInquiryValue = findElement("fJobInquiry_Xpath");
			Select RInquiryType = new Select(ReasonInquiryValue);
			Thread.sleep(2000);
			RInquiryType.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement butto =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", butto);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCont = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
			String presen = TxtBoxCont.getText();
			Assert.assertEquals(presen, "Must contain 7-15 numerical characters.");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");	
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '12345678@' given in textbox");
			type("fPhoneNumberSpc_Xpath", "fPhoneNumberSpc");
			
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryValu = findElement("fCountry2_Xpath");
			Select CValueTyp = new Select(CountryValu);
			Thread.sleep(2000);
			CValueTyp.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement ReasonInquiryValu = findElement("fJobInquiry_Xpath");
			Select RInquiryTyp = new Select(ReasonInquiryValu);
			Thread.sleep(2000);
			RInquiryTyp.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement butt =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", butt);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCon = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
			String prese = TxtBoxCon.getText();
			Assert.assertEquals(prese, "Must contain 7-15 numerical characters.");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is ' ' given in textbox");
			type("fPhoneNumberBlank_Xpath", "fPhoneNumberBlank");
			
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryVal = findElement("fCountry2_Xpath");
			Select CValueTy = new Select(CountryVal);
			Thread.sleep(2000);
			CValueTy.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement ReasonInquiryVal = findElement("fJobInquiry_Xpath");
			Select RInquiryTy = new Select(ReasonInquiryVal);
			Thread.sleep(2000);
			RInquiryTy.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement but =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", but);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCo = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
			String pres = TxtBoxCo.getText();
			Assert.assertEquals(pres, "Must contain 7-15 numerical characters.");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '!@#$%^&*' given in textbox");
			type("fPhoneNumberAllSpcl_Xpath", "fPhoneNumberAllSpcl");
			
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryVa = findElement("fCountry2_Xpath");
			Select CValueT = new Select(CountryVa);
			Thread.sleep(2000);
			CValueT.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement ReasonInquiryVa = findElement("fJobInquiry_Xpath");
			Select RInquiryT = new Select(ReasonInquiryVa);
			Thread.sleep(2000);
			RInquiryT.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement bu =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", bu);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxC = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
			String pre = TxtBoxC.getText();
			Assert.assertEquals(pre, "Must contain 7-15 numerical characters.");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is 'abcdefghi' given in textbox");
			type("fPhoneNumberAllAlphs_Xpath", "fPhoneNumberAllAlphs");
			
			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryV = findElement("fCountry2_Xpath");
			Select CValue = new Select(CountryV);
			Thread.sleep(2000);
			CValue.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement ReasonInquiryV = findElement("fJobInquiry_Xpath");
			Select RInquiry = new Select(ReasonInquiryV);
			Thread.sleep(2000);
			RInquiry.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement b =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", b);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
			String pr = TxtBox.getText();
			Assert.assertEquals(pr, "Must contain 7-15 numerical characters.");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		}
		catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");
			throw e;
		}
	}
	@Test(priority =4)
	public static void formFillingEmailNegative() throws Exception {
		logger1 = extent.createTest("formFilling_Email_Negative");
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1500)", "up");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'dumpings@fake.com' typed in textbox ");
			type("fBusinessEmailAddressNeg_Xpath", "fBusinessEmailAddressNeg");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement s1 = findElement("fCountry2_Xpath");
			Select jobType1 = new Select(s1);
			Thread.sleep(2000);
			jobType1.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement s3 = findElement("fJobInquiry_Xpath");
			Select jobType3 = new Select(s3);
			Thread.sleep(2000);
			jobType3.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement button =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", button);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Please enter a valid email address (2-50 characters).");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address '12345@fake.com' typed in textbox ");
			type("fBusinessEmailAddressNFake_Xpath", "fBusinessEmailAddressNFake");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryValue = findElement("fCountry2_Xpath");
			Select CValueType = new Select(CountryValue);
			Thread.sleep(2000);
			CValueType.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement REasonInquiryValue = findElement("fJobInquiry_Xpath");
			Select RInquiryValueType = new Select(REasonInquiryValue);
			Thread.sleep(2000);
			RInquiryValueType.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement butto =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", butto);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxConten = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
			String presen = TxtBoxConten.getText();
			Assert.assertEquals(presen, "Please enter a valid email address (2-50 characters).");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address '!@#$%^&*@fake.com' typed in textbox ");
			type("fBusinessEmailAddressSFake_Xpath", "fBusinessEmailAddressSFake");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryValu = findElement("fCountry2_Xpath");
			Select CValueTyp = new Select(CountryValu);
			Thread.sleep(2000);
			CValueTyp.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement REasonInquiryValu = findElement("fJobInquiry_Xpath");
			Select RInquiryValueTyp = new Select(REasonInquiryValu);
			Thread.sleep(2000);
			RInquiryValueTyp.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement butt =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", butt);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxConte = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
			String prese = TxtBoxConte.getText();
			Assert.assertEquals(prese, "Please enter a valid email address (2-50 characters).");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'dumpings1234@fake.com' typed in textbox ");
			type("fBusinessEmailAddressMixFake_Xpath", "fBusinessEmailAddressMixFake");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryVal = findElement("fCountry2_Xpath");
			Select CValueTy = new Select(CountryVal);
			Thread.sleep(2000);
			CValueTy.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement REasonInquiryVal = findElement("fJobInquiry_Xpath");
			Select RInquiryValueTy = new Select(REasonInquiryVal);
			Thread.sleep(2000);
			RInquiryValueTy.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement but =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", but);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCont = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
			String pres = TxtBoxCont.getText();
			Assert.assertEquals(pres, "Please enter a valid email address (2-50 characters).");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address '12345' typed in textbox ");
			type("fBusinessEmailAddressNum_Xpath", "fBusinessEmailAddressNum");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryVa = findElement("fCountry2_Xpath");
			Select CValueT = new Select(CountryVa);
			Thread.sleep(2000);
			CValueT.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement REasonInquiryVa = findElement("fJobInquiry_Xpath");
			Select RInquiryValueT = new Select(REasonInquiryVa);
			Thread.sleep(2000);
			RInquiryValueT.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement bu =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", bu);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCon = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
			String pre = TxtBoxCon.getText();
			Assert.assertEquals(pre, "Please enter a valid email address (2-50 characters).");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info("Business Email Address 'abcdefghi' typed in textbox ");
			type("fBusinessEmailAddressAlphs_Xpath", "fBusinessEmailAddressAlphs");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("fJobTitle_Xpath", "fJobTitle");
		
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,100)", "up");

			logger1.info("Country name 'United Kingdom' given in textbox");
			WebElement CountryV = findElement("fCountry2_Xpath");
			Select CValue = new Select(CountryV);
			Thread.sleep(2000);
			CValue.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox'");
			WebElement REasonInquiryV = findElement("fJobInquiry_Xpath");
			Select RInquiryValue = new Select(REasonInquiryV);
			Thread.sleep(2000);
			RInquiryValue.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);
			
			 logger1.info("Contact Us button is selected");
			 WebElement b =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				
				jse.executeScript("arguments[0].click();", b);			
			
			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCo = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
			String pr = TxtBoxCo.getText();
			Assert.assertEquals(pr, "Please enter a valid email address (2-50 characters).");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");		
		}
		catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");
			throw e;
		}
	
}
@Test(priority =5)
public static void formFillingCompanyNegative() throws Exception {
	logger1 = extent.createTest("formFilling_Company_Negative");
	try {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500)", "up");

		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company 'A' given in textbox");
		type("fCompanySChar_Xpath", "fCompanySChar");

		Thread.sleep(2000);
		logger1.info("Job Title 'Automation QA' given in textbox");
		type("fJobTitle_Xpath", "fJobTitle");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		logger1.info("Country name 'United Kingdom' given in textbox");
		WebElement s1 = findElement("fCountry2_Xpath");
		Select jobType1 = new Select(s1);
		Thread.sleep(2000);
		jobType1.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement s3 = findElement("fJobInquiry_Xpath");
		Select jobType3 = new Select(s3);
		Thread.sleep(2000);
		jobType3.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement button =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", button);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[4]/div[2]"));
		String present = TxtBoxContent.getText();
		Assert.assertEquals(present, "Must contain 2-50 characters with atleast 1 albhabetic character.");
		
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company '1234' given in textbox");
		type("fCompanyNum_Xpath", "fCompanyNum");

		Thread.sleep(2000);
		logger1.info("Job Title 'Automation QA' given in textbox");
		type("fJobTitle_Xpath", "fJobTitle");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		logger1.info("Country name 'United Kingdom' given in textbox");
		WebElement CountryValue = findElement("fCountry2_Xpath");
		Select CValueType = new Select(CountryValue);
		Thread.sleep(2000);
		CValueType.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement JobInquiry = findElement("fJobInquiry_Xpath");
		Select JInquiryType = new Select(JobInquiry);
		Thread.sleep(2000);
		JInquiryType.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement buttons =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", buttons);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxContents = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[4]/div[2]"));
		String presents = TxtBoxContents.getText();
		Assert.assertEquals(presents, "Must contain 2-50 characters with atleast 1 albhabetic character.");
		
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company '!@#$' given in textbox");
		type("fCompanySpecialChar_Xpath", "fCompanySpecialChar");

		Thread.sleep(2000);
		logger1.info("Job Title 'Automation QA' given in textbox");
		type("fJobTitle_Xpath", "fJobTitle");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		logger1.info("Country name 'United Kingdom' given in textbox");
		WebElement CountryValu = findElement("fCountry2_Xpath");
		Select CValueTyp = new Select(CountryValu);
		Thread.sleep(2000);
		CValueTyp.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement JobInquir = findElement("fJobInquiry_Xpath");
		Select JInquiryTyp = new Select(JobInquir);
		Thread.sleep(2000);
		JInquiryTyp.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquir"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement butto =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", butto);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxConten = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[4]/div[2]"));
		String presen = TxtBoxConten.getText();
		Assert.assertEquals(presen, "Must contain 2-50 characters with atleast 1 albhabetic character.");
		
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company ' ' given in textbox");
		type("fCompanyBlank_Xpath", "fCompanyBlank");

		Thread.sleep(2000);
		logger1.info("Job Title 'Automation QA' given in textbox");
		type("fJobTitle_Xpath", "fJobTitle");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		logger1.info("Country name 'United Kingdom' given in textbox");
		WebElement CountryVal = findElement("fCountry2_Xpath");
		Select CValueTy = new Select(CountryVal);
		Thread.sleep(2000);
		CValueTy.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement JobInqui = findElement("fJobInquiry_Xpath");
		Select JInquiryTy = new Select(JobInqui);
		Thread.sleep(2000);
		JInquiryTy.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquir"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement butt =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", butt);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxConte = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[4]/div[2]"));
		String prese = TxtBoxConte.getText();
		Assert.assertEquals(prese, "Must contain 2-50 characters with atleast 1 albhabetic character.");
		
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");		
	}
	catch (Exception e) {
		logger1.fail(e);
		captureScreenShots("ErrorScreenshot.png");
		throw e;
	}
}
@Test(priority =6)
public static void formFillingJobTitleNegative() throws Exception {
	logger1 = extent.createTest("formFilling_JobTitle_Negative");
	try {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500)", "up");

		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company 'Agoworks' given in textbox");
		type("fCompany_Xpath", "fCompany");

		Thread.sleep(2000);
		logger1.info("Job Title 'A' given in textbox");
		type("fJobTitleNeg_Xpath", "fJobTitleNeg");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		logger1.info("Country name 'United Kingdom' given in textbox");
		WebElement s1 = findElement("fCountry2_Xpath");
		Select jobType1 = new Select(s1);
		Thread.sleep(2000);
		jobType1.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement s3 = findElement("fJobInquiry_Xpath");
		Select jobType3 = new Select(s3);
		Thread.sleep(2000);
		jobType3.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement button =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", button);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
		String present = TxtBoxContent.getText();
		Assert.assertEquals(present, "Must contain 2-50 alphabetic characters .");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company 'Agoworks' given in textbox");
		type("fCompany_Xpath", "fCompany");

		Thread.sleep(2000);
		logger1.info("Job Title '@@' given in textbox");
		type("fJobTitleSpcl_Xpath", "fJobTitleSpcl");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		logger1.info("Country name 'United Kingdom' given in textbox");
		WebElement CountryValue = findElement("fCountry2_Xpath");
		Select CValueType = new Select(CountryValue);
		Thread.sleep(2000);
		CValueType.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement JobInquiryValue = findElement("fJobInquiry_Xpath");
		Select JInquiryType = new Select(JobInquiryValue);
		Thread.sleep(2000);
		JInquiryType.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement buttons =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", buttons);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxContents = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
		String presents = TxtBoxContents.getText();
		Assert.assertEquals(presents, "Must contain 2-50 alphabetic characters .");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company 'Agoworks' given in textbox");
		type("fCompany_Xpath", "fCompany");

		Thread.sleep(2000);
		logger1.info("Job Title 'Automation!' given in textbox");
		type("fJobTitleSpc_Xpath", "fJobTitleSpc");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		logger1.info("Country name 'United Kingdom' given in textbox");
		WebElement CountryValu = findElement("fCountry2_Xpath");
		Select CValueTyp = new Select(CountryValu);
		Thread.sleep(2000);
		CValueTyp.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement JobInquiryValu = findElement("fJobInquiry_Xpath");
		Select JInquiryTyp = new Select(JobInquiryValu);
		Thread.sleep(2000);
		JInquiryTyp.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement butto =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", butto);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxConten = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
		String presen = TxtBoxConten.getText();
		Assert.assertEquals(presen, "Must contain 2-50 alphabetic characters .");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company 'Agoworks' given in textbox");
		type("fCompany_Xpath", "fCompany");

		Thread.sleep(2000);
		logger1.info("Job Title '123456' given in textbox");
		type("fJobTitleNum_Xpath", "fJobTitleNum");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		logger1.info("Country name 'United Kingdom' given in textbox");
		WebElement CountryVal = findElement("fCountry2_Xpath");
		Select CValueTy = new Select(CountryVal);
		Thread.sleep(2000);
		CValueTy.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement JobInquiryVal = findElement("fJobInquiry_Xpath");
		Select JInquiryTy = new Select(JobInquiryVal);
		Thread.sleep(2000);
		JInquiryTy.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement butt =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", butt);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxConte = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
		String prese = TxtBoxConte.getText();
		Assert.assertEquals(prese, "Must contain 2-50 alphabetic characters .");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company 'Agoworks' given in textbox");
		type("fCompany_Xpath", "fCompany");

		Thread.sleep(2000);
		logger1.info("Job Title ' ' given in textbox");
		type("fJobTitleBlank_Xpath", "fJobTitleBlank");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		logger1.info("Country name 'United Kingdom' given in textbox");
		WebElement CountryVa = findElement("fCountry2_Xpath");
		Select CValueT = new Select(CountryVa);
		Thread.sleep(2000);
		CValueT.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement JobInquiryVa = findElement("fJobInquiry_Xpath");
		Select JInquiryT = new Select(JobInquiryVa);
		Thread.sleep(2000);
		JInquiryT.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement but =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", but);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxCont = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
		String pres = TxtBoxCont.getText();
		Assert.assertEquals(pres, "Must contain 2-50 alphabetic characters .");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company 'Agoworks' given in textbox");
		type("fCompany_Xpath", "fCompany");

		Thread.sleep(2000);
		logger1.info("Job Title 'Automation1234' given in textbox");
		type("fJobTitleBlank_Xpath", "fJobTitleBlank");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		logger1.info("Country name 'United Kingdom' given in textbox");
		WebElement CountryV = findElement("fCountry2_Xpath");
		Select CValue = new Select(CountryV);
		Thread.sleep(2000);
		CValue.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement JobInquiryV = findElement("fJobInquiry_Xpath");
		Select JInquiry = new Select(JobInquiryV);
		Thread.sleep(2000);
		JInquiry.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement bu =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", bu);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxCon = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
		String pre = TxtBoxCon.getText();
		Assert.assertEquals(pre, "Must contain 2-50 alphabetic characters .");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
	}
	catch (Exception e) {
		logger1.fail(e);
		captureScreenShots("ErrorScreenshot.png");
		throw e;
	}
}
@Test(priority =7)
public static void formFillingCountryNegative() throws Exception {
	logger1 = extent.createTest("formFilling_Country_Negative");
	try {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500)", "up");

		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company 'Agoworks' given in textbox");
		type("fCompany_Xpath", "fCompany");

		Thread.sleep(2000);
		logger1.info("Job Title 'Automation QA' given in textbox");
		type("fJobTitle_Xpath", "fJobTitle");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

	/*	logger1.info("Country name ' ' given in textbox");
		WebElement s1 = findElement("fCountryBlank_Xpath");
		Select jobType1 = new Select(s1);
		Thread.sleep(2000);
		jobType1.selectByValue(AndroidCapabilities.getPropertyValue("fCountryBlank")); */
		
		Thread.sleep(2000);
		logger1.info(" ' ' is selected");
		driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[6]/span/select")).sendKeys(" ");
 

		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement s3 = findElement("fJobInquiry_Xpath");
		Select jobType3 = new Select(s3);
		Thread.sleep(2000);
		jobType3.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement button =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", button);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/div"));
		String present = TxtBoxContent.getText();
		Assert.assertEquals(present, "Please select your country from the dropdown.");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company 'Agoworks' given in textbox");
		type("fCompany_Xpath", "fCompany");

		Thread.sleep(2000);
		logger1.info("Job Title 'Automation QA' given in textbox");
		type("fJobTitle_Xpath", "fJobTitle");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info(" 'United States' is selected");
		driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[6]/span/select")).sendKeys("United States");
 
		Thread.sleep(2000);
		logger1.info("State ' ' is selected");
		driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/select")).sendKeys(" ");
		
		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement JobInquiryValue = findElement("fJobInquiry_Xpath");
		Select JInquiryType = new Select(JobInquiryValue);
		Thread.sleep(2000);
		JInquiryType.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement buttons =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", buttons);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxContents = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/div"));
		String presents = TxtBoxContents.getText();
		Assert.assertEquals(presents, "Please select your state from the dropdown.");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("fFirstName_Xpath", "fFirstName");
		
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath", "fLastName");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Area code+phone is '9899928177' given in textbox");
		type("fPhoneNumber_Xpath", "fPhoneNumber");
		
	
		Thread.sleep(2000);
		logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
		type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
		
		Thread.sleep(2000);
		logger1.info("Company 'Agoworks' given in textbox");
		type("fCompany_Xpath", "fCompany");

		Thread.sleep(2000);
		logger1.info("Job Title 'Automation QA' given in textbox");
		type("fJobTitle_Xpath", "fJobTitle");
	
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info(" 'Canada' is selected");
		driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[6]/span/select")).sendKeys("Canada");
 
		Thread.sleep(2000);
		logger1.info("Province ' ' is selected");
		driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[8]/span/select")).sendKeys(" ");
		
		Thread.sleep(2000);
		logger1.info("City name 'Noida' given in textbox");
		type("fCity_Xpath", "fCity");

		Thread.sleep(2000);
		logger1.info("'Reason for inquiry' is given in textbox'");
		WebElement JobInquiryValu = findElement("fJobInquiry_Xpath");
		Select JInquiryTyp = new Select(JobInquiryValu);
		Thread.sleep(2000);
		JInquiryTyp.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

		jse.executeScript("window.scrollBy(0,100)", "up");

		Thread.sleep(2000);
		logger1.info("Message is displayed in textbox");
		type("fMessage_Xpath", "fMessage");

		jse.executeScript("window.scrollBy(0,300)", "up");
		Thread.sleep(2000);
		
		 logger1.info("Contact Us button is selected");
		 WebElement butto =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			
			jse.executeScript("arguments[0].click();", butto);			
		
		jse.executeScript("window.scrollBy(0, -800)", "down");
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TxtBoxConten = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/div"));
		String presen = TxtBoxConten.getText();
		Assert.assertEquals(presen, "Please select your state from the dropdown.");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");	
		
		
	}
	catch (Exception e) {
		logger1.fail(e);
		captureScreenShots("ErrorScreenshot.png");
		throw e;
	}
	

	Thread.sleep(8000);

	logger1.pass("Testcase FormFilling Negative is Passed");
}

	public static void setAttribute(WebElement element, String attName, String attValue) {
		driver.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attName, attValue);

	}


}
