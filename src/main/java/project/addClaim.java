package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Capabilities;

public class addClaim extends Capabilities {
	@Test()
	public void AddClaim() throws Exception {

		try {
			Login.validLogin();

			logger1 = extent.createTest("Sumbit Claim");
//hdrbcccccgmjh
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
			logger1.info(" add Claim option \"claims-submit\" is clicked");
			Thread.sleep(3000);
			Element.click();
			Thread.sleep(3000);
			logger1.info(" attach pdf file is choosen");
			String filePath = System.getProperty("user.dir") + "/pdf/pdfurl-guide.pdf";
			Thread.sleep(1000);
			type("AttachFile_Xpath",filePath);
			
			Thread.sleep(1000);
			logger1.info(" click on sumbit the claim");
			click("Insert_Xpath");

			Thread.sleep(1000);
			logger1 = extent.createTest("Sumbit complaints");
			logger1.info(" click on support button");
			 
			click("Title_Xpath");
			Thread.sleep(1000);
			
			logger1.info(" click on complaints/compliments button");
			driver.findElement(By.xpath("//*[@id=\"header-navbar-collapse\"]/div[2]/ul/li[7]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			logger1.info(" click on sumbit a complaints/compliments button");
			driver.findElement(By.xpath("//*[@id=\"portalPage\"]/div/div[2]/div/div[2]/div/div[1]/div/div/a")).click();
			Thread.sleep(2000);
			WebElement a = driver.findElement(
					By.xpath("//*[@id='portalPage']/div/div[2]/div/div[2]/div/div[8]/div/div/div[2]/iframe"));
			driver.switchTo().frame(a);
			Thread.sleep(2000);
			logger1.info("title \"Complaint Title\" is typed in textbox \"//*[@id=\\\"title\\\"]\"");
			driver.findElement(By.xpath("//input[contains(@title, 'Type a subject')]")).sendKeys("Complaint Title");
			Thread.sleep(1000);
			logger1.info("type textbox \"//*[@id=\\\"ks_queriytype\\\"]\" is clicked");
			Select sel = new Select(driver.findElement(By.xpath("//*[@id='ks_queriytype']")));
			sel.selectByVisibleText("Complaint");
			Thread.sleep(2000);
			logger1.info("Description is typed in textbox //*[@id=\"description\"] is clicked");
			driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("Type description of your complaint");
			Thread.sleep(3000);
			logger1.info(" attach pdf file is choosen");
			String filePath1 = System.getProperty("user.dir") + "/pdf/pdfurl-guide.pdf";
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"AttachFile\"]")).sendKeys(filePath1);
			Thread.sleep(1000);
			logger1.info("Sumbit button is clicked");
			driver.findElement(By.xpath("//*[@id=\"InsertButton\"]")).click();
			
			driver.switchTo().defaultContent();

			Thread.sleep(1000);
			logger1 = extent.createTest("View complaints");
			logger1.info("view complaint option is clicked");
			driver.findElement( 
					By.xpath("//table[contains(@class, 'table table-striped table-fluid')]/tbody/tr[1]/td[5]")).click();
			
			Thread.sleep(1000);
			logger1.info("view Details option is clicked");
			driver.findElement(By
					.xpath("//*[@id=\"portalPage\"]/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr/td[5]/div/ul/li/a"))
					.click();
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
