package webautomation;

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
					"First name 'Bob' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/input'");
			type("fFirstName_Xpath", "fFirstName");

			Thread.sleep(2000);

			logger1.info(
					"Last name 'Jackson' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/input'");
			type("fLastName_Xpath", "fLastName");

            Thread.sleep(3000);                                                                                                                                                             
			
			logger1.info("Country code '+91' for country 'UK (+44)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
			type("fCountryCode_Xpath","fCountryCode");
			Thread.sleep(3000);   

			logger1.info(
					"Area code+phone is '9899928177' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[2]/div[2]/div/label'");
			type("fPhoneNumber_Xpath", "fPhoneNumber");

			Thread.sleep(2000);
			logger1.info(
					"Business Email Address 'Bob.Jackson@gmail.com' typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[3]'");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

			
			Thread.sleep(2000);
			logger1.info(
					"Company 'Algoworks' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[4]/input'");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info(
					"Job Title 'Software Test Engineer' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[5]/input'");
			type("fJobTitle_Xpath", "fJobTitle");


			logger1.info("Country code '+91' for country 'India' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
	 
			logger1.info("Country code '+91' for state 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info(
					"City name 'Noida' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox '//*[@id='contactUsReasonforInquiry']'");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");

	

			jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info(
					"Message is displayed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
			type("fMessage_Xpath", "fMessage");

			jse.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);

			logger1.info(
					"'contact us' is clicked having id '//*[@id='global-content']/div[3]/div[1]/section/div/form/div[13]/button'");
			click("fContactUs_Xpath");
			Thread.sleep(2000);
			

			jse.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(5000);

			logger1.pass("Testcase is Passed");

		}

		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}
}
