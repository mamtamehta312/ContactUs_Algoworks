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
public class MobileNegative extends AndroidCapabilities{
	
	@BeforeClass
	public void mobileNext() {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("mMobile_Url"));
	}
	@Test(priority=1)
	public static void mobilefirstname() throws Exception {
		logger1 = extent.createTest("mobile_firstname_negative");
		try {
			
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");
			
			Thread.sleep(2000);
			logger1.info("First Name ' ' has been entered into the text field");
			type("mFirstNameBlank_Xpath","mNameBlank");
			
			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("mLastName_Xpath","mLastName");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath","mCompany");
			
			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath","mRole");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@gmail.com' has been entered into the text field");
			type("mEmail_Xpath","mEmail");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath","mNumber");
			
			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");
			
			jsed.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath","mCity");
			
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
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[1]/div[1]/div[2]/div[2]/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "This field is required.");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
	}
	@Test(priority=2)
	public static void mobilelastname() throws Exception {
		logger1 = extent.createTest("mobile_lastname_negative");
		try {
			
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");
			
			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("mFirstName_Xpath","mName");
			
			Thread.sleep(2000);
			logger1.info("Last Name ' ' has been entered into the text field");
			type("mLastNameBlank_Xpath","mLastNameBlank");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath","mCompany");
			
			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath","mRole");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@gmail.com' has been entered into the text field");
			type("mEmail_Xpath","mEmail");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath","mNumber");
			
			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");
			
			jsed.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath","mCity");
			
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
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[2]/div[1]/div[2]/div[2]/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "This field is required.");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
	}
	@Test(priority=3)
	public static void mobilecompany() throws Exception {
		logger1 = extent.createTest("mobile_company_negative");
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
			logger1.info("Company ' ' has been entered into the text field");
			type("mCompanyBlank_Xpath","mCompanyBlank");
			
			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath","mRole");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@gmail.com' has been entered into the text field");
			type("mEmail_Xpath","mEmail");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath","mNumber");
			
			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");
			
			jsed.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath","mCity");
			
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
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[3]/div[1]/div[2]/div[2]/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "This field is required.");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
	}
	@Test(priority=4)
	public static void mobileJobTitle() throws Exception {
		logger1 = extent.createTest("mobile_JobTitle_negative");
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
			logger1.info("Role ' ' has been entered into the text field");
			type("mRoleBlank_Xpath","mRoleBlank");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@gmail.com' has been entered into the text field");
			type("mEmail_Xpath","mEmail");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath","mNumber");
			
			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");
			
			jsed.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath","mCity");
			
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
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[4]/div[1]/div[2]/div[2]/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "This field is required.");
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
		Thread.sleep(5000);
		
		logger1.pass("Testcase Mobile Negative is Passed");
	}
}

