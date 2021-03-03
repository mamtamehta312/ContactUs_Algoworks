package webautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import Base.WebCapabilities;
import io.appium.java_client.MobileElement;


public class FormFilling extends WebCapabilities {
	static FormFilling f= new FormFilling();


	public void FirstName() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox ");
		type("fFirstName_Xpath", "fFirstName");
		}
	public void LastName() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("fLastName_Xpath","fLastName");
		}
		
		public void PhoneNumber() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("PhoneNumber '9899928177' is typed in textbox");
		type("fPhoneNumber_Xpath","fPhoneNumber");
		}
		
		public void Email() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("Email 'poonam.gupta@algoworks.com' is typed in textbox");
		type("fBusinessEmailAddress_Xpath","fBusinessEmailAddress");
		}
		
		public void CompanyName() throws InterruptedException{
		Thread.sleep(2000);
		logger1.info("Company name 'Algoworks' is typed in textbox");
		type("fCompany_Xpath","fCompany");
		}
		
		public void jobTitle() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Job Title field has been clicked");
		    Actions a= new Actions(driver);
			driver.findElement(By.xpath("//label[contains(text(),'Job Title')]/..//details")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[contains(text(),'Job Title')]/..//details")).click();
			Thread.sleep(2000);
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/div[2]/div/section/div[1]/form/div[1]/div[5]/div/div[1]/details/div/label[1]")))
			.click();
			a.build().perform();
	 }
		
		public void ReasonForInquiry() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Reason for Inquiry field has been clicked");
		    Actions a= new Actions(driver);
			driver.findElement(By.xpath("//label[contains(text(),'Reason for Inquiry')]/..//details")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[contains(text(),'Reason for Inquiry')]/..//details")).click();
			Thread.sleep(2000);
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/div[2]/div/section/div[1]/form/div[1]/div[12]/div/div[1]/details/div/label[1]")))
			.click();
			a.build().perform();
	 }
		public void Message() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Message is typed");
			type("fMessage_Xpath","fMessage");
		}
		public void ContactUs() throws InterruptedException{
			Thread.sleep(2000);
		logger1.info("Contact Us button is selected");
		click("fContactUs_Xpath");
		Thread.sleep(5000);
		}
	
		public void Scrolly() throws InterruptedException{
			Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)", "up");
		}

		public void Scroll() throws InterruptedException{
			Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)", "up");
		}
		
		public void Checkbox() throws InterruptedException {
			Thread.sleep(5000);
			logger1.info("Agreement checkbox has been selected");
			WebElement element = driver.findElement(By.xpath("/html/body/main/div[3]/div[1]/div[2]/div/section/div[1]/form/div[2]/div/div/div/input"));
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
		}
		
	@Test
	public static void validLogin() throws Exception {
		logger1 = extent.createTest("formFilling");
		try {

			f.Scroll();
			f.FirstName();
			f.LastName();
			f.Email();
			f.CompanyName();
			f.Scrolly();
			f.jobTitle();
			f.PhoneNumber();
			f.ReasonForInquiry();
			f.Message();
			f.Checkbox();
			f.ContactUs();
		}

		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}
}
