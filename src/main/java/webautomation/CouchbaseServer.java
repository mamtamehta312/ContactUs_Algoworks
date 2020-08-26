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

public class CouchbaseServer extends WebCapabilities{
	
	static CouchbaseServer c= new CouchbaseServer();
	
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
				click("cplusbuttonServer_Xpath");	
		 }
		 public void clickDownloadButton() throws InterruptedException{
				Thread.sleep(2000);
				logger1.info("Downloads Button is selected");
				click("cDownloadsButtonServer_Xpath");		
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
		  String expectedvalue = properties.getProperty("urlmsgserver");
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
			    click("cSelectOS_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CSelectOS() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("18.04 OS is selected");
			    click("cSelect18.04_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CSelectOS2() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Red Hat 8 option is selected");
			    click("cSelectRedHat8_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CSelectOS3() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Red Hat 7 option is selected");
			    click("cSelectRedHat7_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CSelectOS4() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Windows option is selected");
			    click("cSelectWindows_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CVersion() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Dropdown to select Version is clicked");
			    click("cVersion_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CVersion2() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Dropdown to select Version is clicked");
			    click("cVersion2_Xpath");
				Thread.sleep(5000);
		 }
		 public void CVersion3() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Dropdown to select Version is clicked");
			    click("cVersion3_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CVersion4() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Dropdown to select Version is clicked");
			    click("cVersion4_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CVersionSelect() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Select 6.0.4 Version is clicked");
			    click("cVersion6.0.4_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CVersionSelect2() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Select 6.0.3 Version is clicked");
			    click("cVersion6.0.3_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CVersionSelect3() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Select 6.0.2 Version is clicked");
			    click("cVersion6.0.2_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CVersionSelect4() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Select 6.0.1 Version is clicked");
			    click("cVersion6.0.1_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CDownloadNewVersion() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Download 6.0.4 Version");
			    click("cDownload6.0.4_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CDownloadVersion2() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Download 6.0.3 Version");
			    click("cDownload6.0.3_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CDownloadVersion3() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Download 6.0.2 Version");
			    click("cDownload6.0.2_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void CDownloadVersion4() throws InterruptedException{
			    Thread.sleep(3000);
			    logger1.info("Download 6.0.1 Version");
			    click("cDownload6.0.1_Xpath");
				Thread.sleep(5000);
		 }
		 
		 public void checkingUrll() throws InterruptedException{
			 Thread.sleep(3000);
			 logger1.info("checking the redirection"); 
			  String url_3 =driver.getCurrentUrl();
			  String expect = properties.getProperty("urllserver");
				Assert.assertEquals(url_3, expect);
		}
		 
		 public void checkingUrl603() throws InterruptedException{
			 Thread.sleep(3000);
			 logger1.info("checking the redirection"); 
			  String url_3 =driver.getCurrentUrl();
			  String expect = properties.getProperty("urlredhat");
				Assert.assertEquals(url_3, expect);
		}
		 public void checkingUrl602() throws InterruptedException{
			 Thread.sleep(3000);
			 logger1.info("checking the redirection"); 
			  String url_4 =driver.getCurrentUrl();
			  String expect = properties.getProperty("urlredhat7");
				Assert.assertEquals(url_4, expect);
		}
		 
		 public void checkingUrl601() throws InterruptedException{
			 Thread.sleep(3000);
			 logger1.info("checking the redirection"); 
			  String url_5 =driver.getCurrentUrl();
			  String expect = properties.getProperty("urllast");
				Assert.assertEquals(url_5, expect);
		}
		 
		 
		 @Test
			public static void Server() throws Exception {
				logger1 = extent.createTest("downloads");
				try {
					Thread.sleep(2000);
					c.clickPlusButton();
					c.clickDownloadButton();
					c.firstName();
					c.lastName();
					c.PhoneNumber();
					c.Email();
					c.Company();
					c.jobTitle();
					c.Country();
					c.Checkbox();
					c.Submit();
					c.checkingUrl1();
					c.Cbuttonemail();
					driver.navigate().back();
					c.clickPlusButton();
					c.CDropdown();
					c.CSelectOS();
				    c.CVersion();
				    c.CVersionSelect();
				    c.CDownloadNewVersion();
				    c.checkingUrll();
				    c.Cbuttonemail();
				    driver.navigate().back();
				    c.clickPlusButton();
				    c.CDropdown();
				    c.CSelectOS2();
				    c.CVersion2();
				    c.CVersionSelect2();
				    c.CDownloadVersion2();
				    c.checkingUrl603();
				    c.Cbuttonemail();
				    driver.navigate().back();
				    c.clickPlusButton();
				    c.CDropdown();
				    c.CSelectOS3();
				    c.CVersion3();
				    c.CVersionSelect3();
				    c.CDownloadVersion3();
				    c.checkingUrl602();
				    c.Cbuttonemail();
				    driver.navigate().back();
				    c.clickPlusButton();
				    c.CDropdown();
				    c.CSelectOS4();
				    c.CVersion4();
				    c.CVersionSelect4();
				    c.CDownloadVersion4();
				    c.checkingUrl601();
				    c.Cbuttonemail();
				    
				}
				catch(Exception e) {
		logger1.fail(e);                           
		throw e;
	}
	Thread.sleep(5000);

	logger1.pass("Testcase Couchabse Server is Passed");
}
		 }


	



