package Base;

import static Base.Capabilities.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.w3c.dom.events.Event;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//import com.jeebo.home.CommonFunctions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

/**
 * @author chanchal
 *
 */

public class Capabilities {

	protected AppiumDriver<MobileElement> driver;

	private long timeout;

	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest logger1;

	@BeforeClass
	public void setUp() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		// capabilities.setCapability("deviceName", "4d00b5844e003125");
		//
		// // capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		//
		// capabilities.setCapability(CapabilityType.VERSION, "7.0");
		//
		// capabilities.setCapability("platformName", "Android");
		//
		// capabilities.setCapability("appPackage", "com.app.jeebo");
		//
		// capabilities.setCapability("appActivity",
		// "com.app.jeebo.activity.SplashActivity");
		//
		// driver = new AndroidDriver<MobileElement>(new
		// URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//
		// capabilities.setCapability("no-reset", " false");
		//
		// capabilities.setCapability("permission", "true");
		//
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		capabilities.setCapability("no-reset", " true");
		capabilities.setCapability("deviceName", "iPhone 7");
		capabilities.setCapability("udid", "5B9FF0E0-1442-40DC-9A2D-B492944918D3");
		capabilities.setCapability("platformName", "ios");

		capabilities.setCapability("bundleId", "com.algoworks.Jeebo");
		capabilities.setCapability("automationName", "XCUITest");
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// capabilities.setCapability("no-reset", " false");
		// driver.launchApp();
		// driver.resetApp();
		driver.launchApp();
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

