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
	@Test(priority=1)
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
			String expectedValues= properties.getProperty("d_msg");
			Assert.assertEquals(pre, expectedValues);
				
					
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
			String expectedValue= properties.getProperty("d_msg");
			Assert.assertEquals(present, expectedValue);
			
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
			String expectedValu= properties.getProperty("d_msg");
			Assert.assertEquals(error, expectedValu);
			

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
			String expectedVal= properties.getProperty("d_msg");
			Assert.assertEquals(errors, expectedVal);
				
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
			String expectedVa= properties.getProperty("d_msg");
			Assert.assertEquals(erro, expectedVa);
				
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
			String expectedV= properties.getProperty("d_msg");
			Assert.assertEquals(err, expectedV);
			
					
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
		String expectedValues= properties.getProperty("d_msg");
		Assert.assertEquals(pre, expectedValues);
			
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
		String expectedValue= properties.getProperty("d_msg");
		Assert.assertEquals(present, expectedValue);
		
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
			String expectedValu= properties.getProperty("d_msg");
			Assert.assertEquals(error, expectedValu);
				
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
			String expectedVal= properties.getProperty("d_msg");
			Assert.assertEquals(errors, expectedVal);
						
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
				String expectedVa= properties.getProperty("d_msg");
				Assert.assertEquals(err, expectedVa);
							
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
					String expectedV= properties.getProperty("d_msg");
					Assert.assertEquals(erro, expectedV);
						
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
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[3]"));
			String pre = Text.getText();
			String expectedValues= properties.getProperty("d_phonemsg");
			Assert.assertEquals(pre, expectedValues);
				
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
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[3]"));
			String present = Texts.getText();
			String expectedValue= properties.getProperty("d_phonemsg");
			Assert.assertEquals(present, expectedValue);
						
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
			WebElement Tex = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[3]"));
			String presents = Tex.getText();
			String expectedValu= properties.getProperty("d_phonemsg");
			Assert.assertEquals(presents, expectedValu);
						
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
			WebElement T = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[3]"));
			String errors = T.getText();
			String expectedVal= properties.getProperty("d_phonemsg");
			Assert.assertEquals(errors, expectedVal);
						
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
			WebElement Tbox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[3]"));
			String error = Tbox.getText();
			String expectedVa= properties.getProperty("d_phonemsg");
			Assert.assertEquals(error, expectedVa);
						
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
			WebElement Tboxes = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div[3]"));
			String err = Tboxes.getText();
			String expectedV= properties.getProperty("d_phonemsg");
			Assert.assertEquals(err, expectedV);
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		}
		catch (Exception e) {
			logger1.fail(e);                           
			throw e;
			}
	}
	@Test(priority=4)
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
			String expectedValues= properties.getProperty("d_emailmsg");
			Assert.assertEquals(pre, expectedValues);
						
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
			String expectedValue= properties.getProperty("d_emailmsg");
			Assert.assertEquals(present, expectedValue);
					
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
			String expectedValu= properties.getProperty("d_emailmsg");
			Assert.assertEquals(error, expectedValu);
					
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
			String expectedVal= properties.getProperty("d_emailmsg");
			Assert.assertEquals(errors, expectedVal);
						
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
			String expectedVa= properties.getProperty("d_emailmsg");
			Assert.assertEquals(err, expectedVa);
						
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
			String expectedV= properties.getProperty("d_emailmsg");
			Assert.assertEquals(er, expectedV);
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		}
		catch (Exception e) {
			logger1.fail(e);                           
			throw e;
			}
	}
	@Test(priority=5)
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
			String expectedValues= properties.getProperty("d_msg");
			Assert.assertEquals(pre, expectedValues);
					
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
			String expectedValue= properties.getProperty("d_msg");
			Assert.assertEquals(present, expectedValue);
						
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
			String expectedValu= properties.getProperty("d_msg");
			Assert.assertEquals(presents, expectedValu);
					
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
			String expectedVal= properties.getProperty("d_msg");
			Assert.assertEquals(error, expectedVal);
				
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
		}
		catch (Exception e) {
			logger1.fail(e);                           
			throw e;
			}
	}
	@Test(priority=6)
	public static void downloadJobTitle() throws Exception {
		logger1 = extent.createTest("downloads_JobTitle_Negative");
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
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'A' has been entered to the Jobtitle field");
			type("dJobTitleNeg_Xpath","dJobTitleNeg");
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
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[5]/div[2]"));
			String pre = Text.getText();
			String expectedVa= properties.getProperty("d_msg");
			Assert.assertEquals(pre, expectedVa);
					
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
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title @@' has been entered to the Jobtitle field");
			type("dJobTitleSpcl_Xpath","dJobTitleSpcl");
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
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[5]/div[2]"));
			String present = Texts.getText();
			String expectedV= properties.getProperty("d_msg");
			Assert.assertEquals(present, expectedV);
						
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
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title Automation#' has been entered to the Jobtitle field");
			type("dJobTitleSpc_Xpath","dJobTitleSpc");
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
			WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[5]/div[2]"));
			String error = TextBox.getText();
			String expected= properties.getProperty("d_msg");
			Assert.assertEquals(error, expected);
						
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
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title '123456' has been entered to the Jobtitle field");
			type("dJobTitleNum_Xpath","dJobTitleNum");
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
			WebElement TextBoxes = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[5]/div[2]"));
			String errors = TextBoxes.getText();
			String expecte= properties.getProperty("d_msg");
			Assert.assertEquals(errors, expecte);
					
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
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title ' ' has been entered to the Jobtitle field");
			type("dJobTitleBlank_Xpath","dJobTitleBlank");
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
			WebElement TextBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[5]/div[2]"));
			String erro = TextBoxContent.getText();
			String expect= properties.getProperty("d_msg");
			Assert.assertEquals(erro, expect);
						
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
			
			logger1.info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field");
			type("dEmail_Xpath","dEmail");
			Thread.sleep(2000);
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation1234' has been entered to the Jobtitle field");
			type("dJobTitleAlphdigit_Xpath","dJobTitleAlphdigit");
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
			WebElement TextBoxCont = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[5]/div[2]"));
			String err = TextBoxCont.getText();
			String expec= properties.getProperty("d_msg");
			Assert.assertEquals(err, expec);
						
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
		}
		
		catch (Exception e) {
			logger1.fail(e);                           
			throw e;
			}
	}
	@Test(priority=7)
	public static void downloadCountry() throws Exception {
		logger1 = extent.createTest("downloads_Country_Negative");
		try {
			WebDriverWait wait=new WebDriverWait(driver, 30);
			JavascriptExecutor jsed = (JavascriptExecutor) driver;
			
			
			  Thread.sleep(2000); logger1.info("Click on'Couchbase Lite' tab"); WebElement
			  element = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			  ((JavascriptExecutor)
			  driver).executeScript("arguments[0].scrollIntoView(true);", element);
			  Thread.sleep(2000);
			  
			  Thread.sleep(2000); click("dplusbutton_Xpath");
			  
			  Thread.sleep(2000); jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  
			  Thread.sleep(4000); logger1.info("Downloads Button is selected");
			  click("dgetButton_Xpath"); Thread.sleep(2000);
			  
			  logger1.info("First name 'Form' is typed in textbox");
			  type("dFirstName_Xpath","dName"); Thread.sleep(2000);
			  
			  logger1.info("Last name 'Testing' is typed in textbox");
			  type("dLastName_Xpath", "dLastName"); Thread.sleep(2000);
			  
			  logger1.
			  info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field"
			  ); type("dPhoneNumber_Xpath","dNumber"); Thread.sleep(2000);
			  
			  logger1.
			  info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field"
			  ); type("dEmail_Xpath","dEmail"); Thread.sleep(2000);
			  
			  logger1.info("Company name 'Algoworks' is selected");
			  type("dCompany_Xpath","dCompany"); Thread.sleep(2000);
			  
			  logger1.info("Job Title 'Automation' has been entered to the Jobtitle field"
			  ); type("dJobTitle_Xpath","dJobTitle"); Thread.sleep(2000);
			  
			  logger1.info("Country 'Afghanistan' has been selected");
			  driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select"
			  )).sendKeys("Afghanistan");
			  
			  jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			  findElement(By.id("drift-widget"))));
			  //driver.switchTo().frame("drift-widget");
			  
			  Thread.sleep(2000); click("dPopupClose_Xpath");
			  
			  driver.switchTo().defaultContent();
			  
			  logger1.info("Button 'Try It Free Now' has been clicked");
			  click("dtryitfree_Xpath"); Thread.sleep(3000);
			  
			  Thread.sleep(2000); logger1.info("Checked error text on submission");
			  WebElement Text = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[10]/div[2]/div[2]/div"
			  )); String pre = Text.getText(); String expectedValues=
			  properties.getProperty("d_lisence"); Assert.assertEquals(pre,
			  expectedValues);
			  
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			  
			  Thread.sleep(2000); logger1.info("Click on'Couchbase Lite' tab"); WebElement
			  ele = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			  ((JavascriptExecutor)
			  driver).executeScript("arguments[0].scrollIntoView(true);", ele);
			  Thread.sleep(2000);
			  
			  Thread.sleep(2000); click("dplusbutton_Xpath");
			  
			  Thread.sleep(2000); jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  
			  Thread.sleep(4000); logger1.info("Downloads Button is selected");
			  click("dgetButton_Xpath"); Thread.sleep(2000);
			  
			  logger1.info("First name 'Form' is typed in textbox");
			  type("dFirstName_Xpath","dName"); Thread.sleep(2000);
			  
			  logger1.info("Last name 'Testing' is typed in textbox");
			  type("dLastName_Xpath", "dLastName"); Thread.sleep(2000);
			  
			  logger1.
			  info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field"
			  ); type("dPhoneNumber_Xpath","dNumber"); Thread.sleep(2000);
			  
			  logger1.
			  info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field"
			  ); type("dEmail_Xpath","dEmail"); Thread.sleep(2000);
			  
			  logger1.info("Company name 'Algoworks' is selected");
			  type("dCompany_Xpath","dCompany"); Thread.sleep(2000);
			  
			  logger1.
			  info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			  type("dJobTitle_Xpath","dJobTitle"); Thread.sleep(2000);
			  
			  
			  logger1.info("Agreement checkbox has been selected");
			  click("dCheckbox_Xpath"); Thread.sleep(2000);
			  
			  jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			  findElement(By.id("drift-widget"))));
			  //driver.switchTo().frame("drift-widget");
			  
			  Thread.sleep(2000); click("dPopupClose_Xpath");
			  
			  driver.switchTo().defaultContent();
			  
			  logger1.info("Button 'Try It Free Now' has been clicked");
			  click("dtryitfree_Xpath"); Thread.sleep(3000);
			  
			  Thread.sleep(2000); logger1.info("Checked error text on submission");
			  WebElement TextBoxCont = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/div"
			  )); String err = TextBoxCont.getText(); String expectedValue=
			  properties.getProperty("f_countrymsg"); Assert.assertEquals(err,
			  expectedValue);
			  
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			  
			  Thread.sleep(2000); logger1.info("Click on'Couchbase Lite' tab"); WebElement
			  elemen = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			  ((JavascriptExecutor)
			  driver).executeScript("arguments[0].scrollIntoView(true);", elemen);
			  Thread.sleep(2000);
			  
			  Thread.sleep(2000); click("dplusbutton_Xpath");
			  
			  Thread.sleep(2000); jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  
			  Thread.sleep(4000); logger1.info("Downloads Button is selected");
			  click("dgetButton_Xpath"); Thread.sleep(2000);
			  
			  logger1.info("First name 'Form' is typed in textbox");
			  type("dFirstName_Xpath","dName"); Thread.sleep(2000);
			  
			  logger1.info("Last name 'Testing' is typed in textbox");
			  type("dLastName_Xpath", "dLastName"); Thread.sleep(2000);
			  
			  logger1.
			  info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field"
			  ); type("dPhoneNumber_Xpath","dNumber"); Thread.sleep(2000);
			  
			  logger1.
			  info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field"
			  ); type("dEmail_Xpath","dEmail"); Thread.sleep(2000);
			  
			  logger1.info("Company name 'Algoworks' is selected");
			  type("dCompany_Xpath","dCompany"); Thread.sleep(2000);
			  
			  logger1.
			  info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			  type("dJobTitle_Xpath","dJobTitle"); Thread.sleep(2000);
			  
			  logger1.info("Country 'United States' has been selected");
			  driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select"
			  )).sendKeys("United States");
			  
			  logger1.info("City 'Noida' has been selected"); driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[9]/input"
			  )).sendKeys("Noida");
			  
			  
			  logger1.info("Agreement checkbox has been selected");
			  click("dCheckbox_Xpath"); Thread.sleep(2000);
			  
			  jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			  findElement(By.id("drift-widget"))));
			  //driver.switchTo().frame("drift-widget");
			  
			  Thread.sleep(2000); click("dPopupClose_Xpath");
			  
			  driver.switchTo().defaultContent();
			  
			  logger1.info("Button 'Try It Free Now' has been clicked");
			  click("dtryitfree_Xpath"); Thread.sleep(3000);
			  
			  Thread.sleep(2000); logger1.info("Checked error text on submission");
			  WebElement TextBoxContent = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[7]/span/div"
			  )); String errors = TextBoxContent.getText(); String expectedValu=
			  properties.getProperty("f_statemsg"); Assert.assertEquals(errors,
			  expectedValu);
			  
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			  
			  
			  Thread.sleep(2000); logger1.info("Click on'Couchbase Lite' tab"); WebElement
			  eleme = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			  ((JavascriptExecutor)
			  driver).executeScript("arguments[0].scrollIntoView(true);", eleme);
			  Thread.sleep(2000);
			  
			  Thread.sleep(2000); click("dplusbutton_Xpath");
			  
			  Thread.sleep(2000); jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  
			  Thread.sleep(4000); logger1.info("Downloads Button is selected");
			  click("dgetButton_Xpath"); Thread.sleep(2000);
			  
			  logger1.info("First name 'Form' is typed in textbox");
			  type("dFirstName_Xpath","dName"); Thread.sleep(2000);
			  
			  logger1.info("Last name 'Testing' is typed in textbox");
			  type("dLastName_Xpath", "dLastName"); Thread.sleep(2000);
			  
			  logger1.
			  info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field"
			  ); type("dPhoneNumber_Xpath","dNumber"); Thread.sleep(2000);
			  
			  logger1.
			  info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field"
			  ); type("dEmail_Xpath","dEmail"); Thread.sleep(2000);
			  
			  logger1.info("Company name 'Algoworks' is selected");
			  type("dCompany_Xpath","dCompany"); Thread.sleep(2000);
			  
			  logger1.
			  info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			  type("dJobTitle_Xpath","dJobTitle"); Thread.sleep(2000);
			  
			  logger1.info("Country 'United States' has been selected");
			  driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select"
			  )).sendKeys("United States");
			  
			  logger1.info("State 'Alabama' has been selected");
			  driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[7]/span/select"
			  )).sendKeys("Alabama");
			  
			  logger1.info("Agreement checkbox has been selected");
			  click("dCheckbox_Xpath"); Thread.sleep(2000);
			  
			  jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			  findElement(By.id("drift-widget"))));
			  //driver.switchTo().frame("drift-widget");
			  
			  Thread.sleep(2000); click("dPopupClose_Xpath");
			  
			  driver.switchTo().defaultContent();
			  
			  logger1.info("Button 'Try It Free Now' has been clicked");
			  click("dtryitfree_Xpath"); Thread.sleep(3000);
			  
			  Thread.sleep(2000); logger1.info("Checked error text on submission");
			  WebElement TextBoxConten = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[9]/div[2]"
			  )); String error = TextBoxConten.getText(); String expectedVal=
			  properties.getProperty("d_msg"); Assert.assertEquals(error, expectedVal);
			  
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			  
			  Thread.sleep(2000); logger1.info("Click on'Couchbase Lite' tab"); WebElement
			  elem = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			  ((JavascriptExecutor)
			  driver).executeScript("arguments[0].scrollIntoView(true);", elem);
			  Thread.sleep(2000);
			  
			  Thread.sleep(2000); click("dplusbutton_Xpath");
			  
			  Thread.sleep(2000); jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  
			  Thread.sleep(4000); logger1.info("Downloads Button is selected");
			  click("dgetButton_Xpath"); Thread.sleep(2000);
			  
			  logger1.info("First name 'Form' is typed in textbox");
			  type("dFirstName_Xpath","dName"); Thread.sleep(2000);
			  
			  logger1.info("Last name 'Testing' is typed in textbox");
			  type("dLastName_Xpath", "dLastName"); Thread.sleep(2000);
			  
			  logger1.
			  info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field"
			  ); type("dPhoneNumber_Xpath","dNumber"); Thread.sleep(2000);
			  
			  logger1.
			  info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field"
			  ); type("dEmail_Xpath","dEmail"); Thread.sleep(2000);
			  
			  logger1.info("Company name 'Algoworks' is selected");
			  type("dCompany_Xpath","dCompany"); Thread.sleep(2000);
			  
			  logger1.
			  info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			  type("dJobTitle_Xpath","dJobTitle"); Thread.sleep(2000);
			  
			  logger1.info("Country 'United States' has been selected");
			  driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select"
			  )).sendKeys("United States");
			  
			  logger1.info("State 'Alabama' has been selected");
			  driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[7]/span/select"
			  )).sendKeys("Alabama");
			  
			  logger1.info("State 'Noida' has been selected"); driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[9]/input"
			  )).sendKeys("Noida");
			  
			  jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			  findElement(By.id("drift-widget"))));
			  //driver.switchTo().frame("drift-widget");
			  
			  Thread.sleep(2000); click("dPopupClose_Xpath");
			  
			  driver.switchTo().defaultContent();
			  
			  logger1.info("Button 'Try It Free Now' has been clicked");
			  click("dtryitfree_Xpath"); Thread.sleep(3000);
			  
			  Thread.sleep(2000); logger1.info("Checked error text on submission");
			  WebElement TextBoxCo = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[10]/div[2]/div[2]/div"
			  )); String erro = TextBoxCo.getText(); String expectedVa=
			  properties.getProperty("d_lisence"); Assert.assertEquals(erro, expectedVa);
			  
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			  
			  Thread.sleep(2000); logger1.info("Click on'Couchbase Lite' tab"); WebElement
			  el = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			  ((JavascriptExecutor)
			  driver).executeScript("arguments[0].scrollIntoView(true);", el);
			  Thread.sleep(2000);
			  
			  Thread.sleep(2000); click("dplusbutton_Xpath");
			  
			  Thread.sleep(2000); jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  
			  Thread.sleep(4000); logger1.info("Downloads Button is selected");
			  click("dgetButton_Xpath"); Thread.sleep(2000);
			  
			  logger1.info("First name 'Form' is typed in textbox");
			  type("dFirstName_Xpath","dName"); Thread.sleep(2000);
			  
			  logger1.info("Last name 'Testing' is typed in textbox");
			  type("dLastName_Xpath", "dLastName"); Thread.sleep(2000);
			  
			  logger1.
			  info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field"
			  ); type("dPhoneNumber_Xpath","dNumber"); Thread.sleep(2000);
			  
			  logger1.
			  info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field"
			  ); type("dEmail_Xpath","dEmail"); Thread.sleep(2000);
			  
			  logger1.info("Company name 'Algoworks' is selected");
			  type("dCompany_Xpath","dCompany"); Thread.sleep(2000);
			  
			  logger1.
			  info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			  type("dJobTitle_Xpath","dJobTitle"); Thread.sleep(2000);
			  
			  logger1.info("Country 'United Kingdom' has been selected");
			  driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select"
			  )).sendKeys("United Kingdom");
			  
			  logger1.info("Privacy Policy checkbox is clicked");
			  driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[10]/div[1]/div/div[1]/input"
			  )).click();
			  
			  jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			  findElement(By.id("drift-widget"))));
			  //driver.switchTo().frame("drift-widget");
			  
			  Thread.sleep(2000); click("dPopupClose_Xpath");
			  
			  driver.switchTo().defaultContent();
			  
			  logger1.info("Button 'Try It Free Now' has been clicked");
			  click("dtryitfree_Xpath"); Thread.sleep(3000);
			  
			  Thread.sleep(2000); logger1.info("Checked error text on submission");
			  WebElement TextBoxC = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[10]/div[2]/div[2]/div"
			  )); String er = TextBoxC.getText(); String expectedV=
			  properties.getProperty("d_lisence"); Assert.assertEquals(er, expectedV);
			  
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			  
			  Thread.sleep(2000); logger1.info("Click on'Couchbase Lite' tab"); WebElement
			  ent = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			  ((JavascriptExecutor)
			  driver).executeScript("arguments[0].scrollIntoView(true);", ent);
			  Thread.sleep(2000);
			  
			  Thread.sleep(2000); click("dplusbutton_Xpath");
			  
			  Thread.sleep(2000); jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  
			  Thread.sleep(4000); logger1.info("Downloads Button is selected");
			  click("dgetButton_Xpath"); Thread.sleep(2000);
			  
			  logger1.info("First name 'Form' is typed in textbox");
			  type("dFirstName_Xpath","dName"); Thread.sleep(2000);
			  
			  logger1.info("Last name 'Testing' is typed in textbox");
			  type("dLastName_Xpath", "dLastName"); Thread.sleep(2000);
			  
			  logger1.
			  info("Phone number '1866-648-7575' is entered into the AREA CODE + PHONE field"
			  ); type("dPhoneNumber_Xpath","dNumber"); Thread.sleep(2000);
			  
			  logger1.
			  info("Business email id 'poonam.gupta@algoworks.com' has been entered to the email field"
			  ); type("dEmail_Xpath","dEmail"); Thread.sleep(2000);
			  
			  logger1.info("Company name 'Algoworks' is selected");
			  type("dCompany_Xpath","dCompany"); Thread.sleep(2000);
			  
			  logger1.
			  info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			  type("dJobTitle_Xpath","dJobTitle"); Thread.sleep(2000);
			  
			  logger1.info("Country 'United Kingdom' has been selected");
			  driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select"
			  )).sendKeys("United Kingdom");
			  
			  logger1.info("License Agreement checkbox is clicked");
			  driver.findElement(By.xpath("//*[@id=\"termsandConditions\"]")).click();
			  
			  jsed.executeScript("window.scrollBy(0,800)", "up");
			  
			  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.
			  findElement(By.id("drift-widget"))));
			  //driver.switchTo().frame("drift-widget");
			  
			  Thread.sleep(2000); click("dPopupClose_Xpath");
			  
			  driver.switchTo().defaultContent();
			  
			  logger1.info("Button 'Try It Free Now' has been clicked");
			  click("dtryitfree_Xpath"); Thread.sleep(3000);
			  
			  Thread.sleep(2000); logger1.info("Checked error text on submission");
			  WebElement Textss = driver.findElement(By.xpath(
			  "//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[10]/div[1]/div/div[2]/div"
			  )); String e = Textss.getText(); String expected=
			  properties.getProperty("f_ppmsg"); Assert.assertEquals(e, expected);
			  
			  Thread.sleep(2000); driver.navigate().refresh();
			  logger1.info("------------------------------------------------------------");
			  
			 
			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement ents = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ents);
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
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'CANADA' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("CANADA");
			
			logger1.info("Privacy Policy checkbox is clicked");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[10]/div[1]/div/div[1]/input")).click();
			
			logger1.info("License Agreement checkbox is clicked");
			driver.findElement(By.xpath("//*[@id=\"termsandConditions\"]")).click();
			
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
			WebElement T = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[8]/span/div"));
			String ex = T.getText();
			String expecte= properties.getProperty("f_provincemsg");
			Assert.assertEquals(ex, expecte);
						
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			

			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement ell = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ell);
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
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'CANADA' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("CANADA");
			
			logger1.info("Province 'Alberta' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[8]/span/select")).sendKeys("Alberta");
			
			logger1.info("License Agreement checkbox is clicked");
			driver.findElement(By.xpath("//*[@id=\"termsandConditions\"]")).click();
			
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
			WebElement Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[10]/div[1]/div/div[2]/div"));
			String bug = Box.getText();
			String expect= properties.getProperty("f_ppmsg");
			Assert.assertEquals(bug, expect);
				
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			

			Thread.sleep(2000);
			logger1.info("Click on'Couchbase Lite' tab");
			WebElement elle = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/section/div/h2"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elle);
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
			
			logger1.info("Company name 'Algoworks' is selected");
			type("dCompany_Xpath","dCompany");
			Thread.sleep(2000);
			
			logger1.info("Job Title 'Automation QA' has been entered to the Jobtitle field");
			type("dJobTitle_Xpath","dJobTitle");
			Thread.sleep(2000);
			
			logger1.info("Country 'CANADA' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[6]/span/select")).sendKeys("CANADA");
			
			logger1.info("Province 'Alberta' has been selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[8]/span/select")).sendKeys("Alberta");
			
			logger1.info("Privacy Policy checkbox is clicked");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[10]/div[1]/div/div[1]/input")).click();
			
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
			WebElement Boxes = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div/div[2]/div[2]/div/div/div/div/form/div[10]/div[2]/div[2]/div"));
			String bugs = Boxes.getText();
			String expec= properties.getProperty("d_lisence");
			Assert.assertEquals(bugs, expec);
				
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

			
	

