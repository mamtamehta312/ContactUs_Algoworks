package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.Capabilities;

public class SumbitComplaints extends Capabilities {

	
	public void sumbit complaints() {
	Login2.validLogin();
	
	
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
	
	Thread.sleep(1000);
	driver.switchTo().defaultContent();

	Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,800)", "down");
}
}