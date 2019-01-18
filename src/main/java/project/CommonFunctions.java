package project;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.Capabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class CommonFunctions extends Capabilities {
	private WebDriver driver;

	public CommonFunctions(WebDriver driver) {
		this.driver = driver;
	}

	// public static ExtentTest logger1;
	// have to called first in every case
	// click and collect delivery,showcase,delivery,click and collect
	public void RecommendViewSocialProfile(ExtentTest logger1) throws InterruptedException {
		Thread.sleep(1000);

		{
			logger1.info("'sweet shop' restaurant clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"jeebo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")).click();
			
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			MobileElement recommend;
			recommend = (MobileElement) wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name=\"Recommend\"]")));
			Thread.sleep(4000);
			logger1.info("'Recommend' option clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Recommend\"]")).click();

			logger1.info("'Anshul' name clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]")).click();
			
			
			logger1.info("'Dot Options' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'options\']")).click();

			logger1.info("'Cancel' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'Cancel\']")).click();
			
			
			logger1.info("'Dot Options' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'options\']")).click();

			logger1.info("'Delete Chat' option clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'Delete chat\']")).click();

//			logger1.info("'OK' clicked");
//			driver.findElement(By.id("com.app.jeebo:id/tv_ok")).click();

			logger1.info("'Recommend' option clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Recommend\"]")).click();
			

			logger1.info("'Anshul' name clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]")).click();

			logger1.info("'ahlblabv' text typed");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\'jeebo\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextView")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\'Type a message\']")).sendKeys("ahlblabv");
			
			
			logger1.info("'Send' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'Send\']")).click();

			logger1.info("'done' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Toolbar Done Button\"]")).click();
			
			logger1.info("'back' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"backIcon\"]")).click();
			
			logger1.info("'view social profile' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"View Social Profile\"]")).click();

			logger1.info("'follow' clicked");
			Thread.sleep(1000);
//			TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
//			touchAction.tap(PointOption.point(295,160)).perform();
            driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")).click();
            
            
			logger1.info("'yes' option clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'Yes\']")).click();

			Thread.sleep(2000);
			//driver.navigate().back();
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"backIcon\"]")).click();
			Thread.sleep(2000);

		}
	}

	public void clickAndCollectDelivery(ExtentTest logger1) throws InterruptedException {
		Thread.sleep(3000);

		{
			logger1.info("'fab menu' option clicked");
   			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'eShopMenu\']")).click();

			
            logger1.info("'any' category clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\'jeebo\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]\n")).click();

			logger1.info("any heading clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"jeebo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]\n")).click();

			Thread.sleep(1000);
			logger1.info("'bookmark' clicked");
            driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'productActions\']")).click();
			
			
			Thread.sleep(1000);
			logger1.info("'jeeblove' clicked");
			//tapObject("//XCUIElementTypeApplication[@name=\'jeebo\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
			TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
			touchAction.tap(PointOption.point(234,280)).perform();
			//point(234,280);
			System.out.println("abc");
			
			Thread.sleep(1000);
			
			logger1.info("'OK' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();
			Thread.sleep(1000);
			logger1.info("'bookmark' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'productActions\']")).click();

			Thread.sleep(1000);
			logger1.info("'private post' clicked");
			TouchAction touchAction1 = new TouchAction((PerformsTouchActions) driver);
			touchAction.tap(PointOption.point(272,329)).perform();
			
			
			Thread.sleep(1000);
			logger1.info("'OK' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();
			Thread.sleep(1000);
		

			logger1.info("'share' option clicked");
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\'Share\']")).click();
			TouchAction touchAction2 = new TouchAction((PerformsTouchActions) driver);
			touchAction.tap(PointOption.point(36,340)).perform();
			
			logger1.info("'Anshul' name clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]")).click();

			logger1.info("'back' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"backIcon\"]")).click();

			Thread.sleep(1000);
			logger1.info("'add to shopping list' option clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"jeebo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton")).click();

			// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout).click();
			logger1.info("top list selected");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"jeebo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther")).click();


			logger1.info("'OK' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();
			Thread.sleep(1000);
			
			logger1.info("'cross' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"cross\"]")).click();
			Thread.sleep(1000);
			
			Thread.sleep(1000);
			logger1.info("'add to cart' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Add to Cart\"]")).click();
			
			logger1.info("'OK' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();
			Thread.sleep(1000);
			
			logger1.info("'back' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"backIcon\"]")).click();
			
			logger1.info("'back' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"backIcon\"]")).click();
		}
	}

	public void Showcase(ExtentTest logger1) throws InterruptedException {
		Thread.sleep(3000);
		{
			logger1.info("'fab menu' option clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\\\"eShopMenu\\\"]")).click();

			logger1.info("any category clicked");
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\\\"CHOCOLATE MOMOS \\\"]")).click();

			logger1.info("any product heading clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\\\"jeebo\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")).click();

			Thread.sleep(1000);
			logger1.info("'bookmark' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\\\"jeebo\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")).click();

			logger1.info("'jeeblove' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\\\"jeebo\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")).click();
			Thread.sleep(1000);

			logger1.info("'bookmark' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\\\"jeebo\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")).click();


			logger1.info("'OK' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();
			
			logger1.info("'bookmark' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\\\"jeebo\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")).click();

			Thread.sleep(1000);
			logger1.info("'private post' clicked");
			TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
			touchAction.tap(PointOption.point(272,329)).perform();
			
			logger1.info("'OK' clicked");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();
			Thread.sleep(1000);
		
			Thread.sleep(1000);
			logger1.info("'share' option clicked");
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\\\"shareBlue\\\"]")).click();

			logger1.info("'Anshul' name clicked");
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\\\"jeebo\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"backIcon\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"backIcon\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"backIcon\"]")).click();
	
		}
	}

}
