package webautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.WebCapabilities;
import io.appium.java_client.MobileElement;

public class FormFilling extends WebCapabilities
		 {
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID")));
		
		
		@Test()
		public static void validLogin() throws Exception {
			logger1 = extent.createTest("login");
			try {
				 
				Thread.sleep(1000);
				
			
				
				Thread.sleep(2000);
				logger1.info("First name 'Bob' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[1]/div/input'");
				type("FirstName_Xpath", "FirstName");
				
				Thread.sleep(2000);
				
				logger1.info("Last name 'Jackson' is typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[1]/div[2]/div/input'");
				type("LastName_Xpath", "LastName");
				
				
				Thread.sleep(2000);
				logger1.info("Country code '+91' for country 'UK' is selected");
		/*        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
				jse1.executeScript("window.scrollBy(0,100)", "up");*/
				WebElement s = driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[2]/div[1]/div/span/select"));
				Select jobType = new Select(s);
				jobType.selectByVisibleText("UK (+44)");
				

				Thread.sleep(3000);
			
				Thread.sleep(2000);
				logger1.info("Area code+phone is '9899928177' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[2]/div[2]/div/label'");
				type("PhoneNumber_Xpath", "PhoneNumber");
				
				Thread.sleep(2000);
				logger1.info("Business Email Address 'Bob.Jackson@gmail.com' typed in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[3]'");
				type("BusinessEmailAddress_Xpath", "BusinessEmailAddress"); 
				
				    Thread.sleep(2000);
					logger1.info("Company 'Algoworks' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[4]/input'");
					type("Company_Xpath", "Company");
						
					
					Thread.sleep(2000);	
					logger1.info("Job Title 'Software Test Engineer' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[5]/input'");
					type("JobTitle_Xpath", "JobTitle");
						

					Thread.sleep(2000);	
					
					Thread.sleep(2000);	
					logger1.info("Country name 'CANADA' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[6]/span/span'");
					//type("Country2_Xpath", "Country2");
					JavascriptExecutor jse2 = (JavascriptExecutor) driver;
					jse2.executeScript("window.scrollBy(0,100)", "up");
					
				
					
					WebElement s1 = driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[6]/span/select"));
				    Select jobType1 = new Select(s1);
					Thread.sleep(2000);
					jobType1.selectByValue("United Kingdom");
					

					Thread.sleep(2000);	
					logger1.info("City name 'Noida' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
					type("City_Xpath", "City");
					
					Thread.sleep(2000);	
					//logger1.info("'Job inquiry' is given in textbox ' ' for reason for inquiry");
					//type("JobInquiry_Xpath", "JobInquiry");
					logger1.info("'Reason for inquiry' is given in textbox '//*[@id='contactUsReasonforInquiry']'");
					WebElement s3 = driver.findElement(By.xpath("//*[@id='contactUsReasonforInquiry']"));
					Select jobType3 = new Select(s3);
					jobType3.selectByVisibleText("Sales Inquiry");
							
					
					
					Thread.sleep(2000);	
					logger1.info("City name 'Noida' given in textbox '//*[@id=global-content]/div[3]/div[1]/section/div/form/div[9]/input'");
					type("Message_Xpath", "Message");
				
					
					jse2.executeScript("window.scrollBy(0,300)", "up");
					Thread.sleep(2000);	
					logger1.info("'contact us' is clicked having id '//*[@id='global-content']/div[3]/div[1]/section/div/form/div[13]/button'");
					driver.findElement(By.xpath("//*[@id='global-content']/div[3]/div[1]/section/div/form/div[13]/button")).click();
					
					Thread.sleep(3000);
				

				logger1.pass("Testcase is Passed");
			}                                                                                                                                                     

			catch (Exception e) {
				logger1.fail(e);
				captureScreenShots("ErrorScreenshot.png");                                
				throw e;
			}

		}
	}

