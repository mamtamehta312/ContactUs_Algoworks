package mobileautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import io.appium.java_client.MobileElement;

public class Downloads extends AndroidCapabilities {

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
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement element = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			/*Actions hover = new Actions(driver);
			WebElement Elem_to_hover = driver.findElement(By.xpath("//*[@id="root"]/div/div[2]/div/div[2]/div/span/div/div[2]/div/div/span"));
			hover.moveToElement(Elem_to_hover).build().perform(); */
			
	//		Thread.sleep(2000);
	//		click("dPopupClose_Xpath");
			
	/*		Thread.sleep(10000);
			click("dPopupSel_Xpath");
			
			Thread.sleep(2000);
			click("dPopupCancel_Xpath");  */
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
            //MobileElement sel1 = driver.findElement(By.xpath("//*[@id=\'global-content\']/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/select"));
			//Select support_type1 = new Select(sel1);
			//support_type1.selectByVisibleText("United States/Canada (+1)");
			
			logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
			  driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			logger1.info("checking the redirection");
			String url = driver.getCurrentUrl();
			Assert.assertEquals(url, "https://www.couchbase.com/downloads/thankyou/enterprise?product=couchbase-lite&version=2.7.1&platform=android&addon=false&beta=false" );
			
			Thread.sleep(2000);
			click("dButton_Xpath");
			Thread.sleep(5000);
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
		Thread.sleep(5000);

		logger1.pass("Testcase Downloads is Passed");
	}
}
