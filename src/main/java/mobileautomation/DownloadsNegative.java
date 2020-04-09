package mobileautomation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import io.appium.java_client.MobileElement;

public class DownloadsNegative extends AndroidCapabilities {

	@BeforeClass
	public void downloadNext() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("Downloads_url"));
	}
	@Test(priority=4)
	public static void downloadFirstNameNegative() throws Exception {
		logger1 = extent.createTest("downloads_FirstName_Negative");
		try {
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			WebDriverWait wait=new WebDriverWait(driver, 30);
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement element = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'F' is typed in textbox");
			type("dFirstNameNeg_Xpath","dNameNeg");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String pre = Text.getText();
			Assert.assertEquals(pre, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elements = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name '!!' is typed in textbox");
			type("dFirstNameSpcl_Xpath","dNameSpcl");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String present = TextBox.getText();
			Assert.assertEquals(present, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor js = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elemen = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemen);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form@' is typed in textbox");
			type("dFirstNameSpc_Xpath","dNameSpc");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String error = TextBoxContent.getText();
			Assert.assertEquals(error, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor j = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement eleme = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleme);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			j.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name '123456' is typed in textbox");
			type("dFirstNameNum_Xpath","dNameNum");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			j.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxCont = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String errors = TextBoxCont.getText();
			Assert.assertEquals(errors, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor jx = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elem = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jx.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name '  ' is typed in textbox");
			type("dFirstNameBlank_Xpath","dNameBlank");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jx.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxCon = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String erro = TextBoxCon.getText();
			Assert.assertEquals(erro, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor jxe = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jxe.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form1234' is typed in textbox");
			type("dFirstNameAlphdigit_Xpath","dNameAlphdigit");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jxe.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxCo = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String err = TextBoxCo.getText();
			Assert.assertEquals(err, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			}
		catch (Exception e) {
			logger1.fail(e);                           
			throw e;
			}
	}
	@Test(priority=2)
	public static void downloadLastNameNegative() throws Exception {
		logger1 = extent.createTest("downloads_LastName_Negative");
	try {
		JavascriptExecutor jsed = (JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		Thread.sleep(2000);
		logger1.info("Click on'Couchbase Lite' tab");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000); 
		
		Thread.sleep(2000);
		click("dplusbutton_Xpath");
		
		Thread.sleep(2000);
		jsed.executeScript("window.scrollBy(0,800)", "up");
	
		
		Thread.sleep(4000);
		logger1.info("Downloads Button is selected");
		click("dgetButton_Xpath");
		Thread.sleep(2000);
		
		logger1.info("First name 'Form' is typed in textbox");
		type("dFirstName_Xpath","dName");
		Thread.sleep(2000);
		
		logger1.info("Last name 'T' is typed in textbox");
		type("dLastNameNeg_Xpath", "dLastNameNeg");
		Thread.sleep(2000);
		
		logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
		type("dPhoneNumber_Xpath","dNumber");
		Thread.sleep(2000);
		
		logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
		type("dEmail_Xpath","dEmail");
		Thread.sleep(2000);
		
		logger1.info("Company name 'Algoworks' is selected");
		type("dCompany_Xpath","dCompany");
		Thread.sleep(2000);
		
		logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
		type("dJobTitle_Xpath","dJobTitle");
		Thread.sleep(2000);
		
		logger1.info("Country 'Afghanistan' has been selected");
		driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
		
		
		logger1.info("Agreement checkbox has been selected");
		click("dCheckbox_Xpath");
		Thread.sleep(2000);
		
		jsed.executeScript("window.scrollBy(0,800)", "up");
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
		//driver.switchTo().frame("drift-widget");
	
		Thread.sleep(2000);
		click("dPopupClose_Xpath"); 
		
	    driver.switchTo().defaultContent();
		
		logger1.info("Button 'Try It Free Now' has been clicked");
		click("dtryitfree_Xpath");
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
		String pre = Text.getText();
		Assert.assertEquals(pre, "Must contain 2-50 characters.");
				
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
        JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		logger1.info("Click on'Couchbase Lite' tab");
		WebElement elements = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements);
		Thread.sleep(2000); 
		
		Thread.sleep(2000);
		click("dplusbutton_Xpath");
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,800)", "up");
	
		
		Thread.sleep(4000);
		logger1.info("Downloads Button is selected");
		click("dgetButton_Xpath");
		Thread.sleep(2000);
		
		logger1.info("First name 'Form' is typed in textbox");
		type("dFirstName_Xpath","dName");
		Thread.sleep(2000);
		
		logger1.info("Last name '!!' is typed in textbox");
		type("dLastNameSpcl_Xpath", "dLastNameSpcl");
		Thread.sleep(2000);
		
		logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
		type("dPhoneNumber_Xpath","dNumber");
		Thread.sleep(2000);
		
		logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
		type("dEmail_Xpath","dEmail");
		Thread.sleep(2000);
		
		logger1.info("Company name 'Algoworks' is selected");
		type("dCompany_Xpath","dCompany");
		Thread.sleep(2000);
		
		logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
		type("dJobTitle_Xpath","dJobTitle");
		Thread.sleep(2000);
		
		logger1.info("Country 'Afghanistan' has been selected");
		driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
		
		
		logger1.info("Agreement checkbox has been selected");
		click("dCheckbox_Xpath");
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,800)", "up");
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
		//driver.switchTo().frame("drift-widget");
	
		Thread.sleep(2000);
		click("dPopupClose_Xpath"); 
		
	    driver.switchTo().defaultContent();
		
		logger1.info("Button 'Try It Free Now' has been clicked");
		click("dtryitfree_Xpath");
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		logger1.info("Checked error text on submission");
		WebElement TextBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
		String present = TextBoxContent.getText();
		Assert.assertEquals(present, "Must contain 2-50 characters.");
				
		Thread.sleep(2000);
		driver.navigate().refresh();
		logger1.info("------------------------------------------------------------");
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elemen = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemen);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing#' is typed in textbox");
			type("dLastNameSpc_Xpath", "dLastNameSpc");
			Thread.sleep(2000);
			
			logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
			String error = TextBox.getText();
			Assert.assertEquals(error, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor j = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elem = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			j.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name '123456' is typed in textbox");
			type("dLastNameNum_Xpath", "dLastNameNum");
			Thread.sleep(2000);
			
			logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			j.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxes = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
			String errors = TextBoxes.getText();
			Assert.assertEquals(errors, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			 JavascriptExecutor jex = (JavascriptExecutor) driver;
				
				Thread.sleep(2000);
				logger1.info("Click on'Couchbase Lite' tab");
				WebElement ele = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
				Thread.sleep(2000); 
				
				Thread.sleep(2000);
				click("dplusbutton_Xpath");
				
				Thread.sleep(2000);
				jex.executeScript("window.scrollBy(0,800)", "up");
			
				
				Thread.sleep(4000);
				logger1.info("Downloads Button is selected");
				click("dgetButton_Xpath");
				Thread.sleep(2000);
				
				logger1.info("First name 'Form' is typed in textbox");
				type("dFirstName_Xpath","dName");
				Thread.sleep(2000);
				
				logger1.info("Last name ' ' is typed in textbox");
				type("dLastNameBlank_Xpath", "dLastNameBlank");
				Thread.sleep(2000);
				
				logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
				type("dPhoneNumber_Xpath","dNumber");
				Thread.sleep(2000);
				
				logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
				type("dEmail_Xpath","dEmail");
				Thread.sleep(2000);
				
				logger1.info("Company name 'Algoworks' is selected");
				type("dCompany_Xpath","dCompany");
				Thread.sleep(2000);
				
				logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
				type("dJobTitle_Xpath","dJobTitle");
				Thread.sleep(2000);
				
				logger1.info("Country 'Afghanistan' has been selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
				
				
				logger1.info("Agreement checkbox has been selected");
				click("dCheckbox_Xpath");
				Thread.sleep(2000);
				
				jex.executeScript("window.scrollBy(0,800)", "up");
				
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
				//driver.switchTo().frame("drift-widget");
			
				Thread.sleep(2000);
				click("dPopupClose_Xpath"); 
				
			    driver.switchTo().defaultContent();
				
				logger1.info("Button 'Try It Free Now' has been clicked");
				click("dtryitfree_Xpath");
				Thread.sleep(3000);
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
				String err = Texts.getText();
				Assert.assertEquals(err, "Must contain 2-50 characters.");
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				 JavascriptExecutor jexe = (JavascriptExecutor) driver;
					
					Thread.sleep(2000);
					logger1.info("Click on'Couchbase Lite' tab");
					WebElement el = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
					Thread.sleep(2000); 
					
					Thread.sleep(2000);
					click("dplusbutton_Xpath");
					
					Thread.sleep(2000);
					jexe.executeScript("window.scrollBy(0,800)", "up");
				
					
					Thread.sleep(4000);
					logger1.info("Downloads Button is selected");
					click("dgetButton_Xpath");
					Thread.sleep(2000);
					
					logger1.info("First name 'Form' is typed in textbox");
					type("dFirstName_Xpath","dName");
					Thread.sleep(2000);
					
					logger1.info("Last name 'Testing1234' is typed in textbox");
					type("dLastNameAlphdigit_Xpath", "dLastNameAlphdigit");
					Thread.sleep(2000);
					
					logger1.info("Phone number with area code is entered into the AREA CODE + PHONE field");
					type("dPhoneNumber_Xpath","dNumber");
					Thread.sleep(2000);
					
					logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
					type("dEmail_Xpath","dEmail");
					Thread.sleep(2000);
					
					logger1.info("Company name 'Algoworks' is selected");
					type("dCompany_Xpath","dCompany");
					Thread.sleep(2000);
					
					logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
					type("dJobTitle_Xpath","dJobTitle");
					Thread.sleep(2000);
					
					logger1.info("Country 'Afghanistan' has been selected");
					driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
					
					
					logger1.info("Agreement checkbox has been selected");
					click("dCheckbox_Xpath");
					Thread.sleep(2000);
					
					jexe.executeScript("window.scrollBy(0,800)", "up");
					
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
					//driver.switchTo().frame("drift-widget");
				
					Thread.sleep(2000);
					click("dPopupClose_Xpath"); 
					
				    driver.switchTo().defaultContent();
					
					logger1.info("Button 'Try It Free Now' has been clicked");
					click("dtryitfree_Xpath");
					Thread.sleep(3000);
					
					Thread.sleep(2000);
					logger1.info("Checked error text on submission");
					WebElement Tex = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
					String erro = Tex.getText();
					Assert.assertEquals(erro, "Must contain 2-50 characters.");
							
					Thread.sleep(2000);
					driver.navigate().refresh();
					logger1.info("------------------------------------------------------------");
	}		
catch (Exception e) {
	logger1.fail(e);                           
	throw e;
	}
	}
	@Test(priority=3)
	public static void downloadPhoneNumberNegative() throws Exception {
		logger1 = extent.createTest("downloads_PhoneNumber_Negative");
		try {
			WebDriverWait wait=new WebDriverWait(driver, 30);
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement element = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '123456' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumberNeg_Xpath","dNumberNeg");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String pre = Text.getText();
			Assert.assertEquals(pre, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elements = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '12345@' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumberSpcl_Xpath","dNumberSpcl");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
		    
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String present = Texts.getText();
			Assert.assertEquals(present, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor js = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elemen = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemen);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '12345678#' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumberSpc_Xpath","dNumberSpc");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
		    
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Tex = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String presents = Tex.getText();
			Assert.assertEquals(presents, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor j = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement eleme = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleme);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			j.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number ' ' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumberBlank_Xpath","dNumberBlank");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			j.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement T = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String errors = T.getText();
			Assert.assertEquals(errors, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor jx = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elem = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jx.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '!@#$%^&* ' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumberAllSpc_Xpath","dNumberAllSpc");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jx.executeScript("window.scrollBy(0,800)", "up");
			
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Tbox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String error = Tbox.getText();
			Assert.assertEquals(error, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
            JavascriptExecutor jex = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jex.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number 'abcdefghi ' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumberAllAlph_Xpath","dNumberAllAlph");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jex.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Tboxes = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String err = Tboxes.getText();
			Assert.assertEquals(err, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		}
		catch (Exception e) {
			logger1.fail(e);                           
			throw e;
			}
	}
	@Test(priority=1)
	public static void downloadEmailNegative() throws Exception {
		logger1 = extent.createTest("downloads_Email_Negative");
		try {
			WebDriverWait wait=new WebDriverWait(driver, 30);
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement element = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'dumpings@fake.com' has been entered to the email field");
			type("dEmailFake_Xpath","dEmailFake");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[3]/div[2]"));
			String pre = Text.getText();
			Assert.assertEquals(pre, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elements = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id '12345@fake.com' has been entered to the email field");
			type("dEmailNFake_Xpath","dEmailNFake");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[3]/div[2]"));
			String present = Texts.getText();
			Assert.assertEquals(present, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elemen = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemen);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id '!@#$%^&*@fake.com' has been entered to the email field");
			type("dEmailSFake_Xpath","dEmailSFake");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[3]/div[2]"));
			String error = TextBoxContent.getText();
			Assert.assertEquals(error, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement eleme = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleme);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'dumpings125334@fake.com' has been entered to the email field");
			type("dEmailMixFake_Xpath","dEmailMixFake");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxCont = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[3]/div[2]"));
			String errors = TextBoxCont.getText();
			Assert.assertEquals(errors, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elem = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id '12345678' has been entered to the email field");
			type("dEmailNumber_Xpath","dEmailNumber");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxCon = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[3]/div[2]"));
			String err = TextBoxCon.getText();
			Assert.assertEquals(err, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'dumpings' has been entered to the email field");
			type("dEmailAlphs_Xpath","dEmailAlphs");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TextBoxC = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[3]/div[2]"));
			String er = TextBoxC.getText();
			Assert.assertEquals(er, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		}
		catch (Exception e) {
			logger1.fail(e);                           
			throw e;
			}
	}
	@Test(priority=1)
	public static void downloadCompanyNegative() throws Exception {
		logger1 = extent.createTest("downloads_Company_Negative");
		try {
			WebDriverWait wait=new WebDriverWait(driver, 30);
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement element = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'A' is selected");
			type("dCompanyNeg_Xpath","dCompanyNeg");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[4]/div[2]"));
			String pre = Text.getText();
			Assert.assertEquals(pre, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elements = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name '1234' is selected");
			type("dCompanyNum_Xpath","dCompanyNum");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[4]/div[2]"));
			String present = Texts.getText();
			Assert.assertEquals(present, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			

			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elemen = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemen);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name '!@#$' is selected");
			type("dCompanySchar_Xpath","dCompanySchar");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Tex = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[4]/div[2]"));
			String presents = Tex.getText();
			Assert.assertEquals(presents, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement eleme = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleme);
			Thread.sleep(2000); 
			
			Thread.sleep(2000);
			click("dplusbutton_Xpath");
			
			Thread.sleep(2000);
			jsed.executeScript("window.scrollBy(0,800)", "up");
		
			
			Thread.sleep(4000);
			logger1.info("Downloads Button is selected");
			click("dgetButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			logger1.info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field");
			type("dPhoneNumber_Xpath","dNumber");
			Thread.sleep(2000);
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name ' ' is selected");
			type("dCompanyBlank_Xpath","dCompanyBlank");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'Afghanistan' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			jsed.executeScript("window.scrollBy(0,800)", "up");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("drift-widget"))));
			//driver.switchTo().frame("drift-widget");
		
			Thread.sleep(2000);
			click("dPopupClose_Xpath"); 
			
		    driver.switchTo().defaultContent();
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dtryitfree_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement T = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[4]/div[2]"));
			String error = T.getText();
			Assert.assertEquals(error, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
		}
		catch (Exception e) {
			logger1.fail(e);                           
			throw e;
			}
		Thread.sleep(5000);

		logger1.pass("Testcase Downloads Negative is Passed");
	}
}

			
	

