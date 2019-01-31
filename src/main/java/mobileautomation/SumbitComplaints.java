package mobileautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.AndroidCapabilities;
import Base.WebCapabilities;

public class SumbitComplaints extends AndroidCapabilities {

	@Test()
	public void sumbitcomplaints() throws Exception {

		Login.validLogin();

		Thread.sleep(1000);
		logger1.info("Selector is clicked");
		click("Selector_Xpath");
		
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
		type("Title_Xpath", "ComplaintTitle");

		Thread.sleep(2000);
		logger1.info("type textbox '//*[@id=\"ks_queriytype\"]' is clicked");
		Select sel = new Select(findElement("TypeTextbox_Xpath"));
		Thread.sleep(2000);
		sel.selectByVisibleText("Complaint");

		Thread.sleep(2000);
		logger1.info("Description is typed in textbox //*[@id=\"description\"] is clicked");
		type("Description_Xpath", "Description");

		Thread.sleep(3000);
		logger1.info(" attach pdf file is choosen");
		String filePath1 = System.getProperty("user.dir") + "/src/main/resources/pdf/pdfurl-guide.pdf";
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"AttachFile\"]")).sendKeys(filePath1);

		Thread.sleep(1000);
		logger1.info("Sumbit button is clicked");
		click("SumbitButton_Xpath");

		Thread.sleep(1000);
		driver.switchTo().defaultContent();

		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)", "down");
		
		
		
		
		Thread.sleep(3000);
		logger1 = extent.createTest("View Complaints");
		logger1.info("complaint is viewed after click toggle bar '//*[@id=\"accordion1\"]/div[1]/div[1]/h4/a/i'");
		click("Claim1_Xpath");
//		driver.findElement( 
//				By.xpath("//table[contains(@class, 'table table-striped table-fluid')]/tbody/tr[1]/td[5]")).click();
		//*[@id="portalPage"]/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr/td[5]/div/button/span
		
		//Thread.sleep(1000);
//		logger1.info("complaint 2 is viewed after click toggle bar '//*[@id=\"accordion1\"]/div[2]/div[1]/h4/a/i'");
//		click("Claim2_Xpath");
//		driver.findElement(By
//				.xpath("//*[@id=\"portalPage\"]/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr/td[5]/div/ul/li/a"))
//				.click();
//		Thread.sleep(1000);
//		logger1.info("complaint 3 is viewed after click toggle bar '//*[@id=\"accordion1\"]/div[3]/div[1]/h4/a/i'");
//		click("Claim3_Xpath");
		
		Thread.sleep(1000);
		logger1.info("View Details option is clicked");
		driver.findElement(
				By.xpath("//*[@id=\"portalPage\"]/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr/td[5]/div/ul/li/a"))
				.click();
		
		logger1.info("cancel option is clicked");
		driver.findElement(
				By.xpath("//*[@id=\"portalPage\"]/div/div[2]/div/div[2]/div/div[10]/div/div/div[1]/button/span[1]"))
				.click();
		//*[@id="portalPage"]/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr[1]
		// driver.switchTo().defaultContent();
		Thread.sleep(2000);

		
		logger1.pass("Testcase is Passed");

	}
}