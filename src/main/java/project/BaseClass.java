
package project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Capabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * @author chanchal
 *
 */
public class BaseClass {

	static Properties properties;
	
	protected AppiumDriver<MobileElement> driver;

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
	
	public BaseClass(AppiumDriver<MobileElement> driver){
		this.driver = driver;
	}

	public String getObject(String Data) throws IOException {
		String data = properties.getProperty(Data);
		return data;

	}

	public void type(String Locator, String value) {
		if (Locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(properties.getProperty(Locator))).sendKeys(value);

		} else if (Locator.endsWith("_ID")) {
			driver.findElement(By.id(properties.getProperty(Locator))).sendKeys(value);
		}
	}

	public void click(String element) {
		// click();
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(element)));
		driver.findElement(By.id(element)).click();
		//driver.findElement(By.xpath("_Xpath")).click();
	}
	
	public void back() {
		driver.navigate().back();
	}
	
	
}

