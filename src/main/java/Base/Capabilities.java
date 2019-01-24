package Base;

import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebElement;
/**
 * @author chanchal
 *
 */

public class Capabilities {
	protected static WebDriver driver = new ChromeDriver();

	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest logger1;

	@BeforeClass
	public static void LaunchBrowser() {
		
		driver.get(properties.getProperty("url"));
		 driver.manage().window().maximize();

	}

	static Properties properties;

	static {
		properties = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//resources//Properties//IOS_OR.properties");
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getObject(String Data) throws IOException {
		String data = properties.getProperty(Data);
		return data;

	}

	public  static void type(String Locator, String key) {
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

	public static WebElement findElement(String Locator) {
		WebElement WebElement = null;
		if (Locator.endsWith("_Xpath")) {
			WebElement=driver.findElement(By.xpath(properties.getProperty(Locator)));

		} else if (Locator.endsWith("_ID")) {
			WebElement=driver.findElement(By.id(properties.getProperty(Locator)));
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

	@AfterClass
	public void closeApplication() {
		driver.quit();
		Reporter.log("===Session End===", true);
	}

}
