package webautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.WebCapabilities;

public class FormFilling extends WebCapabilities
		 {
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID")));
		
		
		@Test()
		public static void validLogin() throws Exception {
			logger1 = extent.createTest("login");
			try {
				 
				Thread.sleep(1000);
				
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,1500)", "up");
				
				Thread.sleep(2000);
				logger1.info("First name 'Bob' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/input'");
				type("FirstName_Xpath", "FirstName");
				
				Thread.sleep(2000);
				
				logger1.info("Last name 'Jackson' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/input'");
				type("LastName_Xpath", "LastName");
				
				//point(int , int );
				
				Thread.sleep(2000);
				logger1.info("Country code '+91' for country 'India' is selected");
				click("CountryCode_Xpath");
				Thread.sleep(2000);
				click("CountryCode");
				
				Thread.sleep(2000);
				logger1.info("Area code+phone is '9899928177' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[2]/div[2]/div/label'");
				type("PhoneNumber_Xpath", "PhoneNumber");
				

				logger1.pass("Testcase is Passed");
			}                                                                                                                                                     

			catch (Exception e) {
				logger1.fail(e);
				captureScreenShots("ErrorScreenshot.png");                                
				throw e;
			}

		}
	}

