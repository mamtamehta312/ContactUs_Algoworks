package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.WebCapabilities;

public class Login2 extends WebCapabilities {
	
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
			Thread.sleep(1000);
			logger1.info("sign-in is clicked");
			click("SignIn_Xpath");

			Thread.sleep(1000);
			
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