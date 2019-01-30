package mobileautomation;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
			driver.get(("https://bonitasmembersandbox.microsoftcrmportals.com/SignIn"));
			 
			logger1.info("username  \"benm449@gmail.com\" is typed in textbox '//*[@id=\"Username\"]' ");
			type("Username_ID", "username");
			logger1.info("correct password \"Ranger40#\" is typed in textbox '//*[@id=\"Password\"]' ");
			type("Password_ID", "password");
			Thread.sleep(2000);
			logger1.info("sign-in is clicked");
			//click("SignIn_ID");
			//new TouchAction(driver).tap(209,1603).perform();

			//driver.navigate().back();
			/*Thread.sleep(1000);
			WebElement plusYouXp = driver.findElement(By.id("SIGN IN"));
                  int center_x = plusYouXp.getSize().getHeight()/2;
					int center_y = plusYouXp.getSize().getWidth()/2;
					System.out.println(center_x+" "+center_y);
					click("SIGN IN");*/
					//click("submit-signin-local");
					
					//point(213,1599);
				//	tapObject("SignIn_Xpath");
					
					/*WebDriverWait wait = new WebDriverWait(driver, 60);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[6]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[14]/android.widget.Button[1]")));
					driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[6]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[14]/android.widget.Button[1]")).click();
					*/
					
					/*WebDriverWait wait1 = new WebDriverWait(driver,40);
					wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[6]/android.view.View[2]/android.view.View[2]")));
					driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[6]/android.view.View[2]/android.view.View[2]")).click();
*/
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[6]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[14]/android.widget.Button[1]")));
			
					WebElement element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[6]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[14]/android.widget.Button[1]"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", element);
					
		
					//driver.findElement(MobileBy.className("android.widget.Button")).click();
					
			Thread.sleep(1000);
			
			WebElement Member = findElement("MemberName_Xpath");
			WebElement Membership =findElement("MembershipNumber_ID");
		    WebElement PlanType = findElement("PlanType_ID");
			
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
