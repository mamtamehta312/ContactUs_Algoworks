package Base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class WebCapabilities {

	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest logger1;

	 public static WebDriver driver;
	
	 
	 @Parameters("browser")
		@BeforeSuite
		public static void LaunchBrowser( String browser) throws FileNotFoundException {
			{
				
				System.out.println("browser is "+browser);
				if (browser.equalsIgnoreCase("Chrome")) {
			    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");	
				driver = new ChromeDriver();
					 
				} else if (browser.equalsIgnoreCase("Safari")) {
					 driver = new SafariDriver();
				}
				else if (browser.equalsIgnoreCase("Firefox")) {
					System.setProperty("webdriver.gecko.driver","./driver/geckodriver");
					File pathBinary = new File("/usr/bin/firefox");
					FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
					DesiredCapabilities desired = DesiredCapabilities.firefox();
					FirefoxOptions options = new FirefoxOptions();
				    desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
				    driver = new FirefoxDriver(options);
				}
				
			
				}
		

			driver.get(properties.getProperty("form_url"));
			driver.manage().window().maximize();

		}

	 

	 
	 
//	@Parameters("browser")
//	@BeforeSuite
//	public static void LaunchBrowser(String browser) throws FileNotFoundException {
//		{
//
//			System.out.println("browser is " + browser);
//			if (browser.equalsIgnoreCase("Chrome")) {
//				System.setProperty("webdriver.chrome.driver", "/home/riya/Downloads/chromedriver_linux64/chromedriver");
//				driver = new ChromeDriver();
//
//			} else if (browser.equalsIgnoreCase("Safari")) {
//				driver = new SafariDriver();
//			} else if (browser.equalsIgnoreCase("Firefox")) {
//				System.setProperty("webdriver.gecko.driver", "/home/riya/Downloads/geckodriver_linux64/geckodriver");
//				File pathBinary = new File("/home/riya/Downloads/firefox/firefox");
//				FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
//				DesiredCapabilities desired = DesiredCapabilities.firefox();
//				FirefoxOptions options = new FirefoxOptions();
//				desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
//				driver = new FirefoxDriver(options);
//			}
//
//		}
//
//		driver.get(properties.getProperty("form_url"));
//		driver.manage().window().maximize();
//
//	}

	protected static Properties properties;
	static {
		properties = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//resources//Properties//Web_OR.properties");
			properties.load(fis);

			String var =  getPropertyValue("language");

			FileInputStream fis2 = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//resources//Properties//" + var + "_OR.properties");
			properties.load(fis2);

		}

		catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * protected static Properties properties;
		 * 
		 * static { properties = new Properties(); FileInputStream fis; try { fis = new
		 * FileInputStream( System.getProperty("user.dir") +
		 * "//src//main//resources//Properties//Web_OR.properties");
		 * properties.load(fis); } catch (IOException e) { e.printStackTrace(); }
		 * 
		 * }
		 */
	}

	public static String getObject(String Data) throws IOException {
		String data = properties.getProperty(Data);
		return data;

	}

	public static void type(String Locator, String key) {
		if (Locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(properties.getProperty(Locator))).sendKeys(properties.getProperty(key));

		} else if (Locator.endsWith("_ID")) {
			driver.findElement(By.id(properties.getProperty(Locator))).sendKeys(properties.getProperty(key));
		}
	}

	public static void click(String Locator) {
		if (Locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(properties.getProperty(Locator))).click();

		} else if (Locator.endsWith("_ID")) {
			driver.findElement(By.id(properties.getProperty(Locator))).click();
			// driver.findElementByAccessibilityId(properties.getProperty(Locator)).click();
		}
	}

	public static String getPropertyValue(String key) {

		return properties.getProperty(key);

	}

	public static WebElement findElement(String Locator) {
		WebElement WebElement = null;
		if (Locator.endsWith("_Xpath")) {
			WebElement = driver.findElement(By.xpath(properties.getProperty(Locator)));

		} else if (Locator.endsWith("_ID")) {
			WebElement = driver.findElement(By.id(properties.getProperty(Locator)));
			// driver.findElementByAccessibilityId(properties.getProperty(Locator)).click();

		}

		return WebElement;
	}

	public void back() {
		driver.navigate().back();
	}

	public void clear(String Locator) {
		if (Locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(properties.getProperty(Locator))).clear();

		} else if (Locator.endsWith("_ID")) {
			driver.findElement(By.id(properties.getProperty(Locator))).clear();
			// driver.findElementByAccessibilityId(properties.getProperty(Locator)).click();

		}
	}

	public static void captureScreenShots(String file_name) throws IOException {
		String folder_name;
		DateFormat df;
		folder_name = "Screenshot";
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Date format fot screenshot file name
		// df = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		// create dir with given folder name
		new File(folder_name).mkdir();
		// Setting file name
		// String file1_name=df.format(new Date())+".png";
		// coppy screenshot file into screenshot folder.
		FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
	}

	@BeforeTest
	public void createReport() {
		reporter = new ExtentHtmlReporter("./extent.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@AfterTest
	public void flush() throws IOException {
		extent.flush();
		// logger1.fail("Failed because of some issue",
		// MediaEntityBuilder.createScreenCaptureFromPath("/home/chanchal/Desktop/Screenshots/logo.jpg").build());
		// logger1.addScreenCaptureFromPath("/home/chanchal/Desktop/Screenshots/logo.jpg");
	}

	@AfterSuite
	public void closeApplication() {
		driver.quit();
		Reporter.log("===Session End===", true);
	}

}
