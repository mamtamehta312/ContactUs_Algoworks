package webautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.WebCapabilities;
import io.appium.java_client.MobileElement;

public class Downloads extends WebCapabilities{
	
	static Downloads d= new Downloads();
	
	@BeforeClass
	public void downloadNext() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if( getPropertyValue("urltype").equalsIgnoreCase("first")) {
			driver.navigate().to(properties.getProperty("Downloads_url"));	
		}
		else if( getPropertyValue("urltype").equalsIgnoreCase("second")){
		driver.navigate().to(properties.getProperty("Downloads2_url"));
		}
		else {
			driver.navigate().to(properties.getProperty("Downloadsmain_url"));
			}
	}
	 public void clickPlusButton() throws InterruptedException{ 
		 Thread.sleep(2000);
			click("dplusbutton_Xpath");	
	 }
	 
	 public void clickPlusButtonmain() throws InterruptedException{ 
		 Thread.sleep(2000);
			click("dplussbutton_Xpath");	
	 }
	 public void clickDownloadButton() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");		
	 }
	 
	 public void clickDownloadsButton() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadssButton_Xpath");		
	 }
	 public void firstName() throws InterruptedException{
		    Thread.sleep(2000);
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");	
	 }
	 public void lastName() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
	 }
	 public void PhoneNumber() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
	 }
	 public void Email() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");		
	 }
	 public void Company() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");	
	 }
	 public void jobTitle() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
	 }
	 public void Country() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Country 'Afghanistan' has been selected");
			type("dCountryy_Xpath","dCountryy");
	 }
	 public void Checkbox() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
	 }
	 public void Submit() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(5000);
	 }
	 public void Dbutton() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButton_Xpath");
			Thread.sleep(5000);
	 }
	 public void dropdown() throws InterruptedException{
		 logger1.info("Dropdown has been clicked");   
	 Thread.sleep(2000);
	 click("dDropdown_Xpath");
	 }
	 public void selectOS() throws InterruptedException{
		 logger1.info("Select Objective-C option ");   
		 Thread.sleep(2000);
		 click("dSelectObjective-c_Xpath");
	 }
	 public void selectOSNET() throws InterruptedException{
		 logger1.info(".NET option is selected");   
		 Thread.sleep(2000);
		 click("dSelect.Net_Xpath");
	 }
	 
	 public void selectOSJava() throws InterruptedException{
		 logger1.info("Java option is selected");   
		 Thread.sleep(2000);
		 click("dSelectJava_Xpath");
	 }
	 
	 public void selectOSAndroid() throws InterruptedException{
		 logger1.info("Android option is selected");   
		 Thread.sleep(2000);
		 click("dSelectAndroid_Xpath");
	 }
	 
	 public void Version() throws InterruptedException{
		 logger1.info("Click on version");   
		 Thread.sleep(3000);
		 click("dVersion_Xpath");
	 }
	 
	 public void VersionSelect() throws InterruptedException{
		 logger1.info("Click on version");   
		 Thread.sleep(3000);
		 click("dVersionSelect_Xpath");
	 }
	 
	 public void VersionNew() throws InterruptedException{
		 logger1.info("Click on version");   
		 Thread.sleep(3000);
		 click("dVersionNew_Xpath");
	 }
	 public void selectVersion() throws InterruptedException{
		 logger1.info("Select 2.6.4 version");   
		 Thread.sleep(4000);
		 click("dSelect2.6.4_Xpath");
	 }
	 
	 public void selectVersionNew() throws InterruptedException{
		 logger1.info("Select 2.6.0 version");   
		 Thread.sleep(4000);
		 click("dSelect2.6.0_Xpath");
	 }
	 
	 public void selectVersions() throws InterruptedException{
		 logger1.info("Select 2.5.3 version");   
		 Thread.sleep(4000);
		 click("dSelect2.5.3_Xpath");
	 }
	 
	 public void Downloadnewbutton() throws InterruptedException{
	 Thread.sleep(2000);
		logger1.info("Downloads Button is selected");
		click("dDownloadsButton2.6.4_Xpath");
		Thread.sleep(2000); 
	 }
	 
	 public void DownloadNewVersion() throws InterruptedException{
		 Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton2.6.0_Xpath");
			Thread.sleep(2000); 
		 }
	 
	 public void DownloadNewVersion2() throws InterruptedException{
		 Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton2.5.3_Xpath");
			Thread.sleep(2000); 
		 }
	 
	 public void scroll() throws InterruptedException{
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,350)", "down");
	 }
	 public void checkingUrlLanguage2() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String url2 =driver.getCurrentUrl();
	  String expectedvalues = properties.getProperty("urlmsg2");
		Assert.assertEquals(url2, expectedvalues);
	 }
	 public void checkingUrlEnglish() throws InterruptedException{
			Thread.sleep(3000);
			  logger1.info("checking the redirection"); 
			  String url_e =driver.getCurrentUrl();
			  String expectedval = properties.getProperty("url_m");
				Assert.assertEquals(url_e, expectedval);
	 }
	 public void checkingUrlLanguage1() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String url =driver.getCurrentUrl();
	  String expectedvalue = properties.getProperty("urlmsg");
		Assert.assertEquals(url, expectedvalue);
}
	 public void checkingUrlAndroid() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String url2 =driver.getCurrentUrl();
	  String ex = properties.getProperty("urlcheck");
		Assert.assertEquals(url2, ex);
	 }
	 
	 public void checkingUrlJava() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String urljava =driver.getCurrentUrl();
	  String exe = properties.getProperty("urljava");
		Assert.assertEquals(urljava, exe);
	 }
	 
	 public void checkingUrlLanguage3() throws InterruptedException{
		 Thread.sleep(3000);
		 logger1.info("checking the redirection"); 
		  String url_3 =driver.getCurrentUrl();
		  String expect = properties.getProperty("urlmsg3");
			Assert.assertEquals(url_3, expect);
	}
	 
	 public void ScrollingToCouchbaseLiteTabLanguage() throws InterruptedException{
	 logger1.info("Click on'Couchbase Lite' tab");
	  WebElement element =driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/div[3]/div[1]/div[1]"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
}
	 
	 public void ScrollingToCouchbaseLiteTab() throws InterruptedException{
		 Thread.sleep(2000);
	 logger1.info("Click on'Couchbase Lite' tab");
	  WebElement element =driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
	 }
	 
	@Test
	public static void downloads() throws Exception {
		logger1 = extent.createTest("downloads");
		try {
			Thread.sleep(2000);
			if( getPropertyValue("urltype").equalsIgnoreCase("main") ) {
			d.ScrollingToCouchbaseLiteTab();
			d.clickPlusButtonmain();
			d.clickDownloadsButton();
			}
			
			else {
			d.ScrollingToCouchbaseLiteTabLanguage();
			d.clickPlusButton();
			d.clickDownloadButton();
			}
	
		
		
		d.firstName();
		d.lastName();
		d.PhoneNumber();
		d.Email();
		d.Company();
		d.jobTitle();
		d.Country();
		d.Checkbox();
		d.Submit();
			
			if( getPropertyValue("language").equalsIgnoreCase("english") && getPropertyValue("urltype").equalsIgnoreCase("main")) {
				d.checkingUrlEnglish();
			  d.Dbutton();
			  driver.navigate().back();
			}
			else {
			
				    d.checkingUrlLanguage1();
					 d.Dbutton();
					driver.navigate().back();
					d.ScrollingToCouchbaseLiteTabLanguage();
				d.clickPlusButton();
				d.dropdown();
				d.selectOS();
				d.scroll();
				d.Version();
				d.selectVersion();
				d.Downloadnewbutton();			
				d.checkingUrlLanguage2();
				d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseLiteTabLanguage();
				d.clickPlusButton();
				d.dropdown();
				d.selectOSNET();
				d.scroll();
				d.VersionNew();
				d.selectVersionNew();
				d.DownloadNewVersion();
				d.checkingUrlLanguage3();
				d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseLiteTabLanguage();
				d.clickPlusButton();
				d.dropdown();
				d.selectOSAndroid();
				d.VersionSelect();
				d.selectVersions();
				d.DownloadNewVersion2();
				d.checkingUrlAndroid();
				d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseLiteTabLanguage();
				d.clickPlusButton();
				d.dropdown();
				d.selectOSJava();
				d.clickDownloadButton();
				d.checkingUrlJava();
				d.Dbutton();
			           }
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
		Thread.sleep(5000);

		logger1.pass("Testcase Downloads is Passed");
	}
}


