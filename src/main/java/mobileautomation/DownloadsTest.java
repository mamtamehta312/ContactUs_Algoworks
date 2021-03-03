package mobileautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import io.appium.java_client.MobileElement;
import webautomation.Downloads;

public class DownloadsTest extends AndroidCapabilities {
	static DownloadsTest dt= new DownloadsTest();
	
	
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
	 public void clickPlusButtonKubernetes() throws InterruptedException{ 
		 Thread.sleep(2000);
			click("dplusbuttonKubernetesMob_Xpath");	
	 }
	 
	 public void clickPlusButtonKuberneteslang() throws InterruptedException{ 
		 Thread.sleep(2000);
			click("dplusbuttonKubernetesMoblang_Xpath");	
	 }
	 
	 public void clickPlusButtonSyncGatewaylang() throws InterruptedException{ 
		 Thread.sleep(2000);
			click("dplusbuttonSyncGatewayMoblang_Xpath");	
	 }
	 
	 public void clickPlusButtonSyncG() throws InterruptedException{ 
		 Thread.sleep(2000);
			click("dplusbuttonSyncG_Xpath");	
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
	 
	 public void clickDownloadsButtonJava() throws InterruptedException{
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadssButtonJava_Xpath");		
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
	 
	 public void Tab() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Job Title field has been clicked");
	 
		    WebElement webElement = driver.findElement(By.xpath("//*[@id=\"modalShow\"]/div/div/div[2]/section/div[1]/form/div[1]/div[4]/div/input"));//You can use xpath, ID or name whatever you like
		    webElement.sendKeys(Keys.TAB);
		    WebElement webElements = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/div/div/div[2]/section/div[1]/form/div[1]/div[5]"));
		    webElements.sendKeys("i");
		    webElement.sendKeys(Keys.TAB);
	 }
	 
	 public void jobTitle() throws InterruptedException{
		    Thread.sleep(3000);
		    logger1.info("Job Title field has been clicked");

		    Select dropdown = new Select(driver.findElement(By.name("jobTitle2")));  
			 dropdown.selectByIndex(0); 
		    
	 }
	 
	 public void Country() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Country 'Afghanistan' has been selected");
			type("dCountryy_Xpath","dCountryy");
	 }
	 public void Checkbox() throws InterruptedException{
		    Thread.sleep(5000);
		    logger1.info("Agreement checkbox has been selected");
		    WebElement element=driver.findElement(By.xpath("//*[@id=\"license\"]"));
		    Actions act= new Actions(driver);
		    act.moveToElement(element).click().build().perform();
	 }
	 
