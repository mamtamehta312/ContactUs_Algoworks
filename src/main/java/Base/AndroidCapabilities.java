package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AndroidCapabilities {

	protected static AppiumDriver<MobileElement> driver;

	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest logger1;

	@BeforeSuite
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "4d00b5844e003125");
		// Emulator-5554

		capabilities.setCapability(CapabilityType.VERSION, "7.0");

		//capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("browserName", "Chrome");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		System.out.println("helloo");
		driver.get(properties.getProperty("url"));

	}

	/*
	 * @Test public void tc() throws InterruptedException {
	 * driver.get(properties.getProperty("url"));
	 * 
	 * }
	 */
	static Properties properties;

	static {
		properties = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//resources//Properties//Android_OR.properties");
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

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

	public static void point(int xPoint, int yPoint) {
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(xPoint, yPoint)).perform();
	}

	public static void tapObject(String Locator) {
		MobileElement element = driver.findElement(By.xpath((properties.getProperty(Locator))));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, Integer> tapObject1 = new HashMap<String, Integer>();

		tapObject1.put("x", element.getCenter().getX());
		tapObject1.put("y", element.getCenter().getY());
		js.executeScript("mobile: tap", tapObject1);
	}

	public static void swipeup(int xPoint, int yPoint) {
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(xPoint,yPoint)", "up");
	
	}
	
	/*JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,500)", "up");*/
	//jse.executeScript("scroll(0, -1110);","down");

//scroll to bottom of page
//JavascriptExecutor js = ((JavascriptExecutor) driver);
//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	
	
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
	}

	@AfterSuite
	public void closeApplication() {
		driver.quit();
		Reporter.log("===Session End===", true);
	}

}
