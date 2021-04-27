package com.algoworks.contactUs.PageObjects;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.algoworks.contactUs.TestClass.contact_test;
import com.algoworks.contactUs.Utilities.ReadConfig;
import com.algoworks.contactUs.Utilities.screenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass{
	
    public  static  ReadConfig rd=new ReadConfig();
	public  static   WebDriver driver;
	public  String driverPath= rd.getDriverPath();
	public  String url=rd.getUrl();
	public  String excelPath=rd.getExcelPath();
	public  int sheetIndex=0; 
	public static ExtentReports extent;
	public static ExtentTest rlog;
	public static Logger log;
	public static  String timestamp;
	public  String name;
	public  static String screenshotPath=null;

	
	@BeforeSuite
	public void setUp()
	{
		
		screenshotPath=rd.getScreenshotPath();
	    name =rd.getReportPath()+".html";
		extent= new ExtentReports(name);
		log = Logger.getLogger("com.algoworks.contactUs");
		PropertyConfigurator.configure("log4j.properties");
		extent.addSystemInfo("User Name" , "Mamta Mehta ( Quality Analyst)");
		extent.addSystemInfo("Environment", "Production");
		extent.addSystemInfo("Host Name", "Local Host");
		extent.loadConfig(new File("./extent-config.xml"));
		
		
	}
	@BeforeMethod
	public void onTestStart(ITestResult result)
	{   
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		
		if(result.getStatus()==result.STARTED)
		{
			rlog.log(LogStatus.PASS, result.getName() + "-- Test Started Successfully !");
			log.info(result.getName() +"-- Test Started Successfully !");
		}
		
	}	
	
    	@AfterMethod()
		public   void  onTestSuccess(ITestResult result) {
			
			    if(result.getStatus()==result.SUCCESS)
					{
				log.info(result.getName()+" - Test Case Passed Successfully  ! " );
				rlog.log(LogStatus.PASS, " Test Case Passed Successfully !");
				 try {
					rlog.log(LogStatus.PASS, rlog.addScreenCapture("." +screenshot.shots(driver,contact_test.use_case1+"-2")));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
					
				extent.endTest(rlog); 
					driver.quit();
					}	
			     }

	@AfterMethod
	public void onTestFailure(ITestResult result) 
	{
		if(result.getStatus()==result.FAILURE)
		{
	    log.info(result.getName()+ "- OOPS! Testcase has been  Failed");
	    rlog.log(LogStatus.FAIL, result.getName()+"  -- OOPS! Test Case has been Failed ");
	    rlog.log(LogStatus.FAIL, result.getName()+"  --  "+result.getThrowable());
	    
	   
	try {
		
		 Thread.sleep(3000);
		 log.info("Screenshot captured for failed Test Case");
		 rlog.log(LogStatus.FAIL, rlog.addScreenCapture("." +screenshot.shots(driver,contact_test.use_case1+"-2"))); 
		 extent.endTest(rlog);
		 driver.quit();
	} 
	    catch (InterruptedException | IOException e) {
		e.printStackTrace();
		log.info("Screenshot Failed for failed Test Case");
	    extent.endTest(rlog);
	    driver.quit();
	}
		}
		
	}
	@AfterMethod
	public   void  onTestSkip(ITestResult result) throws InterruptedException {
		
		if(result.getStatus()==result.SKIP)
				{
			log.info(result.getName()+" - Test Case Skipped ");
			rlog.log(LogStatus.SKIP, result.getName()+"  -- Test Case Skipped ");
			rlog.log(LogStatus.SKIP, result.getName()+"  --  "+result.getThrowable());
			extent.endTest(rlog);
			driver.quit();
			
				}
		
		
	}
	@AfterSuite
	public void TearDown() throws InterruptedException
	{
		
		extent.flush();
		extent.close();
   	}
	
	//Swtich driver to next window
	public void switch_driver_to_next_window(String title)
	{
		for(String window1:driver.getWindowHandles())
		 {
			 if(driver.switchTo().window(window1).getTitle().equals(title))
			 {
				break;
			 }
		 } 
	}
	
	}
