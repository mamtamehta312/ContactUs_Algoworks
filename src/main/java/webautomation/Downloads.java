package webautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
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

import Base.WebCapabilities;
import io.appium.java_client.MobileElement;

public class Downloads extends WebCapabilities {

	static Downloads d = new Downloads();

	@BeforeClass
	public void downloadNext() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (getPropertyValue("urltype").equalsIgnoreCase("first")) {
			driver.navigate().to(properties.getProperty("Downloads_url"));
		} else if (getPropertyValue("urltype").equalsIgnoreCase("second")) {
			driver.navigate().to(properties.getProperty("Downloads2_url"));
		} else {
			driver.navigate().to(properties.getProperty("Downloadsmain_url"));
		}
	}

	public void clickPlusButton() throws InterruptedException {
		Thread.sleep(2000);
		click("dplusbutton_Xpath");
	}

	public void clickPlusButtonmain() throws InterruptedException {
		Thread.sleep(2000);
		click("dplussbutton_Xpath");
	}

	public void clickPlusButtonKubernetes() throws InterruptedException {
		Thread.sleep(2000);
		click("dplusbuttonKubernetes_Xpath");
	}
	
	public void clickPlusButtonKubernetesLang() throws InterruptedException {
		Thread.sleep(2000);
		click("dplusbuttonKubernetesLang_Xpath");
	}
	
	public void clickPlusButtonSyncG() throws InterruptedException {
		Thread.sleep(2000);
		click("dplusbuttonSyncG_Xpath");
	}
	
	public void clickPlusButtonSyncGLang() throws InterruptedException {
		Thread.sleep(2000);
		click("dplusbuttonSyncGLang_Xpath");
	}

	public void clickDownloadButton() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Downloads Button is selected");
		click("dDownloadsButton_Xpath");
	}

	public void clickDownloadsButton() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Downloads Button is selected");
		click("dDownloadssButton_Xpath");
	}

	public void firstName() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("First name 'Form' is typed in textbox");
		type("dFirstName_Xpath", "dName");
	}

	public void lastName() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Last name 'Testing' is typed in textbox");
		type("dLastName_Xpath", "dLastName");
	}

	public void PhoneNumber() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
		type("dPhoneNumber_Xpath", "dNumber");
	}

	public void Email() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
		type("dEmail_Xpath", "dEmail");
	}

	public void Company() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Company name 'Algoworks' is selected");
		type("dCompany_Xpath", "dCompany");
	}

	public void Tab() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Job Title field has been clicked");

		WebElement webElement = driver.findElement(
				By.xpath("//*[@id=\"modalShow\"]/div/div/div[2]/section/div[1]/form/div[1]/div[4]/div/input"));// You
																												// can
																												// use
																												// xpath,
																												// ID or
																												// name
																												// whatever
																												// you
																												// like
		webElement.sendKeys(Keys.TAB);
		WebElement webElements = driver.findElement(
				By.xpath("/html/body/main/div/div[2]/div[2]/div/div/div[2]/section/div[1]/form/div[1]/div[5]"));
		webElements.sendKeys("i");
		webElement.sendKeys(Keys.TAB);
	}

	public void jobTitle() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Job Title field has been clicked");
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//label[contains(text(),'Job Title')]/..//details")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Job Title')]/..//details")).click();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/div[2]/div/div/div[2]/section/div[1]/form/div[1]/div[5]/div/div[1]/details/div/label[1]")))
				.click();
		a.build().perform();
	}

	public void jobTitleFrench() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Job Title field has been clicked");
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//label[contains(text(),'Fonction')]/..//details")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Fonction')]/..//details")).click();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/div[2]/div/div/div[2]/section/div[1]/form/div[1]/div[5]/div/div[1]/details/div/label[1]")))
				.click();
		a.build().perform();
	}

	public void jobTitleGerman() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Job Title field has been clicked");
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//label[contains(text(),'Job Titel')]/..//details")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Job Titel')]/..//details")).click();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/div[2]/div/div/div[2]/section/div[1]/form/div[1]/div[5]/div/div[1]/details/div/label[1]")))
				.click();
		a.build().perform();
	}

	public void Country() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Country 'Afghanistan' has been selected");
		type("dCountryy_Xpath", "dCountryy");
	}

	public void Checkbox() throws InterruptedException {
		Thread.sleep(5000);
		logger1.info("Agreement checkbox has been selected");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"license\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}

	public void Submit() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Button 'Try It Free Now' has been clicked");
		click("dtryitfree_Xpath");
		Thread.sleep(5000);
	}

	public void Dbutton() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButton_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonServer() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonServer_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonServer650() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonServer650_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonServer651() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonServer_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonServer604() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonServer604_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonKubernetes201() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonKub201_Xpath");
		Thread.sleep(5000);
	}
	
	public void DbuttonKubernetes201Lang() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonKub201Lang_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonKubernetes200() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonKub200_Xpath");
		Thread.sleep(5000);
	}
	
	public void DbuttonKubernetes200Lang() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonKub200Lang_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonKubernetes122() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonKub122_Xpath");
		Thread.sleep(5000);
	}
	
	
	public void DbuttonRedHat201() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonRedHat201_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonRedHat200() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonRedHat200_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonRedHat122() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonRedHat122_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonSyncG273() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonSyncG273_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonSyncG272() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonSyncG272_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonSyncG271() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonSyncG271_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonSyncG270() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonSyncG270_Xpath");
		Thread.sleep(5000);
	}

	public void DbuttonSyncG261() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Download button has been clicked");
		click("dButtonSyncG261_Xpath");
		Thread.sleep(5000);
	}

	public void Platform() throws InterruptedException {
		logger1.info("Dropdown has been clicked");
		Thread.sleep(2000);
		click("dPlatform_Xpath");
	}

	public void PlatformServer() throws InterruptedException {
		logger1.info("Dropdown has been clicked");
		Thread.sleep(2000);
		click("dOSButtonServer_Xpath");

	}

	public void PlatformKubernetes() throws InterruptedException {
		logger1.info("Dropdown has been clicked");
		Thread.sleep(2000);
		click("dOSButtonKubernetes_Xpath");
	}

	public void PlatformKubRedHat() throws InterruptedException {
		logger1.info("Dropdown has been clicked");
		Thread.sleep(2000);
		click("dOSButtonKubRedHat_Xpath");
	}

	public void PlatformSyncG() throws InterruptedException {
		logger1.info("Dropdown has been clicked");
		Thread.sleep(2000);
		click("dOSButtonSyncG_Xpath");
	}

	public void PlatformKubernetesselectWindows() throws InterruptedException {
		logger1.info("Windows has been selected");
		Thread.sleep(2000);
		click("dSelectWindowsKubernetes_Xpath");
	}

	public void PlatformKubernetesselectWindowsLang() throws InterruptedException {
		logger1.info("Windows has been selected");
		Thread.sleep(2000);
		click("dSelectWindowsKubernetesLang_Xpath");
	}
	
	public void PlatformKubernetesselectMacOS() throws InterruptedException {
		logger1.info("Mac has been selected");
		Thread.sleep(2000);
		click("dSelectMacKubernetes_Xpath");
	}
	public void PlatformKubernetesselectMacOSLang() throws InterruptedException {
		logger1.info("Mac has been selected");
		Thread.sleep(2000);
		click("dSelectMacKubernetesLang_Xpath");
	}

	public void PlatformKubernetesselectLinux() throws InterruptedException {
		logger1.info("Linux has been selected");
		Thread.sleep(2000);
		click("dSelectLinuxKubernetes_Xpath");
	}
	
	public void PlatformKubernetesselectLinuxLang() throws InterruptedException {
		logger1.info("Linux has been selected");
		Thread.sleep(2000);
		click("dSelectLinuxKubernetesLang_Xpath");
	}


	public void PlatformKubRedHatselectWindows() throws InterruptedException {
		logger1.info("Windows has been selected");
		Thread.sleep(2000);
		click("dSelectWinRedHatKub_Xpath");
	}
	
	public void PlatformKubRedHatselectWindowsLang() throws InterruptedException {
		logger1.info("Windows has been selected");
		Thread.sleep(2000);
		click("dSelectWinRedHatKubLang_Xpath");
	}

	public void PlatformKubRedHatselectMac() throws InterruptedException {
		logger1.info("Mac has been selected");
		Thread.sleep(2000);
		click("dSelectMacRedHatKub_Xpath");
	}
	
	public void PlatformKubRedHatselectMacLang() throws InterruptedException {
		logger1.info("Mac has been selected");
		Thread.sleep(2000);
		click("dSelectMacRedHatKubLang_Xpath");
	}

	public void PlatformKubRedHatselectLinux() throws InterruptedException {
		logger1.info("Linux has been selected");
		Thread.sleep(2000);
		click("dSelectLinRedHatKub_Xpath");
	}
	
	public void PlatformKubRedHatselectLinuxLang() throws InterruptedException {
		logger1.info("Linux has been selected");
		Thread.sleep(2000);
		click("dSelectLinRedHatKubLang_Xpath");
	}

	public void PlatformSyncGselectLinux() throws InterruptedException {
		logger1.info("Linux has been selected");
		Thread.sleep(2000);
		click("dSelectLinuxSyncG_Xpath");
	}
	
	public void PlatformSyncGselectLinuxLang() throws InterruptedException {
		logger1.info("Linux has been selected");
		Thread.sleep(2000);
		click("dSelectLinuxSyncGLang_Xpath");
	}

	public void PlatformSyncGselectRedHat6() throws InterruptedException {
		logger1.info("RedHat6 has been selected");
		Thread.sleep(2000);
		click("dSelectRedHat6SyncG_Xpath");
	}

	public void PlatformSyncGselectRedHat6Lang() throws InterruptedException {
		logger1.info("RedHat6 has been selected");
		Thread.sleep(2000);
		click("dSelectRedHat6SyncGLang_Xpath");
	}
	
	public void PlatformSyncGselectRedHat7() throws InterruptedException {
		logger1.info("RedHat7 has been selected");
		Thread.sleep(2000);
		click("dSelectRedHat7SyncG_Xpath");
	}
	
	public void PlatformSyncGselectRedHat7Lang() throws InterruptedException {
		logger1.info("RedHat7 has been selected");
		Thread.sleep(2000);
		click("dSelectRedHat7SyncGLang_Xpath");
	}

	public void PlatformSyncGselectWindows() throws InterruptedException {
		logger1.info("Windows has been selected");
		Thread.sleep(2000);
		click("dSelectWindowsSyncG_Xpath");
	}

	public void PlatformSyncGselectMac() throws InterruptedException {
		logger1.info("Mac has been selected");
		Thread.sleep(2000);
		click("dSelectSyncGMac_Xpath");
	}

	public void PlatformSelectionUbuntu1604() throws InterruptedException {
		logger1.info("Ubuntu 16.04 has been selected");
		Thread.sleep(2000);
		WebElement et = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/span/ul/li[2]"));
		Actions ax = new Actions(driver);
		ax.moveToElement(et).click().build().perform();
	}

	public void PlatformSelectionUbuntu1604Lang() throws InterruptedException {
		logger1.info("Ubuntu 16.04 has been selected");
		Thread.sleep(2000);
		WebElement et = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[1]/span/ul/li[2]"));
		Actions ax = new Actions(driver);
		ax.moveToElement(et).click().build().perform();
	}

	public void PlatformSelectionUbuntu1804() throws InterruptedException {
		logger1.info("Ubuntu 18.04 has been selected");
		Thread.sleep(2000);
		WebElement et = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/span/ul/li[1]"));
		Actions ax = new Actions(driver);
		ax.moveToElement(et).click().build().perform();
	}

	public void PlatformSelectionUbuntu1804Lang() throws InterruptedException {
		logger1.info("Ubuntu 18.04 has been selected");
		Thread.sleep(2000);
		WebElement et = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[1]/span/ul/li[1]"));
		Actions ax = new Actions(driver);
		ax.moveToElement(et).click().build().perform();
	}

	public void PlatformSelectionUbuntuRedHat() throws InterruptedException {
		logger1.info("Red Hat has been selected");
		Thread.sleep(2000);
		WebElement et = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/span/ul/li[3]"));
		Actions ax = new Actions(driver);
		ax.moveToElement(et).click().build().perform();
	}

	public void PlatformSelectionUbuntuRedHatLang() throws InterruptedException {
		logger1.info("Red Hat has been selected");
		Thread.sleep(2000);
		WebElement et = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[1]/span/ul/li[3]"));
		Actions ax = new Actions(driver);
		ax.moveToElement(et).click().build().perform();
	}

	public void PlatformSelectionObjectiveC() throws InterruptedException {
		logger1.info("Objective-C has been selected");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[1]/span/ul/li[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}

	public void PlatformSelectionNet() throws InterruptedException {
		logger1.info(".NET has been selected");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[1]/span/ul/li[3]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}

	public void MouseHover() throws InterruptedException {
		logger1.info("ul has been selected");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sync-gateway-enterprise-osSelectBoxItOptions\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void PlatformSelectionAndroid() throws InterruptedException {
		logger1.info("Android has been selected");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[1]/span/ul/li[4]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).pause(5000).click().build().perform();
	}

	public void PlatformSelectionAndroidff() throws InterruptedException {
		logger1.info("Android has been selected");
		Thread.sleep(2000);
		// WebElement
		// element=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[1]/span/ul/li[4]"));
		int li_size = driver.findElements(By.xpath("//*[@id=\"couchbase-lite-enterprise-osSelectBoxItOptions\"]"))
				.size();
		System.out.println(li_size);
		driver.findElements(By.xpath("//*[@id=\"couchbase-lite-enterprise-osSelectBoxItOptions\"]")).get(li_size)
				.click();
	}

	public void PlatformSelectionAndroidtest() throws InterruptedException {
		logger1.info("Android has been selected");
		getVisibility(By.xpath("//*[@id=\"couchbase-lite-enterprise-osSelectBoxIt\"]"), 10).click();
		for (int i = 1; i <= 10; i++) {
			try {
				clickElementWhenClickable(By.xpath("//*[@id,'ui-id-2']/li[contains(text(),'test1@webkul.com']"), 2);
				break;
			} catch (Exception e) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("$(\"#ui-id-2\").animate({ scrollTop: \"" + 100 * i + "px\" })");
			}
		}
	}

	public WebElement getVisibility(By locator, int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
	}

	public void clickElementWhenClickable(By locator, int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}

	public void PlatformSelectionJava() throws InterruptedException {
		logger1.info("Java has been selected");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[1]/span/ul/li[5]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}

	public void Versionn() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionSyncG1() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionSyncG1Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionSyncG2() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	

	public void VersionSyncG2Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionSyncG3() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionSyncG3Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionSyncG4() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[6]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionSyncG5() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[7]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionKubernetes1() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionKubernetes1Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionKubernetes2() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionKubernetes2Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionKubernetes3() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionKubernetes3Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionKubRedHat1() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionKubRedHat1Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionKubRedHat2() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionKubRedHat2Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement ph = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
		Actions am = new Actions(driver);
		am.moveToElement(ph).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionKubRedHat3() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionKubRedHat3Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	
	public void VersionKub201() throws InterruptedException {
		logger1.info("Version 2.0.1 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[1]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionKub201Lang() throws InterruptedException {
		logger1.info("Version 2.0.1 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[1]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionKub200() throws InterruptedException {
		logger1.info("Version 2.0.0 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/ul/li[2]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionKub200Lang() throws InterruptedException {
		logger1.info("Version 2.0.0 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/ul/li[2]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionKub122() throws InterruptedException {
		logger1.info("Version 1.2.2 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/ul/li[3]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionKub122Lang() throws InterruptedException {
		logger1.info("Version 1.2.2 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/ul/li[3]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionRedHat201() throws InterruptedException {
		logger1.info("Version 2.0.1 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[1]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionRedHat201Lang() throws InterruptedException {
		logger1.info("Version 2.0.1 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[1]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionRedHat200() throws InterruptedException {
		logger1.info("Version 2.0.0 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/ul/li[2]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionRedHat200Lang() throws InterruptedException {
		logger1.info("Version 2.0.0 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/ul/li[2]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionRedHat122() throws InterruptedException {
		logger1.info("Version 1.2.2 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/ul/li[3]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionRedHat122Lang() throws InterruptedException {
		logger1.info("Version 1.2.2 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/ul/li[3]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionSyncG273() throws InterruptedException {
		logger1.info("Version 2.7.3 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/ul/li[1]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionSyncG273Lang() throws InterruptedException {
		logger1.info("Version 2.7.3 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/ul/li[1]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionSyncG272() throws InterruptedException {
		logger1.info("Version 2.7.2 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[2]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionSyncG272Lang() throws InterruptedException {
		logger1.info("Version 2.7.2 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[2]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionSyncG271() throws InterruptedException {
		logger1.info("Version 2.7.1 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/ul/li[3]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void VersionSyncG271Lang() throws InterruptedException {
		logger1.info("Version 2.7.1 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/ul/li[3]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionSyncG270() throws InterruptedException {
		logger1.info("Version 2.7.0 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[6]/div[2]/div/span/ul/li[4]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionSyncG261() throws InterruptedException {
		logger1.info("Version 2.6.1 is selected");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[7]/div[2]/div/span/ul/li[5]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServer1() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServer1Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[3]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServer2() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServer2Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServer3() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServer3Lang() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionnSecnd() throws InterruptedException {
		logger1.info("Version 2.7.0 has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServerSelect1() throws InterruptedException {
		logger1.info("Version 6.5.0 has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServerSelect1Lang() throws InterruptedException {
		logger1.info("Version 6.5.0 has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[3]/div[2]/div/span/ul/li[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServerSelect2() throws InterruptedException {
		logger1.info("Version 6.5.1 has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/ul/li[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServerSelect2Lang() throws InterruptedException {
		logger1.info("Version 6.5.1 has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/span/ul/li[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServerSelect3() throws InterruptedException {
		logger1.info("Version 6.0.4 has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/ul/li[3]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionServerSelect3Lang() throws InterruptedException {
		logger1.info("Version 6.0.4 has been clicked");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/ul/li[3]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void Versionnextt() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement elep = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(elep).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionnThrd() throws InterruptedException {
		logger1.info("Version 2.6.4 has been clicked");
		Thread.sleep(3000);
		WebElement eleme = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div/span/ul/li[3]"));
		Actions act = new Actions(driver);
		act.moveToElement(eleme).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionAndroid() throws InterruptedException {
		logger1.info("Version dropdown has been clicked");
		Thread.sleep(3000);
		WebElement eleA = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[5]/div[2]/div"));
		Actions acti = new Actions(driver);
		acti.moveToElement(eleA).click().build().perform();
		Thread.sleep(2000);
	}

	public void VersionnFourth() throws InterruptedException {
		logger1.info("Version 2.6.0 has been clicked");
		Thread.sleep(3000);
		WebElement eleme = driver.findElement(By.xpath(
				"/html/body/main/div/div[2]/section/div/div[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[5]/div[2]/div/span/ul/li[4]"));
		Actions act = new Actions(driver);
		act.moveToElement(eleme).click().build().perform();
		Thread.sleep(2000);
	}

	public void dowloaddEnglish() throws InterruptedException {
		logger1.info("Dropdown has been clicked");
		Thread.sleep(2000);
		click("dDownloadEnglish2.7.0_Xpath");
	}

	public void dropdown() throws InterruptedException {
		logger1.info("Dropdown has been clicked");
		Thread.sleep(2000);
		click("dDropdown_Xpath");
	}

	public void selectOS() throws InterruptedException {
		logger1.info("Select Objective-C option ");
		Thread.sleep(2000);
		click("dSelectObjective-c_Xpath");
	}

	public void selectOSNET() throws InterruptedException {
		logger1.info(".NET option is selected");
		Thread.sleep(2000);
		click("dSelect.Net_Xpath");
	}

	public void selectOSJava() throws InterruptedException {
		logger1.info("Java option is selected");
		Thread.sleep(2000);
		click("dSelectJava_Xpath");
	}

	public void selectOSAndroid() throws InterruptedException {
		logger1.info("Android option is selected");
		Thread.sleep(2000);
		click("dSelectAndroid_Xpath");
	}

	public void Version() throws InterruptedException {
		logger1.info("Click on version");
		Thread.sleep(3000);
		click("dVersion_Xpath");
	}

	public void VersionSelect() throws InterruptedException {
		logger1.info("Click on version");
		Thread.sleep(3000);
		click("dVersionSelect_Xpath");
	}

	public void VersionNew() throws InterruptedException {
		logger1.info("Click on version");
		Thread.sleep(3000);
		click("dVersionNew_Xpath");
	}

	public void selectVersion() throws InterruptedException {
		logger1.info("Select 2.6.4 version");
		Thread.sleep(4000);
		click("dSelect2.6.4_Xpath");
	}

	public void selectVersionNew() throws InterruptedException {
		logger1.info("Select 2.6.0 version");
		Thread.sleep(4000);
		click("dSelect2.6.0_Xpath");
	}

	public void selectVersions() throws InterruptedException {
		logger1.info("Select 2.5.3 version");
		Thread.sleep(4000);
		click("dSelect2.5.3_Xpath");
	}

	public void Downloadnewbutton() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Downloads Button is selected");
		click("dDownloadsButton2.6.4_Xpath");
		Thread.sleep(2000);
	}

	public void DownloadNewVersion() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Downloads Button is selected");
		click("dDownloadsButton2.6.0_Xpath");
		Thread.sleep(2000);
	}

	public void DownloadNewVersion2() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Downloads Button is selected");
		click("dDownloadsButton2.5.3_Xpath");
		Thread.sleep(2000);
	}

	public void scroll() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "down");
	}

	public void scrolling() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "down");
	}

	

	public void scrolly() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "down");
	}

	public void scrollinform() throws InterruptedException {
		Thread.sleep(2000);
		WebElement elt = driver.findElement(
				By.xpath("//*[@id=\"modalShow\"]/div/div/div[2]/section/div[1]/form/div[2]/div[2]/div/div/label"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", elt);
	}

	public void checkingUrlLanguage2() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String url2 = driver.getCurrentUrl();
		String expectedvalues = properties.getProperty("urlmsg2");
		Assert.assertEquals(url2, expectedvalues);
	}

	public void checkingUrlEnglish() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String url_e = driver.getCurrentUrl();
		String expectedval = properties.getProperty("url_m");
		Assert.assertEquals(url_e, expectedval);
	}

	public void checkingUrlEJava() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String url_e = driver.getCurrentUrl();
		String expectedval = properties.getProperty("url_jav");
		Assert.assertEquals(url_e, expectedval);
	}

	public void checkingUrlEnglish2() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String url_x = driver.getCurrentUrl();
		String expectedval = properties.getProperty("url_en");
		Assert.assertEquals(url_x, expectedval);
	}

	public void checkingUrlEnglish264() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String url_xx = driver.getCurrentUrl();
		String expectedval = properties.getProperty("url_2.6.4");
		Assert.assertEquals(url_xx, expectedval);
	}

	public void checkingUrlLanguage1() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String url = driver.getCurrentUrl();
		String expectedvalue = properties.getProperty("urlmsg");
		Assert.assertEquals(url, expectedvalue);
	}

	public void checkingUrlAndr() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String urli = driver.getCurrentUrl();
		String expectedvalue = properties.getProperty("url2.6.0");
		Assert.assertEquals(urli, expectedvalue);
	}

	public void checkingUrlAndroid() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String url2 = driver.getCurrentUrl();
		String ex = properties.getProperty("urlcheck");
		Assert.assertEquals(url2, ex);
	}

	public void checkingUrlJava() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String urljava = driver.getCurrentUrl();
		String exe = properties.getProperty("urljava");
		Assert.assertEquals(urljava, exe);
	}

	public void checkingUrlServer650() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_server2");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlServer651() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_server3");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlServer604() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_server4");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlKubWindows201() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_KubWin201");
		Assert.assertEquals(link, expectedlink);
	}
	
	public void checkingUrlKubWindows201Lang() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_KubWin201Lang");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlKubMac200() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_KubMac200");
		Assert.assertEquals(link, expectedlink);
	}
	
	public void checkingUrlKubMac200Lang() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_KubMac200Lang");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlKubLin122() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_KubLin122");
		Assert.assertEquals(link, expectedlink);
	}
	
	public void checkingUrlKubLin122Lang() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_KubLin122Lang");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlRedHatWin201() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_RedHatWin201");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlRedHatMac200() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_RedHatMac200");
		Assert.assertEquals(link, expectedlink);
	}
	

	public void checkingUrlRedHatLinux122() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_RedHatLin122");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlSyncGLinux273() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_SyncGLin273");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlSyncGRedHat6272() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_SyncGRedHat272");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlSyncGRedHat7271() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_SyncGRedHat271");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlSyncGWin270() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_SyncGWin270");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlSyncGMac261() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String link = driver.getCurrentUrl();
		String expectedlink = properties.getProperty("url_SyncGMac261");
		Assert.assertEquals(link, expectedlink);
	}

	public void checkingUrlLanguage3() throws InterruptedException {
		Thread.sleep(3000);
		logger1.info("checking the redirection");
		String url_3 = driver.getCurrentUrl();
		String expect = properties.getProperty("urlmsg3");
		Assert.assertEquals(url_3, expect);
	}

	public void ScrollingToCouchbaseLiteTabLanguage() throws InterruptedException {
		logger1.info("Click on'Couchbase Lite' tab");
		WebElement element = driver
				.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/div[3]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void ScrollingToCouchbaseLiteTab() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Click on'Couchbase Lite' tab");
		WebElement element = driver
				.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/div[4]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void ScrollingToCouchbaseServerTab() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Click on'Couchbase server' tab");
		WebElement element = driver
				.findElement(By.xpath(" /html/body/main/div/div[2]/section/div/div[1]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void ScrollingToCouchbaseKubernetesTab() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Click on'Couchbase Kubernetes' tab");
		WebElement element = driver
				.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[3]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void ScrollingToCouchbaseKubernetesTabLang() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Click on'Couchbase Kubernetes' tab");
		WebElement element = driver
				.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[2]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void ScrollingToCouchbaseSyncGatewayTab() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Click on'Couchbase Sync Gateway' tab");
		WebElement element = driver
				.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[5]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void ScrollingToCouchbaseSyncGatewayTabLang() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Click on'Couchbase Sync Gateway' tab");
		WebElement element = driver
				.findElement(By.xpath("/html/body/main/div/div[2]/section/div/div[4]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void Switchingtoframe() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));

		// driver.switchTo().frame("drift-widget");

		Thread.sleep(2000);
		click("dPopupClose_Xpath");

		driver.switchTo().defaultContent();
	}

	public void TestForm() throws InterruptedException {
		Thread.sleep(2000);
		logger1.info("Filling the form");
		d.firstName();
		d.lastName();
		d.Email();
		d.Company();
		if (getPropertyValue("language").equalsIgnoreCase("French")) {
			d.jobTitleFrench();
		} else if (getPropertyValue("language").equalsIgnoreCase("German")) {
			d.jobTitleGerman();
		} else {
			d.jobTitle();
		}
		d.PhoneNumber();
		d.scrollinform();
		d.Checkbox();
		d.Submit();

	}

	@Test
	@Parameters("browser")
	public static void downloads(String browser) throws Exception {
		logger1 = extent.createTest("downloads");
		try {
			Thread.sleep(2000);
			if (getPropertyValue("urltype").equalsIgnoreCase("main")) {
				d.ScrollingToCouchbaseLiteTab();
				d.clickPlusButtonmain();
				d.scroll();
				d.clickDownloadsButton();
			}

			else {
				d.ScrollingToCouchbaseLiteTabLanguage();
				d.clickPlusButton();
				d.clickDownloadButton();
			}
			d.TestForm();
			if (getPropertyValue("language").equalsIgnoreCase("english")
					&& getPropertyValue("urltype").equalsIgnoreCase("main")) {
				d.checkingUrlEnglish();
				driver.navigate().back();
				d.ScrollingToCouchbaseLiteTab();
				d.clickPlusButtonmain();
				d.scroll();
				d.Platform();
				d.PlatformSelectionObjectiveC();
				d.Versionn();
				d.VersionnSecnd();
				d.dowloaddEnglish();
				d.checkingUrlEnglish2();
				// d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseLiteTab();
				d.clickPlusButtonmain();
				d.scroll();
				d.Platform();
				d.PlatformSelectionNet();
				d.Versionnextt();
				d.VersionnThrd();
				d.Downloadnewbutton();
				d.checkingUrlEnglish264();
				driver.navigate().back();

				if (browser.equalsIgnoreCase("chrome")) {
					d.ScrollingToCouchbaseLiteTab();
					d.clickPlusButtonmain();
					d.scroll();
					d.Platform();
					d.PlatformSelectionAndroid();
					d.VersionAndroid();
					d.VersionnFourth();
					d.DownloadNewVersion();
					d.checkingUrlAndr();

					driver.navigate().back();
					d.ScrollingToCouchbaseLiteTab();
					d.clickPlusButtonmain();
					d.scroll();
					d.Platform();
					d.PlatformSelectionJava();
					d.clickDownloadsButton();
					d.checkingUrlEJava();

					driver.navigate().back();
				}
				driver.manage().deleteAllCookies();
				d.ScrollingToCouchbaseServerTab();
				d.Switchingtoframe();
				d.PlatformServer();
				d.PlatformSelectionUbuntu1604();
				d.scrolly();
				d.scrolly();
				d.VersionServer1();
				d.VersionServerSelect1();
				d.DbuttonServer650();
				d.firstName();
				d.lastName();
				d.Email();
				d.Company();
				d.jobTitle();
				d.PhoneNumber();
				d.scrollinform();
				d.Checkbox();
				d.Submit();
				d.checkingUrlServer650();
				// d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseServerTab();
				d.PlatformServer();
				d.PlatformSelectionUbuntu1804();
				d.scrolly();
				// d.Switchingtoframe();
				d.VersionServer2();
				d.VersionServerSelect2();
				d.scrolly();
				d.DbuttonServer651();
				d.checkingUrlServer651();
				// d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseServerTab();
				d.scrolly();
				d.PlatformServer();
				d.PlatformSelectionUbuntuRedHat();
				d.scrolly();
				// d.Switchingtoframe();
				d.VersionServer3();
				d.VersionServerSelect3();
				d.DbuttonServer604();
				d.checkingUrlServer604();
				// d.Dbutton();
				driver.navigate().back();
				driver.manage().deleteAllCookies();
				d.ScrollingToCouchbaseKubernetesTab();
				d.clickPlusButtonKubernetes();
				d.scroll();
				d.PlatformKubernetes();
				d.PlatformKubernetesselectWindows();
				d.VersionKubernetes1();
				d.VersionKub201();
				d.DbuttonKubernetes201();
				d.firstName();
				d.lastName();
				d.Email();
				d.Company();
				d.jobTitle();
				d.PhoneNumber();
				d.scrollinform();
				d.Checkbox();
				d.Submit();
				d.checkingUrlKubWindows201();
				// d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseKubernetesTab();
				d.clickPlusButtonKubernetes();
				d.scroll();
				d.PlatformKubernetes();
				d.PlatformKubernetesselectMacOS();
				d.VersionKubernetes2();
				d.VersionKub200();
				d.DbuttonKubernetes200();
				d.checkingUrlKubMac200();
				// d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseKubernetesTab();
				d.clickPlusButtonKubernetes();
				d.scroll();
				d.PlatformKubernetes();
				d.PlatformKubernetesselectLinux();
				d.VersionKubernetes3();
				d.VersionKub122();
				d.DbuttonKubernetes122();
				d.checkingUrlKubLin122();
				// d.Dbutton();
				driver.navigate().back();
				driver.manage().deleteAllCookies();
				d.ScrollingToCouchbaseKubernetesTab();
				d.clickPlusButtonKubernetes();
				d.scrolling();
				d.scrolly();
				d.scrolly();
				d.PlatformKubRedHat();
				d.PlatformKubRedHatselectWindows();
				d.VersionKubRedHat1();
				d.VersionRedHat201();
				d.DbuttonRedHat201();
				d.firstName();
				d.lastName();
				d.Email();
				d.Company();
				d.jobTitle();
				d.PhoneNumber();
				d.scrollinform();
				d.Checkbox();
				d.Submit();
				d.checkingUrlRedHatWin201();
				// d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseKubernetesTab();
				d.clickPlusButtonKubernetes();
				d.scrolling();
				d.scrolly();
				d.scrolly();
				d.PlatformKubRedHat();
				d.PlatformKubRedHatselectMac();
				d.VersionKubRedHat2();
				d.VersionRedHat200();
				d.DbuttonRedHat200();
				d.checkingUrlRedHatMac200();
				// d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseKubernetesTab();
				d.clickPlusButtonKubernetes();
				d.scrolling();
				d.scrolly();
				d.scrolly();
				d.PlatformKubRedHat();
				d.PlatformKubRedHatselectLinux();
				d.VersionKubRedHat3();
				d.VersionRedHat122();
				d.DbuttonRedHat122();
				d.checkingUrlRedHatLinux122();
				// d.Dbutton();
				driver.navigate().back();
				driver.manage().deleteAllCookies();
				d.ScrollingToCouchbaseSyncGatewayTab();
				d.clickPlusButtonSyncG();
				d.scroll();
				d.PlatformSyncG();
				d.PlatformSyncGselectLinux();
				d.VersionSyncG1();
				d.VersionSyncG273();
				d.DbuttonSyncG273();
				d.firstName();
				d.lastName();
				d.Email();
				d.Company();
				d.jobTitle();
				d.PhoneNumber();
				d.scrollinform();
				d.Checkbox();
				d.Submit();
				d.checkingUrlSyncGLinux273();
				// d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseSyncGatewayTab();
				d.clickPlusButtonSyncG();
				d.scroll();
				d.PlatformSyncG();
				d.PlatformSyncGselectRedHat6();
				d.VersionSyncG2();
				d.VersionSyncG272();
				d.DbuttonSyncG272();
				d.checkingUrlSyncGRedHat6272();
				// d.Dbutton();
				driver.navigate().back();
				d.ScrollingToCouchbaseSyncGatewayTab();
				d.clickPlusButtonSyncG();
				d.scroll();
				d.PlatformSyncG();
				d.PlatformSyncGselectRedHat7();
				d.VersionSyncG3();
				d.VersionSyncG271();
				d.DbuttonSyncG271();
				d.checkingUrlSyncGRedHat7271();
				// d.Dbutton();
				driver.navigate().back();
				if (browser.equalsIgnoreCase("chrome")) {
					d.ScrollingToCouchbaseSyncGatewayTab();
					d.clickPlusButtonSyncG();
					d.scroll();
					d.PlatformSyncG();
					d.PlatformSyncGselectWindows();
					d.VersionSyncG4();
					d.VersionSyncG270();
					d.DbuttonSyncG270();
					d.checkingUrlSyncGWin270();
					// d.Dbutton();
					driver.navigate().back();
					d.ScrollingToCouchbaseSyncGatewayTab();
					d.clickPlusButtonSyncG();
					d.scroll();
					d.PlatformSyncG();
					d.PlatformSyncGselectMac();

					d.VersionSyncG5();
					d.VersionSyncG261();
					d.scrolly();
					d.DbuttonSyncG261();
					d.checkingUrlSyncGMac261();
					// d.Dbutton();
					driver.navigate().back();
				}
			} else {// language based scenarios start from here

				d.checkingUrlLanguage1();
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
				driver.navigate().back();
				d.ScrollingToCouchbaseLiteTabLanguage();
				Thread.sleep(2000);
				d.clickPlusButton();
				d.dropdown();
				d.selectOSAndroid();
				d.VersionSelect();
				d.selectVersions();
				d.DownloadNewVersion2();
				d.checkingUrlAndroid();
				driver.navigate().back();
				d.ScrollingToCouchbaseLiteTabLanguage();
				d.clickPlusButton();
				d.dropdown();
				d.selectOSJava();
				d.clickDownloadButton();
				d.checkingUrlJava();
				driver.navigate().back();
				driver.manage().deleteAllCookies();
				// server tile's testing starts here
				// ***********************************************

				d.ScrollingToCouchbaseServerTab();
				d.PlatformServer();
				d.PlatformSelectionUbuntu1604Lang();
				d.scrolly();
				d.VersionServer1Lang();
				d.VersionServerSelect1Lang();
				d.DbuttonServer650();
				d.TestForm();
				d.checkingUrlServer650();
				driver.navigate().back();
				d.ScrollingToCouchbaseServerTab();
				d.PlatformServer();
				d.PlatformSelectionUbuntu1804Lang();
				d.scrolly();
				d.VersionServer2Lang();
				d.VersionServerSelect2Lang();
				d.scrolly();
				d.DbuttonServer651();
				d.checkingUrlServer651();
				driver.navigate().back();
				d.ScrollingToCouchbaseServerTab();
				d.scrolly();
				d.PlatformServer();
				d.PlatformSelectionUbuntuRedHatLang();
				d.scrolly();
				d.VersionServer3Lang();
				d.VersionServerSelect3Lang();
				d.DbuttonServer604();
				d.checkingUrlServer604();
				driver.navigate().back();
				driver.manage().deleteAllCookies();
				// Kubernetes tile's testing starts here
				// ***********************************************
				d.ScrollingToCouchbaseKubernetesTabLang();
				d.clickPlusButtonKubernetesLang();
				d.scroll();
				d.PlatformKubernetes();
				d.PlatformKubernetesselectWindowsLang();
				d.VersionKubernetes1Lang();
				d.VersionKub201Lang();
				d.DbuttonKubernetes201Lang();
				d.TestForm();
				d.checkingUrlKubWindows201Lang();
				
				driver.navigate().back();
				d.ScrollingToCouchbaseKubernetesTabLang();
				d.clickPlusButtonKubernetesLang();
				d.scroll();
				d.PlatformKubernetes();
				d.PlatformKubernetesselectMacOSLang();
				d.VersionKubernetes2Lang();
				d.VersionKub200Lang();
				d.DbuttonKubernetes200Lang();
				d.checkingUrlKubMac200Lang();
				
				driver.navigate().back();
				d.ScrollingToCouchbaseKubernetesTabLang();
				d.clickPlusButtonKubernetesLang();
				d.scroll();
				d.PlatformKubernetes();
				d.PlatformKubernetesselectLinuxLang();
				d.VersionKubernetes3Lang();
				d.VersionKub122Lang();
				d.DbuttonKubernetes122();
				d.checkingUrlKubLin122Lang();
				driver.navigate().back();
				driver.manage().deleteAllCookies();
				
				//Kubernetes red hat testing startes here
				
				d.ScrollingToCouchbaseKubernetesTabLang();
				d.clickPlusButtonKubernetesLang();
				d.scrolling();
				d.scrolly();
				d.PlatformKubRedHat();
				d.PlatformKubRedHatselectLinuxLang();
				d.VersionKubRedHat3Lang();
				d.VersionRedHat122Lang();
				d.DbuttonRedHat122();
				d.TestForm();
				d.checkingUrlRedHatLinux122();
				
				driver.navigate().back();
				d.ScrollingToCouchbaseKubernetesTabLang();
				d.clickPlusButtonKubernetesLang();
				d.scrolling();
				d.scrolly();
				d.PlatformKubRedHat();
				d.PlatformKubRedHatselectWindowsLang();
				d.VersionKubRedHat1Lang();
				d.VersionRedHat201Lang();
				d.DbuttonRedHat201();
				d.checkingUrlRedHatWin201();
				
				
				driver.navigate().back();
				d.ScrollingToCouchbaseKubernetesTabLang();
				d.clickPlusButtonKubernetesLang();
				d.scrolling();
				d.scrolly();
				d.PlatformKubRedHat();
				d.PlatformKubRedHatselectMacLang();
				d.VersionKubRedHat2Lang();
				d.VersionRedHat200Lang();
				d.DbuttonRedHat200();
				d.checkingUrlRedHatMac200();
				
				driver.navigate().back();
			    driver.manage().deleteAllCookies();
				//Sync gateway starts here
				d.ScrollingToCouchbaseSyncGatewayTabLang();
				d.clickPlusButtonSyncGLang();
				d.scroll();
				d.PlatformSyncG();
				d.PlatformSyncGselectLinuxLang();
				d.VersionSyncG1Lang();
				d.VersionSyncG273Lang();
				d.DbuttonSyncG273();
				d.TestForm();
				d.checkingUrlSyncGLinux273();
			
				driver.navigate().back();
				d.ScrollingToCouchbaseSyncGatewayTabLang();
				d.clickPlusButtonSyncGLang();
				d.scroll();
				d.PlatformSyncG();
				d.PlatformSyncGselectRedHat6Lang();
				d.VersionSyncG2Lang();
				d.VersionSyncG272Lang();
				d.DbuttonSyncG272();
				d.checkingUrlSyncGRedHat6272();
			
				driver.navigate().back();
				d.ScrollingToCouchbaseSyncGatewayTabLang();
				d.clickPlusButtonSyncGLang();
				d.scroll();
				d.PlatformSyncG();
				d.PlatformSyncGselectRedHat7Lang();
				d.VersionSyncG3Lang();
				d.VersionSyncG271Lang();
				d.DbuttonSyncG271();
				d.checkingUrlSyncGRedHat7271();
				
				driver.navigate().back();
			}	
			}
		 catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
		Thread.sleep(5000);

		logger1.pass("Testcase Downloads is Passed");
	
}
}
