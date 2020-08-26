package mobileautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Base.AndroidCapabilities;
import io.appium.java_client.MobileElement;

public class MobileNegative extends AndroidCapabilities {

	@BeforeClass
	public void mobileNext() {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("mMobile_Url"));
	}

	@Test(priority = 1)
	public static void mobilefirstname() throws Exception {
		logger1 = extent.createTest("mobile_firstname_negative");
		try {

			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");

			Thread.sleep(2000);
			logger1.info("First Name ' ' has been entered into the text field");
			type("mFirstNameBlank_Xpath", "mNameBlank");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@gmail.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[1]/div[1]/div[2]/div[2]/div[2]"));
			String present = TxtBoxContent.getText();
			String expectedValues= properties.getProperty("m_msg");
			Assert.assertEquals(present, expectedValues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 2)
	public static void mobilelastname() throws Exception {
		logger1 = extent.createTest("mobile_lastname_negative");
		try {

			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name ' ' has been entered into the text field");
			type("mLastNameBlank_Xpath", "mLastNameBlank");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@gmail.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[2]/div[1]/div[2]/div[2]/div[2]"));
			String present = TxtBoxContent.getText();
			String expectedValues= properties.getProperty("m_msg");
			Assert.assertEquals(present, expectedValues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 3)
	public static void mobilecompany() throws Exception {
		logger1 = extent.createTest("mobile_company_negative");
		try {

			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company ' ' has been entered into the text field");
			type("mCompanyBlank_Xpath", "mCompanyBlank");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@gmail.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[3]/div[1]/div[2]/div[2]/div[2]"));
			String present = TxtBoxContent.getText();
			String expectedValues= properties.getProperty("m_msg");
			Assert.assertEquals(present, expectedValues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 4)
	public static void mobileJobTitle() throws Exception {
		logger1 = extent.createTest("mobile_JobTitle_negative");
		try {

			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role ' ' has been entered into the text field");
			type("mRoleBlank_Xpath", "mRoleBlank");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@gmail.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[4]/div[1]/div[2]/div[2]/div[2]"));
			String present = TxtBoxContent.getText();
			String expectedValues= properties.getProperty("m_msg");
			Assert.assertEquals(present, expectedValues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 5)
	public static void Emailnegative() throws Exception {
		logger1 = extent.createTest("mobile_Email_negative");
		try {

			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email ' ' has been entered into the text field");
			type("mEmailBlank_Xpath", "mEmailBlank");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String presents = TxtBox.getText();
			Assert.assertEquals(presents, "Must be valid email.\n" + "example@yourdomain.com");

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'dumpings@fake.com' has been entered into the text field");
			type("mEmailFake_Xpath", "mEmailFake");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement CountryValue = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValueType = new Select(CountryValue);
			CValueType.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(presents, "Must be valid email.\n" + "example@yourdomain.com");

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email '12345@fake.com' has been entered into the text field");
			type("mEmailNFake_Xpath", "mEmailNFake");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement CountryValu = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValueTyp = new Select(CountryValu);
			CValueTyp.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContents = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String presen = TxtBoxContents.getText();
			String expectedValue= properties.getProperty("m_emailmsg");
			Assert.assertEquals(presen, expectedValue);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email '!@#$%@fake.com' has been entered into the text field");
			type("mEmailSFake_Xpath", "mEmailSFake");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement CountryVal = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValueTy = new Select(CountryVal);
			CValueTy.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxConte = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String prese = TxtBoxConte.getText();
			Assert.assertEquals(prese, "Must be valid email.\n" + "example@yourdomain.com");

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'dumpings12345@fake.com' has been entered into the text field");
			type("mEmailMixFake_Xpath", "mEmailMixFake");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement CountryVa = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValueT = new Select(CountryVa);
			CValueT.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCont = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String pres = TxtBoxCont.getText();
			String expectedValu= properties.getProperty("m_emailmsg");
			Assert.assertEquals(pres, expectedValu);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email '12345678' has been entered into the text field");
			type("mEmailNum_Xpath", "mEmailNum");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement CountryV = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValue = new Select(CountryV);
			CValue.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCon = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String pre = TxtBoxCon.getText();
			Assert.assertEquals(pre, "Must be valid email.\n" + "example@yourdomain.com");

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'dumpings' has been entered into the text field");
			type("mEmailAlphs_Xpath", "mEmailAlphs");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement Country = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValu = new Select(Country);
			CValu.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxCo = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String pr = TxtBoxCo.getText();
			Assert.assertEquals(pr, "Must be valid email.\n" + "example@yourdomain.com");

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'riyasaini18195@gmail.com' has been entered into the text field");
			type("mEmailNonBusiness_Xpath", "mEmailNonBusiness");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement Countr = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CVal = new Select(Countr);
			CVal.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxC = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String p = TxtBoxC.getText();
			String expectedVal= properties.getProperty("m_emsg");
			Assert.assertEquals(p, expectedVal);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 6)
	public static void PhoneNumbernegative() throws Exception {
		logger1 = extent.createTest("mobile_PhoneNumber_negative");
		try {

			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone ' ' has been entered into the field");
			type("mPhoneNumberBlank_Xpath", "mNumberBlank");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[6]/div[1]/div[2]/div[2]/div[2]"));
			String presents = TxtBox.getText();
			Assert.assertEquals(presents, "Must be a phone number.\n" + "503-555-1212");

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone '!@#$%^&*' has been entered into the field");
			type("mPhoneNumberSChar_Xpath", "mNumberSChar");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement CountryValue = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValueType = new Select(CountryValue);
			CValueType.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBox = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[6]/div[1]/div[2]/div[2]/div[2]"));
			String present = TextBox.getText();
			Assert.assertEquals(present, "Must be a phone number.\n" + "503-555-1212");

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone 'abcdefghi' has been entered into the field");
			type("mPhoneNumberAlphs_Xpath", "mNumberAlphs");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement CountryValu = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValueTyp = new Select(CountryValu);
			CValueTyp.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxContent = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[6]/div[1]/div[2]/div[2]/div[2]"));
			String presen = TextBoxContent.getText();
			Assert.assertEquals(presen, "Must be a phone number.\n" + "503-555-1212");

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone 'abcdefh!@#$%' has been entered into the field");
			type("mPhoneNumberMix_Xpath", "mNumberMix");

			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement CountryVal = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValueTy = new Select(CountryVal);
			CValueTy.selectByVisibleText("France");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");

			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxConten = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[6]/div[1]/div[2]/div[2]/div[2]"));
			String prese = TextBoxConten.getText();
			Assert.assertEquals(prese, "Must be a phone number.\n" + "503-555-1212");

			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(priority = 7)
	public static void Countrynegative() throws Exception {
		logger1 = extent.createTest("mobile_Country_negative");
		try {

			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");

			
			  Thread.sleep(2000);
			  logger1.info("First Name 'Form' has been entered into the text field");
			  type("mFirstName_Xpath","mName");
			  
			  Thread.sleep(2000);
			  logger1.info("Last Name 'Testing' has been entered into the text field");
			  type("mLastName_Xpath","mLastName");
			  
			  Thread.sleep(2000);
			  logger1.info("Company 'Algoworks' has been entered into the text field");
			  type("mCompany_Xpath","mCompany");
			  
			  Thread.sleep(2000);
			  logger1.info("Role 'Automation QA' has been entered into the text field");
			  type("mRole_Xpath","mRole");
			  
			  Thread.sleep(2000); logger1.
			  info("Email 'poonam.gupta@algoworks.com' has been entered into the text field"
			  ); type("mEmail_Xpath","mEmail");
			  
			  Thread.sleep(2000);
			  logger1.info("Phone '1(866)648-7575' has been entered into the field");
			  type("mPhoneNumber_Xpath","mNumber");
			  
			  Thread.sleep(2000); logger1.info("Country 'France' has been selected");
			  MobileElement selectEle =
			  driver.findElement(By.xpath("//*[@id=\'Country\']")); Select ele = new
			  Select(selectEle); ele.selectByVisibleText("France");
			  
			  jsed.executeScript("window.scrollBy(0,100)", "up");
			  
			  Thread.sleep(2000);
			  logger1.info("City 'Paris' has been entered into the field");
			  type("mCity_Xpath","mCity");
			  
			  jsed.executeScript("window.scrollBy(0,100)", "up");
			  
			  jsed.executeScript(
			  "document.getElementsByName('termsandConditions')[0].click()");
			/*
			 * Thread.sleep(2000);
			 * logger1.info("Checkbox 'privacy policy' has been checked");
			 * jsed.executeScript(
			 * "document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
			 */
			  
			  Thread.sleep(2000); logger1.info("'Download Now' button is pressed");
			  click("mButtonnew_Xpath");
			  
			  Thread.sleep(5000); logger1.info("Checked error text on submission");
			  WebElement TxtBox = driver.findElement(By.xpath(
			  "//*[@id=\"mktoForm_2768\"]/div[12]/div[1]/div[2]/div[3]/div[2]")); String
			  presents = TxtBox.getText();
				String expectedValues= properties.getProperty("m_msg");
				Assert.assertEquals(presents, expectedValues);
				
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			  
			  Thread.sleep(2000);
			  logger1.info("First Name 'Form' has been entered into the text field");
			  type("mFirstName_Xpath","mName");
			  
			  Thread.sleep(2000);
			  logger1.info("Last Name 'Testing' has been entered into the text field");
			  type("mLastName_Xpath","mLastName");
			  
			  Thread.sleep(2000);
			  logger1.info("Company 'Algoworks' has been entered into the text field");
			  type("mCompany_Xpath","mCompany");
			  
			  Thread.sleep(2000);
			  logger1.info("Role 'Automation QA' has been entered into the text field");
			  type("mRole_Xpath","mRole");
			  
			  Thread.sleep(2000); logger1.
			  info("Email 'poonam.gupta@algoworks.com' has been entered into the text field"
			  ); type("mEmail_Xpath","mEmail");
			  
			  Thread.sleep(2000);
			  logger1.info("Phone '1(866)648-7575' has been entered into the field");
			  type("mPhoneNumber_Xpath","mNumber");
			  
			  Thread.sleep(2000); logger1.info("Country 'France' has been selected");
			  MobileElement CountryValue =
			  driver.findElement(By.xpath("//*[@id=\'Country\']")); Select CValueType = new
			  Select(CountryValue); CValueType.selectByVisibleText("France");
			  
			  jsed.executeScript("window.scrollBy(0,100)", "up");
			  
			  Thread.sleep(2000);
			  logger1.info("City 'Paris' has been entered into the field");
			  type("mCity_Xpath","mCity");
			  
			  jsed.executeScript("window.scrollBy(0,100)", "up");
			  
			  // jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");
			  
			  Thread.sleep(2000);
			  logger1.info("Checkbox 'privacy policy' has been checked");
			  jsed.executeScript(
			  "document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
			  
			  
			  Thread.sleep(2000); logger1.info("'Download Now' button is pressed");
			  click("mButtonnew_Xpath");
			  
			  Thread.sleep(5000); logger1.info("Checked error text on submission");
			  WebElement TextBox = driver.findElement(By.xpath(
			  "//*[@id=\"mktoForm_2768\"]/div[10]/div[1]/div[2]/div[3]/div[2]")); String
			  present = TextBox.getText(); 
			  String expectedValue= properties.getProperty("m_msg");
				Assert.assertEquals(present, expectedValue);
				
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			 
			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'Canada' has been selected");
			MobileElement CountryValu = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValueTyp = new Select(CountryValu);
			CValueTyp.selectByVisibleText("Canada");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButtonnew_Xpath");

			Thread.sleep(5000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxes = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[8]/div[1]/div[2]/div[2]/div[2]"));
			String presen = TextBoxes.getText();
			 String expectedValu= properties.getProperty("m_msg");
				Assert.assertEquals(presen, expectedValu);
				
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'Canada' has been selected");
			MobileElement CountryVal = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValueTy = new Select(CountryVal);
			CValueTy.selectByVisibleText("Canada");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Province 'Alberta' has been entered into the field");
			type("mProvince_Xpath", "mProvince");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			// jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jsed.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButtonnew_Xpath");

			Thread.sleep(5000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxe = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[10]/div[1]/div[2]/div[3]/div[2]"));
			String prese = TextBoxe.getText();
			 String expectedVal= properties.getProperty("m_msg");
				Assert.assertEquals(prese, expectedVal);
				
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'Canada' has been selected");
			MobileElement CountryVa = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValueT = new Select(CountryVa);
			CValueT.selectByVisibleText("Canada");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Province 'Alberta' has been entered into the field");
			type("mProvince_Xpath", "mProvince");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			/*
			 * Thread.sleep(2000);
			 * logger1.info("Checkbox 'privacy policy' has been checked");
			 * jsed.executeScript(
			 * "document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
			 */

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButtonnew_Xpath");

			Thread.sleep(5000);
			logger1.info("Checked error text on submission");
			WebElement TextBo = driver
					.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[12]/div[1]/div[2]/div[3]/div[2]"));
			String pres = TextBo.getText();
			 String expectedVa= properties.getProperty("m_msg");
				Assert.assertEquals(pres, expectedVa);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'United States' has been selected");
			MobileElement CountryV = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValue = new Select(CountryV);
			CValue.selectByVisibleText("United States");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("State 'Alabama' has been entered into the field");
			type("mState_Xpath", "mState");

			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

		//	jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButtonnew_Xpath");

			Thread.sleep(5000);
			logger1.info("Checked error text on submission");
			WebElement TextB = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[10]/div[1]/div[2]/div[3]/div[2]"));
			String pre = TextB.getText();
			 String expectedV= properties.getProperty("m_msg");
				Assert.assertEquals(pre, expectedV);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath", "mName");

			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath", "mLastName");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath", "mCompany");

			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath", "mRole");

			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath", "mEmail");

			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath", "mNumber");

			Thread.sleep(2000);
			logger1.info("Country 'United States' has been selected");
			MobileElement Country = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select CValu = new Select(Country);
			CValu.selectByVisibleText("United States");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			/*
			 * Thread.sleep(2000);
			 * logger1.info("State 'Alabama' has been entered into the field");
			 * type("mState_Xpath", "mState");
			 */
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath", "mCity");

			jsed.executeScript("window.scrollBy(0,100)", "up");

			jsed.executeScript("document.getElementsByName('termsandConditions')[0].click()");

			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButtonnew_Xpath");

			Thread.sleep(5000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[8]/div[1]/div[2]/div[2]/div[2]"));
			String pr = Text.getText();
			 String expected= properties.getProperty("m_msg");
				Assert.assertEquals(pr, expected);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");		
		}

		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}
	@Test(priority = 8)
	public static void Citynegative() throws Exception {
		logger1 = extent.createTest("mobile_City_negative");
		try {

			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");

			
			  Thread.sleep(2000);
			  logger1.info("First Name 'Form' has been entered into the text field");
			  type("mFirstName_Xpath","mName");
			  
			  Thread.sleep(2000);
			  logger1.info("Last Name 'Testing' has been entered into the text field");
			  type("mLastName_Xpath","mLastName");
			  
			  Thread.sleep(2000);
			  logger1.info("Company 'Algoworks' has been entered into the text field");
			  type("mCompany_Xpath","mCompany");
			  
			  Thread.sleep(2000);
			  logger1.info("Role 'Automation QA' has been entered into the text field");
			  type("mRole_Xpath","mRole");
			  
			  Thread.sleep(2000); logger1.
			  info("Email 'poonam.gupta@algoworks.com' has been entered into the text field"
			  ); type("mEmail_Xpath","mEmail");
			  
			  Thread.sleep(2000);
			  logger1.info("Phone '1(866)648-7575' has been entered into the field");
			  type("mPhoneNumber_Xpath","mNumber");
			  
			  Thread.sleep(2000); logger1.info("Country 'France' has been selected");
			  MobileElement selectEle =
			  driver.findElement(By.xpath("//*[@id=\'Country\']")); Select ele = new
			  Select(selectEle); ele.selectByVisibleText("France");
			  
			  jsed.executeScript("window.scrollBy(0,100)", "up");
			  
			/*
			 * Thread.sleep(2000);
			 * logger1.info("City 'Paris' has been entered into the field");
			 * type("mCity_Xpath","mCity");
			 */
			  
			  jsed.executeScript("window.scrollBy(0,100)", "up");
			  
			  jsed.executeScript(
			  "document.getElementsByName('termsandConditions')[0].click()");
			  
			  Thread.sleep(2000);
			  logger1.info("Checkbox 'privacy policy' has been checked");
			  jsed.executeScript(
			  "document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
			  
			  
			  Thread.sleep(2000); logger1.info("'Download Now' button is pressed");
			  click("mButtonnew_Xpath");
			  
			  Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[9]/div[1]/div[2]/div[2]/div[2]"));
				String presents = TxtBox.getText();
				 String expected= properties.getProperty("m_msg");
					Assert.assertEquals(presents, expected);
					
			  
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			  
			  
		}
		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
		Thread.sleep(5000);

		logger1.pass("Testcase Mobile Negative is Passed");
	}
}
