package mobileautomation;

import java.io.File;
import java.nio.file.FileSystems;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import Base.WebCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AddClaim extends AndroidCapabilities {
	@Test()
	public static void AddClaim() throws Exception {

		try {
			//Login.validLogin();

			logger1 = extent.createTest("Sumbit Claim");

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,-300)", "down");
			
			Thread.sleep(1000);
			logger1.info("Selector is clicked");
			click("Selector_Xpath");
			
			Thread.sleep(1000);
			logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
			click("MembershipOption_Xpath");
		
			Thread.sleep(1000);
			logger1.info("Claims option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/ul/li[3]/a\" is clicked");
			click("ClaimOption_Xpath");
			
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = findElement("SumbitClaim_Xpath");
			// This will scroll the page Horizontally till the element is found
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			logger1.info(" sumbit a new Claim option \"claims-submit\" is clicked");
			Thread.sleep(3000);
			Element.click();
			
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("window.scrollBy(0,500)", "down");
			
			
			Thread.sleep(5000);
			logger1.info("search box '//button/span[@class=\"fa fa-search\"]' clicked");
			 List<MobileElement> myList=driver.findElements(By.xpath("//span[@class='fa fa-search']"));
			 myList.get(1).click();
			 
			 Thread.sleep(5000);
			logger1.info("Select Button '//button[@class=\"primary btn btn-primary\"]' clicked");
			click("SelectButton_Xpath");
			
			/*Thread.sleep(3000);
			logger1.info(" attach pdf file is choosen");*/
//			String absolutePath = FileSystems.getDefault().Capabilities.getPropertyValue("pathForPdf").normalize()
//					.toAbsolutePath().toString();
//
//			Cababilities.getElementByXpath("//*[@id=\'example\']").sendKeys(absolutePath);
			
			/*click("ChooseFile_Xpath");
			Thread.sleep(1000);*/
			
			/*MobileElement frame = driver.findElement(By.xpath("//*[@id='screenshotContainer']/div/div/div/div/div/div[6]"));
			driver.switchTo().frame(frame);
	
			List<MobileElement> list = driver.findElementsByName("ALLOW");
			for(MobileElement l:list){
			l.click();	
			}*/
			/*ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");*/
			
			/*if(driver.findElement(By.className("android.widget.Button")).isDisplayed()){
				driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			}*/
		
			
			//com.android.packageinstaller:id/permission_allow_button
			/*String pathForPdf="src/main/resources/pdf/pdfurl-guide.pdf";
			
			String absolutePath = FileSystems.getDefault().getPath(pathForPdf).normalize()
					.toAbsolutePath().toString();
			driver.findElement(By.xpath("//*[@id=\"AttachFile\"]")).sendKeys(absolutePath);*/
			
			

					//TestUtility.getElementByXpath("//*[@id=\'example\']").sendKeys(absolutePath);
			
			/*String filePath ="/storage/emulated/0/Documents/pdfurl-guide.pdf";
			driver.findElement(By.xpath("//*[@id=\"AttachFile\"]")).sendKeys(filePath);*/
			

		//	MobileElement frame = driver.findElement(By.xpath("//*[@id='screenshotContainer']/div/div/div/div/div/div[6]"));
		//	driver.switchTo().frame(frame);
		//	MobileElement element = driver.findElement(By.xpath("//*[contains(text(), 'ALLOW')]"));
		//	System.out.println("Text : "+element.getText());
		//	element.click();
		/*	driver.switchTo().frame("//*[@id='screenshotContainer']/div/div/div/div/div/div[6]");
		
			
			
			Thread.sleep(3000);
			logger1.info("Record audio and video permission is clicked");
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("com.android.packageinstaller:id/permission_allow_button")).click();
			
			Thread.sleep(3000);
			logger1.info("Documents is choosen");
			driver.findElement(By.xpath("//*[@id='screenshotContainer']/div/div/div/div/div/div[29]")).click();*/
			
			
			
			
			Thread.sleep(1000);
			logger1.info(" click on sumbit the claim");
			click("Insert_Xpath");

			
			Thread.sleep(3000);
			
			
     		logger1.pass("Testcase is Passed");
		}

		catch (Exception e) {
			logger1.fail(e);
			captureScreenShots("ErrorScreenshot.png");
			throw e;
		}

	}
}
