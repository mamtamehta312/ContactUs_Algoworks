package webautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.WebCapabilities;
import io.appium.java_client.MobileElement;

public class Server extends WebCapabilities{
	@BeforeClass
	public void ServerNext() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("sServer_Url"));
	}
	@Test
	public static void server() throws Exception {
		logger1 = extent.createTest("server");
		try {
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("First Name 'Form' has been entered into the text field");
			type("sFirstName_Xpath","sName");
			
			Thread.sleep(2000);
			logger1.info("Last Name 'Testing' has been entered into the text field");
			type("sLastName_Xpath","sLastName");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("sCompany_Xpath","sCompany");
			
			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("sRole_Xpath","sRole");
			
			Thread.sleep(2000);
			logger1.info("Email 'poonam.gupta@algoworks.com' has been entered into the text field");
			type("sEmail_Xpath","sEmail");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("sPhoneNumber_Xpath","sNumber");
			
			Thread.sleep(2000);
			logger1.info("'Australia' country has been entered into the field");
			WebElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("Australia");
			
					
			Thread.sleep(2000);
			logger1.info("City 'Sydney' has been entered into the field");
			type("sCity_Xpath","sCity");
			
			Thread.sleep(2000);
			logger1.info("Checkbox 'license Agreement' has been checked");
			click("sCheckbox_Xpath");
			
			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			click("sCheckbox1_Xpath");
					
			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			click("sButton_Xpath");
			Thread.sleep(2000);
			
			/*WebDriverWait wait = new WebDriverWait(driver, 1);
			if(wait.until(ExpectedConditions.alertIsPresent())==null) {
				Thread.sleep(10000);
			}else {
				click("sConfirmationButton_Xpath");
			}*/
			
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
		Thread.sleep(3000);

		logger1.pass("Testcase Server is Passed");
	}
}

