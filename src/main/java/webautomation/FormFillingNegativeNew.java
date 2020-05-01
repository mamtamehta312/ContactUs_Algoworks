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

public class FormFillingNegativeNew extends WebCapabilities {
	
	@BeforeClass
	public static void init() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(properties.getProperty("form_url"));
	}

	@Test(priority=6)
	public static void NegativeFirstName() throws Exception {
		logger1 = extent.createTest("formFilling_firstname_negative");
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,400)", "up");

			Thread.sleep(2000);
			logger1.info("First name 'F' is typed in textbox");
			type("fFirstNameNeg_Xpath", "fFirstNameNeg");

			Thread.sleep(2000);

			logger1.info("Last name 'Testing' is typed in textbox ");
			type("fLastName_Xpath", "fLastName");

            Thread.sleep(3000);                                                                                                                                                             
			
			//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
			//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
			//type("fCountryCode_Xpath","fCountryCode");
			//Thread.sleep(3000);   

			logger1.info("Area code+phone is '9899928177' given in textbox ");
			type("fPhoneNumber_Xpath", "fPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

			
			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox ");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox ");
			type("fJobTitle_Xpath", "fJobTitle");

			Thread.sleep(2000);
			logger1.info("'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
	 
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
			
			//jse.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox 'Type you enquiry here'");
			type("fMessage_Xpath", "fMessage");

			//jse.executeScript("window.scrollBy(0,300)", "up");
			
			Thread.sleep(2000);
			logger1.info("'contact us' is clicked ");
			click("fContactUs_Xpath");
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			//jse.executeScript("window.scrollBy(0, -800)", "down");
			
			JavascriptExecutor jsf = (JavascriptExecutor) driver;
			jsf.executeScript("window.scrollBy(0,400)", "up");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String present = TxtBoxContent.getText();
			String expectedvalue = properties.getProperty("f_msg");
			Assert.assertEquals(present, expectedvalue);
		
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)", "up");

			Thread.sleep(2000);
			logger1.info("First name '!!' is typed in textbox");
			type("fFirstNameSpcl_Xpath", "fFirstNameSpcl");

			Thread.sleep(2000);
            logger1.info("Last name 'Testing' is typed in textbox ");
			type("fLastName_Xpath", "fLastName");

            Thread.sleep(3000); 
			logger1.info("Area code+phone is '9899928177' given in textbox ");
			type("fPhoneNumber_Xpath", "fPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox ");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox ");
			type("fJobTitle_Xpath", "fJobTitle");

			Thread.sleep(2000);
			logger1.info("'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
	        
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");

			//js.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox 'Type you enquiry here'");
			type("fMessage_Xpath", "fMessage");

			//js.executeScript("window.scrollBy(0,300)", "up");

			Thread.sleep(2000);
			logger1.info("'contact us' is clicked ");
			click("fContactUs_Xpath");
			
			Thread.sleep(2000);
			//js.executeScript("window.scrollBy(0, -800)", "down");
			
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("window.scrollBy(0,400)", "up");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Content = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String presents = Content.getText();
			String expectedvalues = properties.getProperty("f_msg");
			Assert.assertEquals(presents, expectedvalues);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			
			Thread.sleep(2000);
			JavascriptExecutor e = (JavascriptExecutor) driver;
			e.executeScript("window.scrollBy(0,400)", "up");

			Thread.sleep(2000);
			logger1.info("First name 'Form@' is typed in textbox");
			type("fFirstNameSpc_Xpath", "fFirstNameSpc");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox ");
			type("fLastName_Xpath", "fLastName");

            Thread.sleep(3000); 
            logger1.info("Area code+phone is '9899928177' given in textbox ");
			type("fPhoneNumber_Xpath", "fPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox ");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox ");
			type("fJobTitle_Xpath", "fJobTitle");

			Thread.sleep(2000);
			logger1.info("'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
	 
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");

			//e.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox 'Type you enquiry here'");
			type("fMessage_Xpath", "fMessage");

			//e.executeScript("window.scrollBy(0,300)", "up");
			
			Thread.sleep(2000);
			logger1.info("'contact us' is clicked ");
			click("fContactUs_Xpath");
			
			//e.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			JavascriptExecutor jss = (JavascriptExecutor) driver;
			jss.executeScript("window.scrollBy(0,400)", "up");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String error = text.getText();
			String expectedvalu = properties.getProperty("f_msg");
			Assert.assertEquals(error, expectedvalu);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			JavascriptExecutor ex = (JavascriptExecutor) driver;
			ex.executeScript("window.scrollBy(0,400)", "up");

			Thread.sleep(2000);
			logger1.info("First name '123456' is typed in textbox");
			type("fFirstNameNum_Xpath", "fFirstNameSpc");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox ");
			type("fLastName_Xpath", "fLastName");

            Thread.sleep(3000); 
            logger1.info("Area code+phone is '9899928177' given in textbox ");
			type("fPhoneNumber_Xpath", "fPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox ");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox ");
			type("fJobTitle_Xpath", "fJobTitle");

			Thread.sleep(2000);
			logger1.info("'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
	 
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");

			//ex.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox 'Type you enquiry here'");
			type("fMessage_Xpath", "fMessage");

			//ex.executeScript("window.scrollBy(0,300)", "up");
			
			Thread.sleep(2000);
			logger1.info("'contact us' is clicked ");
			click("fContactUs_Xpath");
			
			//ex.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			JavascriptExecutor eq = (JavascriptExecutor) driver;
			eq.executeScript("window.scrollBy(0,400)", "up");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement textbox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String errors = textbox.getText();
			String expectedval = properties.getProperty("f_msg");
			Assert.assertEquals(errors, expectedval);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");

			Thread.sleep(2000);
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			exe.executeScript("window.scrollBy(0,400)", "up");

			Thread.sleep(2000);
			logger1.info("First name ' ' is typed in textbox");
			type("fFirstNameBlank_Xpath", "fFirstNameBlank");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox ");
			type("fLastName_Xpath", "fLastName");

            Thread.sleep(3000); 
            logger1.info("Area code+phone is '9899928177' given in textbox ");
			type("fPhoneNumber_Xpath", "fPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox ");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox ");
			type("fJobTitle_Xpath", "fJobTitle");

			Thread.sleep(2000);
			logger1.info("'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
	 
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");

			//exe.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox 'Type you enquiry here'");
			type("fMessage_Xpath", "fMessage");

			//exe.executeScript("window.scrollBy(0,300)", "up");
			
			Thread.sleep(2000);
			logger1.info("'contact us' is clicked ");
			click("fContactUs_Xpath");
			
			//exe.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			JavascriptExecutor eqq = (JavascriptExecutor) driver;
			eqq.executeScript("window.scrollBy(0,400)", "up");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String err = texts.getText();
			String expectedva = properties.getProperty("f_msg");
			Assert.assertEquals(err, expectedva);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
			
			Thread.sleep(2000);
			JavascriptExecutor exeq = (JavascriptExecutor) driver;
			exeq.executeScript("window.scrollBy(0,400)", "up");

			Thread.sleep(2000);
			logger1.info("First name 'Form1234' is typed in textbox");
			type("fFirstNameAlphdigit_Xpath", "fFirstNameAlphdigit");

			Thread.sleep(2000);
			logger1.info("Last name 'Testing' is typed in textbox ");
			type("fLastName_Xpath", "fLastName");

            Thread.sleep(3000); 
            logger1.info("Area code+phone is '9899928177' given in textbox ");
			type("fPhoneNumber_Xpath", "fPhoneNumber");

			Thread.sleep(2000);
			logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox ");
			type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

			Thread.sleep(2000);
			logger1.info("Company 'Algoworks' given in textbox ");
			type("fCompany_Xpath", "fCompany");

			Thread.sleep(2000);
			logger1.info("Job Title 'Automation QA' given in textbox ");
			type("fJobTitle_Xpath", "fJobTitle");

			Thread.sleep(2000);
			logger1.info("'United States' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
	 
			Thread.sleep(2000);
			logger1.info("State 'Alabama' is selected");
			driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
			
			Thread.sleep(2000);
			logger1.info("City name 'Noida' given in textbox");
			type("fCity_Xpath", "fCity");

			Thread.sleep(2000);
			logger1.info("'Reason for inquiry' is given in textbox");
			driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");

			//exeq.executeScript("window.scrollBy(0,100)", "up");

			Thread.sleep(2000);
			logger1.info("Message is displayed in textbox 'Type you enquiry here'");
			type("fMessage_Xpath", "fMessage");

			//exeq.executeScript("window.scrollBy(0,300)", "up");
			
			Thread.sleep(2000);
			logger1.info("'contact us' is clicked ");
			click("fContactUs_Xpath");
			
			//exeq.executeScript("window.scrollBy(0, -800)", "down");
			
			Thread.sleep(2000);
			JavascriptExecutor q = (JavascriptExecutor) driver;
			q.executeScript("window.scrollBy(0,400)", "up");
			
			Thread.sleep(2000);
			logger1.info("Checked error text on submission");
			WebElement Box = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/div[2]"));
			String bug = Box.getText();
			String expectedv = properties.getProperty("f_msg");
			Assert.assertEquals(bug, expectedv);
			
			driver.navigate().refresh();
			logger1.info("------------------------------------------------------------");
		
		}

		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}
		
		@Test(priority=2)
		public static void NegativeLastName() throws Exception {
			logger1 = extent.createTest("formFilling_lastname_negative");
			try {

				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'T' is typed in textbox ");
				type("fLastNameNeg_Xpath", "fLastNameNeg");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jsf = (JavascriptExecutor) driver;
				jsf.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
				String present = TxtBoxContent.getText();
				String expectedvalue = properties.getProperty("f_msg");
				Assert.assertEquals(present, expectedvalue);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name '!!' is typed in textbox ");
				type("fLastNameSpcl_Xpath", "fLastNameSpcl");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Content = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
				String presents = Content.getText();
				String expectedvalu = properties.getProperty("f_msg");
				Assert.assertEquals(presents, expectedvalu);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor jexe = (JavascriptExecutor) driver;
				jexe.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing@' is typed in textbox ");
				type("fLastNameSpc_Xpath", "fLastNameSpc");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor ex = (JavascriptExecutor) driver;
				ex.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Contents = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
				String error = Contents.getText();
				String expectedval = properties.getProperty("f_msg");
				Assert.assertEquals(error, expectedval);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name '123456' is typed in textbox ");
				type("fLastNameNum_Xpath", "fLastNameNum");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor java = (JavascriptExecutor) driver;
				java.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Cont = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
				String errors = Cont.getText();
				String expectedva = properties.getProperty("f_msg");
				Assert.assertEquals(errors, expectedva);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor exmp = (JavascriptExecutor) driver;
				exmp.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name ' ' is typed in textbox ");
				type("fLastNameBlank_Xpath", "fLastNameBlank");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor javas = (JavascriptExecutor) driver;
				javas.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
				String err = Text.getText();
				String expectedv = properties.getProperty("f_msg");
				Assert.assertEquals(err, expectedv);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor scroll = (JavascriptExecutor) driver;
				scroll.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing1234' is typed in textbox ");
				type("fLastNameAlphdigit_Xpath", "fLastNameAlphdigit");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor ja = (JavascriptExecutor) driver;
				ja.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/div[2]"));
				String er = Texts.getText();
				String expected = properties.getProperty("f_msg");
				Assert.assertEquals(er, expected);
				
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
		public static void NegativePhoneNumber() throws Exception {
			logger1 = extent.createTest("formFilling_PhoneNumber_negative");
			try {

				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '123456' given in textbox ");
				type("fPhoneNumberNeg_Xpath", "fPhoneNumberNeg");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jsf = (JavascriptExecutor) driver;
				jsf.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
				String present = TxtBoxContent.getText();
				String expectedvalue = properties.getProperty("f_phonemsg");
				Assert.assertEquals(present, expectedvalue);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '12345@' given in textbox ");
				type("fPhoneNumberSpcl_Xpath", "fPhoneNumberSpcl");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jf = (JavascriptExecutor) driver;
				jf.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
				String presents = TxtBox.getText();
				String expectedvalu = properties.getProperty("f_phonemsg");
				Assert.assertEquals(presents, expectedvalu);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor e = (JavascriptExecutor) driver;
				e.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '12345678#' given in textbox ");
				type("fPhoneNumberSpc_Xpath", "fPhoneNumberSpc");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Txt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
				String errors = Txt.getText();
				String expectedval = properties.getProperty("f_phonemsg");
				Assert.assertEquals(errors, expectedval);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor jex = (JavascriptExecutor) driver;
				jex.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is ' ' given in textbox ");
				type("fPhoneNumberBlank_Xpath", "fPhoneNumberBlank");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor f = (JavascriptExecutor) driver;
				f.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
				String err = Text.getText();
				String expectedva = properties.getProperty("f_phonemsg");
				Assert.assertEquals(err, expectedva);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor jexe = (JavascriptExecutor) driver;
				jexe.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '!@#$%^&*' given in textbox ");
				type("fPhoneNumberAllspcl_Xpath", "fPhoneNumberAllspcl");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor script = (JavascriptExecutor) driver;
				script.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Te = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
				String erro = Te.getText();
				String expected = properties.getProperty("f_phonemsg");
				Assert.assertEquals(erro, expected);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor jexec = (JavascriptExecutor) driver;
				jexec.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is 'abcdefghi' given in textbox ");
				type("fPhoneNumberAllAlph_Xpath", "fPhoneNumberAllAlph");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks.com' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor scripts = (JavascriptExecutor) driver;
				scripts.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Tex = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div/div/div[2]"));
				String ek = Tex.getText();
				String expecte = properties.getProperty("f_phonemsg");
				Assert.assertEquals(ek, expecte);
				
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
		public static void NegativeEmail() throws Exception {
			logger1 = extent.createTest("formFilling_email_negative");
			try {

				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'dumpings@fake.com' typed in textbox");
				type("fBusinessEmailAddressFake_Xpath", "fBusinessEmailAddressFake");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jsf = (JavascriptExecutor) driver;
				jsf.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
				String present = TxtBoxContent.getText();
				String expectedvalue = properties.getProperty("f_emailmsg");
				Assert.assertEquals(present, expectedvalue);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address '1234567@fake.com' typed in textbox");
				type("fBusinessEmailAddressNFake_Xpath", "fBusinessEmailAddressNFake");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
				String presents = TxtBox.getText();
				String expectedvalu = properties.getProperty("f_emailmsg");
				Assert.assertEquals(presents, expectedvalu);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor jx = (JavascriptExecutor) driver;
				jx.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address '!@#$%^&*s@fake.com' typed in textbox");
				type("fBusinessEmailAddressSFake_Xpath", "fBusinessEmailAddressSFake");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jexec = (JavascriptExecutor) driver;
				jexec.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Txt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
				String pre = Txt.getText();
				String expectedval = properties.getProperty("f_emailmsg");
				Assert.assertEquals(pre, expectedval);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
		
				JavascriptExecutor e = (JavascriptExecutor) driver;
				e.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'dumpings125543@fake.com' typed in textbox");
				type("fBusinessEmailAddressMixFake_Xpath", "fBusinessEmailAddressMixFake");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jexc = (JavascriptExecutor) driver;
				jexc.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
				String errors = Text.getText();
				String expectedva = properties.getProperty("f_emailmsg");
				Assert.assertEquals(errors, expectedva);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor exx = (JavascriptExecutor) driver;
				exx.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address '123456789' typed in textbox");
				type("fBusinessEmailAddressNumber_Xpath", "fBusinessEmailAddressNumber");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jc = (JavascriptExecutor) driver;
				jc.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Textcontent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
				String error = Textcontent.getText();
				String expectedv = properties.getProperty("f_emailmsg");
				Assert.assertEquals(error, expectedv);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor script = (JavascriptExecutor) driver;
				script.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'dumpings' typed in textbox");
				type("fBusinessEmailAddressAlphs_Xpath", "fBusinessEmailAddressAlphs");

				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor c = (JavascriptExecutor) driver;
				c.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement contnt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[3]/div[2]"));
				String err = contnt.getText();
				String expected = properties.getProperty("f_emailmsg");
				Assert.assertEquals(err, expected);
				
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
		public static void NegativeCompany() throws Exception {
			logger1 = extent.createTest("formFilling_company_negative");
			try {

				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'A' given in textbox ");
				type("fCompanySChar_Xpath", "fCompanySChar");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jsf = (JavascriptExecutor) driver;
				jsf.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[4]/div[2]"));
				String present = TxtBoxContent.getText();
				String expectedValue = properties.getProperty("f_companymsg");
				Assert.assertEquals(present, expectedValue);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company '1234' given in textbox ");
				type("fCompanyNum_Xpath", "fCompanyNum");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor f = (JavascriptExecutor) driver;
				f.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Content = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[4]/div[2]"));
				String presents = Content.getText();
				String expectedValu = properties.getProperty("f_companymsg");
				Assert.assertEquals(presents, expectedValu);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor script = (JavascriptExecutor) driver;
				script.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company '!@#$' given in textbox ");
				type("fCompanySpecialChar_Xpath", "fCompanySpecialChar");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor scr = (JavascriptExecutor) driver;
				scr.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Contents = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[4]/div[2]"));
				String pre = Contents.getText();
				String expectedVal = properties.getProperty("f_companymsg");
				Assert.assertEquals(pre, expectedVal);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor scripts = (JavascriptExecutor) driver;
				scripts.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company ' ' given in textbox ");
				type("fCompanyBlank_Xpath", "fCompanyBlank");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor scri = (JavascriptExecutor) driver;
				scri.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[4]/div[2]"));
				String error = Text.getText();
				String expectedVa = properties.getProperty("f_companymsg");
				Assert.assertEquals(error, expectedVa);
				
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
		public static void NegativeJobTitle() throws Exception {
			logger1 = extent.createTest("formFilling_JobTitle_negative");
			try {

				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'A' given in textbox ");
				type("fJobTitleNeg_Xpath", "fJobTitleNeg");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jsf = (JavascriptExecutor) driver;
				jsf.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
				String present = TxtBoxContent.getText();
				String expectedValue = properties.getProperty("f_msg");
				Assert.assertEquals(present, expectedValue);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title '@@' given in textbox ");
				type("fJobTitleSpcl_Xpath", "fJobTitleSpcl");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
				String presents = TxtBox.getText();
				String expectedValu = properties.getProperty("f_msg");
				Assert.assertEquals(presents, expectedValu);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation!' given in textbox ");
				type("fJobTitleSpc_Xpath", "fJobTitleSpc");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor script = (JavascriptExecutor) driver;
				script.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Txt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
				String error = Txt.getText();
				String expectedVal = properties.getProperty("f_msg");
				Assert.assertEquals(error, expectedVal);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor ex = (JavascriptExecutor) driver;
				ex.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title '123456' given in textbox ");
				type("fJobTitleNum_Xpath", "fJobTitleNum");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor scripts = (JavascriptExecutor) driver;
				scripts.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
				String errors = Text.getText();
				String expectedVa = properties.getProperty("f_msg");
				Assert.assertEquals(errors, expectedVa);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor exx = (JavascriptExecutor) driver;
				exx.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title ' ' given in textbox ");
				type("fJobTitleBlank_Xpath", "fJobTitleBlank");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor scri = (JavascriptExecutor) driver;
				scri.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TextContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
				String err = TextContent.getText();
				String expectedV = properties.getProperty("f_msg");
				Assert.assertEquals(err, expectedV);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor x = (JavascriptExecutor) driver;
				x.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation1234' given in textbox ");
				type("fJobTitleAlphdigit_Xpath", "fJobTitleAlphdigit");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor sc = (JavascriptExecutor) driver;
				sc.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TextContents = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[5]/div[2]"));
				String errs = TextContents.getText();
				String expected = properties.getProperty("f_msg");
				Assert.assertEquals(errs, expected);
				
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
		public static void NegativeCountry() throws Exception {
			logger1 = extent.createTest("formFilling_country_negative");
			try {

				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info(" ' ' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys(" ");
		 
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jsf = (JavascriptExecutor) driver;
				jsf.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/div"));
				String present = TxtBoxContent.getText();
				String expectedValue = properties.getProperty("f_countrymsg");
				Assert.assertEquals(present, expectedValue);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State ' ' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys(" ");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/div"));
				String presents = TxtBox.getText();
				String expectedValu = properties.getProperty("f_statemsg");
				Assert.assertEquals(presents, expectedValu);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				
				JavascriptExecutor jx = (JavascriptExecutor) driver;
				jx.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'Canada' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("Canada");
		 
				Thread.sleep(2000);
				logger1.info("Province ' ' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[8]/span/span")).sendKeys(" ");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida' given in textbox");
				type("fCity_Xpath", "fCity");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor x = (JavascriptExecutor) driver;
				x.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[8]/div"));
				String error = TextBox.getText();
				String expectedVal = properties.getProperty("f_provincemsg");
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
		@Test(priority=8)
		public static void NegativeCity() throws Exception {
			logger1 = extent.createTest("formFilling_city_negative");
			try {

				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'N' given in textbox");
				type("fCityNeg_Xpath", "fCityNeg");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor jsf = (JavascriptExecutor) driver;
				jsf.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[9]/div[2]"));
				String present = TxtBoxContent.getText();
				String expectedVal = properties.getProperty("f_msg");
				Assert.assertEquals(present, expectedVal);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor se = (JavascriptExecutor) driver;
				se.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name '@@' given in textbox");
				type("fCitySpcl_Xpath", "fCitySpcl");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Content = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[9]/div[2]"));
				String presents = Content.getText();
				String expectedVa = properties.getProperty("f_msg");
				Assert.assertEquals(presents, expectedVa);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor e = (JavascriptExecutor) driver;
				e.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida%' given in textbox");
				type("fCitySpc_Xpath", "fCitySpc");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor s = (JavascriptExecutor) driver;
				s.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Text = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[9]/div[2]"));
				String error = Text.getText();
				String expectedV = properties.getProperty("f_msg");
				Assert.assertEquals(error, expectedV);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor ex = (JavascriptExecutor) driver;
				ex.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name '123456' given in textbox");
				type("fCityNum_Xpath", "fCityNum");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor script = (JavascriptExecutor) driver;
				script.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Texts = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[9]/div[2]"));
				String errors = Texts.getText();
				String expected = properties.getProperty("f_msg");
				Assert.assertEquals(errors, expected);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name ' ' given in textbox");
				type("fCityBlank_Xpath", "fCityBlank");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor scripts = (JavascriptExecutor) driver;
				scripts.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement Txt = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[9]/div[2]"));
				String err = Txt.getText();
				String expectedValue = properties.getProperty("f_msg");
				Assert.assertEquals(err, expectedValue);
						
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
				JavascriptExecutor exec = (JavascriptExecutor) driver;
				exec.executeScript("window.scrollBy(0,400)", "up");

				Thread.sleep(2000);
				logger1.info("First name 'Form' is typed in textbox");
				type("fFirstName_Xpath", "fFirstName");

				Thread.sleep(2000);

				logger1.info("Last name 'Testing' is typed in textbox ");
				type("fLastName_Xpath", "fLastName");

	            Thread.sleep(3000);                                                                                                                                                             
				
				//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
				//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
				//type("fCountryCode_Xpath","fCountryCode");
				//Thread.sleep(3000);   

				logger1.info("Area code+phone is '9899928177' given in textbox ");
				type("fPhoneNumber_Xpath", "fPhoneNumber");

				Thread.sleep(2000);
				logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
				type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

				
				Thread.sleep(2000);
				logger1.info("Company 'Algoworks' given in textbox ");
				type("fCompany_Xpath", "fCompany");

				Thread.sleep(2000);
				logger1.info("Job Title 'Automation QA' given in textbox ");
				type("fJobTitle_Xpath", "fJobTitle");

				Thread.sleep(2000);
				logger1.info("'United States' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
		 
				Thread.sleep(2000);
				logger1.info("State 'Alabama' is selected");
				driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
				
				Thread.sleep(2000);
				logger1.info("City name 'Noida1234' given in textbox");
				type("fCityAlphdigit_Xpath", "fCityAlphdigit");

				Thread.sleep(2000);
				logger1.info("'Reason for inquiry' is given in textbox");
				driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
				
				//jse.executeScript("window.scrollBy(0,100)", "up");

				Thread.sleep(2000);
				logger1.info("Message is displayed in textbox 'Type you enquiry here'");
				type("fMessage_Xpath", "fMessage");

				//jse.executeScript("window.scrollBy(0,300)", "up");
				
				Thread.sleep(2000);
				logger1.info("'contact us' is clicked ");
				click("fContactUs_Xpath");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				//jse.executeScript("window.scrollBy(0, -800)", "down");
				
				JavascriptExecutor scri = (JavascriptExecutor) driver;
				scri.executeScript("window.scrollBy(0,400)", "up");
				
				Thread.sleep(2000);
				logger1.info("Checked error text on submission");
				WebElement T = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[9]/div[2]"));
				String errs = T.getText();
				String expectedValu = properties.getProperty("f_msg");
				Assert.assertEquals(errs, expectedValu);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				logger1.info("------------------------------------------------------------");
				
			}
		
			catch (Exception e) {
				logger1.fail(e);
				throw e;
			}
		}
			
			@Test(priority=9)
			public static void NegativeReasonforInquiry() throws Exception {
				logger1 = extent.createTest("formFilling_ReasonForInquiry_negative");
				try {

					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("window.scrollBy(0,400)", "up");

					Thread.sleep(2000);
					logger1.info("First name 'Form' is typed in textbox");
					type("fFirstName_Xpath", "fFirstName");

					Thread.sleep(2000);

					logger1.info("Last name 'Testing' is typed in textbox ");
					type("fLastName_Xpath", "fLastName");

		            Thread.sleep(3000);                                                                                                                                                             
					
					//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
					//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
					//type("fCountryCode_Xpath","fCountryCode");
					//Thread.sleep(3000);   

					logger1.info("Area code+phone is '9899928177' given in textbox ");
					type("fPhoneNumber_Xpath", "fPhoneNumber");

					Thread.sleep(2000);
					logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
					type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

					
					Thread.sleep(2000);
					logger1.info("Company 'Algoworks' given in textbox ");
					type("fCompany_Xpath", "fCompany");

					Thread.sleep(2000);
					logger1.info("Job Title 'Automation QA' given in textbox ");
					type("fJobTitle_Xpath", "fJobTitle");

					Thread.sleep(2000);
					logger1.info("'United States' is selected");
					driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("United States");
			 
					Thread.sleep(2000);
					logger1.info("State 'Alabama' is selected");
					driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[7]/span/span")).sendKeys("Alabama");
					
					Thread.sleep(2000);
					logger1.info("City name 'Noida' given in textbox");
					type("fCity_Xpath", "fCity");

					Thread.sleep(2000);
					logger1.info("' ' is given in textbox");
					driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys(" ");
					
					//jse.executeScript("window.scrollBy(0,100)", "up");

					Thread.sleep(2000);
					logger1.info("Message is displayed in textbox 'Type you enquiry here'");
					type("fMessage_Xpath", "fMessage");

					//jse.executeScript("window.scrollBy(0,300)", "up");
					
					Thread.sleep(2000);
					logger1.info("'contact us' is clicked ");
					click("fContactUs_Xpath");
					Thread.sleep(2000);
					
					Thread.sleep(2000);
					//jse.executeScript("window.scrollBy(0, -800)", "down");
					
					JavascriptExecutor jsf = (JavascriptExecutor) driver;
					jsf.executeScript("window.scrollBy(0,400)", "up");
					
					Thread.sleep(2000);
					logger1.info("Checked error text on submission");
					WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[10]/div"));
					String present = TxtBoxContent.getText();
					String expectedValues = properties.getProperty("f_reasonmsg");
					Assert.assertEquals(present, expectedValues);
					
					Thread.sleep(2000);
					driver.navigate().refresh();
					logger1.info("------------------------------------------------------------");
				}
				catch (Exception e) {
					logger1.fail(e);
					throw e;
				}
			}
			@Test(priority=10)
			public static void NegativeGDPRCountry() throws Exception {
				logger1 = extent.createTest("formFilling_GDPRCountry_negative");
				try {

					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("window.scrollBy(0,400)", "up");

					Thread.sleep(2000);
					logger1.info("First name 'Form' is typed in textbox");
					type("fFirstName_Xpath", "fFirstName");

					Thread.sleep(2000);

					logger1.info("Last name 'Testing' is typed in textbox ");
					type("fLastName_Xpath", "fLastName");

		            Thread.sleep(3000);                                                                                                                                                             
					
					//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
					//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
					//type("fCountryCode_Xpath","fCountryCode");
					//Thread.sleep(3000);   

					logger1.info("Area code+phone is '9899928177' given in textbox ");
					type("fPhoneNumber_Xpath", "fPhoneNumber");

					Thread.sleep(2000);
					logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
					type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

					
					Thread.sleep(2000);
					logger1.info("Company 'Algoworks' given in textbox ");
					type("fCompany_Xpath", "fCompany");

					Thread.sleep(2000);
					logger1.info("Job Title 'Automation QA' given in textbox ");
					type("fJobTitle_Xpath", "fJobTitle");

					Thread.sleep(2000);
					logger1.info("'United Kingdom' is selected");
					driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("UNITED KINGDOM");
			 
					Thread.sleep(2000);
					logger1.info("City name 'Noida' given in textbox");
					type("fCity_Xpath", "fCity");

					Thread.sleep(2000);
					logger1.info("'Reason for inquiry' is given in textbox");
					driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
					
					//jse.executeScript("window.scrollBy(0,100)", "up");

					Thread.sleep(2000);
					logger1.info("Message is displayed in textbox 'Type you enquiry here'");
					type("fMessage_Xpath", "fMessage");

					//jse.executeScript("window.scrollBy(0,300)", "up");
					
					Thread.sleep(2000);
					logger1.info("'contact us' is clicked ");
					click("fContactUs_Xpath");
					Thread.sleep(2000);
					
					Thread.sleep(2000);
					//jse.executeScript("window.scrollBy(0, -800)", "down");
					
					JavascriptExecutor jsf = (JavascriptExecutor) driver;
					jsf.executeScript("window.scrollBy(0,400)", "up");
					
					Thread.sleep(2000);
					logger1.info("Checked error text on submission");
					WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[12]/div/div/div[2]/div"));
					String present = TxtBoxContent.getText();
					String expectedValues = properties.getProperty("f_ppmsg");
					Assert.assertEquals(present, expectedValues);
					
					Thread.sleep(2000);
					driver.navigate().refresh();
					logger1.info("------------------------------------------------------------");
					
					JavascriptExecutor jex = (JavascriptExecutor) driver;
					jex.executeScript("window.scrollBy(0,400)", "up");

					Thread.sleep(2000);
					logger1.info("First name 'Form' is typed in textbox");
					type("fFirstName_Xpath", "fFirstName");

					Thread.sleep(2000);

					logger1.info("Last name 'Testing' is typed in textbox ");
					type("fLastName_Xpath", "fLastName");

		            Thread.sleep(3000);                                                                                                                                                             
					
					//logger1.info("Country code '+91' for country 'UK (+44)' is selected");
					//driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/span")).sendKeys("UK (+44)");
					//type("fCountryCode_Xpath","fCountryCode");
					//Thread.sleep(3000);   

					logger1.info("Area code+phone is '9899928177' given in textbox ");
					type("fPhoneNumber_Xpath", "fPhoneNumber");

					Thread.sleep(2000);
					logger1.info("Business Email Address 'poonam.gupta@algoworks' typed in textbox");
					type("fBusinessEmailAddress_Xpath", "fBusinessEmailAddress");

					
					Thread.sleep(2000);
					logger1.info("Company 'Algoworks' given in textbox ");
					type("fCompany_Xpath", "fCompany");

					Thread.sleep(2000);
					logger1.info("Job Title 'Automation QA' given in textbox ");
					type("fJobTitle_Xpath", "fJobTitle");

					Thread.sleep(2000);
					logger1.info("'FRANCE' is selected");
					driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[6]/span/span")).sendKeys("FRANCE");
			 
					Thread.sleep(2000);
					logger1.info("City name 'Noida' given in textbox");
					type("fCity_Xpath", "fCity");

					Thread.sleep(2000);
					logger1.info("'Reason for inquiry' is given in textbox");
					driver.findElement(By.xpath("//*[@id='contactUsReasonforInquirySelectBoxIt']")).sendKeys("Sales Inquiry");
					
					//jse.executeScript("window.scrollBy(0,100)", "up");

					Thread.sleep(2000);
					logger1.info("Message is displayed in textbox 'Type you enquiry here'");
					type("fMessage_Xpath", "fMessage");

					//jse.executeScript("window.scrollBy(0,300)", "up");
					
					Thread.sleep(2000);
					logger1.info("'contact us' is clicked ");
					click("fContactUs_Xpath");
					Thread.sleep(2000);
					
					Thread.sleep(2000);
					//jse.executeScript("window.scrollBy(0, -800)", "down");
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,400)", "up");
					
					Thread.sleep(2000);
					logger1.info("Checked error text on submission");
					WebElement TxtBox = driver.findElement(By.xpath("//*[@id=\"global-content\"]/div[3]/div[1]/section/div/form/div[12]/div/div/div[2]/div"));
					String error = TxtBox.getText();
					String expectedValue = properties.getProperty("f_ppmsg");
					Assert.assertEquals(error, expectedValue);
					
					Thread.sleep(2000);
					driver.navigate().refresh();
					logger1.info("------------------------------------------------------------");
				}
				catch (Exception e) {
					logger1.fail(e);
					throw e;
				}
				
			Thread.sleep(3000);
		logger1.pass("Testcase FormFilling Negative is Passed");
	}
}