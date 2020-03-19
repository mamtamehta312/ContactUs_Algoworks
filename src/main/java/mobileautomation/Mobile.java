package mobileautomation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Base.AndroidCapabilities;
import io.appium.java_client.MobileElement;
public class Mobile extends AndroidCapabilities{
	
	@BeforeClass
	public void mobileNext() {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("mMobile_Url"));
	}
	
	@Test
	public static void mobile() throws Exception {
		logger1 = extent.createTest("mobile");
		try {
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");
			
			Thread.sleep(2000);
			logger1.info("First Name 'Bob' has been entered into the text field");
			type("mFirstName_Xpath","mName");
			
			Thread.sleep(2000);
			logger1.info("Last Name 'jackson' has been entered into the text field");
			type("mLastName_Xpath","mLastName");
			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' has been entered into the text field");
			type("mCompany_Xpath","mCompany");
			
			Thread.sleep(2000);
			logger1.info("Role 'Automation QA' has been entered into the text field");
			type("mRole_Xpath","mRole");
			
			Thread.sleep(2000);
			logger1.info("Email 'Bob.jackson@gmail.com' has been entered into the text field");
			type("mEmail_Xpath","mEmail");
			
			Thread.sleep(2000);
			logger1.info("Phone '1(866)648-7575' has been entered into the field");
			type("mPhoneNumber_Xpath","mNumber");
			
			Thread.sleep(2000);
			logger1.info("Country 'France' has been selected");
			MobileElement selectEle = driver.findElement(By.xpath("//*[@id=\'Country\']"));
			Select ele = new Select(selectEle);
			ele.selectByVisibleText("France");
			
			jsed.executeScript("window.scrollBy(0,100)", "up");
			
			Thread.sleep(2000);
			logger1.info("City 'Paris' has been entered into the field");
			type("mCity_Xpath","mCity");
			
			jsed.executeScript("window.scrollBy(0,100)", "up");
		
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementsByName('termsandConditions')[0].click()");
				
			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			js.executeScript("document.getElementsByName('Double_Opt_in_Compliant__c')[0].click()");		
			
/*			Thread.sleep(2000);
			logger1.info("Checkbox 'license Agreement' has been checked");
			click("mCheckbox_Xpath");
			
			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			click("mCheckbox1_Xpath");	*/		
					
			Thread.sleep(2000);
			logger1.info("'Download Now' button is pressed");
			
			click("mButton_Xpath");			
			Thread.sleep(5000);
			
			logger1.pass("Testcase is Passed");
			/*WebDriverWait wait1 = new WebDriverWait(driver, 300);
			if(wait1.until(ExpectedConditions.alertIsPresent())==null) {
				Thread.sleep(10000);
			}else {
				click("mConfirmationButton_Xpath");
			}*/
			
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
	}
}
