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

	@Test(priority = 7)
	public static void ContactFormFirstNameNegative() throws Exception {
		logger1 = extent.createTest("contactForm_FirstName_negative");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait = new WebDriverWait(driver, 30);

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
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val1 = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
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
			// driver.switchTo().frame("drift-widget");

			Thread.sleep(2000);
			click("dPopupClose_Xpath");

			driver.switchTo().defaultContent();

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement button = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			button.click();
			JavascriptExecutor jsexec = (JavascriptExecutor) driver;

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String present = TxtBoxContent.getText();
			String expectedValues= properties.getProperty("f_msg");
			Assert.assertEquals(present, expectedValues);
						
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
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val01 = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
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

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement buttons = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			buttons.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String bug = Box.getText();
			String expectedValue= properties.getProperty("f_msg");
			Assert.assertEquals(bug, expectedValue);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form@' is typed in textbox");
			type("cFirstNameSpc_Xpath", "cFirstNameSpc");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType = new Select(val);
			Thread.sleep(2000);
			valueType.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement vall = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select valueTypee = new Select(vall);
			Thread.sleep(2000);
			valueTypee.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement values = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select valueTypes = new Select(values);
			valueTypes.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement b = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			b.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement B = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String error = B.getText();
			String expectedValu= properties.getProperty("f_msg");
			Assert.assertEquals(error, expectedValu);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name '123456' is typed in textbox");
			type("cFirstNameNum_Xpath", "cFirstNameNum");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValue = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValueType = new Select(CountryValue);
			Thread.sleep(2000);
			CountryValueType.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValue = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValueType = new Select(StateValue);
			Thread.sleep(2000);
			StateValueType.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsButtonValue = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ContactUsButtonValueType = new Select(ContactUsButtonValue);
			ContactUsButtonValueType.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement bu = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			bu.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String errors = Text.getText();
			String expectedVal= properties.getProperty("f_msg");
			Assert.assertEquals(errors, expectedVal);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name ' ' is typed in textbox");
			type("cFirstNameBlank_Xpath", "cFirstNameBlank");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValu = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValueTyp = new Select(CountryValu);
			Thread.sleep(2000);
			CountryValueTyp.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValu = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValueTyp = new Select(StateValu);
			Thread.sleep(2000);
			StateValueTyp.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsButtonValu = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ContactUsButtonValueTyp = new Select(ContactUsButtonValu);
			ContactUsButtonValueTyp.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement but = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			but.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String erro = Texts.getText();
			String expectedVa= properties.getProperty("f_msg");
			Assert.assertEquals(erro, expectedVa);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form1234' is typed in textbox");
			type("cFirstNameAlphdigit_Xpath", "cFirstNameAlphdigit");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryVal = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValueTy = new Select(CountryVal);
			Thread.sleep(2000);
			CountryValueTy.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateVal = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValueTy = new Select(StateVal);
			Thread.sleep(2000);
			StateValueTy.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsButtonVal = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ContactUsButtonValueTy = new Select(ContactUsButtonVal);
			ContactUsButtonValueTy.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butt = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butt.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Tex = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/div[2]"));
			String err = Tex.getText();
			String expectedV= properties.getProperty("f_msg");
			Assert.assertEquals(err, expectedV);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

		}

		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 2)
	public static void ContactFormLastNameNegative() throws Exception {
		logger1 = extent.createTest("contactForm_LastName_negative");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait = new WebDriverWait(driver, 30);

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'T' is typed in textbox");
			type("cLastNameNeg_Xpath", "cLastNameNeg");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val1 = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
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

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget")))); // //
			 * driver.switchTo().frame("drift-widget");
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement button = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			button.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Boxes = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String bugs = Boxes.getText();
			String expectedValues= properties.getProperty("f_msg");
			Assert.assertEquals(bugs, expectedValues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name '@@' is typed in textbox");
			type("cLastNameSpcl_Xpath", "cLastNameSpcl");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValue = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValueType = new Select(CountryValue);
			Thread.sleep(2000);
			CountryValueType.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValue = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValueType = new Select(StateValue);
			Thread.sleep(2000);
			StateValueType.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsReason = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ContactUsReasonType = new Select(ContactUsReason);
			ContactUsReasonType.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement buttons = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			buttons.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement B = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String bug = B.getText();
			String expectedValue= properties.getProperty("f_msg");
			Assert.assertEquals(bug, expectedValue);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing@' is typed in textbox");
			type("cLastNameSpc_Xpath", "cLastNameSpc");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValu = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValueTyp = new Select(CountryValu);
			Thread.sleep(2000);
			CountryValueTyp.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValu = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValueTyp = new Select(StateValu);
			Thread.sleep(2000);
			StateValueTyp.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsReaso = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ContactUsReasonTyp = new Select(ContactUsReaso);
			ContactUsReasonTyp.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement b = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			b.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String error = TextBoxContent.getText();
			String expectedValu= properties.getProperty("f_msg");
			Assert.assertEquals(error, expectedValu);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name '123456' is typed in textbox");
			type("cLastNameNum_Xpath", "cLastNameNum");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryVal = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValueTy = new Select(CountryVal);
			Thread.sleep(2000);
			CountryValueTy.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateVal = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValueTy = new Select(StateVal);
			Thread.sleep(2000);
			StateValueTy.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsReas = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ContactUsReasonTy = new Select(ContactUsReas);
			ContactUsReasonTy.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement bu = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			bu.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxConten = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String errors = TextBoxConten.getText();
			String expectedVal= properties.getProperty("f_msg");
			Assert.assertEquals(errors, expectedVal);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name ' ' is typed in textbox");
			type("cLastNameBlank_Xpath", "cLastNameBlank");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryVa = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValueT = new Select(CountryVa);
			Thread.sleep(2000);
			CountryValueT.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateVa = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValueT = new Select(StateVa);
			Thread.sleep(2000);
			StateValueT.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsRea = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ContactUsReasonT = new Select(ContactUsRea);
			ContactUsReasonT.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement but = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			but.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxConte = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String errorss = TextBoxConte.getText();
			String expectedVa= properties.getProperty("f_msg");
			Assert.assertEquals(errorss, expectedVa);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing123' is typed in textbox");
			type("cLastNameAlphdigit_Xpath", "cLastNameAlphdigit");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryV = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CType = new Select(CountryV);
			Thread.sleep(2000);
			CType.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateV = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SValue = new Select(StateV);
			Thread.sleep(2000);
			SValue.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsR = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select CReason = new Select(ContactUsR);
			CReason.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butt = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butt.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxCont = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/div[2]"));
			String erro = TextBoxCont.getText();
			String expectedV= properties.getProperty("f_msg");
			Assert.assertEquals(erro, expectedV);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		}

		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 3)
	public static void ContactFormPhoneNumberNegative() throws Exception {
		logger1 = extent.createTest("contactForm_PhoneNumber_negative");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait = new WebDriverWait(driver, 30);

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '123456' given in textbox");
			type("cPhoneNumberNeg_Xpath", "cPhoneNumberNeg");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val1 = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType1 = new Select(val1);
			Thread.sleep(2000);
			valueType1.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val2 = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
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

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget")))); //
			 * driver.switchTo().frame("drift-widget");
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */
			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement button = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			button.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Boxes = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
			String bugs = Boxes.getText();
			String expectedValues= properties.getProperty("f_phonemsg");
			Assert.assertEquals(bugs, expectedValues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '12345@' given in textbox");
			type("cPhoneNumberSpcl_Xpath", "cPhoneNumberSpcl");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val01 = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType01 = new Select(val01);
			Thread.sleep(2000);
			valueType01.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val03 = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select valueType02 = new Select(val03);
			Thread.sleep(2000);
			valueType02.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement val7 = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select valueType4 = new Select(val7);
			valueType4.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement buttons = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			buttons.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
			String bug = Box.getText();
			String expectedValue= properties.getProperty("f_phonemsg");
			Assert.assertEquals(bug, expectedValue);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '12345678@' given in textbox");
			type("cPhoneNumberSpc_Xpath", "cPhoneNumberSpc");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val02 = driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType11 = new Select(val02);
			Thread.sleep(2000);
			valueType11.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val04 = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select valueType03 = new Select(val04);
			Thread.sleep(2000);
			valueType03.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement val8 = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select valueType5 = new Select(val8);
			valueType5.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butt = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butt.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement B = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
			String error = B.getText();
			String expectedValu= properties.getProperty("f_phonemsg");
			Assert.assertEquals(error, expectedValu);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is ' ' given in textbox");
			type("cPhoneNumberBlank_Xpath", "cPhoneNumberBlank");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val003 = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType12 = new Select(val003);
			Thread.sleep(2000);
			valueType12.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val05 = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select valueType04 = new Select(val05);
			Thread.sleep(2000);
			valueType04.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement val9 = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select valueType6 = new Select(val9);
			valueType6.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement but = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			but.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
			String erro = Text.getText();
			String expectedVal= properties.getProperty("f_phonemsg");
			Assert.assertEquals(erro, expectedVal);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '!@#$%^&*' given in textbox");
			type("cPhoneNumberAllspc_Xpath", "cPhoneNumberAllspc");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val004 = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType13 = new Select(val004);
			Thread.sleep(2000);
			valueType13.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val06 = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select valueType05 = new Select(val06);
			Thread.sleep(2000);
			valueType05.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement val90 = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select valueType7 = new Select(val90);
			valueType7.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement bu = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			bu.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
			String err = Texts.getText();
			String expectedVa= properties.getProperty("f_phonemsg");
			Assert.assertEquals(err, expectedVa);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is 'abcdefghi' given in textbox");
			type("cPhoneNumberAllAlphs_Xpath", "cPhoneNumberAllAlphs");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val005 = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType14 = new Select(val005);
			Thread.sleep(2000);
			valueType14.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val07 = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select valueType06 = new Select(val07);
			Thread.sleep(2000);
			valueType06.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement val900 = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select valueType8 = new Select(val900);
			valueType8.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement b = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			b.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Textss = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div/div/div[2]"));
			String er = Textss.getText();
			String expectedV= properties.getProperty("f_phonemsg");
			Assert.assertEquals(er, expectedV);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 4)
	public static void ContactFormEmailNegative() throws Exception {
		logger1 = extent.createTest("contactForm_Email_negative");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait = new WebDriverWait(driver, 30);

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'dumpings@fake.com' typed in textbox");
			type("cBusinessEmailAddressFake_Xpath", "cBusinessEmailAddressFake");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val1 = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType1 = new Select(val1);
			Thread.sleep(2000);
			valueType1.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val2 = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
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
			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget")))); //
			 * driver.switchTo().frame("drift-widget");
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */
			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement button = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			button.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Boxes = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
			String bugs = Boxes.getText();
			String expectedValues= properties.getProperty("f_emailmsg");
			Assert.assertEquals(bugs, expectedValues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address '12345@fake.com' typed in textbox");
			type("cBusinessEmailAddressNFake_Xpath", "cBusinessEmailAddressNFake");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValue = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValType = new Select(CountryValue);
			Thread.sleep(2000);
			CountryValType.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValue = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValType = new Select(StateValue);
			Thread.sleep(2000);
			StateValType.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement Reason = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ReasonValue = new Select(Reason);
			ReasonValue.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement buttons = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			buttons.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Box = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
			String bug = Box.getText();
			String expectedValue= properties.getProperty("f_emailmsg");
			Assert.assertEquals(bug, expectedValue);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address '!@#$%^&*@fake.com' typed in textbox");
			type("cBusinessEmailAddressSFake_Xpath", "cBusinessEmailAddressSFake");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValu = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValTyp = new Select(CountryValu);
			Thread.sleep(2000);
			CountryValTyp.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValu = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValTyp = new Select(StateValu);
			Thread.sleep(2000);
			StateValTyp.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement Reaso = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ReasonValu = new Select(Reaso);
			ReasonValu.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butto = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butto.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBox = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
			String error = TextBox.getText();
			String expectedValu= properties.getProperty("f_emailmsg");
			Assert.assertEquals(error, expectedValu);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'dumpings12345@fake.com' typed in textbox");
			type("cBusinessEmailAddressMixFake_Xpath", "cBusinessEmailAddressMixFake");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryVal = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValTy = new Select(CountryVal);
			Thread.sleep(2000);
			CountryValTy.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateVal = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValTy = new Select(StateVal);
			Thread.sleep(2000);
			StateValTy.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement Reas = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ReasonVal = new Select(Reas);
			ReasonVal.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butt = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butt.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxes = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
			String errors = TextBoxes.getText();
			String expectedVal= properties.getProperty("f_emailmsg");
			Assert.assertEquals(errors, expectedVal);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address '12345678' typed in textbox");
			type("cBusinessEmailAddressNumber_Xpath", "cBusinessEmailAddressNumber");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryVa = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryValT = new Select(CountryVa);
			Thread.sleep(2000);
			CountryValT.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateVa = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateValT = new Select(StateVa);
			Thread.sleep(2000);
			StateValT.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement Rea = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ReasonVa = new Select(Rea);
			ReasonVa.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement but = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			but.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
			String erro = Text.getText();
			String expectedVa= properties.getProperty("f_emailmsg");
			Assert.assertEquals(erro, expectedVa);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'abcdefghi' typed in textbox");
			type("cBusinessEmailAddressAlphs_Xpath", "cBusinessEmailAddressAlphs");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryV = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CountryVall = new Select(CountryV);
			Thread.sleep(2000);
			CountryVall.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateV = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select StateVall = new Select(StateV);
			Thread.sleep(2000);
			StateVall.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement Re = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ReasonV = new Select(Re);
			ReasonV.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement bu = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			bu.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement T = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/div[2]"));
			String err = T.getText();
			String expectedV= properties.getProperty("f_emailmsg");
			Assert.assertEquals(err, expectedV);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 5)
	public static void ContactFormCompanyNegative() throws Exception {
		logger1 = extent.createTest("contactForm_Company_negative");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait = new WebDriverWait(driver, 30);

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'A' given in textbox");
			type("cCompanyNeg_Xpath", "cCompanyNeg");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val1 = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType1 = new Select(val1);
			Thread.sleep(2000);
			valueType1.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val2 = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
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

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget")))); //
			 * driver.switchTo().frame("drift-widget");
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement button = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			button.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Boxes = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[4]/div[2]"));
			String bugs = Boxes.getText();
			String expectedValues= properties.getProperty("f_companymsg");
			Assert.assertEquals(bugs, expectedValues);
			
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company '12345' given in textbox");
			type("cCompanyNum_Xpath", "cCompanyNum");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValues = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueType = new Select(CountryValues);
			Thread.sleep(2000);
			CValueType.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValues = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SValueType = new Select(StateValues);
			Thread.sleep(2000);
			SValueType.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsValu = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select CValueTyp = new Select(ContactUsValu);
			CValueTyp.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butto = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butto.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Box = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[4]/div[2]"));
			String bug = Box.getText();
			String expectedValue= properties.getProperty("f_companymsg");
			Assert.assertEquals(bug, expectedValue);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company '!@#$' given in textbox");
			type("cCompanySchar_Xpath", "cCompanySchar");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValue = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueTy = new Select(CountryValue);
			Thread.sleep(2000);
			CValueTy.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValue = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SValueTyp = new Select(StateValue);
			Thread.sleep(2000);
			SValueTyp.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsVal = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ContactValueTy = new Select(ContactUsVal);
			ContactValueTy.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butt = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butt.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[4]/div[2]"));
			String errors = Text.getText();
			String expectedValu= properties.getProperty("f_companymsg");
			Assert.assertEquals(errors, expectedValu);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company ' ' given in textbox");
			type("cCompanyBlank_Xpath", "cCompanyBlank");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValu = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueT = new Select(CountryValu);
			Thread.sleep(2000);
			CValueT.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValu = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SValueTy = new Select(StateValu);
			Thread.sleep(2000);
			SValueTy.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactUsVa = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select ContactValueT = new Select(ContactUsVa);
			ContactValueT.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement but = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			but.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[4]/div[2]"));
			String error = Texts.getText();
			String expectedVal= properties.getProperty("f_companymsg");
			Assert.assertEquals(error, expectedVal);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 6)
	public static void ContactFormJobTitleNegative() throws Exception {
		logger1 = extent.createTest("contactForm_JobTitle_negative");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait = new WebDriverWait(driver, 30);

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'A' given in textbox");
			type("cJobTitleNeg_Xpath", "cJobTitleNeg");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val1 = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType1 = new Select(val1);
			Thread.sleep(2000);
			valueType1.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val2 = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
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

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget")))); //
			 * driver.switchTo().frame("drift-widget");
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */
			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement button = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			button.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Boxes = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[5]/div[2]"));
			String bugs = Boxes.getText();
			String expectedValues= properties.getProperty("f_msg");
			Assert.assertEquals(bugs, expectedValues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title '@@' given in textbox");
			type("cJobTitleSpcl_Xpath", "cJobTitleSpcl");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValue = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueType = new Select(CountryValue);
			Thread.sleep(2000);
			CValueType.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValue = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SvalueType = new Select(StateValue);
			Thread.sleep(2000);
			SvalueType.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactReason = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select CreasonType = new Select(ContactReason);
			CreasonType.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement buttons = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			buttons.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Box = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[5]/div[2]"));
			String bug = Box.getText();
			String expectedValue= properties.getProperty("f_msg");
			Assert.assertEquals(bug, expectedValue);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation@' given in textbox");
			type("cJobTitleSpc_Xpath", "cJobTitleSpc");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValu = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueTyp = new Select(CountryValu);
			Thread.sleep(2000);
			CValueTyp.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValu = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SvalueTyp = new Select(StateValu);
			Thread.sleep(2000);
			SvalueTyp.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactReaso = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select CreasonTyp = new Select(ContactReaso);
			CreasonTyp.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butto = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butto.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBox = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[5]/div[2]"));
			String error = TextBox.getText();
			String expectedValu= properties.getProperty("f_msg");
			Assert.assertEquals(error, expectedValu);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title ' ' given in textbox");
			type("cJobTitleBlank_Xpath", "cJobTitleBlank");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryVal = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueTy = new Select(CountryVal);
			Thread.sleep(2000);
			CValueTy.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateVal = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SvalueTy = new Select(StateVal);
			Thread.sleep(2000);
			SvalueTy.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactReas = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select CreasonTy = new Select(ContactReas);
			CreasonTy.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butt = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butt.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBo = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[5]/div[2]"));
			String erro = TextBo.getText();
			String expectedVal= properties.getProperty("f_msg");
			Assert.assertEquals(erro, expectedVal);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title '123456' given in textbox");
			type("cJobTitleNum_Xpath", "cJobTitleNum");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryVa = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueT = new Select(CountryVa);
			Thread.sleep(2000);
			CValueT.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateVa = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SvalueT = new Select(StateVa);
			Thread.sleep(2000);
			SvalueT.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactRea = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select CreasonT = new Select(ContactRea);
			CreasonT.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement but = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			but.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextB = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[5]/div[2]"));
			String err = TextB.getText();
			String expectedVa= properties.getProperty("f_msg");
			Assert.assertEquals(err, expectedVa);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation1234' given in textbox");
			type("cJobTitleAlphdigit_Xpath", "cJobTitleAlphdigit");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryV = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValue = new Select(CountryV);
			Thread.sleep(2000);
			CValue.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateV = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select Svalue = new Select(StateV);
			Thread.sleep(2000);
			Svalue.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactRe = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select Creason = new Select(ContactRe);
			Creason.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			 * findElement(By.id("drift-widget"))));
			 * //driver.switchTo().frame("drift-widget");
			 * 
			 * 
			 * Thread.sleep(2000); click("dPopupClose_Xpath");
			 * 
			 * driver.switchTo().defaultContent();
			 */

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement bu = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			bu.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Tex = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[5]/div[2]"));
			String er = Tex.getText();
			String expectedV= properties.getProperty("f_msg");
			Assert.assertEquals(er, expectedV);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 1)
	public static void ContactFormCountryNegative() throws Exception {
		logger1 = extent.createTest("contactForm_Country_negative");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait = new WebDriverWait(driver, 30);

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			
			/*
			 * Thread.sleep(2000); logger1.info("State 'Alabama' is selected");
			 * MobileElement val2 = driver.findElement( By.xpath(
			 * "//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select")
			 * ); Select valueType2 = new Select(val2); Thread.sleep(2000);
			 * valueType2.selectByValue("AL"); jse.executeScript("window.scrollBy(0,100)",
			 * "up");
			 */

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

			
			  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			  findElement(By.id("drift-widget"))));
			  //driver.switchTo().frame("drift-widget");
			  
			  
			  Thread.sleep(2000); click("dPopupClose_Xpath");
			  
			  driver.switchTo().defaultContent();
			 

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement button = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			button.click();

			jse.executeScript("window.scrollBy(0, -400)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement BC = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/div"));
			String gift = BC.getText();
			String expectedValues= properties.getProperty("f_countrymsg");
			Assert.assertEquals(gift, expectedValues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValue = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueType = new Select(CountryValue);
			Thread.sleep(2000);
			CValueType.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			/*
			 * Thread.sleep(2000); logger1.info("State 'Alabama' is selected");
			 * MobileElement valueess = driver.findElement(By.xpath(
			 * "//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select")
			 * ); Select valueee = new Select(valueess); Thread.sleep(2000);
			 * valueee.selectByValue("AL"); jse.executeScript("window.scrollBy(0,100)",
			 * "up");
			 */

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactReason = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select CReasonType = new Select(ContactReason);
			CReasonType.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement buttons = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			buttons.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/div"));
			String bug = Box.getText();
			String expectedValue= properties.getProperty("f_statemsg");
			Assert.assertEquals(bug, expectedValue);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'Canada' is selected");
			MobileElement CountryValu = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueTyp = new Select(CountryValu);
			Thread.sleep(2000);
			CValueTyp.selectByValue("Canada");
			jse.executeScript("window.scrollBy(0,100)", "up");

			/*
			 * Thread.sleep(2000); logger1.info("State 'Alabama' is selected");
			 * MobileElement StateValue = driver.findElement( By.xpath(
			 * "//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select")
			 * ); Select SValueType = new Select(StateValue); Thread.sleep(2000);
			 * SValueType.selectByValue("AL"); jse.executeScript("window.scrollBy(0,100)",
			 * "up");
			 */

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement ContactReasonnn = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select CReasonTypde = new Select(ContactReasonnn);
			CReasonTypde.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			logger1.info("Privacy policy checkbox has been selected");
			driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[12]/div/div/div[1]/input"))
					.click();

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butto = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butto.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[8]/span/div"));
			String error = Text.getText();
			String expectedValu= properties.getProperty("f_provincemsg");
			Assert.assertEquals(error, expectedValu);
			

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 8)
	public static void ContactFormCityNegative() throws Exception {
		logger1 = extent.createTest("contactForm_City_negative");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait = new WebDriverWait(driver, 30);

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val1 = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType1 = new Select(val1);
			Thread.sleep(2000);
			valueType1.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val2 = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select valueType2 = new Select(val2);
			Thread.sleep(2000);
			valueType2.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'N' given in textbox");
			type("cCityNeg_Xpath", "cCityNeg");
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
			
			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement button = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			button.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[9]/div[2]"));
			String present = TxtBoxContent.getText();
			String expectedValues= properties.getProperty("f_msg");
			Assert.assertEquals(present, expectedValues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValue = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueType = new Select(CountryValue);
			Thread.sleep(2000);
			CValueType.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValue = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SValueType = new Select(StateValue);
			Thread.sleep(2000);
			SValueType.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name '@@' given in textbox");
			type("cCitySpcl_Xpath", "cCitySpcl");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement InquiryValue = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select IValueType = new Select(InquiryValue);
			IValueType.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement buttons = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			buttons.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContents = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[9]/div[2]"));
			String presents = TxtBoxContents.getText();
			String expectedValue= properties.getProperty("f_msg");
			Assert.assertEquals(presents, expectedValue);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryValu = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueTyp = new Select(CountryValu);
			Thread.sleep(2000);
			CValueTyp.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateValu = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SValueTyp = new Select(StateValu);
			Thread.sleep(2000);
			SValueTyp.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida!' given in textbox");
			type("cCitySpc_Xpath", "cCitySpc");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement InquiryValu = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select IValueTyp = new Select(InquiryValu);
			IValueTyp.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butto = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butto.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxConten = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[9]/div[2]"));
			String presen = TxtBoxConten.getText();
			String expectedValu= properties.getProperty("f_msg");
			Assert.assertEquals(presen, expectedValu);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryVal = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueTy = new Select(CountryVal);
			Thread.sleep(2000);
			CValueTy.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateVal = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SValueTy = new Select(StateVal);
			Thread.sleep(2000);
			SValueTy.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name '12345' given in textbox");
			type("cCityNum_Xpath", "cCityNum");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement InquiryVal = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select IValueTy = new Select(InquiryVal);
			IValueTy.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement butt = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			butt.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxConte = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[9]/div[2]"));
			String prese = TxtBoxConte.getText();
			String expectedVal= properties.getProperty("f_msg");
			Assert.assertEquals(prese, expectedVal);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryVa = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValueT = new Select(CountryVa);
			Thread.sleep(2000);
			CValueT.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateVa = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SValueT = new Select(StateVa);
			Thread.sleep(2000);
			SValueT.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name ' ' given in textbox");
			type("cCityBlank_Xpath", "cCityBlank");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement InquiryVa = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select IValueT = new Select(InquiryVa);
			IValueT.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement but = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			but.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCont = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[9]/div[2]"));
			String pres = TxtBoxCont.getText();
			String expectedVa= properties.getProperty("f_msg");
			Assert.assertEquals(pres, expectedVa);
			

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement CountryV = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select CValue = new Select(CountryV);
			Thread.sleep(2000);
			CValue.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement StateV = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select SValue = new Select(StateV);
			Thread.sleep(2000);
			SValue.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida1234' given in textbox");
			type("cCityAlphdigit_Xpath", "cCityAlphdigit");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement InquiryV = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select IValue = new Select(InquiryV);
			IValue.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement bu = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			bu.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCon = driver
					.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[9]/div[2]"));
			String pre = TxtBoxCon.getText();
			String expectedV= properties.getProperty("f_msg");
			Assert.assertEquals(pre, expectedV);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 9)
	public static void ContactFormReasonforinquiryNegative() throws Exception {
		logger1 = extent.createTest("contactForm_Reasonforinquiry_negative");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait = new WebDriverWait(driver, 30);

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			MobileElement val1 = driver
					.findElement(By.xpath("/html/body/main/div/div[2]/section/div/form/div[6]/span/select"));
			Select valueType1 = new Select(val1);
			Thread.sleep(2000);
			valueType1.selectByValue("United States");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			MobileElement val2 = driver.findElement(
					By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/select"));
			Select valueType2 = new Select(val2);
			Thread.sleep(2000);
			valueType2.selectByValue("AL");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			/*
			 * Thread.sleep(2000); logger1.info("Partner Inquiry is selected");
			 * MobileElement val4 =
			 * driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			 * Select valueType3 = new Select(val4);
			 * valueType3.selectByVisibleText("Partner Inquiry");
			 * jse.executeScript("window.scrollBy(0,100)", "up");
			 * jse.executeScript("window.scrollBy(0,100)", "up");
			 */
			
			Thread.sleep(3000);
			logger1.info("' ' is selected");
			driver.findElement(By.xpath("//*[@id=\"contactUsReasonforInquiry\"]")).sendKeys(" ");
		

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			// driver.switchTo().frame("drift-widget");

			Thread.sleep(2000);
			click("dPopupClose_Xpath");

			driver.switchTo().defaultContent();
			
			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement button = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			button.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(2000);

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver
					.findElement(By.xpath("//*[@id=\"contactUsReasonforInquirySelectBoxItContainer\"]/div"));
			String present = TxtBoxContent.getText();
			String expectedV= properties.getProperty("f_reasonmsg");
			Assert.assertEquals(present, expectedV);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 10)
	public static void ContactFormGDPRCountryNegative() throws Exception {
		logger1 = extent.createTest("contactForm_GDPRCountry_negative");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)", "up");
			WebDriverWait wait = new WebDriverWait(driver, 30);

			
			  Thread.sleep(2000); logger1.info("First name 'Form' is typed in textbox");
			  type("cFirstName_Xpath", "cFirstName");
			  
			  Thread.sleep(2000); logger1.info("Last name 'Testing' is typed in textbox");
			  type("cLastName_Xpath", "cLastName");
			  jse.executeScript("window.scrollBy(0,100)", "up");
			  
			  Thread.sleep(2000);
			  logger1.info("Area code+phone is '9899928177' given in textbox");
			  type("cPhoneNumber_Xpath", "cPhoneNumber");
			  
			  Thread.sleep(2000); logger1.
			  info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			  type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");
			  
			  Thread.sleep(2000); logger1.info("Company 'Algoworks' given in textbox");
			  type("cCompany_Xpath", "cCompany");
			  
			  Thread.sleep(2000);
			  logger1.info("Job Title 'Automation QA' given in textbox");
			  type("cJobTitle_Xpath", "cJobTitle");
			  
			  
			  
			  Thread.sleep(2000); logger1.info("Country 'United Kingdom' is selected");
			  MobileElement val1 = driver .findElement(By.xpath(
			  "/html/body/main/div/div[2]/section/div/form/div[6]/span/select")); Select
			  valueType1 = new Select(val1); Thread.sleep(2000);
			  valueType1.selectByValue("United Kingdom");
			  jse.executeScript("window.scrollBy(0,100)", "up");
			  
			  
			  
			  Thread.sleep(2000); logger1.info("City name 'Noida' given in textbox");
			  type("cCity_Xpath", "cCity"); jse.executeScript("window.scrollBy(0,100)",
			  "up");
			  
			  Thread.sleep(2000); logger1.info("Partner Inquiry is selected");
			  MobileElement val4 =
			  driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			  Select valueType3 = new Select(val4);
			  valueType3.selectByVisibleText("Partner Inquiry");
			  jse.executeScript("window.scrollBy(0,100)", "up");
			  jse.executeScript("window.scrollBy(0,100)", "up");
			  
			  Thread.sleep(2000); logger1.info("optional message is written");
			  type("cMessage_Xpath", "cMessage");
			  
			
			  
			  Thread.sleep(10000); logger1.info("Contact Us button is selected");
			  WebElement button =
			  driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			  button.click();
			  
			  jse.executeScript("window.scrollBy(0, -800)", "down"); Thread.sleep(2000);
			  
			  Thread.sleep(2000); logger1.info("Checked error text on submission");
			  WebElement TxtBoxContent = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[12]/div/div/div[2]/div"
			  )); 
			  String present = TxtBoxContent.getText();
			  String expectedValues= properties.getProperty("f_ppmsg");
				Assert.assertEquals(present, expectedValues);
				
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			 
			
			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("cFirstName_Xpath", "cFirstName");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox");
			type("cLastName_Xpath", "cLastName");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox");
			type("cPhoneNumber_Xpath", "cPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("cBusinessEmailAddress_Xpath", "cBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox");
			type("cCompany_Xpath", "cCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox");
			type("cJobTitle_Xpath", "cJobTitle");

			
			  
			  Thread.sleep(2000); logger1.info("Country 'France' is selected");
			  MobileElement val = driver .findElement(By.xpath(
			  "/html/body/main/div/div[2]/section/div/form/div[6]/span/select")); Select
			  valueType = new Select(val); Thread.sleep(2000);
			  valueType.selectByValue("France");
			  jse.executeScript("window.scrollBy(0,100)", "up");
			  
			

			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("cCity_Xpath", "cCity");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Partner Inquiry is selected");
			MobileElement va = driver.findElement(By.xpath("//*[@id=\'contactUsReasonforInquiry\']"));
			Select valueTyp = new Select(va);
			valueTyp.selectByVisibleText("Partner Inquiry");
			jse.executeScript("window.scrollBy(0,100)", "up");
			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("optional message is written");
			type("cMessage_Xpath", "cMessage");

			Thread.sleep(10000);
			logger1.info("Contact Us button is selected");
			WebElement buttons = driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
			buttons.click();

			jse.executeScript("window.scrollBy(0, -800)", "down");
			
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			 
			 WebElement TxtBoxContents = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[12]/div/div/div[2]/div"
			  )); String presents = TxtBoxContents.getText(); 
			  String expectedValue= properties.getProperty("f_ppmsg");
				Assert.assertEquals(presents, expectedValue);
				
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");	

		
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
		Thread.sleep(2000);

		logger1.pass("Testcase ContactForm Negative is Passed");
	}

	public static void setAttribute(WebElement element, String attName, String attValue) {
		driver.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attName, attValue);

	}

}
