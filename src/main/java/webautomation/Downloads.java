package webautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.WebCapabilities;
import io.appium.java_client.MobileElement;

public class Downloads extends WebCapabilities{
	@BeforeClass
	public void downloadNext() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("Downloads_url"));
	}
	@Test
	public static void downloads() throws Exception {
		logger1 = extent.createTest("downloads");
		try {
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab '//*[@id='global-content']/section[1]/div/div/div[1]/ul/li[2]'");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Bob' is typed in textbox '//*[@id=\'global-content\']/div[4]/div/div/div/div/form/div[1]/div[1]/div/input'");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Jackson' is typed in textbox '//*[@id=\'global-content\']/div[3]/div[1]/section/div/form/div[1]/div[2]/div/input'");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Country 'United States/Canada (+1)' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
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


