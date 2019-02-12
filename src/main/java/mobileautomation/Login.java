package mobileautomation;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

public class Login extends AndroidCapabilities {
	
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID")));
	

	@Test()
	public static void validLogin() throws Exception {
		logger1 = extent.createTest("login");
		try {
			 
			logger1.info("username  \"benm449@gmail.com\" is typed in textbox '//*[@id=\"Username\"]' ");
			type("Username_Xpath", "username");
			logger1.info("correct password \"Ranger40#\" is typed in textbox '//*[@id=\"Password\"]' ");
			type("Password_Xpath", "password");
			Thread.sleep(2000);
			logger1.info("sign-in is clicked");
//			MobileElement element = driver.findElement(By.xpath("//*[@id='submit-signin-local']"));
//			//element.click();
//			Thread.sleep(2000);
//			element.click();
			click("SignIn_Xpath");
		
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div/div/div[1]/div[1]/div[2]/p[1]")));
			
			//swipeup(0,300);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,300)", "up");
					
			Thread.sleep(2000);
			
			WebElement Member = findElement("MemberName_Xpath");
			WebElement Membership =findElement("MembershipNumber_Xpath");
		    WebElement PlanType = findElement("PlanType_Xpath");
			
			if (Member.isDisplayed()) {
				Member.click();
				logger1.info(Member.getText());

			} else {
				logger1.info("'Member Name' text did not displayed");
			}

			Thread.sleep(1000);
			if (Membership.isDisplayed()) {
				logger1.info(Membership.getText());
			} else {
				logger1.info("'Membership Number' text did not displayed");
			}

			Thread.sleep(1000);
			if (PlanType.isDisplayed()) {
				logger1.info(PlanType.getText());
			} else {
				logger1.info("'Plan Type' text did not displayed");
			}

			logger1.pass("Testcase is Passed");
		}                                                                                                                                                     

		catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");                                
			throw e;
		}

	}
}
