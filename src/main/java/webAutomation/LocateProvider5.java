package webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.WebCapabilities;

public class LocateProvider5 extends WebCapabilities {

	@Test()
	public void locateProvider() throws Exception {

		try {
			// Login2.validLogin();
//			 AddClaim3.AddClaim();
//			 VerifyMembershipText4.verifyMembershiptext();

			logger1 = extent.createTest("Locate a Provider");

			Thread.sleep(2000);
			logger1.info("Healthcare option '//a[@title='Healthcare']' is clicked");
			click("Healthcare_Xpath");

			Thread.sleep(2000);
			logger1.info(
					"Locate a provider option '//*[@id=\"header-navbar-collapse\"]/div[2]/ul/li[5]/ul/li[2]/a' is clicked");
			click("LocateProvider_Xpath");

			Thread.sleep(2000);
			logger1.info("Location option '//input[@id='PostalAddressLookup1']' is clicked");
			type("Location_Xpath", "Location");

			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "down");
			// jse.executeScript("scroll(0, -1110);","up");

//	scroll to bottom of page
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);

			System.out.println("biubciksjd");

//	Thread.sleep(1000);
//	logger1.info("Scheme Plan textbox '//span[@id='select2-plan-select-container']' is clicked");
//	click("SchemePlan_Xpath");
//	
//	Thread.sleep(1000);
//	logger1.info("Primary Select '//*[@id=\"select2-plan-select-result-dpil-PL469\"]' is clicked");
//	click("PrimarySelect_Xpath");

//	Thread.sleep(2000);
//	logger1.info("Select any option '//li[@id='select2-plan-select-result-wriv-PL020']' is selected");
//	Select sel = new Select(findElement("SchemePlan_Xpath"));
//	sel.selectByIndex(1);

			Thread.sleep(2000);
			logger1.info(
					"Provider name 'Fortis Hospital' is typed in textbox '//input[@class='ng-pristine ng-valid ng-empty ng-touched']' ");
			type("ProviderName_Xpath", "ProviderName");

			Thread.sleep(2000);
			logger1.info(
					"Practice Number '12345678' is typed in textbox '//input[@placeholder='Practice number'][@class='ng-pristine ng-valid ng-empty ng-touched']' ");
			type("PracticeNumber_Xpath", "PracticeNumber");

			Thread.sleep(2000);
			logger1.info("Search button '//*[@id=\"submit-button\"]' is clicked");
			click("SearchButton_Xpath");

			Thread.sleep(2000);
			logger1.info("show map '//span[@class='slider round']' is clicked");
			click("ShowMap_Xpath");
			Thread.sleep(2000);

			logger1.pass("Testcase is Passed");
		}

		catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");
			throw e;
		}

	}

}
