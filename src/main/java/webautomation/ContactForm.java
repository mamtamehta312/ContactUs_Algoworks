package webautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.WebCapabilities;




public class ContactForm extends WebCapabilities {
	
	static ContactForm c= new ContactForm();
	
	@BeforeClass
	public static void init() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("ContactForm_url"));
	}

			public void FirstName() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("First name 'Sumit' is typed in textbox ");
			type("cFirstName_Xpath", "cFirstName");
			}
			
			public void LastName() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Last name 'Tomar' is typed in textbox");
			type("cLastName_Xpath","cLastName");
			}
			
			//Thread.sleep(2000);
			//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
			
			public void PhoneNumber() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("PhoneNumber '9899928177' is typed in textbox");
			type("cPhoneNumber_Xpath","cPhoneNumber");
			}
			
			public void Email() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Email sumit.tomar@algoworks.com' is typed in textbox");
			type("cBusinessEmailAddress_Xpath","cBusinessEmailAddress");
			}
			
			public void CompanyName() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Company name 'Algoworks' is typed in textbox");
			type("cCompany_Xpath","cCompany");
			}
			
			public void jobTitle() throws InterruptedException{
			    Thread.sleep(2000);
			    logger1.info("Job Title field has been clicked");
			driver.findElement(By.xpath("//*[@id=\"contactUsPageForm\"]/div[2]/section/div[1]/form/div[1]/div[4]/div/input")).sendKeys(Keys.chord(Keys.TAB,Keys.ENTER));
			Thread.sleep(2000);
		 }
			
			public void ReasonForInquiry() throws InterruptedException{
			    Thread.sleep(2000);
			    logger1.info("Reason for Inquiry field has been clicked");
			    driver.findElement(By.xpath("//*[@id=\"contactUsPageForm\"]/div[2]/section/div[1]/form/div[1]/div[6]/div[1]/div/div[1]/input")).sendKeys(Keys.chord(Keys.TAB,Keys.TAB,Keys.ENTER));
				Thread.sleep(2000);
				
				
//			   
//			    Actions a= new Actions(driver);
//				driver.findElement(By.xpath("//label[contains(text(),'Reason for Inquiry')]/..//details")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//label[contains(text(),'Reason for Inquiry')]/..//details")).click();
//				Thread.sleep(2000);
//				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[1]/div[2]/div[2]/section/div[1]/form/div[1]/div[12]/div/div[1]/details/div/label[1]")))
//				.click();
//				a.build().perform();
		 }
			public void Message() throws InterruptedException{
				Thread.sleep(2000);
				logger1.info("Message is typed");
				type("cMessage_Xpath","cMessage");
			}
			
			
			public void ContactUs() throws InterruptedException{
				Thread.sleep(2000);
			logger1.info("Contact Us button is selected");
			click("cContactUsButton_Xpath");
			Thread.sleep(5000);
			}
			public void Scrolly() throws InterruptedException{
				Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,400)", "up");
			}
			public void Scrolls() throws InterruptedException{
				Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,200)", "up");
			}

			public void Scroll() throws InterruptedException{
				Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "up");
			}
			
			public void Checkbox() throws InterruptedException {
				Thread.sleep(5000);
				logger1.info("Agreement checkbox has been selected");
				WebElement element = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/section/div[2]/section/div[1]/form/div[2]/div/div/div/input"));
				Actions act = new Actions(driver);
				act.moveToElement(element).click().build().perform();
			}
			@Test
			 @Parameters("browser")
			 public static void contactform(String browser) throws Exception {
				 logger1 = extent.createTest("contactform");
				 try {
					 Thread.sleep(2000);
					 c.Scrolly();
					 c.FirstName();
					 c.LastName();
					 c.Email();
					 c.CompanyName();
					 if(browser.equalsIgnoreCase("firefox")) {
					 c.Scrolly();
					 }
					 c.Scrolls();
					 c.jobTitle();
					 c.PhoneNumber();
					 c.ReasonForInquiry();
					 c.Scrolls();
					 c.Message();
					 c.Checkbox();
					 c.ContactUs();	
					 
					
					 
					 
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
		Thread.sleep(3000);

		logger1.pass("Testcase ContactForm is Passed");
	}
}
