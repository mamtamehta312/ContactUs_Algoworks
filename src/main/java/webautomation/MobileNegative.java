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

public class MobileNegative extends WebCapabilities {
	
	@BeforeClass
	public void mobileNext() {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("mMobile_Url"));
	}
	
	@Test
	public static void Firstnamenegative() throws Exception {
		logger1 = extent.createTest("mobile_FirstName_Negative");
		try {
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			
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
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath","mEmail");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath","mNumber");
			
			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			WebElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");
			
			jsed.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath","mCity");
			
			jsed.executeScript("window.scrollBy(0,100)", "up");
		
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementsByName('termsandConditions')[0].click()");
				
			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			js.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
			
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
			
            JavascriptExecutor j = (JavascriptExecutor) driver;
			
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
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath","mEmail");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath","mNumber");
			
			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			WebElement selectE = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select element = new Select(selectE);
			element.selectByVisibleText("France");
			
			j.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath","mCity");
			
			j.executeScript("window.scrollBy(0,100)", "up");
		
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementsByName('termsandConditions')[0].click()");
				
			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jse.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
			
			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[2]/div[1]/div[2]/div[2]/div[2]"));
			String presents = TxtBox.getText();
			Assert.assertEquals(presents, "This field is required.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
	
		Thread.sleep(5000);

		logger1.pass("Testcase Mobile is Passed");
		}
}
