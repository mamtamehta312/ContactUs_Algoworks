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

import io.appium.java_client.MobileElement;

public class CommonFunctions {
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
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"jeebo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeImage")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			MobileElement recommend;
			recommend = (MobileElement) wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.app.jeebo:id/tv_recommend")));
			Thread.sleep(4000);
			logger1.info("'Recommend' option clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_recommend")).click();

			logger1.info("'Anshul' name clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_contact")).click();

			logger1.info("'Dot Options' clicked");
			driver.findElement(By.id("com.app.jeebo:id/img_chat_header_options")).click();

			logger1.info("'Cancel' clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_cancel")).click();

			logger1.info("'Dot Options' clicked");
			driver.findElement(By.id("com.app.jeebo:id/img_chat_header_options")).click();

			logger1.info("'Delete Chat' option clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_delete_list")).click();

			logger1.info("'OK' clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_ok")).click();

			logger1.info("'Recommend' option clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_recommend")).click();

			logger1.info("'Anshul' name clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_contact")).click();

			logger1.info("'ahlblabv' text typed");
			driver.findElement(By.id("com.app.jeebo:id/edt_chat_message")).sendKeys("ahlblabv");

			logger1.info("'Send' clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_chat_send")).click();

			driver.navigate().back();
			driver.navigate().back();

			logger1.info("'view social profile' clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_follow")).click();

			logger1.info("'follow' clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_follow")).click();

			logger1.info("'yes' option clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_yes")).click();

			Thread.sleep(2000);
			//driver.navigate().back();
			driver.findElement(By.id("com.app.jeebo:id/iv_back")).click();
			Thread.sleep(2000);
			//driver.navigate().back();

		}
	}

	public void clickAndCollectDelivery(ExtentTest logger1) throws InterruptedException {
		Thread.sleep(3000);

		{
			logger1.info("'fab menu' option clicked");
			driver.findElement(By.id("com.app.jeebo:id/iv_fab_menu")).click();

			// https://www.udemy.com/selenium-webdriver-web-based-automation-testing/
			logger1.info("'test' category clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_main")).click();

			logger1.info("'jalebi' heading clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_heading_post")).click();

			Thread.sleep(1000);
			logger1.info("'bookmark' clicked");
			driver.findElement(By.id("com.app.jeebo:id/iv_bookmark")).click();

			logger1.info("'jeeblove' clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_jeebslove")).click();
			Thread.sleep(1000);
			/*
			 * //logger1.info("'restaurants' category clicked");
			 * driver.findElement(By.id("com.app.jeebo:id/iv_category")).click()
			 * ; Thread.sleep(1000);
			 */
			logger1.info("'bookmark' clicked");
			driver.findElement(By.id("com.app.jeebo:id/iv_bookmark")).click();

			Thread.sleep(1000);
			logger1.info("'private post' clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_private_post")).click();

			// driver.switchTo().alert().accept();

			logger1.info("'share' option clicked");
			driver.findElement(By.id("com.app.jeebo:id/ll_share")).click();

			logger1.info("'Anshul' name clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_contact")).click();

			driver.navigate().back();

			Thread.sleep(1000);
			logger1.info("'add to shopping list' option clicked");
			driver.findElement(By.id("com.app.jeebo:id/ll_add_to_shopping_list")).click();

			// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout).click();
			logger1.info("top list selected");
			driver.findElement(By.id("com.app.jeebo:id/tv_shopping_list")).click();

			Thread.sleep(1000);
			driver.navigate().back();

			Thread.sleep(1000);
			logger1.info("'add to cart' clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_add_to_cart2")).click();

			driver.navigate().back();
			driver.navigate().back();

		}
	}

	public void Showcase(ExtentTest logger1) throws InterruptedException {
		Thread.sleep(3000);
		{
			logger1.info("'fab menu' option clicked");
			driver.findElement(By.id("com.app.jeebo:id/iv_fab_menu")).click();

			logger1.info("any category clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_main")).click();

			logger1.info("any product heading clicked");
			driver.findElement(By.id("com.app.jeebo:id/tv_heading_post")).click();

			Thread.sleep(1000);
			logger1.info("'bookmark' clicked");
			driver.findElement(By.id("com.app.jeebo:id/iv_bookmark")).click();

			logger1.info("'jeeblove' clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_jeebslove")).click();
			Thread.sleep(1000);

			logger1.info("'bookmark' clicked");
			driver.findElement(By.id("com.app.jeebo:id/iv_bookmark")).click();

			Thread.sleep(1000);
			logger1.info("'private post' clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_private_post")).click();

			Thread.sleep(1000);
			logger1.info("'share' option clicked");
			driver.findElement(By.id("com.app.jeebo:id/ll_share")).click();

			logger1.info("'Anshul' name clicked");
			driver.findElement(By.id("com.app.jeebo:id/rl_contact")).click();

			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			//driver.navigate().back();

		}
	}

}
