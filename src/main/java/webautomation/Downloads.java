package webautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.WebCapabilities;
import io.appium.java_client.MobileElement;

public class Downloads extends WebCapabilities{
	@BeforeClass
	public void downloadNext() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if( getPropertyValue("urltype").equalsIgnoreCase("first")) {
			driver.navigate().to(properties.getProperty("Downloads_url"));	
		}
		//else if(getPropertyValue("urltype").equalsIgnoreCase("second")) {
		else {
		driver.navigate().to(properties.getProperty("Downloads2_url"));
		}
		}
		
	@Test
	public static void downloads() throws Exception {
		logger1 = extent.createTest("downloads");
		try {
			
			Thread.sleep(2000);
			if( getPropertyValue("language").equalsIgnoreCase("english")) {
			
			  logger1.info("Click on'Couchbase Lite' tab");
			  WebElement element =driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			 }
			
			else  {
				logger1.info("Click on'Couchbase Lite' tab");
				  WebElement element2 =driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/div[3]/div[1]/div[1]"));
				  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element2);
					  }
	
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			
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
			type("dCountryy_Xpath","dCountryy");
			Thread.sleep(2000);
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			if( getPropertyValue("language").equalsIgnoreCase("english")) {
			
			  logger1.info("checking the redirection"); 
			  String url_e =driver.getCurrentUrl();
			  String expectedval = properties.getProperty("url_m");
				Assert.assertEquals(url_e, expectedval);
			  Thread.sleep(2000);
				click("dButton_Xpath");
				Thread.sleep(5000);
			}
			
			else {
				logger1.info("checking the redirection"); 
				  String url =driver.getCurrentUrl();
				  String expectedvalue = properties.getProperty("urlmsg");
					Assert.assertEquals(url, expectedvalue);
				  Thread.sleep(2000);
					click("dButton_Xpath");
					Thread.sleep(5000);
			
					driver.navigate().back();
					
					logger1.info("Click on'Couchbase Lite' tab");
					  WebElement element =driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/div[3]/div[1]/div[1]"));
					  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
					  
					  Thread.sleep(2000);
						click("dplusbutton_Xpath");
						
						 Thread.sleep(2000);
						 click("dDropdown_Xpath");
						 
						 Thread.sleep(2000);
						 click("dSelectObjective-c_Xpath");
						 
						 JavascriptExecutor js = (JavascriptExecutor) driver;
				            js.executeScript("window.scrollBy(0,350)", "down");
						 
						 Thread.sleep(3000);
						 click("dVersion_Xpath");
						 
						 Thread.sleep(4000);
						 click("dSelect2.6.4_Xpath");
						 
						 
						 Thread.sleep(2000);
							logger1.info("Downloads Button is selected");
							click("dDownloadsButton2.6.4_Xpath");
							Thread.sleep(2000);  
							
							logger1.info("checking the redirection"); 
							  String url2 =driver.getCurrentUrl();
							  String expectedvalues = properties.getProperty("urlmsg2");
								Assert.assertEquals(url2, expectedvalues);
							  Thread.sleep(2000);
								click("dButton_Xpath");
								Thread.sleep(5000);					
						 	 	 
			}
			
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
		Thread.sleep(5000);

		logger1.pass("Testcase Downloads is Passed");
	}
}


