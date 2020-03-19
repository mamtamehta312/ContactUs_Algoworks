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

public class FormFilling extends AndroidCapabilities {

	// WebDriverWait wait = new WebDriverWait(driver, 10);
	// WebElement element =
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID")));
	
	@BeforeClass
	public static void init() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("url"));
	}

	@Test()
	public static void formFilling() throws Exception {
		logger1 = extent.createTest("formFilling");
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1500)", "up");

			Thread.sleep(2000);
			logger1.info(
					"First name 'Bob' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/input'");
			type("fFirstName_Xpath", "fFirstName");
			
		

			Thread.sleep(2000);

			logger1.info(
					"Last name 'Jackson' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/input'");
			type("fLastName_Xpath", "fLastName");

			Thread.sleep(2000);
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			jse1.executeScript("window.scrollBy(0,100)", "up");

			//Thread.sleep(3000);
			//logger1.info("Country code '+91' for country 'UK' is selected");
			//WebElement s = findElement("fCountryCode_Xpath");
			//Select jobType = new Select(s);
			//jobType.selectByVisibleText(AndroidCapabilities.getPropertyValue("fCountryCode"));

			// ----------------------------------------------------------------------------------------------

			Thread.sleep(2000);
			logger1.info(
					"Area code+phone is '9899928177' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[2]/div[2]/div/label'");
			type("fPhoneNumber_Xpath", "fPhoneNumber");
			
		
			Thread.sleep(2000);
			logger1.info(
					"Business Email Address 'Bob.Jackson@gmail.com' typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[3]'");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");
			
			
/*			Thread.sleep(5000);
			logger1.info("Popup is closed");
			click("fPopupClose_Xpath");*/

			// ---------------------------------------------------------------------------------------------------

			Thread.sleep(2000);
			logger1.info(
					"Company 'Algoworks' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[4]/input'");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info(
					"Job Title 'Software Test Engineer' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[5]/input'");
			type("fJobTitle_Xpath", "fJobTitle");

			// --------------------------------------------------------------------------------------------------------------------------------------------------
			Thread.sleep(2000);
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("window.scrollBy(0,100)", "up");

			logger1.info(
					"Country name 'United Kingdom' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[6]/span/span'");
			WebElement s1 = findElement("fCountry2_Xpath");
			Select jobType1 = new Select(s1);
			Thread.sleep(2000);
			jobType1.selectByValue(AndroidCapabilities.getPropertyValue("fCountry2"));

			// ----------------------------------------------------------------------------------------------------------------

			Thread.sleep(2000);
			logger1.info(
					"City name 'Noida' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox '//*[@id='contactUsReasonforInquiry']'");
			WebElement s3 = findElement("fJobInquiry_Xpath");
			Select jobType3 = new Select(s3);
			Thread.sleep(2000);
			jobType3.selectByVisibleText(AndroidCapabilities.getPropertyValue("fJobInquiry"));

			jse2.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info(
					"Message is displayed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
			type("fMessage_Xpath", "fMessage");

			jse2.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);

/*			logger1.info(
					"'contact us' is clicked having id '//*[@id='global-content']/div[3]/div[1]/section/div/form/div[13]/button'");
			click("fContactUs_Xpath");
			Thread.sleep(2000);*/
			/*click("fContactUs_Xpath");
			Thread.sleep(5000);*/

			 logger1.info("Contact Us button is selected");
			 WebElement button =driver.findElement(By.xpath("//form[@name='enquiryform']//button"));
				JavascriptExecutor jsexec = (JavascriptExecutor)driver;
				jsexec.executeScript("arguments[0].click();", button);			
			
			jse2.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(8000);

			logger1.pass("Testcase is Passed");

		} catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");
			throw e;
		}
	}

	public static void setAttribute(WebElement element, String attName, String attValue) {
		driver.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attName, attValue);

	}
}
