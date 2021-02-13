package com.algoworks.contactUs.Utilities;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;
import com.algoworks.contactUs.PageObjects.contact_page;
import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestUtils  {
	
	public  static  void  submitDetails(WebDriver driver,ExtentReports extent,ExtentTest rlog,Logger log,String name,String email,String phone,String message,String expected_res) throws InterruptedException, IOException
	{
		
		contact_page  cp= new contact_page(driver);
	
		scroll(driver,driver.findElement(By.xpath("//*[contains(text(),'COVID-19 FAQ')]")));  //scroll the window to the Form
		cp.setName(name);    // All details filled
		cp.setEmail(email);
		cp.setPhone(phone);
		cp.setMessage(message);  
		log.info(" All Details entered Successfully !");
		rlog.log(LogStatus.INFO, " All Details entered Successfully !");
		rlog.log(LogStatus.INFO, rlog.addScreenCapture( "."+shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_Form_Filled")));
		Thread.sleep(1000);
		cp.clickSubmit();
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(),expected_res);  // verfify Result
	}
	
	public static void contactButtonValidation(WebDriver driver,String testName,String locType,String waitNeeded,String loc,String scroll,ExtentTest rlog,Logger log ) throws InterruptedException, IOException
	{
		
		if(!scroll.equals(""))
		{
			if(scroll.charAt(0)=='/') {
			TestUtils.scroll(driver, driver.findElement(By.xpath(scroll)) );
			}
			else
			{
				TestUtils.scrollByPixel(driver, scroll);
			}
			
		}
			WebElement	bt=TestUtils.getWebElement(driver, locType, waitNeeded, loc);
			boolean display= bt.isDisplayed();
			AssertJUnit.assertEquals(display,true);
			rlog.log(LogStatus.INFO," Contact Us Button is Displayed !");
			log.info(" Contact Us Button is Displayed !");
			boolean enable= bt.isEnabled();
			AssertJUnit.assertEquals(enable,true);
			rlog.log(LogStatus.INFO, " Contact Us Button is Enabled !");
			log.info(" Contact Us Button is Enabled !");
			TestUtils.highLight(driver, bt);
			Thread.sleep(3000);
			if(!bt.isDisplayed())
			{
				TestUtils.ExplicitelyWaitForVisibility(driver, bt, 60);
			}
			rlog.log(LogStatus.INFO, rlog.addScreenCapture( "."+TestUtils.shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_Button_Highlight")));
			bt.click();
			Thread.sleep(2000);
			TestUtils.switch_driver_to_next_window(driver,"Contact Us - Algoworks");
			AssertJUnit.assertEquals(driver.getTitle(),"Contact Us - Algoworks");
			rlog.log(LogStatus.INFO, " Contact Us Button clicked successfully !");
		
	
		
	}
	
	//Swtich driver to next window
	public static void switch_driver_to_next_window(WebDriver driver,String title)
	{
		for(String window1:driver.getWindowHandles())
		{
			if(driver.switchTo().window(window1).getTitle().equals(title))
			{
				break;
			}
		} 
	}
	
	//explicitleywait
	public static WebElement ExplicitelyWait(WebDriver driver,WebElement wb,long timeOut )
	{
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(wb));

	}
	//explicitely wait for visibility
	public static WebElement ExplicitelyWaitForVisibility(WebDriver driver,WebElement wb,long timeOut )
	{
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.visibilityOf(wb));

	}

	// Highlight the Element While Taking the Screenshot

	public static void highLight(WebDriver driver,WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='8px solid green'", wb);

	}
	//Scroll down
	public static  void scroll(WebDriver driver,WebElement wb)
	{
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",wb);
	}
	
	public static  void scrollByPixel(WebDriver driver,String pix)
	{
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+pix+")", "");
	}

	
	
	public static String shots(WebDriver driver,String name) throws IOException
	{
		ReadConfig rd= new ReadConfig();
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String desPath= rd.getScreenshotPath()+name+".png";
		File des= new File(desPath);
		Files.copy(src, des);
		return desPath;
	}
	public static WebElement getWebElement(WebDriver driver,String locType,String waitNeeded,String loc)
	{
		WebElement  bt1=null;
		if(locType.equals("xpath")) 
		{
			if(waitNeeded.equals("y"))
			{
				bt1=TestUtils.ExplicitelyWait(driver,driver.findElement(By.xpath(loc)) , 60);
			}
			else
			{
				bt1=driver.findElement(By.xpath(loc));
			}
		}
		if(locType.equals("linkText"))
		{
			if(waitNeeded.equals("y"))
			{
				bt1=TestUtils.ExplicitelyWait(driver,driver.findElement(By.linkText(loc)) , 60);
			}
			else
			{
				bt1=driver.findElement(By.linkText(loc));
			}
		}
		return bt1;
	}

	public static void servicesValidation(WebDriver driver,ExtentTest rlog,Logger log ,String TestName,String service_locator,String scroll_locator ) throws InterruptedException, IOException
	{
		TestUtils.scrollByPixel(driver, "500");
        WebElement service=driver.findElement(By.xpath("//*[@id=\"menu-item-8804\"]/a/span"));
		
	    Actions	action=new Actions(driver);
		action.moveToElement(service).build().perform();
		
		TestUtils.highLight(driver, service);
		Thread.sleep(2000);
		
        WebElement services=driver.findElement(By.xpath(service_locator));
        TestUtils.highLight(driver, services);
		Thread.sleep(3000);
		
		rlog.log(LogStatus.INFO," Services Highlighted !");
		log.info(" Services Highlighted !");
		rlog.log(LogStatus.INFO, rlog.addScreenCapture( "."+TestUtils.shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_Services_Highlighted")));
		
		services.click();
		Thread.sleep(2000);
		
		

	}
	
	public static String getScreenshotId(String testName)
	{
		String[] arr= testName.split("_");
		
		return arr[0]+"_"+arr[1]+"_"+arr[2];
		
	}
	public static void getNewUserTesting(String TestName,WebDriver driver, String url,ExtentTest rlog,Logger log,ExtentReports extent) throws IOException, InterruptedException
	{
		
		 
		 String  contact_locator= "//*[@id='menu-item-23882']/a/span";
		 String scroll_locator ="";
		
		 driver.get(url);
		
		 TestUtils.scrollByPixel(driver, "2800");
		 WebElement wb= driver.findElement(By.xpath("//*[@id='social']/div/div[1]/div/a")); 
		 TestUtils.highLight(driver, wb);
		 Thread.sleep(2000);
		 rlog.log(LogStatus.INFO, " Learn More Button Highlighted !");
		 rlog.log(LogStatus.INFO, rlog.addScreenCapture( "."+TestUtils.shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_Learn_More_Highlighted")));
		 
		 Thread.sleep(1000);
		 wb.click();
		 TestUtils.switch_driver_to_next_window(driver, "A Complete Overview About Algoworks");
		 Thread.sleep(2000);
		 rlog.log(LogStatus.INFO, " Switch to Learn More Page Successfully !");
		 rlog.log(LogStatus.INFO, rlog.addScreenCapture( "."+TestUtils.shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_Switched_Learn_More")));
		 
		
		 Thread.sleep(2000);
		 TestUtils.scrollByPixel(driver, "1100");
		 
		 Thread.sleep(2000);
		 driver.close();
		 TestUtils.switch_driver_to_next_window(driver, "Top Mobile App Development Company USA, India | Salesforce Consulting Company");
		 
		 rlog.log(LogStatus.INFO, " Switch Back to  Home Page Successfully !");
		 rlog.log(LogStatus.INFO, rlog.addScreenCapture( "."+TestUtils.shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_Switched_Back_Home_Page")));
		 
		 TestUtils.scrollByPixel(driver, "-20000");

		 Thread.sleep(2000);
		 rlog.log(LogStatus.INFO, " Scrolled Up on Home Page Successfully !");
		 rlog.log(LogStatus.INFO, rlog.addScreenCapture( "."+TestUtils.shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_Home_Page")));
		 
		 TestUtils.contactButtonValidation(driver, TestName, "xpath", "y", contact_locator, scroll_locator, rlog, log);
		 TestUtils.submitDetails(driver, extent, rlog, log, "Mamta Mehta", "mamta.mehta@algoworks.com", "7355532141", "Testing", "Thank You - Algoworks");
			
		 
	}
	
	
}
