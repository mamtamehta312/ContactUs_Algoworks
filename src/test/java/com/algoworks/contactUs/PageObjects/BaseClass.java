package com.algoworks.contactUs.PageObjects;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.algoworks.contactUs.Utilities.ReadConfig;
import com.algoworks.contactUs.Utilities.Retry;
import com.algoworks.contactUs.Utilities.TestUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class  BaseClass{

	public  static  ReadConfig rd=new ReadConfig();
	public  static   WebDriver driver;
	public  String chromeDriverPath= rd.getChromeDriverPath();
	public  String geckoDriverPath= rd.getGeckoDriverPath();
	public  String url=rd.getUrl();
	public  String excelPath=null;
	public static ExtentReports extent;
	public static ExtentTest rlog;
	public static Logger log;
	public  String name;
	public  static String screenshotPath=null;
	public static String contactFormUrl=rd.getContactFormUrl();
	public contact_page cp=null;
	
	// case_study webpage Elements
	
    public static String case_study_url=rd.getCaseStudyUrl();
   // public static CaseStudyPage case_study_page=null;
   
    
	@BeforeSuite
	public void setUp()
	{

		excelPath=rd.getExcelPath();
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

	@Parameters("browser")

	@BeforeMethod
	public void onTestStart(String browser,ITestResult result)
	{   
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",chromeDriverPath);
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {

			
			System.setProperty("webdriver.gecko.driver",geckoDriverPath);
			driver= new FirefoxDriver();
		}
      
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}	

	@AfterMethod()
	public   void  onTestSuccess(ITestResult result) throws InterruptedException {

		if(result.getStatus()==ITestResult.SUCCESS)
		{
			Retry.count=0;
			log.info("Test Case Passed Successfully  ! " );
			rlog.log(LogStatus.PASS, " Test Case Passed Successfully !");
			try {
				Thread.sleep(2000);
				rlog.log(LogStatus.PASS, rlog.addScreenCapture("." +TestUtils.shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_Success")));
			} catch (IOException e) {

				e.printStackTrace();
			} 

			extent.endTest(rlog); 
			driver.quit();
		}	
	}

	@AfterMethod
	public void onTestFailure(ITestResult result) throws IOException, InterruptedException 
	{

		if(result.getStatus()==ITestResult.FAILURE)
		{
			Retry.count=0;
			log.info(rlog.getDescription()+ " -- OOPS! Testcase has been  Failed");
			rlog.log(LogStatus.FAIL, result.getName()+"  -- OOPS! Test Case has been Failed ");
			rlog.log(LogStatus.FAIL, result.getName()+"  --  "+result.getThrowable());
			log.info("Screenshot captured for failed Test Case");
			Thread.sleep(2000);
			rlog.log(LogStatus.FAIL, rlog.addScreenCapture("." +TestUtils.shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_Failure"))); 
			extent.endTest(rlog);
			driver.quit();
		}

	}
	@AfterMethod
	public   void  onTestSkip(ITestResult result) throws InterruptedException, IOException {

		if(result.getStatus()==ITestResult.SKIP)
		{
			log.info(result.getName()+" - Test Case Skipped ");
			log.info("Screenshot captured for Skipped Test Case");
			Thread.sleep(2000);
			rlog.log(LogStatus.SKIP, rlog.addScreenCapture("." +TestUtils.shots(driver,TestUtils.getScreenshotId(rlog.getDescription())+"_Skipped"))); 

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



}
