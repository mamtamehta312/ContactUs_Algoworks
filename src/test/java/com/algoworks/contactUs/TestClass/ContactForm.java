package com.algoworks.contactUs.TestClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import com.algoworks.contactUs.PageObjects.BaseClass;
import com.algoworks.contactUs.TestData.excelReader;
import com.algoworks.contactUs.Utilities.Retry;
import com.algoworks.contactUs.Utilities.TestUtils;
import com.relevantcodes.extentreports.LogStatus;


public class ContactForm extends BaseClass {

	//@Test(dataProvider  = "ContactForm", retryAnalyzer = Retry.class)                        
	public void contactForm( String testName,String locType,String loc ,String scroll,String waitNeeded,String name,String email,String phone,String message,String expected_res) throws InterruptedException, IOException
	{ 
		
		driver.get(url);
		rlog=extent.startTest(testName);
		rlog.setDescription(testName);
		rlog.log(LogStatus.INFO, testName+ "-- Test Case Started Successfully !");
		log.info(testName+"-- Test Case Started Successfully !");
		TestUtils.contactButtonValidation(driver, testName, locType, waitNeeded, loc, scroll, rlog, log);
		TestUtils.submitDetails(driver, extent, rlog, log, name, email, phone, message, expected_res);
	    
	}

   //@Test(dataProvider = "ServicesContactForm" , retryAnalyzer = Retry.class)
	public void servicesContactForm(String TestName , String service_locator ,String scroll_locator, String contact_locator , String exp_res,String waitNeeded) throws InterruptedException, IOException
	{

       
		driver.get(url);
		rlog=extent.startTest(TestName);
		rlog.setDescription(TestName);
		rlog.log(LogStatus.INFO, TestName+ "-- Test Case Started Successfully !");
		log.info(TestName+"-- Test Case Started Successfully !");
		TestUtils.servicesValidation(driver, rlog, log, TestName, service_locator, scroll_locator);		
		TestUtils.contactButtonValidation(driver, TestName, "xpath", waitNeeded, contact_locator, scroll_locator, rlog, log);
		
	}
	
 //  @Test(retryAnalyzer = Retry.class)
	public void NewUserTesting() throws InterruptedException, IOException
	{ 
    	
		String TestName="TC_N_01_New User Testing with Random Scenario";
		rlog=extent.startTest(TestName);
		rlog.setDescription(TestName);
		rlog.log(LogStatus.INFO, TestName+ "-- Test Case Started Successfully !");
		log.info(TestName+"-- Test Case Started Successfully !");
		TestUtils.getNewUserTesting(TestName,driver, url, rlog, log, extent);
		
	}
	@Test(dataProvider = "thirdPartyContactForm" )
   public void thirdPartyContactForm(String TestName ,String turl,String scrollTPLocator,String algoLocator, String scroll_locator, String contact_locator , String exp_res,String waitNeeded) throws InterruptedException, IOException
	{
  
		System.out.println(TestName);
		driver.get(turl);
		
		rlog=extent.startTest(TestName);
		rlog.setDescription(TestName);
		
		rlog.log(LogStatus.INFO, TestName+ "-- Test Case Started Successfully !");
		log.info(TestName+"-- Test Case Started Successfully !");
		
		
		TestUtils.TPContactFormValidation(driver, rlog, log, turl, scrollTPLocator, algoLocator, TestName, scroll_locator, contact_locator, exp_res, waitNeeded);
		TestUtils.contactButtonValidation(driver, TestName, "xpath", waitNeeded, contact_locator, scroll_locator, rlog, log);
		
	}
	
	//@Test(dataProvider = "VariousContactForm" , retryAnalyzer = Retry.class)
	   public void varContactForm(String TestName ,String turl, String scroll_locator, String contact_locator , String exp_res,String waitNeeded) throws InterruptedException, IOException
		{
	  
			
			driver.get(turl);
			Thread.sleep(2000);
			rlog=extent.startTest(TestName);
			rlog.setDescription(TestName);
			rlog.log(LogStatus.INFO, TestName+ "-- Test Case Started Successfully !");
			log.info(TestName+"-- Test Case Started Successfully !");
			rlog.log(LogStatus.INFO, "Website Opened Successfully !");
			rlog.log(LogStatus.INFO, rlog.addScreenCapture( "."+TestUtils.shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_TP_URL_Open")));
			TestUtils.contactButtonValidation(driver, TestName, "xpath", waitNeeded, contact_locator, scroll_locator, rlog, log);
			
		}
	
   

	@DataProvider(name="ServicesContactForm")
	public Object[][] getData1() throws IOException
	{
		int row=excelReader.RowCount(excelPath, 1);
		int cell=excelReader.CellCount(excelPath, 1,0);
		Object[][] data = new Object[row][cell];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				data[i-1][j]=excelReader.getData(excelPath, 1, i, j);
			}
		}
		return data;
	}

	@DataProvider(name="ContactForm")
	public Object[][] getData() throws IOException
	{
		int row=excelReader.RowCount(excelPath, 2);
		int cell=excelReader.CellCount(excelPath, 2,0);
		Object[][] data = new Object[row][cell];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				data[i-1][j]=excelReader.getData(excelPath, 2, i, j);
			}
		}
		return data;
	}
	
	@DataProvider(name="thirdPartyContactForm")
	public Object[][] getData2() throws IOException
	{
		int row=excelReader.RowCount(excelPath, 4);
		int cell=excelReader.CellCount(excelPath, 4,0);
		Object[][] data = new Object[row][cell];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				data[i-1][j]=excelReader.getData(excelPath, 4, i, j);
			}
		}
		return data;
	}

	@DataProvider(name="VariousContactForm")
	public Object[][] getData3() throws IOException
	{
		int row=excelReader.RowCount(excelPath, 3);
		int cell=excelReader.CellCount(excelPath, 3,0);
		Object[][] data = new Object[row][cell];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				data[i-1][j]=excelReader.getData(excelPath, 3, i, j);
			}
		}
		return data;
	}


}





