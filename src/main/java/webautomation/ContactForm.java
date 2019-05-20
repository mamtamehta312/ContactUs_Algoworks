package webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.WebCapabilities;
@Test
public class ContactForm extends WebCapabilities {

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
			
			/*Thread.sleep(2000);
			logger1.info("Country code '+44' for country 'UK' is selected");
			WebElement ele= driver.findElement(By.xpath("//*[@id=\'global-content\']/div/div[2]/section/div/form/div[2]/div[1]/div/span/select"));
			Select select = new Select(ele);
			select.selectByVisibleText("United States/Canada (+1)");*/
			
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
			
			/*Thread.sleep(2000);
			logger1.info("Country 'United Kingdom' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[6]/span/select'");
			WebElement ele= driver.findElement(By.xpath("//select[@name='Country']"));
			Thread.sleep(2000);
			Select select = new Select(ele);
			Thread.sleep(2000);
			select.selectByVisibleText("United Kingdom");*/
//			Thread.sleep(2000);
//			jse.executeScript("document.getElementsByName('Country')[1].value='United Kingdom'");
			
			Thread.sleep(2000);
			logger1.info("City 'Sydney' is typed in textbox '//*[@id=\"global-content\"]/div/div[2]/section/div/form/div[9]/input'");
			type("cCity_Xpath", "cCity");
			
			Thread.sleep(2000);
			logger1.info("");
			
			
			Thread.sleep(2000);
			logger1.info("Message 'Type your inquiry here' is entered in textarea'//*[@id=\"comment\"]'");
			type("cMessage_Xpath","cMessage");
			
			Thread.sleep(2000);
			click("cContactUsButton_Xpath");
			
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}
}