	public void type(String Locator, String value) {
		if (Locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(properties.getProperty(Locator))).sendKeys(value);

		} else if (Locator.endsWith("_ID")) {
			driver.findElement(By.id(properties.getProperty(Locator))).sendKeys(value);
			// driver.findElementByAccessibilityId(properties.getProperty(Locator)).sendKeys(value);
		}
	}

	public void point(int xPoint, int yPoint) {
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(xPoint, yPoint)).perform();
	}

	public void click(String Locator) {
		if (Locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(properties.getProperty(Locator))).click();

		} else if (Locator.endsWith("_ID")) {
			driver.findElement(By.id(properties.getProperty(Locator))).click();
			// driver.findElementByAccessibilityId(properties.getProperty(Locator)).click();

		}
	}

	public void tapObject(String Locator) {
		MobileElement element = driver.findElement(By.xpath((properties.getProperty(Locator))));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, Integer> tapObject1 = new HashMap<String, Integer>();

		tapObject1.put("x", element.getCenter().getX());
		tapObject1.put("y", element.getCenter().getY());
		js.executeScript("mobile: tap", tapObject1);
	}

	public void swipeLeft(String Locator) {
		//MobileElement element = driver.findElement(By.xpath((properties.getProperty(Locator))));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, Object> swipeObject = new HashMap<String, Object>();
//		swipeObject.put("fromX", 328);
//		swipeObject.put("fromY", 185);
//		swipeObject.put("toX", 48);
//		swipeObject.put("toY", 179);
//		swipeObject.put("duration", 1.0);
//		// swipeObject.put("direction", "left");
//		// js.executeScript("mobile: swipe", swipeObject);
//		swipeObject.put("element", ((RemoteWebElement) element).getId());
//		js.executeScript("mobile: dragFromToForDuration", swipeObject);
		
	}

	public void clearFullText(String Locator) {
		MobileElement element = driver.findElement(By.xpath((properties.getProperty(Locator))));
		if (element.getText() != null && "".equals(element.getText())) {
			element.clear();

			// if(event.target.value==event.target.defaultValue)
			// event.targetValue="";
		}
	}

	public void back() {
		// driver.navigate().back();
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'backIcon\']")).click();
	}

	public void done() {
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Toolbar Done Button\"]")).click();
	}

	public void clear(String Locator) {
		if (Locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(properties.getProperty(Locator))).clear();

		} else if (Locator.endsWith("_ID")) {
			driver.findElement(By.id(properties.getProperty(Locator))).clear();
			// driver.findElementByAccessibilityId(properties.getProperty(Locator)).click();

		}
	}

	public void SwipeUpWindow() throws InterruptedException {
		Dimension size = driver.manage().window().getSize();
		int width = (int) (size.width / 2);
		// System.out.println(width);
		int startpoint = (int) (size.getHeight() * 0.80);
		int endpoint = (int) (size.getHeight() * 0.01);
		Thread.sleep(1000);
		new TouchAction(driver).press(width, startpoint).waitAction().moveTo(width, endpoint).release().perform();
	}

	public void SwipeLeft() {
		Dimension size = driver.manage().window().getSize();
		int height = (int) (size.height / 3);

		int startpoint = (int) (size.getWidth() * 0.80);
		int endpoint = (int) (size.getWidth() * 0.01);
		new TouchAction(driver).press(startpoint, height).waitAction().moveTo(endpoint, height).release().perform();
	}

	// Horizontal Swipe by percentages
	// public void horizontalSwipeByPercentage(double startPercentage, double
	// endPercentage, double anchorPercentage) {
	// Dimension size = driver.manage().window().getSize();
	// int anchor = (int) (size.height * anchorPercentage);
	// int startPoint = (int) (size.width * startPercentage);
	// int endPoint = (int) (size.width * endPercentage);
	//
	// new TouchAction(driver).press(point(startPoint,
	// anchor)).waitAction(waitOptions(ofMillis(1000)))
	// .moveTo(point(endPoint, anchor)).release().perform();
	// }

	public void tap(String Locator) {
		MobileElement element = null;

		// new TouchAction(driver).tap(null);
		// TouchActions action = new TouchActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, timeout);

		/*
		 * if (((String) Locator).endsWith("_Xpath")) { By a =
		 * By.xpath(properties.getProperty(Locator));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(a)); element =
		 * driver.findElement(By.id("com.app.jeebo:id/rl_notification"));
		 * 
		 * } else if (((String) Locator).endsWith("_ID")) { By b =
		 * By.id(properties.getProperty(Locator));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(b)); element =
		 * driver.findElement(By.id("com.app.jeebo:id/rl_notification"));
		 * 
		 * } new TouchAction(driver).tap(element);
		 */
		// action.perform();
	}

	public void Category(String Locator) throws InterruptedException {
		List<String> textValues = new ArrayList<String>();

		for (int i = 0; i < 4; i++) {
			List<MobileElement> elements = driver.findElements(By.id(properties.getProperty(Locator)));
			for (MobileElement menu : elements) {
				if (textValues.contains(menu.getText())) {
					continue;
				}
				Thread.sleep(1000);
				textValues.add(menu.getText());
				Thread.sleep(1000);
				menu.click();
				System.out.println(menu.getText());

				Thread.sleep(1000);

				// driver.findElement(By.xpath("//android.widget.TextView[@text='Burgers']")).click();
				test: {

					List<MobileElement> collectAndDelivery = driver.findElements(
							By.xpath("//android.widget.TextView[@text='Click & Collect' or @text='Delivery']"));
					List<MobileElement> showcase = driver
							.findElements(By.xpath("//android.widget.TextView[@text='Showcase']"));
					if ((!collectAndDelivery.isEmpty()) && collectAndDelivery.get(0).isDisplayed()) {
						//
						// CommonFunctions r = new CommonFunctions(driver);
						// r.RecommendViewSocialProfile(logger1);
						//
						// CommonFunctions c = new CommonFunctions(driver);
						// c.clickAndCollectDelivery(logger1);

					} else if ((!showcase.isEmpty()) && showcase.get(0).isDisplayed()) {

						// CommonFunctions r = new CommonFunctions(driver);
						// r.RecommendViewSocialProfile(logger1);
						//
						// CommonFunctions s = new CommonFunctions(driver);
						// s.Showcase(logger1);

					}

					else {
						logger1.info("no e-shop is present");
					}

					Thread.sleep(1000);
					menu.click();

				}

				Dimension size = driver.manage().window().getSize();
				new TouchAction(driver).press((int) (size.getWidth() * 0.70), (int) (size.height / 8)).waitAction()
						.moveTo((int) (size.getWidth() * 0.03), (int) (size.height / 8)).release().perform();
			}
		}
		/*
		 * for (int i = 0; i < 4; i++) { MobileElement menu =
		 * driver.findElements(By.id(properties.getProperty(Locator))).get(i);
		 * 
		 * 
		 * if (textValues.contains(menu.getText())){ continue; }
		 * textValues.add(menu.getText()); menu.click();
		 * System.out.println(menu.getText());
		 * 
		 * }
		 */

	}

	@BeforeTest
	public void createReport() {
		reporter = new ExtentHtmlReporter("/Users/varun/Downloads/ChanchalProject/IOS/JeeboTestCases.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@AfterTest
	public void flush() {
		extent.flush();
	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
		Reporter.log("===Session End===", true);
	}
}
