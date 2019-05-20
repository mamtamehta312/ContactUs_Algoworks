package webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.WebCapabilities;
import io.appium.java_client.MobileElement;
@Test
public class Downloads extends WebCapabilities{

	public static void downloads() throws Exception {
		logger1 = extent.createTest("downloads");
		try {
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab '//*[@id='global-content']/section[1]/div/div/div[1]/ul/li[2]'");
			click("dTab_Xpath");
			Thread.sleep(2000);
						
			/*logger1.info("Couchbase supports Ubuntu 18.04' is selected");
			WebElement sel = driver.findElement(By.xpath("//*[contains(@id,'tab-couchbase-lite-')]/div[1]/div/span/select"));
			Select support_type = new Select(sel);
			support_type.selectByVisibleText("Swift");*/
			
			Thread.sleep(2000);
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Bob' is typed in textbox '//*[@id=\'global-content\']/div[4]/div/div/div/div/form/div[1]/div[1]/div/input'");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Jackson' is typed in textbox '//*[@id=\'global-content\']/div[3]/div[1]/section/div/form/div[1]/div[2]/div/input'");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Country 'United States/Canada (+1)' is selected");
			/*WebElement sel1 = driver.findElement(By.xpath("//*[@id=\'global-content\']/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/select"));
			Select support_type1 = new Select(sel1);
			support_type1.selectByVisibleText("United States/Canada (+1)");*/
			
			logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'Testing@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'Testing@algoworks.com' has been entered to the email field");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'CANADA' has been selected");
			/*WebElement sel2 = driver.findElement(By.xpath("//*[@id=\'global-content\']/div[4]/div/div/div/div/form/div[6]/span/select"));
			Select support_type2 = new Select(sel2);
			support_type2.selectByVisibleText("Canada");
			Thread.sleep(2000);*/
			
			logger1.info("Province 'British Columbia' has been selected");
			/*WebElement sel3 = driver.findElement(By.xpath("//*[@id=\'global-content\']/div[4]/div/div/div/div/form/div[8]/span/select"));
			Select support_type3 = new Select(sel3);
			support_type3.selectByVisibleText("British Columbia");
			Thread.sleep(2000);*/
			
			/*logger1.info("City 'Toronto' has been entered to the field");
			type("dCity_Xpath","dCity");
			Thread.sleep(2000);*/
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' button has been clicked");
			click("dButton_Xpath");
			Thread.sleep(2000);
					
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
	}
}


