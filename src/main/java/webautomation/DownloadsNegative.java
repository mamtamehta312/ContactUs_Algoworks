package webautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.WebCapabilities;

public class DownloadsNegative extends WebCapabilities {

	@BeforeClass
	public void downloadNext() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("Downloads_url"));
	}
	@Test (priority=1)
	public static void NegativeFirstName() throws Exception {
		logger1 = extent.createTest("downloads_FirstName_Negative");
try {
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
            JavascriptExecutor jsed = (JavascriptExecutor) driver;
			jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'F' is typed in textbox");
			type("dFirstNameNeg_Xpath","dNameNeg");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
           JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name '!!' is typed in textbox");
			type("dFirstNameSpcl_Xpath","dNameSpcl");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String presents = TxtBox.getText();
			Assert.assertEquals(presents, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
           JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form@' is typed in textbox");
			type("dFirstNameSpc_Xpath","dNameSpc");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String pre = Text.getText();
			Assert.assertEquals(pre, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
       //     JavascriptExecutor j = (JavascriptExecutor) driver;
		//	j.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name '123456' is typed in textbox");
			type("dFirstNameNum_Xpath","dNameNum");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String error = Texts.getText();
			Assert.assertEquals(error, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
       //     JavascriptExecutor ex = (JavascriptExecutor) driver;
		//	ex.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name ' ' is typed in textbox");
			type("dFirstNameBlank_Xpath","dNameBlank");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String errors = Txt.getText();
			Assert.assertEquals(errors, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
    //        JavascriptExecutor exe = (JavascriptExecutor) driver;
	//		exe.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form1234' is typed in textbox");
			type("dFirstNameAlphdigit_Xpath","dNameAlphdigit");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[1]/div/div[2]"));
			String err = Txts.getText();
			Assert.assertEquals(err, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
           }
           catch(Exception e) {
	       logger1.fail(e);                           
	       throw e;
           }
	}
	@Test (priority=2)
	public static void NegativeLastName() throws Exception {
	logger1 = extent.createTest("downloads_LastName_Negative");
            
	        try {
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
      //      JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'T' is typed in textbox");
			type("dLastNameNeg_Xpath", "dLastNameNeg");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
        //    JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name '!!' is typed in textbox");
			type("dLastNameSpcl_Xpath", "dLastNameSpcl");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Content = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
			String pre = Content.getText();
			Assert.assertEquals(pre, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
        //    JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing#' is typed in textbox");
			type("dLastNameSpc_Xpath", "dLastNameSpc");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
			String presents = TxtBox.getText();
			Assert.assertEquals(presents, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
        //    JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name '123456' is typed in textbox");
			type("dLastNameNum_Xpath", "dLastNameNum");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
			String error = Txt.getText();
			Assert.assertEquals(error, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
        //    JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name ' ' is typed in textbox");
			type("dLastNameBlank_Xpath", "dLastNameBlank");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
			String errors = Text.getText();
			Assert.assertEquals(errors, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
        //    JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing1234' is typed in textbox");
			type("dLastNameAlphdigit_Xpath", "dLastNameAlphdigit");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[1]/div[2]/div/div[2]"));
			String err = Texts.getText();
			Assert.assertEquals(err, "Must contain 2-50 characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
	        
	        }
            catch(Exception e) {
            logger1.fail(e);                           
            throw e;
            }
	        }
	
	@Test (priority=3)
	public static void NegativePhoneNumber() throws Exception {
	logger1 = extent.createTest("downloads_PhoneNumber_Negative");
            
	        try {
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
      //      JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
      //      JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String presents = TxtBox.getText();
			Assert.assertEquals(presents, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
      //      JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String error = Txt.getText();
			Assert.assertEquals(error, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
      //      JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String errors = Text.getText();
			Assert.assertEquals(errors, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
      //      JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
			logger1.info("Phone number '!@#$%^&*' is entered into the AREA CODE + PHONE field");
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String err = Texts.getText();
			Assert.assertEquals(err, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
      //      JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
			logger1.info("Phone number 'abcdefghi' is entered into the AREA CODE + PHONE field");
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div/div/div[2]"));
			String errs = Txts.getText();
			Assert.assertEquals(errs, "Must contain numerical characters.");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
	        }
	        catch(Exception e) {
	            logger1.fail(e);                           
	            throw e;
	            }
	}
	
	@Test (priority=4)
	public static void NegativeEmail() throws Exception {
	logger1 = extent.createTest("downloads_Email_Negative");
            
	        try {
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
      //      JavascriptExecutor jsed = (JavascriptExecutor) driver;
		//	jsed.executeScript("window.scrollBy(0,150)", "up");
			
			/*Thread.sleep(2000);
			logger1.info("Click on Popup Cancel button ");
			click("dPopupCancel_Xpath");
			Thread.sleep(2000); */
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
			Thread.sleep(2000);
			
			logger1.info("First name 'Form' is typed in textbox");
			type("dFirstName_Xpath","dName");
			Thread.sleep(2000);
			
			logger1.info("Last name 'Testing' is typed in textbox");
			type("dLastName_Xpath", "dLastName");
			Thread.sleep(2000);
			
			//logger1.info("Country 'United States/Canada (+1)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[2]/div[1]/div/span/span")).sendKeys("United States/Canada (+1)");
			
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[3]/div[2]"));
			String present = TxtBoxContent.getText();
			Assert.assertEquals(present, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[3]/div[2]"));
			String presents = TxtBox.getText();
			Assert.assertEquals(presents, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Txt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[3]/div[2]"));
			String errors = Txt.getText();
			Assert.assertEquals(errors, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[3]/div[2]"));
			String error = Text.getText();
			Assert.assertEquals(error, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[3]/div[2]"));
			String errorss = Texts.getText();
			Assert.assertEquals(errorss, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			logger1.info("Click on mobile tab");
			click("dTab_Xpath");
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			logger1.info("Downloads Button is selected");
			click("dDownloadsButton_Xpath");
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
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[6]/span/span")).sendKeys("Afghanistan");
			
			
			logger1.info("Agreement checkbox has been selected");
			click("dCheckbox_Xpath");
			Thread.sleep(2000);
			
			logger1.info("Button 'Try It Free Now' has been clicked");
			click("dButton_Xpath");
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Content = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[4]/div/div/div/div/form/div[3]/div[2]"));
			String err = Content.getText();
			Assert.assertEquals(err, "Please enter a valid email address (2-50 characters).");
					
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
	        }
	        catch(Exception e) {
	            logger1.fail(e);                           
	            throw e;
	            }
	
           Thread.sleep(5000);

           logger1.pass("Testcase Downloads Negative is Passed");
	       }
           }