	 public void Checkbox2() throws InterruptedException{
		    Thread.sleep(5000);
		    logger1.info("Agreement checkbox has been selected");
		    WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/div/div/div[2]/section/div[1]/form/div[2]/div[1]/div/div/input"));
		    Actions act= new Actions(driver);
		    act.moveToElement(element).click().build().perform();
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
	 
	 public void DbuttonServer() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonServer_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void DbuttonServer650() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonServer650_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void DbuttonServer651() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonServer_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void DbuttonServer604() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonServer604_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void DbuttonKubernetes201() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonKub201_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void DbuttonKubernetes201RedHat() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonKub201RedHat_Xpath");
			Thread.sleep(5000);
	 }
	 
	 
	 public void DbuttonKubernetes200() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonKub200_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void DbuttonKubernetes200RedHat() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonKub200RedHat_Xpath");
			Thread.sleep(5000);
	 }
	 
	 
	 public void DbuttonKubernetes122() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonKub122_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void DbuttonKubernetes122RedHat() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonKub122RedHat_Xpath");
			Thread.sleep(5000);
	 }
	 
	 
	 public void DbuttonRedHat201() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonRedHat201_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void DbuttonRedHat200() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonRedHat200_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void DbuttonRedHat122() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonRedHat122_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void DbuttonSyncG273() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonSyncG273_Xpath");
			Thread.sleep(5000);
	 }
	 public void DbuttonSyncG272() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonSyncG272_Xpath");
			Thread.sleep(5000);
	 }
	 public void DbuttonSyncG271() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonSyncG271_Xpath");
			Thread.sleep(5000);
	 }
	 public void DbuttonSyncG270() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonSyncG270_Xpath");
			Thread.sleep(5000);
	 }
	 public void DbuttonSyncG261() throws InterruptedException{
		    Thread.sleep(2000);
		    logger1.info("Download button has been clicked");
		    click("dButtonSyncG261_Xpath");
			Thread.sleep(5000);
	 }
	 
	 public void Platform() throws InterruptedException{
		 logger1.info("Dropdown has been clicked");   
	 Thread.sleep(2000);
	 click("dPLatformMob_Xpath");
	 }

	 public void PlatformServer() throws InterruptedException{
		 logger1.info("Dropdown has been clicked");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("couchbase-server-enterprise-os")));  
	 dropdown.selectByIndex(1); 
	 
	 }
	 public void PlatformKubernetes() throws InterruptedException{
		 logger1.info("Dropdown has been clicked");   
	 Thread.sleep(2000);
	 click("dOSButtonKubernetes_Xpath");
	 }
	 
	 public void PlatformKubRedHat() throws InterruptedException{
		 logger1.info("Dropdown has been clicked");   
	 Thread.sleep(2000);
	 click("dOSButtonKubRedHat_Xpath");
	 }
	 
	 public void PlatformSyncG() throws InterruptedException{
		 logger1.info("Dropdown has been clicked");   
	 Thread.sleep(2000);
	 click("dOSButtonSyncG_Xpath");
	 }
	 
	 public void PlatformKubernetesselectWindows() throws InterruptedException{
		 logger1.info("Windows has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("open-source-kubernetes-open-source-kubernetes-os")));  
	 dropdown.selectByIndex(1);
	 }
	 
	 public void PlatformKubernetesselectWindowsRedHat() throws InterruptedException{
		 logger1.info("Windows has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("red-hat-openshift-red-hat-openshift-os")));  
	 dropdown.selectByIndex(1);
	 }
	 
	 public void PlatformKubernetesselectMacOS() throws InterruptedException{
		 logger1.info("Mac has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("open-source-kubernetes-open-source-kubernetes-os")));  
	 dropdown.selectByIndex(0);
	 }
	 
	 public void PlatformKubernetesselectMacOSRedHat() throws InterruptedException{
		 logger1.info("Mac has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("red-hat-openshift-red-hat-openshift-os")));  
	 dropdown.selectByIndex(0);
	 }
	 
	 public void PlatforLiteSelectSwift() throws InterruptedException{
		 logger1.info("Swift has been selected");   
	 Thread.sleep(2000);
	
	 Select dropdown = new Select(driver.findElement(By.id("couchbase-lite-enterprise-os")));  
	 dropdown.selectByVisibleText("Swift");  

	 }
	 
	 public void PlatforLiteSelectNET() throws InterruptedException{
		 logger1.info(".NET has been selected");   
	 Thread.sleep(2000);
	
	 Select dropdown = new Select(driver.findElement(By.id("couchbase-lite-enterprise-os")));  
	 dropdown.selectByIndex(4);  

	 }
	 
	 public void PlatformKubernetesselectLinux() throws InterruptedException{
		 logger1.info("Linux has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("open-source-kubernetes-open-source-kubernetes-os")));  
	 dropdown.selectByIndex(2);
	 }
	 
	 public void PlatformKubernetesselectLinuxRedHat() throws InterruptedException{
		 logger1.info("Linux has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("red-hat-openshift-red-hat-openshift-os")));  
	 dropdown.selectByIndex(2);
	 }
	
	 public void PlatformKubRedHatselectWindows() throws InterruptedException{
		 logger1.info("Windows has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("red-hat-openshift-red-hat-openshift-os")));  
	 dropdown.selectByIndex(1);
	 }
	 
	 public void PlatformKubRedHatselectMac() throws InterruptedException{
		 logger1.info("Mac has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("red-hat-openshift-red-hat-openshift-os")));  
	 dropdown.selectByIndex(0);
	 }
	 
	 public void PlatformKubRedHatselectLinux() throws InterruptedException{
		 logger1.info("Linux has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("red-hat-openshift-red-hat-openshift-os")));  
	 dropdown.selectByIndex(2);
	 }
	 
	 public void PlatformSyncGselectLinux() throws InterruptedException{
		 logger1.info("Linux has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("sync-gateway-enterprise-os")));  
	 dropdown.selectByIndex(0);
	 }
	 
	 public void PlatformSyncGselectRedHat6() throws InterruptedException{
		 logger1.info("RedHat6 has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("sync-gateway-enterprise-os")));  
	 dropdown.selectByIndex(5);
	 }
	 public void PlatformSyncGselectRedHat7() throws InterruptedException{
		 logger1.info("RedHat7 has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("sync-gateway-enterprise-os")));  
	 dropdown.selectByIndex(1);
	 }
	 
	 public void PlatformSyncGselectWindows() throws InterruptedException{
		 logger1.info("Windows has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("sync-gateway-enterprise-os")));  
	 dropdown.selectByIndex(3);
	 }
	 
	 public void PlatformSyncGselectMac() throws InterruptedException{
		 logger1.info("Mac has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("sync-gateway-enterprise-os")));  
	 dropdown.selectByIndex(4);
	 }
	 
	 public void PlatformSelectionUbuntu1604() throws InterruptedException{
		 logger1.info("Ubuntu 16.04 has been selected");   
	 Thread.sleep(2000);
	  WebElement et=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div[1]/span/ul/li[2]"));
	    Actions ax= new Actions(driver);
	    ax.moveToElement(et).click().build().perform();
	 }
	 
	 public void PlatformSelectionUbuntu1804() throws InterruptedException{
		 logger1.info("Ubuntu 18.04 has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("couchbase-server-enterprise-os")));  
	 dropdown.selectByIndex(0);
	 }
	 
	 public void PlatformSelectionUbuntuRedHat() throws InterruptedException{
		 logger1.info("Red Hat 8 has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("couchbase-server-enterprise-os")));  
	 dropdown.selectByIndex(2);
	 }
	 
	 public void PlatformSelectionObjectiveC() throws InterruptedException{
		 logger1.info("Objective-C has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("couchbase-lite-enterprise-os")));  
	 dropdown.selectByIndex(3);  
	 
	 }
	 
	 public void PlatformSelectionNet() throws InterruptedException{
		 logger1.info(".NET has been selected");   
	 Thread.sleep(2000);
	  WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[1]/span/ul/li[3]"));
	    Actions act= new Actions(driver);
	    act.moveToElement(element).click().build().perform();
	 }
	 
	 public void MouseHover() throws InterruptedException{
		 logger1.info("ul has been selected");   
	 Thread.sleep(2000);
	  WebElement element=driver.findElement(By.xpath("//*[@id=\"sync-gateway-enterprise-osSelectBoxItOptions\"]"));
	    Actions act= new Actions(driver);
	    act.moveToElement(element).click().build().perform();
	    Thread.sleep(2000);
	 }
	 
	 public void PlatformSelectionAndroid() throws InterruptedException{
		 logger1.info("Android has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("couchbase-lite-enterprise-os")));  
	 dropdown.selectByIndex(0); 
	 }
	 
	 public void PlatformSelectionAndroidff() throws InterruptedException{
		 logger1.info("Android has been selected");   
	 Thread.sleep(2000);
	 // WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[1]/span/ul/li[4]"));
	  int li_size=driver.findElements(By.xpath("//*[@id=\"couchbase-lite-enterprise-osSelectBoxItOptions\"]")).size();
	  System.out.println(li_size);
	  driver.findElements(By.xpath("//*[@id=\"couchbase-lite-enterprise-osSelectBoxItOptions\"]")).get(li_size).click(); 
	 }
	 
	 public void PlatformSelectionAndroidtest() throws InterruptedException{
		 logger1.info("Android has been selected");   
		 getVisibility(By.xpath("//*[@id=\"couchbase-lite-enterprise-osSelectBoxIt\"]"), 10).click();
	        for(int i=1;i<=10;i++){
	        try{
		clickElementWhenClickable(By.xpath("//*[@id,'ui-id-2']/li[contains(text(),'test1@webkul.com']"), 2);
		break;
	        }  
	        catch(Exception e){
	        	JavascriptExecutor	js = (JavascriptExecutor) driver;
		js.executeScript("$(\"#ui-id-2\").animate({ scrollTop: \""+100*i+"px\" })");
	        }
	        }
	 }
	 public WebElement getVisibility(By locator, int timeout) {
			WebElement element = null;
			WebDriverWait	wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return element;
			}
		public void clickElementWhenClickable(By locator, int timeout) {
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
		}
	 
	 public void PlatformSelectionJava() throws InterruptedException{
		 logger1.info("Java has been selected");   
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.id("couchbase-lite-enterprise-os")));  
	 dropdown.selectByIndex(1); 
	 }
	 
	 public void Versionn() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked"); 
		 logger1.info("2.7.0 has been clicked"); 
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[5]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(2);  
	 
	 }
	 
	 public void VersionSyncG1() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionSyncG2() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 public void VersionSyncG3() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 public void VersionSyncG4() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[6]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionSyncG5() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[7]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionKubernetes1() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");
		 logger1.info("Version 2.0.1 has been clicked");
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(1); 
	 }
	 
	 public void VersionKubernetes1lang() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");
		 logger1.info("Version 2.0.1 has been clicked");
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(0); 
	 }
	 
	 public void VersionKubernetes1langRedHat() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");
		 logger1.info("Version 2.0.1 has been clicked");
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(0); 
	 }
	 
	 public void VersionKubernetes2() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked"); 
		 logger1.info("Version 2.0.0 has been clicked"); 
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(2); 
	 }
	 
	 public void VersionKubernetes2lang() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked"); 
		 logger1.info("Version 2.0.0 has been clicked"); 
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(1); 
	 }
	 
	 public void VersionKubernetes2langRedHat() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked"); 
		 logger1.info("Version 2.0.0 has been clicked"); 
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(1); 
	 }
	 
	 public void VersionKubernetes3() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 public void VersionKubRedHat1() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionKubRedHat2() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
	 Actions acti= new Actions(driver);              
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionKubRedHat3() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionKub201() throws InterruptedException{
		 logger1.info("Version 2.0.1 is selected");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[1]"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionKub200() throws InterruptedException{
		 logger1.info("Version 2.0.0 is selected");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/ul/li[2]"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionKub122() throws InterruptedException{
		 logger1.info("Version 1.2.2 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(3);
	 }
	 
	 public void VersionKub122lang() throws InterruptedException{
		 logger1.info("Version 1.2.2 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(2);
	 }
	 
	 public void VersionKub122langRedHat() throws InterruptedException{
		 logger1.info("Version 1.2.2 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(2);
	 }
	 
	 public void VersionRedHat201() throws InterruptedException{
		 logger1.info("Version 2.0.1 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(1); 
	 }
	 
	 public void VersionRedHat200() throws InterruptedException{
		 logger1.info("Version 2.0.0 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(2);
	 }
	 
	 public void VersionRedHat122() throws InterruptedException{
		 logger1.info("Version 1.2.2 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(3);
	 }
	 
	 public void VersionSyncG273() throws InterruptedException{
		 logger1.info("Version 2.7.3 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(2);
	 }
	 
	 public void VersionSyncG273Lang() throws InterruptedException{
		 logger1.info("Version 2.7.3 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(0);
	 }
	 
	 public void VersionSyncG272() throws InterruptedException{
		 logger1.info("Version 2.7.2 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[7]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(2);
	 }
	 
	 public void VersionSyncG272Lang() throws InterruptedException{
		 logger1.info("Version 2.7.2 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(1);
	 }
	 
	 public void VersionSyncG271() throws InterruptedException{
		 logger1.info("Version 2.7.1 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(4);
	 }
	 
	 public void VersionSyncG271Lang() throws InterruptedException{
		 logger1.info("Version 2.7.1 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(2);
	 }
	 
	 public void VersionSyncG270() throws InterruptedException{
		 logger1.info("Version 2.7.0 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[5]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(5); 
	 }
	 
	 public void VersionSyncG261() throws InterruptedException{
		 logger1.info("Version 2.6.1 is selected");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[6]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(6); 

	 }
	 
	 public void VersionServer1() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionServer2() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionServer3() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
	 Actions acti= new Actions(driver);
	 acti.moveToElement(element).click().build().perform();
	 Thread.sleep(2000);
	 }
	 
	 public void VersionnSecnd() throws InterruptedException{
		 logger1.info("Version 2.7.0 has been clicked");   
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[2]"));
     Actions act= new Actions(driver);
     act.moveToElement(element).click().build().perform();	 
     Thread.sleep(2000);	 
	 }
	 
	 public void VersionServerSelect1() throws InterruptedException{
		 logger1.info("Version 6.5.0 has been clicked");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(2);	 
	 }
	 
	 public void VersionServerSelect1lang() throws InterruptedException{
		 logger1.info("Version 6.5.0 has been clicked");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(1);	 
	 }
	 
	 public void VersionServerSelect2() throws InterruptedException{
		 logger1.info("Version 6.5.1 has been clicked");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(1);
	 }
	 
	 public void VersionServerSelect2lang() throws InterruptedException{
		 logger1.info("Version 6.5.1 has been clicked");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(0);
	 }
	 
	 public void VersionServerSelect3() throws InterruptedException{
		 logger1.info("Version 6.0.4 has been clicked");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(3); 
	 }
	 
	 public void VersionServerSelect3lang() throws InterruptedException{
		 logger1.info("Version 6.0.4 has been clicked");   
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(2); 
	 }
	 
	 public void Versionnextt() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked"); 
		 logger1.info("Version 2.6.4 has been clicked"); 
	 Thread.sleep(2000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[6]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(3); 
	 }
	 
	 public void VersionnThrd() throws InterruptedException{
		 logger1.info("Version 2.6.4 has been clicked");   
	 Thread.sleep(3000);
	 WebElement eleme=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/ul/li[3]"));
     Actions act= new Actions(driver);
     act.moveToElement(eleme).click().build().perform();	 
     Thread.sleep(2000);	 
	 }
	 
	 public void Select260Lang() throws InterruptedException{
		 logger1.info("Version 2.6.0 has been clicked");   
		 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[2]/div/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/select")));
		 Thread.sleep(2000);
		 dropdown.selectByIndex(3);
	 }
	 
	 public void Select253Lang() throws InterruptedException{
		 logger1.info("Version 2.5.3 has been clicked");   
		 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[2]/div/div[2]/div/div/div/div/div/div[5]/div[2]/div/span/select")));
		 Thread.sleep(2000);
		 dropdown.selectByIndex(4);
	 }
	 public void Select264Lang() throws InterruptedException{
		 logger1.info("Version 2.6.4 has been clicked");   
		 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[2]/div/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/select")));
		 Thread.sleep(2000);
		 dropdown.selectByIndex(2);
	 }
	 
	 public void VersionAndroid() throws InterruptedException{
		 logger1.info("Version dropdown has been clicked"); 
		 logger1.info("Version 2.6.0 has been selected"); 
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/select")));
	 Thread.sleep(2000);
	 dropdown.selectByIndex(4);
	
	 }
	 public void VersionnFourth() throws InterruptedException{
		 logger1.info("Version 2.6.0 has been clicked");   
	 Thread.sleep(3000);
	 WebElement eleme=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[5]/div[2]/div/span/ul/li[4]"));
     Actions act= new Actions(driver);
     act.moveToElement(eleme).click().build().perform();	 
     Thread.sleep(2000);	 
	 }
	 
	 public void dowloaddEnglish() throws InterruptedException{
		 logger1.info("Dropdown has been clicked");   
	 Thread.sleep(2000);
	 click("dDownloadEnglish2.7.0_Xpath");
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
	 
	 public void selectOSSwift() throws InterruptedException{
		 logger1.info(".NET option is selected");   
		 Thread.sleep(2000);
		 click("dSelectSwift_Xpath");
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
		 Thread.sleep(2000);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,350)", "down");
	 }
	 
	 public void scrol() throws InterruptedException{
		 Thread.sleep(2000);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,100)", "down");
	 }
	 
	 public void scrolling() throws InterruptedException{
		 Thread.sleep(2000);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,600)", "down");
	 }
	 
	
	 
	 public void scrolly() throws InterruptedException{
		 Thread.sleep(3000);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,150)", "down");
	 }
	 
	 public void scrollinform() throws InterruptedException{
		 Thread.sleep(2000);
		WebElement elt= driver.findElement(By.xpath("//*[@id=\"modalShow\"]/div/div/div[2]/section/div[1]/form/div[2]/div[2]/div/div/label"));
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(true);", elt);
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
	 public void checkingUrlEJava() throws InterruptedException{
			Thread.sleep(3000);
			  logger1.info("checking the redirection"); 
			  String url_e =driver.getCurrentUrl();
			  String expectedval = properties.getProperty("url_jav");
				Assert.assertEquals(url_e, expectedval);
	 }
	 
	 public void checkingUrlEnglish2() throws InterruptedException{
			Thread.sleep(3000);
			  logger1.info("checking the redirection"); 
			  String url_x =driver.getCurrentUrl();
			  String expectedval = properties.getProperty("url_en");
				Assert.assertEquals(url_x, expectedval);
	 }
	 
	 public void checkingUrlEnglish264() throws InterruptedException{
			Thread.sleep(3000);
			  logger1.info("checking the redirection"); 
			  String url_xx =driver.getCurrentUrl();
			  String expectedval = properties.getProperty("url_2.6.4");
				Assert.assertEquals(url_xx, expectedval);
	 }
	 
	 public void checkingUrlLanguage1() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String url =driver.getCurrentUrl();
	  String expectedvalue = properties.getProperty("urlmsg");
		Assert.assertEquals(url, expectedvalue);
}
	 public void checkingUrlAndr() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String urli =driver.getCurrentUrl();
	  String expectedvalue = properties.getProperty("url2.6.0");
		Assert.assertEquals(urli, expectedvalue);
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
	 
	 public void checkingUrlServer650() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_server2");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlServer651() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_server3");
		Assert.assertEquals(link, expectedlink);
	 }
	 public void checkingUrlServer604() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_server4");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlKubWindows201() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_KubWin201");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlKubWindows201RedHat() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_KubWin201RedHat");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlKubMac200() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_KubMac200");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlKubMac200RedHat() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_KubMac200RedHat");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlKubLin122() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_KubLin122");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlKubLin122RedHat() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_KubLin122RedHat");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlRedHatWin201() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_RedHatWin201");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlRedHatMac200() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_RedHatMac200");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlRedHatLinux122() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_RedHatLin122");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlSyncGLinux273() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_SyncGLin273");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlSyncGLinux273Lang() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_SyncGLin273Lang");
		Assert.assertEquals(link, expectedlink);
	 }
	 public void checkingUrlSyncGRedHat6272() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_SyncGRedHat272");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlSyncGRedHat6272Lang() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_SyncGRedHat272Lang");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlSyncGRedHat7271() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_SyncGRedHat271");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlSyncGRedHat7271Lang() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_SyncGRedHat271Lang");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlSyncGWin270() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_SyncGWin270");
		Assert.assertEquals(link, expectedlink);
	 }
	 
	 public void checkingUrlSyncGMac261() throws InterruptedException{
		 Thread.sleep(3000);
	 logger1.info("checking the redirection"); 
	  String link =driver.getCurrentUrl();
	  String expectedlink = properties.getProperty("url_SyncGMac261");
		Assert.assertEquals(link, expectedlink);
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
	  WebElement element =driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/div[4]/div[1]/div[1]"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
	 }
	 
	
			 
			 public void ScrollingToCouchbaseServerTab() throws InterruptedException{
				 Thread.sleep(2000);
			 logger1.info("Click on'Couchbase server' tab");
			  WebElement element =driver.findElement(By.xpath(" /html/body/main/div/div[2]/section/div/div[1]/div[1]/div[1]"));
			  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			 }
			 
			 public void ScrollingToCouchbaseKubernetesTab() throws InterruptedException{
				 Thread.sleep(2000);
			 logger1.info("Click on'Couchbase Kubernetes' tab");
			  WebElement element =driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[1]/div[1]"));
			                                                   
			  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			 }
			 
			 public void ScrollingToCouchbaseKubernetesTablang() throws InterruptedException{
				 Thread.sleep(2000);
			 logger1.info("Click on'Couchbase Kubernetes' tab");
			  WebElement element =driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[1]/div[1]"));
			                                                   
			  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			 }
			 
			 public void ScrollingToCouchbaseSyncGatewayTablang() throws InterruptedException{
				 Thread.sleep(2000);
			 logger1.info("Click on'Couchbase SyncGateway' tab");
			  WebElement element =driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[1]/div[1]"));
			                                                   
			  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			 }
			 
			 public void ScrollingToCouchbaseSyncGatewayTab() throws InterruptedException{
				 Thread.sleep(2000);
			 logger1.info("Click on'Couchbase Sync Gateway' tab");
			  WebElement element =driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[1]/div[1]"));
			  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			 }
			 public void test() throws InterruptedException{
				 Thread.sleep(2000);
				 dt.firstName();
				 dt.lastName();
				 dt.Email();
				 dt.Company();
				
						dt.jobTitle();
		
				
				 dt.PhoneNumber();
				 dt.scrollinform();
				 dt.Checkbox2();
				 dt.Checkbox();
				 dt.Submit();
			 }
	 
			 public void Switchingtoframe() throws InterruptedException{
				 WebDriverWait wait=new WebDriverWait(driver, 30);
			 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
					  findElement(By.id("drift-widget"))));
			 
					  //driver.switchTo().frame("drift-widget");
					  
					  Thread.sleep(2000); click("dPopupClose_Xpath");
					  
					  driver.switchTo().defaultContent();
			 }
			 @Test
			 @Parameters("browser")
			 public static void downloads(String browser) throws Exception {
				 logger1 = extent.createTest("downloads");
				 try {
					 Thread.sleep(2000);
					 if( getPropertyValue("urltype").equalsIgnoreCase("main") ) {
						 dt.ScrollingToCouchbaseLiteTab();
						 dt.clickPlusButtonmain();
						 dt.scroll();
						 dt.scrolly();
						 Thread.sleep(2000);
						// dt.Platform();
						 dt.PlatforLiteSelectSwift();
						 dt.Switchingtoframe();
						 dt.clickDownloadsButton();
					 }

					 else {
						 dt.ScrollingToCouchbaseLiteTabLanguage();
						 dt.clickPlusButton();
						 dt.scrolly();
						 dt.scrolly();
						 dt.PlatforLiteSelectSwift();
						 dt.clickDownloadButton();
					 }
					 dt.test();

					 if( getPropertyValue("language").equalsIgnoreCase("english") && getPropertyValue("urltype").equalsIgnoreCase("main")) {
						 dt.checkingUrlEnglish();
						 //  d.Dbutton();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseLiteTab();
						 dt.clickPlusButtonmain();
						 dt.scroll();
						 dt.scrolly();
						 Thread.sleep(2000);
						 //dt.Platform();
						 dt.PlatformSelectionObjectiveC();
						 dt.scrolly();
						// dt.Select264Lang();
						 dt.Versionn();
						 dt.dowloaddEnglish();
						 dt.checkingUrlEnglish2();
						 //    d.Dbutton();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseLiteTab();
						 dt.clickPlusButtonmain();
						 dt.scroll();
						 dt.scrolly();
						 Thread.sleep(2000);
						// dt.Platform();
						 dt.PlatforLiteSelectNET();
						 dt.scrolly();
						 dt.Versionnextt();
						 dt.Downloadnewbutton();
						 dt.checkingUrlEnglish264();
						 driver.navigate().back();
						 //	  d.Dbutton();
						 //	  Thread.sleep(7000);
						 //	  driver.navigate().back();
						 //	  Thread.sleep(4000);
						 if(browser.equalsIgnoreCase("chrome")) {
							 dt.ScrollingToCouchbaseLiteTab();
							 dt.clickPlusButtonmain();
							 dt.scroll();
							 dt.scrolly();
							
							 dt.PlatformSelectionAndroid();
							 dt.scrolly();
							 dt.VersionAndroid();
							
							 dt.DownloadNewVersion();
							 dt.checkingUrlAndr();
							 //	d.Dbutton();
							 driver.navigate().back();
							 dt.ScrollingToCouchbaseLiteTab();
							 dt.clickPlusButtonmain();
							 dt.scroll();
							 dt.scrolly();
							 
							 dt.PlatformSelectionJava();
							 dt.clickDownloadsButtonJava();
							 dt.checkingUrlEJava();
							 //	d.Dbutton();
							 driver.navigate().back();
						 }
						 driver.manage().deleteAllCookies();
						 dt.ScrollingToCouchbaseServerTab();
						 dt.scroll();
						 dt.PlatformServer();
						// dt.PlatformSelectionUbuntu1604();
						// dt.scrolly();
						// d.Switchingtoframe();
						 dt.scrolly();
						 dt.VersionServerSelect1();
						 dt.DbuttonServer650();
						 dt.test();
						 dt.checkingUrlServer650();
						 //	d.Dbutton();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseServerTab();
						 dt.scroll();
						 dt.scrolly();
						 dt.PlatformSelectionUbuntu1804();
						 dt.scrolly();
						 //	d.Switchingtoframe();
						 dt.VersionServerSelect2();
						// dt.scrolly();
						 dt.DbuttonServer651();
						 dt.checkingUrlServer651();
						 //		d.Dbutton();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseServerTab();
						 dt.scroll();
						 dt.scrolly();
						 dt.PlatformSelectionUbuntuRedHat();
						 dt.scrolly();
						 //		  d.Switchingtoframe();
						 
						 dt.VersionServerSelect3();
						 dt.DbuttonServer604();
						 dt.checkingUrlServer604();
						 //		d.Dbutton();
						 driver.navigate().back();
						 driver.manage().deleteAllCookies();
						 dt.ScrollingToCouchbaseKubernetesTab();
						 dt.clickPlusButtonKubernetes();
						 dt.scroll();
						// dt.PlatformKubernetes();
						 dt.PlatformKubernetesselectWindows();
						 dt.VersionKubernetes1();
						 dt.scrolly();
						// dt.VersionKub201();
						 dt.DbuttonKubernetes201();
						 dt.test();
						 dt.checkingUrlKubWindows201();
						 //	d.Dbutton();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseKubernetesTab();
						 dt.clickPlusButtonKubernetes();
						 dt.scroll();
						// dt.PlatformKubernetes();
						 dt.PlatformKubernetesselectMacOS();
						 dt.VersionKubernetes2();
						 dt.scrolly();
						 dt.scrolly();
						 dt.DbuttonKubernetes200();
						 dt.checkingUrlKubMac200();
						 //	 d.Dbutton();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseKubernetesTab();
						 dt.clickPlusButtonKubernetes();
						 dt.scroll();
						// dt.PlatformKubernetes();
						 dt.PlatformKubernetesselectLinux();
						// dt.VersionKubernetes3();
						 dt.VersionKub122();
						 dt.scroll();
						 dt.DbuttonKubernetes122();
						 dt.checkingUrlKubLin122();
						 //		 d.Dbutton();
						 driver.navigate().back();
						 driver.manage().deleteAllCookies();
						 dt.ScrollingToCouchbaseKubernetesTab();
						 dt.clickPlusButtonKubernetes();
						 dt.scrolling();
						 dt.scrolly();
						 dt.scrolly();
						// dt.PlatformKubRedHat();
						 dt.PlatformKubRedHatselectWindows();
						// dt.VersionKubRedHat1();
						 dt.VersionRedHat201();
						 dt.scrolly();
						 dt.DbuttonRedHat201();
						dt.test();
						 dt.checkingUrlRedHatWin201();
						 //	d.Dbutton();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseKubernetesTab();
						 dt.clickPlusButtonKubernetes();
						 dt.scrolling();
						 dt.scrolly();
						 dt.scrolly();
						 dt.scrolly();
						// dt.PlatformKubRedHat();
						 dt.PlatformKubRedHatselectMac();
						// dt.VersionKubRedHat2();
						 dt.VersionRedHat200();
						 dt.scrolly();
						 dt.scrolly();
						 dt.DbuttonRedHat200();
						 dt.checkingUrlRedHatMac200();
						 //	d.Dbutton();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseKubernetesTab();
						 dt.clickPlusButtonKubernetes();
						 dt.scrolling();
						 dt.scrolly();
						 dt.scrolly();
						 dt.scrolly();
						// dt.PlatformKubRedHat();
						 dt.PlatformKubRedHatselectLinux();
						// dt.VersionKubRedHat3();
						 dt.VersionRedHat122();
						 dt.scrolly();
						 dt.scrolly();
						 dt.DbuttonRedHat122();
						 dt.checkingUrlRedHatLinux122();
						 //		d.Dbutton();
						 driver.navigate().back();
						 driver.manage().deleteAllCookies();
						 dt.ScrollingToCouchbaseSyncGatewayTab();
						 dt.clickPlusButtonSyncG();
						 dt.scroll();
						// dt.PlatformSyncG();
						 dt.PlatformSyncGselectLinux();
						// dt.VersionSyncG1();
						 dt.VersionSyncG273();
						 dt.scrolly();
						 dt.DbuttonSyncG273();
						 dt.test();
						 dt.checkingUrlSyncGLinux273();
						 //		d.Dbutton();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseSyncGatewayTab();
						 dt.clickPlusButtonSyncG();
						 dt.scroll();
						// dt.PlatformSyncG();
						 dt.PlatformSyncGselectRedHat6();
						// dt.VersionSyncG2();
						 dt.VersionSyncG272();
						 dt.scrolly();
						 dt.scrolly();
						 dt.DbuttonSyncG272();
						 dt.checkingUrlSyncGRedHat6272();
						 //		d.Dbutton();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseSyncGatewayTab();
						 dt.clickPlusButtonSyncG();
						 dt.scroll();
						// dt.PlatformSyncG();
						 dt.PlatformSyncGselectRedHat7();
						// dt.VersionSyncG3();
						 dt.VersionSyncG271();
						 dt.scrolly();
						 dt.scrolly();
						 dt.DbuttonSyncG271();
						 dt.checkingUrlSyncGRedHat7271();
						 //	d.Dbutton();
						 driver.navigate().back();
						 if(browser.equalsIgnoreCase("chrome")) {
							 dt.ScrollingToCouchbaseSyncGatewayTab();
							 dt.clickPlusButtonSyncG();
							 dt.scroll();
							 //dt.PlatformSyncG();
							 dt.PlatformSyncGselectWindows();
							// dt.VersionSyncG4();
							 dt.VersionSyncG270();
							 dt.scrolly();
							 dt.scrolly();
							 dt.DbuttonSyncG270();
							 dt.checkingUrlSyncGWin270();
							 //	d.Dbutton();
							 driver.navigate().back();
							 dt.ScrollingToCouchbaseSyncGatewayTab();
							 dt.clickPlusButtonSyncG();
							 dt.scroll();
							// dt.PlatformSyncG();
							 dt.PlatformSyncGselectMac();
							// dt.VersionSyncG5();
							 dt.VersionSyncG261();
							 dt.scrolly();
							 dt.scrolly();
							 dt.DbuttonSyncG261();
							 dt.checkingUrlSyncGMac261();
							 //		d.Dbutton();
							 driver.navigate().back(); 
						 }
					 }
					 else {//language scenarios starts here

						 dt.checkingUrlLanguage1();
					
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseLiteTabLanguage();
						 dt.clickPlusButton();
						 dt.PlatformSelectionObjectiveC();
						
						 dt.scrolly();
						 dt.Select264Lang();
						
						 dt.Downloadnewbutton();			
						 dt.checkingUrlLanguage2();
						
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseLiteTabLanguage();
						 dt.clickPlusButton();
					
						 dt.PlatforLiteSelectNET();
						Thread.sleep(3000);
						
						 dt.Select260Lang();

						 dt.DownloadNewVersion();
						 dt.checkingUrlLanguage3();
					
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseLiteTabLanguage();
						 dt.clickPlusButton();
						
						 dt.PlatformSelectionAndroid();
						 dt.scrolly();
						
				dt.Select253Lang();
			
						 dt.DownloadNewVersion2();
						 dt.checkingUrlAndroid();
					
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseLiteTabLanguage();
						 dt.clickPlusButton();
						
						 dt.PlatformSelectionJava();
						 
						 dt.clickDownloadButton();
						 dt.checkingUrlJava();
					
						 driver.navigate().back();
						 driver.manage().deleteAllCookies();
						 //***************************************
						 //server scenarios starts here
						 dt.ScrollingToCouchbaseServerTab();
						 dt.scroll();
						 dt.scrolly();
						 dt.PlatformServer();
						 dt.VersionServerSelect1lang();
						 dt.DbuttonServer650();
						 dt.firstName();
						 dt.lastName();
						 dt.Email();
						 dt.Company();
						 dt.jobTitle();
						 dt.PhoneNumber();
						 dt.scrollinform();
						 dt.Checkbox();
						 dt.Submit();
						 dt.checkingUrlServer650();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseServerTab();
						 dt.scroll();
						 dt.scrolly();
						 dt.PlatformSelectionUbuntu1804();
						 dt.VersionServerSelect2lang();
						 dt.DbuttonServer651();
						 dt.checkingUrlServer651();
						 driver.navigate().back();
						 dt.ScrollingToCouchbaseServerTab();
						 dt.scroll();
						 dt.scrolly();
						 dt.PlatformSelectionUbuntuRedHat();
						 dt.scrolly();
						 dt.VersionServerSelect3lang();
						 dt.DbuttonServer604();
						 dt.checkingUrlServer604();
						 //************************************************************
						 //Kubernetes starts here
						 driver.navigate().back();
						 driver.manage().deleteAllCookies();
						 dt.ScrollingToCouchbaseKubernetesTablang();
						 dt.clickPlusButtonKuberneteslang();
						 dt.scroll();
							
							 dt.PlatformKubernetesselectWindows();
							 dt.VersionKubernetes1lang();
							 dt.scrolly();
							 dt.DbuttonKubernetes201();
							 dt.firstName();
							 dt.lastName();
							 dt.Email();
							 dt.Company();
							 dt.jobTitle();
							 dt.PhoneNumber();
							 dt.scrollinform();
							 dt.Checkbox();
							 dt.Submit();
							 dt.checkingUrlKubWindows201();
							 driver.navigate().back();
							 dt.ScrollingToCouchbaseKubernetesTablang();
							 dt.clickPlusButtonKuberneteslang();
							 dt.scroll();
							 
							 dt.PlatformKubernetesselectMacOS();
							 dt.VersionKubernetes2lang();
							 dt.scrolly();
							 dt.scrolly();
							 dt.DbuttonKubernetes200();
							 dt.checkingUrlKubMac200();
						 
							 driver.navigate().back();
							 dt.ScrollingToCouchbaseKubernetesTablang();
							 dt.clickPlusButtonKuberneteslang();
							 dt.scroll();
							// dt.PlatformKubernetes();
							 dt.PlatformKubernetesselectLinux();
							// dt.VersionKubernetes3();
							 dt.VersionKub122lang();
							// dt.scroll();
							 dt.DbuttonKubernetes122();
							 dt.checkingUrlKubLin122();
							 
							 //kubernetes Red hat starts here
							 
							 driver.navigate().back();
							 driver.manage().deleteAllCookies();
							 dt.ScrollingToCouchbaseKubernetesTablang();
							 dt.clickPlusButtonKuberneteslang();
							 dt.scroll();
							 dt.scroll();
							 dt.PlatformKubernetesselectWindowsRedHat();
							 dt.VersionKubernetes1langRedHat();
							 dt.scrolly();
							 dt.DbuttonKubernetes201RedHat();
							 dt.firstName();
							 dt.lastName();
							 dt.Email();
							 dt.Company();
							 dt.jobTitle();
							 dt.PhoneNumber();
							 dt.scrollinform();
							 dt.Checkbox();
							 dt.Submit();
							 dt.checkingUrlKubWindows201RedHat();
							 driver.navigate().back();
							 dt.ScrollingToCouchbaseKubernetesTablang();
							 dt.clickPlusButtonKuberneteslang();
							 dt.scroll();
							 dt.scroll();
							 dt.PlatformKubernetesselectMacOSRedHat();
							 dt.VersionKubernetes2langRedHat();
							 dt.DbuttonKubernetes200RedHat();
							 dt.checkingUrlKubMac200RedHat();
							 driver.navigate().back();
							 dt.ScrollingToCouchbaseKubernetesTablang();
							 dt.clickPlusButtonKuberneteslang();
							 dt.scroll();
							 dt.scroll();
							 Thread.sleep(2000);
							 dt.PlatformKubernetesselectLinuxRedHat();
							 dt.VersionKub122langRedHat();
							 dt.DbuttonKubernetes122RedHat();
							 dt.checkingUrlKubLin122RedHat();
							 
							//SyncGateway starts here	 
							 driver.navigate().back();
							 driver.manage().deleteAllCookies(); 
							 dt.ScrollingToCouchbaseSyncGatewayTablang();
							 dt.clickPlusButtonSyncGatewaylang();
							 dt.scroll();
					          dt.PlatformSyncGselectLinux();
					          dt.VersionSyncG273Lang();
					          dt.scrolly();
					          dt.scrolly();
								 dt.DbuttonSyncG273();
								 dt.firstName();
								 dt.lastName();
								 dt.Email();
								 dt.Company();
								 dt.jobTitle();
								 dt.PhoneNumber();
								 dt.scrollinform();
								 dt.Checkbox();
								 dt.Submit();
								 dt.checkingUrlSyncGLinux273Lang();
								 driver.navigate().back();
								 dt.ScrollingToCouchbaseSyncGatewayTablang();
								 dt.clickPlusButtonSyncGatewaylang();
								 dt.scroll();
								 dt.PlatformSyncGselectRedHat6();
									// dt.VersionSyncG2();
									 dt.VersionSyncG272Lang();
									 dt.scrolly();
									 dt.scrolly();
									 dt.DbuttonSyncG272();
									 dt.checkingUrlSyncGRedHat6272Lang();
									 driver.navigate().back();
									 dt.ScrollingToCouchbaseSyncGatewayTablang();
									 dt.clickPlusButtonSyncGatewaylang();
									 dt.scroll();
									 dt.PlatformSyncGselectRedHat7();
										// dt.VersionSyncG3();
										 dt.VersionSyncG271Lang();
										 dt.scrolly();
										 dt.scrolly();
										 dt.DbuttonSyncG271();
										 dt.checkingUrlSyncGRedHat7271Lang();
										 driver.navigate().back();
					 }
				 }
				 catch(Exception e) {
					 logger1.fail(e);                           
					 throw e;
				 }
				 Thread.sleep(5000);

				 logger1.pass("Testcase Downloads mobile is Passed");
			 }
}

