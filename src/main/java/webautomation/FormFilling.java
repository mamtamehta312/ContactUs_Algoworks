package webautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import Base.WebCapabilities;
import io.appium.java_client.MobileElement;


public class FormFilling extends WebCapabilities {

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID")));
	@Test
	public static void validLogin() throws Exception {
		logger1 = extent.createTest("formFilling");
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,400)", "up");

			Thread.sleep(2000);
			logger1.info(
					"First name 'Form' is typed in textbox");
			type("fFirstName_Xpath", "fFirstName");

			Thread.sleep(2000);

			logger1.info(
					"Last name 'Testing' is typed in textbox ");
			type("fLastName_Xpath", "fLastName");

            Thread.sleep(3000);                                                                                                                                                             
			
			//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
			//type("fCountryCode_Xpath","fCountryCode");
			//Thread.sleep(3000);   

			logger1.info(
					"Area code+phone is '9899928177' given in textbox ");
			type("fPhoneNumber_Xpath", "fPhoneNumber");

			Thread.sleep(2000);
			logger1.info(
					"Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

			
			Thread.sleep(2000);
			logger1.info(
					"Company 'Algoworks' given in textbox ");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info(
					"Job Title 'Automation QA' given in textbox ");
			type("fJobTitle_Xpath", "fJobTitle");


			logger1.info("'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
	 
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info(
					"City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");

	

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info(
					"Message is displayed in textbox 'Type you enquiry here'");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);

			logger1.info(
					"'contact us' is clicked ");
			click("fContactUs_Xpath");
			Thread.sleep(2000);
			

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(5000);
			
			JavascriptExecutor jsf = (JavascriptExecutor) driver;
			jsf.executeScript("window.scrollBy(0,400)", "up");
			
			Thread.sleep(2000);
			logger1.info("Checked 'Thank you' text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/p"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Thank you for your submission.\n" + 
					"A Couchbase representative will contact you shortly.");


			logger1.pass("Testcase Formfilling is Passed");

		}

		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}
}
