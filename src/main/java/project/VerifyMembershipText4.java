package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.WebCapabilities;

public class VerifyMembershipText4 extends WebCapabilities {

	public static void assertEquals(String actualResult, String expectedResult) {
		String str = findElement(actualResult).getText();

		if (str.equals(expectedResult)) {
			logger1.pass(str + " matches with expected string");

		} else {
			logger1.fail(str + " does not matches with expected string");
		}
	}

	@Test()
	public static void verifyMembershiptext() throws Exception {

		try {
			//Login2.validLogin();
			Thread.sleep(2000);
			logger1 = extent.createTest("Text verification in Membership option");
			logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
			//click("MembershipOption_Xpath");
			driver.findElement(By.xpath("//*[@id='header-navbar-collapse']/div[2]/ul/li[3]/a")).click();

			Thread.sleep(2000);
			logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
			//click("MembershipOption_Xpath");
			driver.findElement(By.xpath("//*[@id='header-navbar-collapse']/div[2]/ul/li[3]/ul/li[1]/a")).click();
			
			Thread.sleep(2000);
			//MemberName_Xpath  
			assertEquals("//*[@id='portalPage']/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/p[1]", "Member Name: Gert Petrus Benjamin Myburgh");
			Thread.sleep(1000);
			//MembershipNumber_Xpath
			assertEquals("//*[@id='portalPage']/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/p[2]", "Membership Number: 02100100561");
			Thread.sleep(2000);
			//PlanType_Xpath
			assertEquals("//*[@id='portalPage']/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/p[3]", "Plan Type: STANDARD SELECT");

			Thread.sleep(2000);
			logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
			//click("MembershipOption_Xpath");
			driver.findElement(By.xpath("//*[@id='header-navbar-collapse']/div[2]/ul/li[3]/a")).click();
			
			Thread.sleep(2000);
			logger1.info("Benefits & Limits option is clicked");
			//click("BenefitsAndLimitsOption_Xpath");
			driver.findElement(By.xpath("//*[@id='header-navbar-collapse']/div[2]/ul/li[3]/ul/li[2]/a")).click();
			



			Thread.sleep(2000);
			//MembershipOption_Xpath
			logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
			driver.findElement(By.xpath("//*[@id='header-navbar-collapse']/div[2]/ul/li[3]/a")).click();

			Thread.sleep(2000);
			logger1.info("Contributions option is clicked");
			//click("Contributions_Xpath");
			driver.findElement(By.xpath("//*[@id='header-navbar-collapse']/div[2]/ul/li[3]/ul/li[4]/a")).click();

			Thread.sleep(2000);
			WebElement a1 = findElement("ContributionTable_Xpath");
			logger1.pass("Contributions table content:- " + a1.getText());

			Thread.sleep(2000);
			logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
			click("MembershipOption_Xpath");

			Thread.sleep(2000);
			logger1.info("Membership status option is clicked");
			click("MembershipStatus_Xpath");

//			Thread.sleep(2000);
//			WebElement a2 = findElement("MembershipTable_Xpath");
//			logger1.pass("Membership status table content:- " + a2.getText());

			logger1.pass("Testcase is Passed");
		}

		catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");
			throw e;
		}
	}
}
