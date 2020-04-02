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
	
	@Test(priority = 1)
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
		    }
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		    }
	}
		@Test(priority =2)
		public static void LastNamenegative() throws Exception {
			logger1 = extent.createTest("mobile_LastName_Negative");
			try {
			
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
		}
		@Test(priority =3)
		public static void Companynegative() throws Exception {
			logger1 = extent.createTest("mobile_Company_Negative");
			try {
			
            JavascriptExecutor j = (JavascriptExecutor) driver;
			
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
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[3]/div[1]/div[2]/div[2]/div[2]"));
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
		}
		@Test(priority=4)
		public static void JobTitlenegative() throws Exception {
			logger1 = extent.createTest("mobile_JobTitle_Negative");
			try {
			
            JavascriptExecutor j = (JavascriptExecutor) driver;
			
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
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[4]/div[1]/div[2]/div[2]/div[2]"));
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
		}
		@Test(priority = 5)
		public static void Emailnegative() throws Exception {
			logger1 = extent.createTest("mobile_Email_Negative");
			try {
			
            JavascriptExecutor j = (JavascriptExecutor) driver;
			
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
			
			Thread.sleep(2000);
			logger1.info("Email ' ' has been entered into the text field");
			type("mEmailBlank_Xpath","mEmailBlank");
			
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
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String presents = TxtBox.getText();
			Assert.assertEquals(presents, "Must be valid email.\n" + 
					"example@yourdomain.com");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor kj = (JavascriptExecutor) driver;
			
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
			
			Thread.sleep(2000);
			logger1.info("Email 'dumpings@fake.com' has been entered into the text field");
			type("mEmailFake_Xpath","mEmailFake");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath","mNumber");
			
			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			WebElement select = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select elements = new Select(select);
			elements.selectByVisibleText("France");
			
			kj.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath","mCity");
			
			kj.executeScript("window.scrollBy(0,100)", "up");
		
			JavascriptExecutor jx = (JavascriptExecutor)driver;
			jx.executeScript("document.getElementsByName('termsandConditions')[0].click()");
				
			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			jx.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
			
			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Please enter a valid email address.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor jk = (JavascriptExecutor) driver;
			
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
			
			Thread.sleep(2000);
			logger1.info("Email '12345@fake.com' has been entered into the text field");
			type("mEmailNFake_Xpath","mEmailNFake");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath","mNumber");
			
			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			WebElement sel = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select e = new Select(sel);
			e.selectByVisibleText("France");
			
			jk.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath","mCity");
			
			jk.executeScript("window.scrollBy(0,100)", "up");
		
			JavascriptExecutor exec = (JavascriptExecutor)driver;
			exec.executeScript("document.getElementsByName('termsandConditions')[0].click()");
				
			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			exec.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
			
			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txt = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
			String error = Txt.getText();
			Assert.assertEquals(error, "Please enter a valid email address.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			 JavascriptExecutor k = (JavascriptExecutor) driver;
				
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
				
				Thread.sleep(2000);
				logger1.info("Email '!@#$%@fake.com' has been entered into the text field");
				type("mEmailSFake_Xpath","mEmailSFake");
				
				Thread.sleep(2000);
				logger1.info("Phone '1(866)648-7575' has been entered into the field");
				type("mPhoneNumber_Xpath","mNumber");
				
				Thread.sleep(2000);
				logger1.info("Country 'France' has been selected");
				WebElement sele = driver.findElement(By.xpath("//*[@id=\'Country\']"));
				Select el = new Select(sele);
				el.selectByVisibleText("France");
				
				k.executeScript("window.scrollBy(0,100)", "up");
				
				Thread.sleep(2000);
				logger1.info("City 'Paris' has been entered into the field");
				type("mCity_Xpath","mCity");
				
				k.executeScript("window.scrollBy(0,100)", "up");
			
				JavascriptExecutor execu = (JavascriptExecutor)driver;
				execu.executeScript("document.getElementsByName('termsandConditions')[0].click()");
					
				Thread.sleep(2000);
				logger1.info("Checkbox 'privacy policy' has been checked");
				execu.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
				
				Thread.sleep(2000);
				logger1.info("'Download Now' button is pressed");
				click("mButton_Xpath");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Text = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
				String errors = Text.getText();
				Assert.assertEquals(errors, "Must be valid email.\n"  + 
					                  "example@yourdomain.com");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				
                JavascriptExecutor java = (JavascriptExecutor) driver;
				
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
				
				Thread.sleep(2000);
				logger1.info("Email 'dumpings12345@fake.com' has been entered into the text field");
				type("mEmailMixFake_Xpath","mEmailMixFake");
				
				Thread.sleep(2000);
				logger1.info("Phone '1(866)648-7575' has been entered into the field");
				type("mPhoneNumber_Xpath","mNumber");
				
				Thread.sleep(2000);
				logger1.info("Country 'France' has been selected");
				WebElement selec = driver.findElement(By.xpath("//*[@id=\'Country\']"));
				Select ele = new Select(selec);
				ele.selectByVisibleText("France");
				
				java.executeScript("window.scrollBy(0,100)", "up");
				
				Thread.sleep(2000);
				logger1.info("City 'Paris' has been entered into the field");
				type("mCity_Xpath","mCity");
				
				java.executeScript("window.scrollBy(0,100)", "up");
			
				JavascriptExecutor execut = (JavascriptExecutor)driver;
				execut.executeScript("document.getElementsByName('termsandConditions')[0].click()");
					
				Thread.sleep(2000);
				logger1.info("Checkbox 'privacy policy' has been checked");
				execut.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
				
				Thread.sleep(2000);
				logger1.info("'Download Now' button is pressed");
				click("mButton_Xpath");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Texts = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
				String err = Texts.getText();
				Assert.assertEquals(err, "Please enter a valid email address.");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				
JavascriptExecutor javas = (JavascriptExecutor) driver;
				
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
				
				Thread.sleep(2000);
				logger1.info("Email '12345678' has been entered into the text field");
				type("mEmailNum_Xpath","mEmailNum");
				
				Thread.sleep(2000);
				logger1.info("Phone '1(866)648-7575' has been entered into the field");
				type("mPhoneNumber_Xpath","mNumber");
				
				Thread.sleep(2000);
				logger1.info("Country 'France' has been selected");
				WebElement selecting = driver.findElement(By.xpath("//*[@id=\'Country\']"));
				Select elem = new Select(selecting);
				elem.selectByVisibleText("France");
				
				javas.executeScript("window.scrollBy(0,100)", "up");
				
				Thread.sleep(2000);
				logger1.info("City 'Paris' has been entered into the field");
				type("mCity_Xpath","mCity");
				
				javas.executeScript("window.scrollBy(0,100)", "up");
			
				JavascriptExecutor executo = (JavascriptExecutor)driver;
				executo.executeScript("document.getElementsByName('termsandConditions')[0].click()");
					
				Thread.sleep(2000);
				logger1.info("Checkbox 'privacy policy' has been checked");
				executo.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
				
				Thread.sleep(2000);
				logger1.info("'Download Now' button is pressed");
				click("mButton_Xpath");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement gettingtext = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
				String erro = gettingtext.getText();
				Assert.assertEquals(erro, "Must be valid email.\n"  + 
									"example@yourdomain.com");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				
                JavascriptExecutor javasc = (JavascriptExecutor) driver;
				
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
				
				Thread.sleep(2000);
				logger1.info("Email 'dumpings' has been entered into the text field");
				type("mEmailAlphs_Xpath","mEmailAlphs");
				
				Thread.sleep(2000);
				logger1.info("Phone '1(866)648-7575' has been entered into the field");
				type("mPhoneNumber_Xpath","mNumber");
				
				Thread.sleep(2000);
				logger1.info("Country 'France' has been selected");
				WebElement selectingC = driver.findElement(By.xpath("//*[@id=\'Country\']"));
				Select eleme = new Select(selectingC);
				eleme.selectByVisibleText("France");
				
				javasc.executeScript("window.scrollBy(0,100)", "up");
				
				Thread.sleep(2000);
				logger1.info("City 'Paris' has been entered into the field");
				type("mCity_Xpath","mCity");
				
				javasc.executeScript("window.scrollBy(0,100)", "up");
			
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("document.getElementsByName('termsandConditions')[0].click()");
					
				Thread.sleep(2000);
				logger1.info("Checkbox 'privacy policy' has been checked");
				executor.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
				
				Thread.sleep(2000);
				logger1.info("'Download Now' button is pressed");
				click("mButton_Xpath");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement gettingtexts = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
				String errorr = gettingtexts.getText();
				Assert.assertEquals(errorr, "Must be valid email.\n"  + 
									"example@yourdomain.com");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				
JavascriptExecutor javascr = (JavascriptExecutor) driver;
				
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
				
				Thread.sleep(2000);
				logger1.info("Email 'riyasaini18195@gmail.com' has been entered into the text field");
				type("mEmailNonBusiness_Xpath","mEmailNonBusiness");
				
				Thread.sleep(2000);
				logger1.info("Phone '1(866)648-7575' has been entered into the field");
				type("mPhoneNumber_Xpath","mNumber");
				
				Thread.sleep(2000);
				logger1.info("Country 'France' has been selected");
				WebElement selectingCountry = driver.findElement(By.xpath("//*[@id=\'Country\']"));
				Select elemen = new Select(selectingCountry);
				elemen.selectByVisibleText("France");
				
				javascr.executeScript("window.scrollBy(0,100)", "up");
				
				Thread.sleep(2000);
				logger1.info("City 'Paris' has been entered into the field");
				type("mCity_Xpath","mCity");
				
				javascr.executeScript("window.scrollBy(0,100)", "up");
			
				JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
				jsexecutor.executeScript("document.getElementsByName('termsandConditions')[0].click()");
					
				Thread.sleep(2000);
				logger1.info("Checkbox 'privacy policy' has been checked");
				jsexecutor.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
				
				Thread.sleep(2000);
				logger1.info("'Download Now' button is pressed");
				click("mButton_Xpath");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement gettingtextvalue = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[5]/div[1]/div[2]/div[2]/div[2]"));
				String bug = gettingtextvalue.getText();
				Assert.assertEquals(bug, "Must be Business email.");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
		}
		@Test(priority = 6)
		public static void PhoneNumbernegative() throws Exception {
			logger1 = extent.createTest("mobile_PhoneNumber_Negative");
			try {
			
            JavascriptExecutor j = (JavascriptExecutor) driver;
			
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
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath","mEmail");
			
			Thread.sleep(2000);
			logger1.info("Phone ' ' has been entered into the field");
			type("mPhoneNumberBlank_Xpath","mNumberBlank");
			
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
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[6]/div[1]/div[2]/div[2]/div[2]"));
			String presents = TxtBox.getText();
			Assert.assertEquals(presents, "Must be a phone number.\n" + 
					"503-555-1212");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			 JavascriptExecutor jk = (JavascriptExecutor) driver;
				
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
				
				Thread.sleep(2000);
				logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
				type("mEmail_Xpath","mEmail");
				
				Thread.sleep(2000);
				logger1.info("Phone '!@#$%^&*' has been entered into the field");
				type("mPhoneNumberSchar_Xpath","mNumberSchar");
				
				Thread.sleep(2000);
				logger1.info("Country 'France' has been selected");
				WebElement selects = driver.findElement(By.xpath("//*[@id=\'Country\']"));
				Select elements = new Select(selects);
				elements.selectByVisibleText("France");
				
				jk.executeScript("window.scrollBy(0,100)", "up");
				
				Thread.sleep(2000);
				logger1.info("City 'Paris' has been entered into the field");
				type("mCity_Xpath","mCity");
				
				jk.executeScript("window.scrollBy(0,100)", "up");
			
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
				WebElement Txt = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[6]/div[1]/div[2]/div[2]/div[2]"));
				String present = Txt.getText();
				Assert.assertEquals(present, "Must be a phone number.\n" + 
						"503-555-1212");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
                JavascriptExecutor kj = (JavascriptExecutor) driver;
				
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
				
				Thread.sleep(2000);
				logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
				type("mEmail_Xpath","mEmail");
				
				Thread.sleep(2000);
				logger1.info("Phone 'abcdefghi' has been entered into the field");
				type("mPhoneNumberAlphs_Xpath","mNumberAlphs");
				
				Thread.sleep(2000);
				logger1.info("Country 'France' has been selected");
				WebElement selecting = driver.findElement(By.xpath("//*[@id=\'Country\']"));
				Select elementt = new Select(selecting);
				elementt.selectByVisibleText("France");
				
				kj.executeScript("window.scrollBy(0,100)", "up");
				
				Thread.sleep(2000);
				logger1.info("City 'Paris' has been entered into the field");
				type("mCity_Xpath","mCity");
				
				kj.executeScript("window.scrollBy(0,100)", "up");
			
				JavascriptExecutor jsex = (JavascriptExecutor)driver;
				jsex.executeScript("document.getElementsByName('termsandConditions')[0].click()");
					
				Thread.sleep(2000);
				logger1.info("Checkbox 'privacy policy' has been checked");
				jsex.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
				
				Thread.sleep(2000);
				logger1.info("'Download Now' button is pressed");
				click("mButton_Xpath");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Text = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[6]/div[1]/div[2]/div[2]/div[2]"));
				String error = Text.getText();
				Assert.assertEquals(error, "Must be a phone number.\n" + 
						"503-555-1212");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
                JavascriptExecutor java = (JavascriptExecutor) driver;
				
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
				
				Thread.sleep(2000);
				logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
				type("mEmail_Xpath","mEmail");
				
				Thread.sleep(2000);
				logger1.info("Phone 'abcdefh!@#$%' has been entered into the field");
				type("mPhoneNumberMix_Xpath","mNumberMix");
				
				Thread.sleep(2000);
				logger1.info("Country 'France' has been selected");
				WebElement selectingCountry = driver.findElement(By.xpath("//*[@id=\'Country\']"));
				Select ele = new Select(selectingCountry);
				ele.selectByVisibleText("France");
				
				java.executeScript("window.scrollBy(0,100)", "up");
				
				Thread.sleep(2000);
				logger1.info("City 'Paris' has been entered into the field");
				type("mCity_Xpath","mCity");
				
				java.executeScript("window.scrollBy(0,100)", "up");
			
				JavascriptExecutor jscsex = (JavascriptExecutor)driver;
				jscsex.executeScript("document.getElementsByName('termsandConditions')[0].click()");
					
				Thread.sleep(2000);
				logger1.info("Checkbox 'privacy policy' has been checked");
				jscsex.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
				
				Thread.sleep(2000);
				logger1.info("'Download Now' button is pressed");
				click("mButton_Xpath");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Texts = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[6]/div[1]/div[2]/div[2]/div[2]"));
				String errors = Texts.getText();
				Assert.assertEquals(errors, "Must be a phone number.\n" + 
						"503-555-1212");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				
			}
			
			catch(Exception e) {
				logger1.fail(e);                           
				throw e;
			}
		}
		@Test(priority = 7)
		public static void Countrynegative() throws Exception {
			logger1 = extent.createTest("mobile_Country_Negative");
			try {
			
            JavascriptExecutor j = (JavascriptExecutor) driver;
			
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
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("mEmail_Xpath","mEmail");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath","mNumber");
			
			Thread.sleep(2000);
			logger1.info("Country 'United States' has been selected");
			WebElement selectE = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select element = new Select(selectE);
			element.selectByVisibleText("United States");
			
			j.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath","mCity");
			
			j.executeScript("window.scrollBy(0,100)", "up");
		
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementsByName('termsandConditions')[0].click()");
				
		//	Thread.sleep(2000);
		//	logger1.info("Checkbox 'privacy policy' has been checked");
		//	jse.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
			
			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("mButton_Xpath");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[8]/div[1]/div[2]/div[2]/div[2]"));
			String presents = TxtBox.getText();
			Assert.assertEquals(presents, "This field is required.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			 JavascriptExecutor java = (JavascriptExecutor) driver;
				
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
				
				Thread.sleep(2000);
				logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
				type("mEmail_Xpath","mEmail");
				
				Thread.sleep(2000);
				logger1.info("Phone '1(866)648-7575' has been entered into the field");
				type("mPhoneNumber_Xpath","mNumber");
				
				Thread.sleep(2000);
				logger1.info("Country 'United States' has been selected");
				WebElement selectCountry = driver.findElement(By.xpath("//*[@id=\'Country\']"));
				Select elements = new Select(selectCountry);
				elements.selectByVisibleText("United States");
				
				java.executeScript("window.scrollBy(0,100)", "up");
				
				Thread.sleep(2000);
				logger1.info("State 'Alabama' has been entered into the field");
				type("mState_Xpath","mState");
				
				Thread.sleep(2000);
				logger1.info("City 'Paris' has been entered into the field");
				type("mCity_Xpath","mCity");
				
				java.executeScript("window.scrollBy(0,100)", "up");
			
		//		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		//		jsc.executeScript("document.getElementsByName('termsandConditions')[0].click()");
					
			//	Thread.sleep(2000);
			//	logger1.info("Checkbox 'privacy policy' has been checked");
			//	jse.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
				
				Thread.sleep(2000);
				logger1.info("'Download Now' button is pressed");
				click("mButton_Xpath");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Txt = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[10]/div[1]/div[2]/div[3]/div[2]"));
				String present = Txt.getText();
				Assert.assertEquals(present, "This field is required.");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				
				
				 JavascriptExecutor javascript = (JavascriptExecutor) driver;
					
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
					
					Thread.sleep(2000);
					logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
					type("mEmail_Xpath","mEmail");
					
					Thread.sleep(2000);
					logger1.info("Phone '1(866)648-7575' has been entered into the field");
					type("mPhoneNumber_Xpath","mNumber");
					
					Thread.sleep(2000);
					logger1.info("Country 'India' has been selected");
					WebElement selectCount = driver.findElement(By.xpath("//*[@id=\'Country\']"));
					Select ele = new Select(selectCount);
					ele.selectByVisibleText("India");
					
					javascript.executeScript("window.scrollBy(0,100)", "up");
					
					Thread.sleep(2000);
					logger1.info("City 'Paris' has been entered into the field");
					type("mCity_Xpath","mCity");
					
					javascript.executeScript("window.scrollBy(0,100)", "up");
				
					JavascriptExecutor jex = (JavascriptExecutor)driver;
					jex.executeScript("document.getElementsByName('termsandConditions')[0].click()");
						
				//	Thread.sleep(2000);
				//	logger1.info("Checkbox 'privacy policy' has been checked");
				//	jse.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
					
					Thread.sleep(2000);
					logger1.info("'Download Now' button is pressed");
					click("mButton_Xpath");
					
					Thread.sleep(2000);
					logger1.info("Checked error text on submission");
					WebElement Text = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[12]/div[1]/div[2]/div[3]/div[2]"));
					String error = Text.getText();
					Assert.assertEquals(error, "This field is required.");
							
					Thread.sleep(2000);
					driver.navigate().refresh();
					logger1.info("------------------------------------------------------------");
					
					 JavascriptExecutor javascripte = (JavascriptExecutor) driver;
						
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
						
						Thread.sleep(2000);
						logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
						type("mEmail_Xpath","mEmail");
						
						Thread.sleep(2000);
						logger1.info("Phone '1(866)648-7575' has been entered into the field");
						type("mPhoneNumber_Xpath","mNumber");
						
						Thread.sleep(2000);
						logger1.info("Country 'India' has been selected");
						WebElement selectCountr = driver.findElement(By.xpath("//*[@id=\'Country\']"));
						Select elem = new Select(selectCountr);
						elem.selectByVisibleText("India");
						
						javascripte.executeScript("window.scrollBy(0,100)", "up");
						
						Thread.sleep(2000);
						logger1.info("City 'Paris' has been entered into the field");
						type("mCity_Xpath","mCity");
						
						javascripte.executeScript("window.scrollBy(0,100)", "up");
					
						JavascriptExecutor ex = (JavascriptExecutor)driver;
					//	ex.executeScript("document.getElementsByName('termsandConditions')[0].click()");
							
						Thread.sleep(2000);
						logger1.info("Checkbox 'privacy policy' has been checked");
						ex.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
						
						Thread.sleep(2000);
						logger1.info("'Download Now' button is pressed");
						click("mButton_Xpath");
						
						Thread.sleep(2000);
						logger1.info("Checked error text on submission");
						WebElement Texts = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[10]/div[1]/div[2]/div[3]/div[2]"));
						String errors = Texts.getText();
						Assert.assertEquals(errors, "This field is required.");
								
						Thread.sleep(2000);
						driver.navigate().refresh();
						logger1.info("------------------------------------------------------------");
						
						 JavascriptExecutor javascriptex = (JavascriptExecutor) driver;
							
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
							
							Thread.sleep(2000);
							logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
							type("mEmail_Xpath","mEmail");
							
							Thread.sleep(2000);
							logger1.info("Phone '1(866)648-7575' has been entered into the field");
							type("mPhoneNumber_Xpath","mNumber");
							
							Thread.sleep(2000);
							logger1.info("Country 'Canada' has been selected");
							WebElement selectCou = driver.findElement(By.xpath("//*[@id=\'Country\']"));
							Select el = new Select(selectCou);
							el.selectByVisibleText("Canada");
							
							javascriptex.executeScript("window.scrollBy(0,100)", "up");
							
							Thread.sleep(2000);
							logger1.info("City 'Paris' has been entered into the field");
							type("mCity_Xpath","mCity");
							
							javascriptex.executeScript("window.scrollBy(0,100)", "up");
						
							JavascriptExecutor x = (JavascriptExecutor)driver;
							ex.executeScript("document.getElementsByName('termsandConditions')[0].click()");
								
							Thread.sleep(2000);
							logger1.info("Checkbox 'privacy policy' has been checked");
							x.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
							
							Thread.sleep(2000);
							logger1.info("'Download Now' button is pressed");
							click("mButton_Xpath");
							
							Thread.sleep(2000);
							logger1.info("Checked error text on submission");
							WebElement T = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[8]/div[1]/div[2]/div[2]/div[2]"));
							String err = T.getText();
							Assert.assertEquals(err, "This field is required.");
									
							Thread.sleep(2000);
							driver.navigate().refresh();
							logger1.info("------------------------------------------------------------");
							
JavascriptExecutor javascriptexec = (JavascriptExecutor) driver;
							
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
							
							Thread.sleep(2000);
							logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
							type("mEmail_Xpath","mEmail");
							
							Thread.sleep(2000);
							logger1.info("Phone '1(866)648-7575' has been entered into the field");
							type("mPhoneNumber_Xpath","mNumber");
							
							Thread.sleep(2000);
							logger1.info("Country 'Canada' has been selected");
							WebElement sel = driver.findElement(By.xpath("//*[@id=\'Country\']"));
							Select ell = new Select(sel);
							ell.selectByVisibleText("Canada");
							
							javascriptexec.executeScript("window.scrollBy(0,100)", "up");
							
							Thread.sleep(2000);
							logger1.info("Province 'Alberta' has been entered into the field");
							type("mProvince_Xpath","mProvince");
							
							Thread.sleep(2000);
							logger1.info("City 'Paris' has been entered into the field");
							type("mCity_Xpath","mCity");
							
							javascriptexec.executeScript("window.scrollBy(0,100)", "up");
						
							JavascriptExecutor xe = (JavascriptExecutor)driver;
							xe.executeScript("document.getElementsByName('termsandConditions')[0].click()");
								
						//	Thread.sleep(2000);
						//	logger1.info("Checkbox 'privacy policy' has been checked");
						//	xe.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
							
							Thread.sleep(2000);
							logger1.info("'Download Now' button is pressed");
							click("mButton_Xpath");
							
							Thread.sleep(2000);
							logger1.info("Checked error text on submission");
							WebElement To = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[12]/div[1]/div[2]/div[3]/div[2]"));
							String erro = To.getText();
							Assert.assertEquals(erro, "This field is required.");
									
							Thread.sleep(2000);
							driver.navigate().refresh();
							logger1.info("------------------------------------------------------------");
							
JavascriptExecutor javascriptexecutor = (JavascriptExecutor) driver;
							
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
							
							Thread.sleep(2000);
							logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
							type("mEmail_Xpath","mEmail");
							
							Thread.sleep(2000);
							logger1.info("Phone '1(866)648-7575' has been entered into the field");
							type("mPhoneNumber_Xpath","mNumber");
							
							Thread.sleep(2000);
							logger1.info("Country 'Canada' has been selected");
							WebElement sell = driver.findElement(By.xpath("//*[@id=\'Country\']"));
							Select elle = new Select(sell);
							elle.selectByVisibleText("Canada");
							
							javascriptexecutor.executeScript("window.scrollBy(0,100)", "up");
							
							Thread.sleep(2000);
							logger1.info("Province 'Alberta' has been entered into the field");
							type("mProvince_Xpath","mProvince");
							
							Thread.sleep(2000);
							logger1.info("City 'Paris' has been entered into the field");
							type("mCity_Xpath","mCity");
							
							javascriptexecutor.executeScript("window.scrollBy(0,100)", "up");
						
							JavascriptExecutor xet = (JavascriptExecutor)driver;
						//	xe.executeScript("document.getElementsByName('termsandConditions')[0].click()");
								
							Thread.sleep(2000);
							logger1.info("Checkbox 'privacy policy' has been checked");
							xet.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");
							
							Thread.sleep(2000);
							logger1.info("'Download Now' button is pressed");
							click("mButton_Xpath");
							
							Thread.sleep(2000);
							logger1.info("Checked error text on submission");
							WebElement message = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[10]/div[1]/div[2]/div[3]/div[2]"));
							String bug = message.getText();
							Assert.assertEquals(bug, "This field is required.");
									
							Thread.sleep(2000);
							driver.navigate().refresh();
							logger1.info("------------------------------------------------------------");
							
								
			}

			catch(Exception e) {
				logger1.fail(e);                           
				throw e;
			}
		}
		@Test(priority = 8)
		public static void Citynegative() throws Exception {
			logger1 = extent.createTest("mobile_City_Negative");
			try {
			
            JavascriptExecutor j = (JavascriptExecutor) driver;
			
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
			
		//	Thread.sleep(2000);
		//	logger1.info("City 'Paris' has been entered into the field");
		//	type("mCity_Xpath","mCity");
			
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
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[9]/div[1]/div[2]/div[2]/div[2]"));
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
