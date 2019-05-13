package mobileautomation;

import java.awt.Robot;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
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
			//driver.findElement(By.cssSelector(" div.I agree to the  div:nth-child(3)")).click();
			
			//driver.findElement(By.cssSelector("a:not(.href)")).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a:not(.href)")));
			element.click();
		
			/*JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.findElementsByName('termsandConditions')[0].click()")*/
			
			/*WebElement switchLabel = driver.findElement(By.xpath("//input[@name='termsandConditions']"));
			String colorRGB = ((JavascriptExecutor)driver)
			        .executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('style');",switchLabel).toString();
			System.out.println(colorRGB);*/
		
			/*driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='termsandConditions']")).click();*/
			//WebElement element = driver.findElement(By.xpath("//*[contains(@id, 'mktoForm_')]/div[10]/div[1]/div[2]/div[2]/label"));
			/*Point coordinates = driver.findElement(By.cssSelector("input[name='termsandConditions']")).getLocation();
			Robot robot = new Robot();
			WebElement markNews = driver.findElement(By.cssSelector("input[name='termsandConditions']"));
			markNews.click();
			System.out.println(coordinates.x);
			System.out.println(coordinates.y);
			robot.mouseMove(coordinates.x,coordinates.y);*/


			
			/*Point point = element.getLocation();
			 int xcord = point.getX();
			 System.out.println("Position of the webelement from left side is "+xcord +" pixels");
			 int ycord = point.getY();
			 System.out.println("Position of the webelement from top side is "+ycord +" pixels");
			 Actions action = new Actions(driver);
			 action.moveToElement(element, xcord, ycord).click().build().perform();*/
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			/*WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='termsandConditions']")));
		    driver.findElement(By.cssSelector("input[name='termsandConditions']")).click();*/
		    
			/*WebElement element1 = driver.findElement(By.cssSelector("input[name='termsandConditions']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("document.getElementById('mktoCheckbox_51340_0').value='true'", element1);
			WebElement yourChkBox  = driver.findElement(By.xpath("//*[@name='termsandConditions']/parent::div"));*/

			//JavascriptExecutor js = (JavascriptExecutor) driver;        
			//((JavascriptExecutor) driver).executeScript("el = document.elementFromPoint(xcord, ycord); el.click();");
			
			//driver.findElement(By.cssSelector("input[name='termsandConditions']")).click();
			
			
			/*WebElement yourChkBox  = driver.findElement(By.xpath("//*[@name='termsandConditions']/parent::div"));

			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(yourChkBox));

			Actions act = new Actions(driver);
			act.moveToElement(yourChkBox).click().build().perform();*/
			
			//Thread.sleep(3000);
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
			
			/*driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector("input[name='termsandConditions']"))).click().build().perform();*/
			
			//driver.findElement(By.xpath("//*[@id=\"mktoForm_2768\"]/div[10]/div[1]/div[2]/div[2]/label/span/span/a")).click();
			/*WebElement checkbox = driver.findElement(By.xpath("//input[contains(@name, 'formid')]"));
			String js = "arguments[0].setAttribute('type','text')";
			((JavascriptExecutor) driver).executeScript(js, checkbox);
			
			driver.findElement(By.xpath("//input[contains(@id, 'mktoCheckbox_')][contains(@name, 'termsandConditions')]")).click();*/
			
			//driver.findElement(By.cssSelector("label.mktoCheckbox_51340_0::before")).click();
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
			
			WebDriverWait wait1 = new WebDriverWait(driver, 300);
			if(wait1.until(ExpectedConditions.alertIsPresent())==null) {
				Thread.sleep(10000);
			}else {
				click("mConfirmationButton_Xpath");
			}
			
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
	}
}
