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

	@Test()
	public static void formFilling() throws Exception {
		logger1 = extent.createTest("formFilling");
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1500)", "up");

			Thread.sleep(2000);
			logger1.info(
					"First name 'Bob' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/input'");
			type("FirstName_Xpath", "FirstName");

			Thread.sleep(2000);

			logger1.info(
					"Last name 'Jackson' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/input'");
			type("LastName_Xpath", "LastName");

			Thread.sleep(2000);
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			jse1.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(3000);
			logger1.info("Country code '+91' for country 'UK' is selected");
			// MobileElement s =
			// driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/select"));
			WebElement s = findElement("CountryCode_Xpath");
			Select jobType = new Select(s);
			jobType.selectByVisibleText(AndroidCapabilities.getPropertyValue("CountryCode"));

			// ----------------------------------------------------------------------------------------------

			Thread.sleep(2000);
			logger1.info(
					"Area code+phone is '9899928177' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[2]/div[2]/div/label'");
			type("PhoneNumber_Xpath", "PhoneNumber");

			Thread.sleep(2000);
			logger1.info(
					"Business Email Address 'Bob.Jackson@gmail.com' typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[3]'");
			type("BusinessEmailAddress_Xpath", "BusinessEmailAddress");

			// ---------------------------------------------------------------------------------------------------

			Thread.sleep(2000);
			logger1.info(
					"Company 'Algoworks' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[4]/input'");
			type("Company_Xpath", "Company");

			Thread.sleep(2000);
			logger1.info(
					"Job Title 'Software Test Engineer' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[5]/input'");
			type("JobTitle_Xpath", "JobTitle");

			// --------------------------------------------------------------------------------------------------------------------------------------------------
			Thread.sleep(2000);
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("window.scrollBy(0,100)", "up");

			logger1.info(
					"Country name 'United Kingdom' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[6]/span/span'");
			WebElement s1 = findElement("Country2_Xpath");
			Select jobType1 = new Select(s1);
			Thread.sleep(2000);
			jobType1.selectByValue(AndroidCapabilities.getPropertyValue("Country2"));

			// ----------------------------------------------------------------------------------------------------------------

			Thread.sleep(2000);
			logger1.info(
					"City name 'Noida' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
			type("City_Xpath", "City");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox '//*[@id='contactUsReasonforInquiry']'");
			WebElement s3 = findElement("JobInquiry_Xpath");
			Select jobType3 = new Select(s3);
			Thread.sleep(2000);
			jobType3.selectByVisibleText(AndroidCapabilities.getPropertyValue("JobInquiry"));

			jse2.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info(
					"Message is displayed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
			type("Message_Xpath", "Message");

			jse2.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);

			logger1.info(
					"'contact us' is clicked having id '//*[@id='global-content']/div[3]/div[1]/section/div/form/div[13]/button'");
			click("ContactUs_Xpath");
			Thread.sleep(2000);
			click("ContactUs_Xpath");
			Thread.sleep(5000);

			jse2.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(5000);

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
