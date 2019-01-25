package project;

import java.nio.file.FileSystems;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Capabilities;

public class AddClaim3 extends Capabilities {
	@Test()
	public void AddClaim() throws Exception {

		try {
			Login2.validLogin();

			logger1 = extent.createTest("Sumbit Claim");

			Thread.sleep(1000);
			logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
			click("MembershipOption_Xpath");
		
			Thread.sleep(1000);
			logger1.info("Claims option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/ul/li[3]/a\" is clicked");
			click("ClaimOption_Xpath");
			
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = findElement("SumbitClaim_Xpath");
			// This will scroll the page Horizontally till the element is found
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			logger1.info(" sumbit a new Claim option \"claims-submit\" is clicked");
			Thread.sleep(3000);
			Element.click();
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,500)", "down");
			
			
			Thread.sleep(5000);
			logger1.info("search box '//button/span[@class=\"fa fa-search\"]' clicked");
			 List<WebElement> myList=driver.findElements(By.xpath("//span[@class='fa fa-search']"));
			 myList.get(1).click();
			 
			 Thread.sleep(5000);
			logger1.info("Select Button '//button[@class=\"primary btn btn-primary\"]' clicked");
			click("SelectButton_Xpath");
			
			Thread.sleep(3000);
			logger1.info(" attach pdf file is choosen");
//			String absolutePath = FileSystems.getDefault().Capabilities.getPropertyValue("pathForPdf").normalize()
//					.toAbsolutePath().toString();
//
//			Cababilities.getElementByXpath("//*[@id=\'example\']").sendKeys(absolutePath);
					
			String filePath = System.getProperty("user.dir") +  "/src/main/resources/pdf/pdfurl-guide.pdf";
			driver.findElement(By.xpath("//*[@id=\"AttachFile\"]")).sendKeys(filePath);
			
			Thread.sleep(1000);
			logger1.info(" click on sumbit the claim");
			click("Insert_Xpath");

			
			
			
			
			
			
			Thread.sleep(5000);
			logger1 = extent.createTest("Sumbit complaints");
			logger1.info(" click on support button");
			click("Support_Xpath");
			Thread.sleep(1000);
			
			logger1.info(" click on complaints/compliments button");
			click("Complaints_Xpath");
			Thread.sleep(2000);
			logger1.info(" click on sumbit a complaints/compliments button");
			click("SumbitComplaintsCompliments_Xpath");
			Thread.sleep(2000);
			WebElement a = findElement("Frame_Xpath");
			driver.switchTo().frame(a);
			
			Thread.sleep(2000);
			logger1.info("title \"Complaint Title\" is typed in textbox \"//*[@id=\\\"title\\\"]\"");
			type("Title_Xpath","ComplaintTitle");
			
			Thread.sleep(1000);
			logger1.info("type textbox '//*[@id=\"ks_queriytype\"]' is clicked");
			Select sel = new Select(findElement("TypeTextbox_Xpath"));
			sel.selectByVisibleText("Complaint");
			
			
			Thread.sleep(2000);
			logger1.info("Description is typed in textbox //*[@id=\"description\"] is clicked");
			type("Description_Xpath","Description");
			
			Thread.sleep(3000);
			logger1.info(" attach pdf file is choosen");
			String filePath1 = System.getProperty("user.dir") +  "/src/main/resources/pdf/pdfurl-guide.pdf";
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"AttachFile\"]")).sendKeys(filePath1);
			
			Thread.sleep(1000);
			logger1.info("Sumbit button is clicked");
			click("SumbitButton_Xpath");
			
			driver.switchTo().defaultContent();

			jse.executeScript("window.scrollBy(0,800)", "down");
			
			
			
			
			
			
			Thread.sleep(1000);
			logger1 = extent.createTest("View Complaints");
			logger1.info("complaint is viewed after click toggle bar '//*[@id=\"accordion1\"]/div[1]/div[1]/h4/a/i'");
			click("Claim1_Xpath");
//			driver.findElement( 
//					By.xpath("//table[contains(@class, 'table table-striped table-fluid')]/tbody/tr[1]/td[5]")).click();
			//*[@id="portalPage"]/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr/td[5]/div/button/span
			
			Thread.sleep(1000);
//			logger1.info("complaint 2 is viewed after click toggle bar '//*[@id=\"accordion1\"]/div[2]/div[1]/h4/a/i'");
//			click("Claim2_Xpath");
			driver.findElement(By
					.xpath("//*[@id=\"portalPage\"]/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr/td[5]/div/ul/li/a"))
					.click();
			Thread.sleep(1000);
			logger1.info("complaint 3 is viewed after click toggle bar '//*[@id=\"accordion1\"]/div[3]/div[1]/h4/a/i'");
			click("Claim3_Xpath");
			
			logger1.info("cross option is clicked");
			driver.findElement(
					By.xpath("//*[@id=\"portalPage\"]/div/div[2]/div/div[2]/div/div[10]/div/div/div[1]/button/span[1]"))
					.click();
			//*[@id="portalPage"]/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr[1]
			// driver.switchTo().defaultContent();
			Thread.sleep(2000);

			logger1.pass("Testcase is Passed");
		}

		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}
}
