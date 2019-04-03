package mobileautomation;


import java.net.MalformedURLException;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

public class FormFilling extends AndroidCapabilities {
	
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID")));
	

	@Test()
	public static void formFilling() throws Exception {
		logger1 = extent.createTest("formFilling");
		try {
			
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1500)", "up");
			
			Thread.sleep(2000);
			logger1.info("First name 'Bob' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/input'");
			type("FirstName_Xpath", "FirstName");
			
			Thread.sleep(2000);
			
			logger1.info("Last name 'Jackson' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/input'");
			type("LastName_Xpath", "LastName");
			
			
			Thread.sleep(2000);
			logger1.info("Country code '+91' for country 'India' is selected");
	        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			jse1.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(3000);
		
			//--------------------------------------------------------------------------------------
			
		
			
			/*MobileElement e = driver.findElement(By.cssSelector("select[ng-model='phonecountrycode']"));
			Thread.sleep(3000);
			
			e.click();
			
			//MobileElement customerType = driver.findElement(By.xpath("//*[contains(@name, 'PhoneCountryCode'])"));
			
			System.out.println("dddd : "+ e.getTagName());
			
			Select jobType = new Select(driver.findElement(By.cssSelector("select[ng-model='phonecountrycode']")));
			jobType.selectByValue("244");
			//*[@id='global-content']/div[3]/div[1]/section/div/form/div[2]/div[1]/div/select
			
			//*[@id='global-content']/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span
			//new WebDriverWait(driver, 15).until( ExpectedConditions.elementToBeClickable(e));
			e.click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//span[text()='UK (+44)']")).click();
			
			Select select = new Select(customerType);
			select.selectByIndex(2);
			
			//select.selectByVisibleText("India (+91)");
			//select.selectByValue("India (+91)");
*/		
		/*	WebElement element = driver.findElement(By.cssSelector("select[ng-model='phonecountrycode']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		
					//*[@id='global-content']/div[3]/div[1]/section/div/form/div[2]/div[1]/div
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Clicking on element with using java script click");

				//((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
				JavascriptExecutor executor1= (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].removeAttribute('unselectable'); return arguments[0];", executor1);
				((WebElement) executor1).click();
				
				
			} else {
				System.out.println("Unable to click on element");
				JavascriptExecutor executor1= (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].removeAttribute('unselectable'); return arguments[0];", executor);
				((WebElement) executor).click();*/
			
			
			/*WebElement element = driver.findElement(By.cssSelector("select[ng-model='phonecountrycode']"));
			
			WebElement s = driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/select"));
			//*[@id='global-content']/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span
			
			System.out.println("abcdedffal "+ s.getAttribute("name"));
			
			System.out.println("abcdedffal "+ s.getAttribute("unselectable"));
			
			
			setAttribute(s, "unselectable", "off");
			Thread.sleep(2000);
			System.out.println("abcdedffal "+ s.getAttribute("unselectable"));
			Select jobType = new Select(s);
			jobType.selectByVisibleText("India (+91)");*/
			
		/*	WebElement attribute = driver.findElement(By.xpath("//span[@unselectable='on']"));
			Dimension size = attribute.getSize();
			System.out.println(size);
			for(int i = 0; i<=1; i++){
				setAttribute(attribute, "unselectable", "off");
				Thread.sleep(2000);
				attribute.getAttribute("unselectable");
				//System.out.println("abcdedffal "+ attribute.getAttribute("unselectable"));
			}*/
			MobileElement s = driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/select"));
			Select jobType = new Select(s);
			jobType.selectByVisibleText("UK (+44)");
			
			
			//----------------------------------------------------------------------------------------------
			
			Thread.sleep(2000);
			logger1.info("Area code+phone is '9899928177' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[2]/div[2]/div/label'");
			type("PhoneNumber_Xpath", "PhoneNumber");
			
			Thread.sleep(2000);
			logger1.info("Business Email Address 'Bob.Jackson@gmail.com' typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[3]'");
			type("BusinessEmailAddress_Xpath", "BusinessEmailAddress"); 
		
		/*WebElement element1 = driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[3]"));
			
					if (element1.isEnabled() && element1.isDisplayed()) {
						System.out.println("Clicking on element with using java script click");
						jse1.executeScript("window.scrollBy(0,100)", "up");
						
						
						((JavascriptExecutor) driver).executeScript("arguments[0].value='Bob.Jackson@gmail.com';", element1);
					
					} else {
						System.out.println("Unable to click on element");}*/
					
			
		
					
			//---------------------------------------------------------------------------------------------------
			
			 Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[4]/input'");
			type("Company_Xpath", "Company");
				
			
			Thread.sleep(2000);	
			logger1.info("Job Title 'Software Test Engineer' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[5]/input'");
			type("JobTitle_Xpath", "JobTitle");
				
          //--------------------------------------------------------------------------------------------------------------------------------------------------
			Thread.sleep(2000);	
			logger1.info("Country name 'CANADA' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[6]/span/span'");
			//type("Country2_Xpath", "Country2");
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("window.scrollBy(0,100)", "up");
			
		
			
			MobileElement s1 = driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[6]/span/select"));
		    Select jobType1 = new Select(s1);
			Thread.sleep(2000);
			jobType1.selectByValue("United Kingdom");
		
			
			
		//----------------------------------------------------------------------------------------------------------------
			
			
			Thread.sleep(2000);	
			logger1.info("City name 'Noida' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
			type("City_Xpath", "City");
			
			Thread.sleep(2000);	
			logger1.info("'Reason for inquiry' is given in textbox '//*[@id='contactUsReasonforInquiry']'");
			MobileElement s3 = driver.findElement(By.xpath("//*[@id='contactUsReasonforInquiry']"));
			Select jobType3 = new Select(s3);
			jobType3.selectByVisibleText("Sales Inquiry");
			
					
			jse2.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);	
			logger1.info("Message is displayed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
			type("Message_Xpath", "Message");
			
			jse2.executeScript("window.scrollBy(0,300)", "up");
			Thread.sleep(2000);	
			logger1.info("'contact us' is clicked having id '//*[@id='global-content']/div[3]/div[1]/section/div/form/div[13]/button'");
			driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[13]/button")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[13]/button")).click();
			Thread.sleep(5000);
			
			jse2.executeScript("window.scrollBy(0, -800)", "down");
			Thread.sleep(5000);
			
			logger1.pass("Testcase is Passed");
		                                                                                                                                                  
		}
		catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");                                
			throw e;
		}}

		public static void setAttribute(WebElement element, String attName, String attValue) {
	        driver.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", 
	                element, attName, attValue);
			
		}
	}
