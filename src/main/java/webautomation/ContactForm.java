package webautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.WebCapabilities;



public class ContactForm extends WebCapabilities {
	
	@BeforeClass
	public static void init() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("ContactForm_url"));
	}
	
	@Test
	  public static void contactform() throws Exception {
		logger1 = extent.createTest("contactform");
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,400)", "up");

			Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[1]/div/input'");
			type("cFirstName_Xpath", "cFirstName");
			
			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[1]/div[2]/div/input'");
			type("cLastName_Xpath","cLastName");
			
			Thread.sleep(2000);
			logger1.info("Country code '+91' for country 'UK (+44)' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
			
			Thread.sleep(2000);
			logger1.info("PhoneNumber '9899928177' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div[2]/div/input'");
			type("cPhoneNumber_Xpath","cPhoneNumber");
			
			Thread.sleep(2000);
			logger1.info("Email 'shashi.singh@algoworks.com' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[3]/input'");
			type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
			
			Thread.sleep(2000);
			logger1.info("Company name 'Algoworks' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[4]/input'");
			type("cCompany_Xpath","cCompany");
			
			Thread.sleep(2000);
			logger1.info("JobTitle 'Automation QA' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[5]/input'");
			type("cJobTitle_Xpath","cJobTitle");
			
			Thread.sleep(2000);
			logger1.info("Country 'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/span")).sendKeys("United States");
			
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City 'Sydney' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[9]/input'");
			type("cCity_Xpath", "cCity");
			
			
			Thread.sleep(3000);
			logger1.info("Sales Inquiry is selected");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
		
			Thread.sleep(2000);
			logger1.info("Message 'Type your inquiry here' is entered in textarea'//*[@id=\"comment\"]'");
			type("cMessage_Xpath","cMessage");
			
			Thread.sleep(2000);
			logger1.info("Contact Us button is selected");
			click("cContactUsButton_Xpath");
			
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}
}
