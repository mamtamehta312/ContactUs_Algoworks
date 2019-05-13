package mobileautomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile extends AndroidCapabilities{
	
	@BeforeClass
	public void ServerNext() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("mMobile_Url"));
	}
	
	
	@Test
	public static void mobile() throws Exception {
		logger1 = extent.createTest("mobile");
		try {
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,1000)", "up");
			
			Thread.sleep(1000);
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
			
			Thread.sleep(3000);
			//driver.findElement(By.cssSelector("#mktoForm_2768 > div.mktoFormRow.checkbox_block_1.checkbox_block.checkbox_width > div.mktoFieldDescriptor.mktoFormCol > div.mktoFieldWrap.mktoRequiredField > div.mktoLogicalField.mktoCheckboxList.mktoHasWidth.mktoRequired.mktoInvalid > label")).click();
			//driver.findElement(By.cssSelector("/*[.=''::before']")).click();
			//driver.findElement(By.xpath("//span[contains(text(),'I agree to the')]")).click();
			//driver.findElement(By.cssSelector("label:before")).click();
			/*Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector("mktoCheckbox_52362_0"))).build().perform();*/
			
			/*WebElement label = driver.findElement(By.xpath("//label[@for='mktoCheckbox_52362_0']"));
			new Actions(driver).moveToElement(label, 1, 1).click().perform();*/
			/*MobileElement element = driver.findElement(By.id("mktoCheckbox_51340_0"));
			Actions action = new Actions(driver);
			action.moveToElement(element).moveByOffset(200, 15).click().build().perform();*/
			
			//driver.findElement(By.xpath("//*[contains(@id,'mktoForm_')]/div[10]/div[1]/div[2]/div[2]/label")).click();
			//List<MobileElement> checkbox=driver.findElements(By.xpath("//input[starts-with(@id,'mktoCheckbox_')]"));
			/*List<MobileElement> checkbox=driver.findElements(By.xpath("//input[contains(@id,'mktoCheckbox_')][contains(@type,'checkbox')]"));
		    //checkbox.get(0).click();
			System.out.println(checkbox.size());
			for(int i=0;i<checkbox.size();i++)
			{
				MobileElement element = checkbox.get(i);
				System.out.println(element);
				String value=element.getAttribute("name");
				System.out.println(value);
				
				if(value.equalsIgnoreCase("termsandConditions")) {
					element.click();
				}
			}*/
		
			/*Thread.sleep(2000);
			logger1.info("Checkbox 'License Agreement' has been checked");
			click("mCheckbox_Xpath");*/
			
			//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			/*WebElement checkbox = driver.findElement(By.xpath("//input[contains(@name, 'formid')]"));
			String js = "arguments[0].setAttribute('type','text')";
			((JavascriptExecutor) driver).executeScript(js, checkbox);
			
			driver.findElement(By.xpath("//input[contains(@id, 'mktoCheckbox_')][contains(@name, 'termsandConditions')]")).click();*/
			//driver.findElement(By.xpath("//*[@class='mktoLogicalField mktoCheckboxList mktoHasWidth mktoRequired mktoInvalid']/input")).click();
			/*WebElement myElement = driver.findElement(By.xpath("//*[contains(@id,'mktoForm_')]/div[10]/div[1]/div[2]/div[2]"));
			String js = "arguments[0].setAttribute('type','text')";
			System.out.println(js);
			((JavascriptExecutor) driver).executeScript(js, myElement);*/
			/*JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.findElementsByName('termsandConditions')[0].click()");*/
		
			/*if (document.forms['myForm'].elements['userid'].value == "hidden")
			   { 
			   document.forms['myForm'].elements['userid'].type = "text"
			   }*/
			/*Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[text()='I agree to the ']/parent::span/parent::label"))).click().build().perform();*/
		
			
			/*List<MobileElement> checkbox=driver.findElements(By.xpath("//input[contains(@id,'mktoCheckbox_'][contains(@name,'termsandConditions']"));
			checkbox.get(9).click();*/
			
			
			
			Thread.sleep(2000);
			logger1.info("Checkbox 'privacy policy' has been checked");
			click("mCheckbox1_Xpath");
			
			
					
			Thread.sleep(2000);
			click("mButton_Xpath");
			
			/*WebDriverWait wait = new WebDriverWait(driver, 300);
			if(wait.until(ExpectedConditions.alertIsPresent())==null) {
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
