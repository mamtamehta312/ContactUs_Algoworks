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

public class FormFillingNegative extends WebCapabilities {
	
//	@BeforeClass
//	public static void init() {
		
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	driver.navigate().to(properties.getProperty("form_url"));
	//}

	@Test(priority=3)
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
			Assert.assertEquals(present, "Must contain 2-50 characters.");
			
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
			Assert.assertEquals(presents, "Must contain 2-50 characters.");
			
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
			Assert.assertEquals(error, "Must contain 2-50 characters.");
			
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
			Assert.assertEquals(errors, "Must contain 2-50 characters.");
			
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
			Assert.assertEquals(err, "Must contain 2-50 characters.");
			
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
			Assert.assertEquals(bug, "Must contain 2-50 characters.");
			
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
				Assert.assertEquals(present, "Must contain 2-50 characters.");
				
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
				Assert.assertEquals(presents, "Must contain 2-50 characters.");
				
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
				Assert.assertEquals(error, "Must contain 2-50 characters.");
				
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
				Assert.assertEquals(errors, "Must contain 2-50 characters.");
				
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
				Assert.assertEquals(err, "Must contain 2-50 characters.");
				
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
				Assert.assertEquals(er, "Must contain 2-50 characters.");
				
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
				Assert.assertEquals(present, "Must contain numerical characters.");
				
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
				Assert.assertEquals(presents, "Must contain numerical characters.");
				
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
				Assert.assertEquals(errors, "Must contain numerical characters.");
				
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
				Assert.assertEquals(err, "Must contain numerical characters.");
				
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
				Assert.assertEquals(erro, "Must contain numerical characters.");
				
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
				Assert.assertEquals(ek, "Must contain numerical characters.");
				
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
