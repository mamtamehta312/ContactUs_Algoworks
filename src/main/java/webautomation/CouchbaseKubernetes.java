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

public class CouchbaseKubernetes extends WebCapabilities {
	static CouchbaseKubernetes k= new CouchbaseKubernetes();
	
	@BeforeClass
	public void downloadNext() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if( getPropertyValue("urltype").equalsIgnoreCase("first")) {
			driver.navigate().to(properties.getProperty("Downloads_url"));	
		}
		else {
		driver.navigate().to(properties.getProperty("Downloads2_url"));
		}
	}
	public void clickPlusButton() throws InterruptedException{ 
		 Thread.sleep(2000);
			click("cplusbuttonKubernetes_Xpath");	
	 }
	 public void clickDownloadButton() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("cDownloadsButtonKubernetes_Xpath");		
	 }
	 
	 public void clickDownloadButton2() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("cDown1.2.2_Xpath");		
	 }
	 
	 public void clickDownloadButton3() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("cDown1.2.1_Xpath");
			Thread.sleep(2000);
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
	 
	 public void Cbutton() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("'Download' button has been clicked");
		    click("cSubmitEmail_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void CSelectOSdropdown() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Dropdown to select OS Version is clicked.");
		    click("cSelectOS_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void checkingUrl1() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String url =driver.getCurrentUrl();
	  String expectedvalue = properties.getProperty("urlkub");
		Assert.assertEquals(url, expectedvalue);
}
	 
	 public void Cbuttonemail() throws InterruptedException{
		    Thread.sleep(3000);
		    logger1.info("Download button has been clicked");
		    click("cSubmitEmail_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void CDropdown() throws InterruptedException{
		    Thread.sleep(3000);
		    logger1.info("Dropdown to select OS is clicked");
		    click("cSelectOSKub_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void CSelectOS() throws InterruptedException{
		    Thread.sleep(3000);
		    logger1.info("Mac OS is selected");
		    click("cSelectMac_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void CSelectOS2() throws InterruptedException{
		    Thread.sleep(3000);
		    logger1.info("Windows option is selected");
		    click("cSelectWin_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void CVersion() throws InterruptedException{
		    Thread.sleep(3000);
		    logger1.info("Dropdown to select Version is clicked");
		    click("cVersionKub_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void CVersion2() throws InterruptedException{
		    Thread.sleep(3000);
		    logger1.info("Dropdown to select Version is clicked");
		    click("cVersionKub2_Xpath");
			Thread.sleep(5000);
	 }
	 
	 
	 public void CVersionSelect() throws InterruptedException{
		    Thread.sleep(3000);
		    logger1.info("Select 1.2.2 Version is clicked");
		    click("cVersion1.2.2_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void CVersionSelect2() throws InterruptedException{
		    Thread.sleep(3000);
		    logger1.info("Select 1.2.1 Version is clicked");
		    click("cVersion1.2.1_Xpath");
			Thread.sleep(5000);
	 }
	 
	
	 
	 public void Scroll() throws InterruptedException{
		    Thread.sleep(3000);
		    logger1.info("Scroll to Couchbase Kubernetes Tab");
		    WebElement element =driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/div[2]/div[1]/div[1]/h4"));
			  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(2000);
	 }
	 
	
	 public void checkingUrl122() throws InterruptedException{
		 Thread.sleep(3000);
		 logger1.info("checking the redirection"); 
		  String url_3 =driver.getCurrentUrl();
		  String expect = properties.getProperty("url122");
			Assert.assertEquals(url_3, expect);
	}
	
	 public void checkingUrl121() throws InterruptedException{
		 Thread.sleep(3000);
		 logger1.info("checking the redirection"); 
		  String url_3 =driver.getCurrentUrl();
		  String expect = properties.getProperty("url121");
			Assert.assertEquals(url_3, expect);
	}
	
	 @Test
		public static void Server() throws Exception {
			logger1 = extent.createTest("downloads");
			try {
				Thread.sleep(2000);
				k.Scroll();
				k.clickPlusButton();
				k.clickDownloadButton();
				k.firstName();
				k.lastName();
				k.PhoneNumber();
				k.Email();
				k.Company();
				k.jobTitle();
				k.Country();
				k.Checkbox();
				k.Submit();
				k.checkingUrl1();
				k.Cbuttonemail();
				driver.navigate().back();
				k.clickPlusButton();
				k.CDropdown();
				k.CSelectOS();
			    k.CVersion();
			    k.CVersionSelect();
			    k.clickDownloadButton2();
			    k.checkingUrl122();
			    k.Cbuttonemail();
			    driver.navigate().back();
			    k.clickPlusButton();
			    k.CDropdown();
			    k.CSelectOS2();
			    k.CVersion2();
			    k.CVersionSelect2();
			    k.clickDownloadButton3();
			    k.checkingUrl121();
			    k.Cbuttonemail();
			    driver.navigate().back();
			    
}
			catch(Exception e) {
				logger1.fail(e);                           
				throw e;
			}
			Thread.sleep(5000);

			logger1.pass("Testcase Couchabse Kubernetes is Passed");
		}
				 }		
	 
	 
