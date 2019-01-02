package project;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import Base.Capabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import io.appium.java_client.touch.offset.PointOption;

public class Test1 extends Capabilities {

	Logger log = Logger.getLogger(Test1.class);

	@SuppressWarnings("rawtypes")
	@Test(enabled = false, priority = 1, description = "perform login functionality of 1st user to send request to jeebo")
	public void signUp1stUser() throws Exception {
		logger1 = extent.createTest("Login1stUser");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'firstrequest@gmail.com' is typed");
			type("Email_Xpath", "firstrequest@gmail.com");

			logger1.info("password '123456' typed");
			type("Password_Xpath", "123456");

			logger1.info("done pressed");
			done();

			Thread.sleep(2000);
			logger1.info("'login' clicked");
			click("Login2_Xpath");

			Thread.sleep(1000);
			logger1.info("newsfeed is clicked");
			click("Newsfeed_Xpath");

			logger1.info("Explore option is clicked");
			click("Explore_Xpath");

			Thread.sleep(1000);
			logger1.info("search id is clicked");
			tapObject("SearchPeople1_Xpath");

			logger1.info("navigated to next searched box and 'jeebo' name is /'typed/'");
			type("SearchPeople2_Xpath", "jeebo");

			logger1.info("click on searched 'jeebo' id");
			click("AcceptRequest_Xpath");
			Thread.sleep(2000);
			logger1.info("click on connect");
			tapObject("Connect_Xpath");
			Thread.sleep(10000);
			back();
			Thread.sleep(10000);
			back();

			Thread.sleep(1000);
			logger1.info("click on profile");
			click("Profile_Xpath");
			Thread.sleep(2000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			Map<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			js.executeScript("mobile: scroll", scrollObject);

			Thread.sleep(10000);
			logger1.info("click on Logout");
			// tapObject("Logout_Xpath");
			driver.findElementByAccessibilityId("Logout").click();

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 2, description = "perform login functionality of 2nd user to send request to jeebo")
	public void signUp2ndUser() throws Exception {
		logger1 = extent.createTest("Login2ndUser");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'second@gmail.com' is typed");
			type("Email_Xpath", "second@gmail.com");

			logger1.info("password '123456' typed");
			type("Password_Xpath", "123456");

			logger1.info("done pressed");
			done();
			
			Thread.sleep(2000);
			logger1.info("'login' clicked");
			click("Login2_Xpath");

			Thread.sleep(1000);
			logger1.info("newsfeed is clicked");
			click("Newsfeed_Xpath");

			logger1.info("Explore option is clicked");
			click("Explore_Xpath");

			Thread.sleep(1000);
			logger1.info("search id is clicked");
			tapObject("SearchPeople1_Xpath");

			logger1.info("navigated to next searched box and 'jeebo' name is /'typed/'");
			type("SearchPeople2_Xpath", "jeebo");

			logger1.info("click on searched 'jeebo' id");
			click("AcceptRequest_Xpath");
			Thread.sleep(2000);
			logger1.info("click on connect");
			tapObject("Connect_Xpath");
			Thread.sleep(10000);
			back();
			Thread.sleep(10000);
			back();

			Thread.sleep(1000);
			logger1.info("click on profile");
			click("Profile_Xpath");
			Thread.sleep(2000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			Map<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			js.executeScript("mobile: scroll", scrollObject);

			Thread.sleep(10000);
			logger1.info("click on Logout");
			// tapObject("Logout_Xpath");
			driver.findElementByAccessibilityId("Logout").click();
			

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}
	
	@Test(enabled = false, priority = 3, description = "perform login functionality of 3rd user to send request to jeebo")
	public void signUp3rdUser() throws Exception {
		logger1 = extent.createTest("Login3rdUser");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'third@gmail.com' is typed");
			type("Email_Xpath", "third@gmail.com");

			logger1.info("password '123456' typed");
			type("Password_Xpath", "123456");

			logger1.info("done pressed");
			done();
			
			Thread.sleep(2000);
			logger1.info("'login' clicked");
			click("Login2_Xpath");

			Thread.sleep(1000);
			logger1.info("newsfeed is clicked");
			click("Newsfeed_Xpath");

			logger1.info("Explore option is clicked");
			click("Explore_Xpath");

			Thread.sleep(1000);
			logger1.info("search id is clicked");
			tapObject("SearchPeople1_Xpath");

			logger1.info("navigated to next searched box and 'jeebo' name is /'typed/'");
			type("SearchPeople2_Xpath", "jeebo");

			logger1.info("click on searched 'jeebo' id");
			click("AcceptRequest_Xpath");
			Thread.sleep(2000);
			logger1.info("click on connect");
			tapObject("Connect_Xpath");
			Thread.sleep(10000);
			back();
			Thread.sleep(10000);
			back();

			Thread.sleep(1000);
			logger1.info("click on profile");
			click("Profile_Xpath");
			Thread.sleep(2000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			Map<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			js.executeScript("mobile: scroll", scrollObject);

			Thread.sleep(10000);
			logger1.info("click on Logout");
			// tapObject("Logout_Xpath");
			driver.findElementByAccessibilityId("Logout").click();
			

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 0, description = "perform signup functionality")
	public void signUp() throws Exception {
		logger1 = extent.createTest("Sign_Up");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'continue' clicked");
			getObject("Continue_ID");
			click("Continue_ID");

			logger1.info("'Jeebo' user name is typed in textbox");
			type("SignupName_ID", "Jeebo");

			logger1.info("'producttesting111@gmail.com' is typed");
			type("SignupEmail_ID", "producttesting111@gmail.com");

			logger1.info("back pressed");
			back();

			logger1.info("'123456' password is typed");
			type("SignupPassword_ID", "123456");

			logger1.info("back pressed");
			back();

			logger1.info("confirm password is clicked");
			type("SignupConfirmPassword_ID", "123456");

			logger1.info("back pressed");
			back();

			logger1.info("sign up is clicked");
			click("SignUp_ID");

			/*
			 * logger1.info("click on allow for access location");
			 * click("LocationAcess_ID");
			 * 
			 * logger1.info("'profile' clicked"); getObject("Profile_ID");
			 * click("Profile_ID");
			 * 
			 * SwipeUpWindow();
			 * 
			 * logger1.info("'Logout' clicked"); getObject("Logout_ID"); click("Logout_ID");
			 */

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}

	@Test(enabled = false, priority = 4, description = "perform login functionality")
	public void LoginScreen() throws Exception {

		logger1 = extent.createTest("Login_Test");
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			if (driver.findElement(By.xpath(
					"//XCUIElementTypeApplication[@name=\"jeebo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField"))
					.isDisplayed()) {

				logger1.info("email id 'producttesting111@gmail.com' typed");
				type("Email_Xpath", "producttesting111@gmail.com");

				logger1.info("password '123456' typed");
				type("Password_Xpath", "123457");

				logger1.info("done clicked");
				done();

				Thread.sleep(1000);
				logger1.info("'login' clicked");
				click("Login2_Xpath");
			}
			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}

	@Test(enabled = false, priority = 0, description = "updating profile by capture image from camera")
	public void edit_profile_camera() throws Exception {

		logger1 = extent.createTest("edit_profile_camera");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(1000);
			logger1.info("'profile' clicked");
			click("Profile_ID");

			Thread.sleep(1000);
			logger1.info("'my profile' clicked");
			click("MyProfile_ID");

			logger1.info("'edit profile' clicked");
			click("EditProfile_ID");

			logger1.info("'edit' option clicked");
			click("Image_ID");

			logger1.info("'camera' clicked");
			click("Camera_ID");

			Thread.sleep(1000);
			logger1.info("'permission to media' clicked");
			click("LocationAcess_ID");

			logger1.info("'permission to video' clicked");
			click("LocationAcess_ID");

			logger1.info("'edit' option clicked");
			click("Image_ID");

			logger1.info("'camera' clicked");
			click("Camera_ID");

			Thread.sleep(1000);
			logger1.info("tap on 'capture'");
			new TouchAction(driver).tap(538, 1774).perform();

			logger1.info("'ok' clicked");
			Thread.sleep(2000);
			new TouchAction(driver).tap(538, 1774).perform();
			click("OkClickCamera_ID");

			/*
			 * logger1.info("'save' clicked"); click("SaveClickCamera_ID");
			 * 
			 * logger1.info("'ok' clicked"); click("CommonOK_ID");
			 */

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 5, description = "updating profile by taking image from gallery")
	public void edit_profile_gallery() throws Exception {

		logger1 = extent.createTest("edit_profile_gallery");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			logger1.info("'profile' clicked");
			click("Profile_Xpath");

			Thread.sleep(1000);
			logger1.info("'my profile' clicked");
			tapObject("MyProfile_Xpath");

			Thread.sleep(1000);
			logger1.info("'edit profile' clicked");
			click("EditProfile_Xpath");

			Thread.sleep(1000);
			logger1.info("'edit' option clicked");
			click("Image_Xpath");

			Thread.sleep(1000);
			logger1.info("'remove' clicked");
			tapObject("Remove_Xpath");

			logger1.info("'edit' clicked");
			click("Image_Xpath");

			Thread.sleep(1000);
			logger1.info("'gallery' clicked");
			tapObject("Gallery_Xpath");

			logger1.info("'gallery profile' clicked");
			click("GalleryProfile_Xpath");

			Thread.sleep(1000);
			logger1.info("'gallery sub profile' clicked");
			click("GallerySubProfile_Xpath");

			logger1.info("'save' option for gallery clicked");
			click("SaveClickCamera_Xpath");
			Thread.sleep(1000);
			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 6, description = "Setup profile information")
	public void SetInfoInProfile() throws Exception {

		logger1 = extent.createTest("Set Info In Profile");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			logger1.info("remove already present text and type 'Jeebo' text");
			clear("Name_Xpath");
			type("Name_Xpath", "Jeebo");
			done();

			logger1.info("phone number '123456789' typed");
			clear("PhoneNumber_Xpath");
			type("PhoneNumber_Xpath", "123456789");
			done();
			Thread.sleep(1000);
			SwipeUpWindow();
			Thread.sleep(1000);
			logger1.info("'male' clicked");
			tapObject("Male_Xpath");

			Thread.sleep(1000);
			logger1.info("'This is Jeebo app' typed in 'About'");
			// driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"jeebo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[5]/XCUIElementTypeTextView")).sendKeys(Keys.CLEAR);
			clearFullText("About_Xpath");

			type("About_Xpath", "This is Jeebo app");
			done();

			Thread.sleep(1000);
			logger1.info("'save' clicked");
			click("SaveProfile_Xpath");

			logger1.info("'ok' clicked");
			Thread.sleep(1000);
			tapObject("CommonOK_Xpath");
			back();

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority=0, description = "Manage address using CurrentLocation")
	public void ManageAddress() throws Exception {

		logger1 = extent.createTest("Manage address");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			logger1.info("'manage address' clicked");
			click("ManageAddress_Xpath");

			logger1.info("'add new address' clicked");
			click("NewAddress_Xpath");

			logger1.info("'use my current location' clicked");
			click("CurrentLocation_Xpath");
			Thread.sleep(1000);

			logger1.info("'Jeebo' name typed");
			type("EditName_ID", "Jeebo");

			back();

			logger1.info("address type 'work' clicked");
			click("AddressType_ID");

			logger1.info("'save' clicked");
			click("CommonSave_ID");

			logger1.info("'okTC ' clicked");
			click("CommonOK_ID");

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 7, description = "addNewAddress")
	public void addNewAddress() throws Exception {

		logger1 = extent.createTest("addNewAddress");

		try {
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			logger1.info("'manage address' clicked");
			tapObject("ManageAddress_Xpath");

			logger1.info("'new address' clicked");
			tapObject("NewAddress_Xpath");

			logger1.info("flat address 'A61/B4' typed");
			Thread.sleep(1000);
			type("FlatAddress_Xpath", "A61/B4");

			logger1.info("locality 'First Floor Spring Meadows Business Park' clicked");
			type("Locality_Xpath", "First Floor Spring Meadows Business Park");

			logger1.info("zipcode '201301' typed");
			type("Zipcode_Xpath", "201301");

			logger1.info("city 'noida' typed");
			type("City_Xpath", "Noida");
			done();

			logger1.info("state 'uttar pradesh' typed");
			type("State_Xpath", "Uttar Pradesh");

			logger1.info("country 'india' typed");
			type("Country_Xpath", "India");
			done();

			logger1.info("name 'Jeebo app' typed");
			type("EditName_Xpath", "Jeebo app");
			done();

			logger1.info("'other' option clicked");
			tapObject("OtherOption_Xpath");

			logger1.info("'save' clicked");
			click("SaveProfile_Xpath");

			logger1.info("'ok' clicked");
			Thread.sleep(1000);
			tapObject("OK_Xpath");

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 8, description = "Editting Text")
	public void EdittingText() throws Exception {

		logger1 = extent.createTest("Editting Text");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			logger1.info("'edit option' clicked");
			click("EditOption_Xpath");

			logger1.info("'edit' text clicked");
			new TouchAction(driver).tap(290, 200).perform();

			logger1.info("'Changed name' typed in name textbox");
			clear("EditName_Xpath");
			type("EditName_Xpath", "Changed Name");

			done();

			logger1.info("'save' clicked");
			click("SaveProfile_Xpath");

			Thread.sleep(1000);
			logger1.info("'ok' clicked");
			tapObject("OK_Xpath");

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 9, description = "deleteAddress")
	public void deleteAddress() throws Exception {

		logger1 = extent.createTest("deleteAddress");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'options' clicked");
			click("EditOption_Xpath");

			logger1.info("'delete' clicked");
			new TouchAction(driver).tap(289, 230).perform();

			logger1.info("'ok' clicked");
			click("OKAddress_Xpath");
			click("OKAddress_Xpath");
			back();

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 10, description = "manageAffiliates")
	public void manageAffiliates() throws Exception {

		logger1 = extent.createTest("manageAffiliates");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'Manage Affiliates' clicked");
			tapObject("Affiliates_Xpath");

			logger1.info("'Add new Affiliates' clicked");
			tapObject("NewAddress_Xpath");
			Thread.sleep(1000);
			back();
			back();
			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 11, description = "Add New Card")
	public void AddNewCard() throws Exception {

		logger1 = extent.createTest("Add New Card");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'saved cards' option clicked");
			Thread.sleep(1000);
			tapObject("SavedCard_Xpath");

			logger1.info("'add new card' option clicked");
			tapObject("NewAddress_Xpath");

			logger1.info("card holder name 'Jeebo' typed");
			type("CardHolderName_Xpath", "Jeebo");

			logger1.info("card number '4111111111111111' typed");
			type("CardNumber_Xpath", "4111111111111111");

			Thread.sleep(1000);
			logger1.info("expiry date of card entered successfully");

			/*
			 * WebDriverWait wait = new WebDriverWait(driver, 15);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
			 * "ExpiryDate_ID")));
			 */

			click("ExpiryDate_Xpath");
			Thread.sleep(1000);
			point(138,519);
			point(137,594);
            
			logger1.info("'done' is clicked");
			done();

			logger1.info("CVV number '123' typed ");
			type("CVV_Xpath", "123");
			done();

			logger1.info("'add' option clicked");
			click("AddClick_Xpath");

			Thread.sleep(1000);
			logger1.info("'ok' option clicked");
			click("OKAddress_Xpath");
			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 12, description = "Delete card")
	public void DeleteCard() throws Exception {
		Thread.sleep(1000);

		logger1 = extent.createTest("Delete card");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("swipe left is done successfully");
			//tapObject("SavedCard_Xpath");

			Thread.sleep(2000);
			SwipeLeft(driver,0.90,0.20,2000);
			//((JavascriptExecutor)driver).executeScript("scroll(800,0)");
			//swipeLeft("Swipe_Xpath");
//			 JavascriptExecutor js = (JavascriptExecutor) driver;
//			 HashMap<String, Object> swipeObject = new HashMap<String, Object>();
//			 swipeObject.put("startX", 343);
//		     swipeObject.put("startY", 320);
//		     swipeObject.put("endX", 48); 
//		     swipeObject.put("endY", 320); 
//		     swipeObject.put("direction", "left"); 
//		     //swipeObject.put("duration", "2000");
//		     js.executeScript("mobile: swipe", swipeObject); 
//		     // js.executeScript("mobile: scroll", swipeObject);
		
			 
			Thread.sleep(1000);
			logger1.info("'delete' option clicked");
			click("DeleteOption_Xpath");

			logger1.info("'ok' option clicked");
			click("OKAddress_Xpath");

			Thread.sleep(1000);
			logger1.info("'confirm ok' option clicked");
			click("OKAddress_Xpath");
			back();

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 13, description = "Purchase History")
	public void PurchaseHistory() throws Exception {

		logger1 = extent.createTest("Purchase History");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'Purchase History' clicked");
			click("PurchaseHistory_Xpath");

			logger1.info("'My Orders' clicked");
			click("MyOrders_Xpath");

			logger1.info("'Purchase History' clicked");
			click("AffiliateOrders_Xpath");

			logger1.info("'See all affiliates account's request' clicked");
			click("SeeAllAffiliatesRequest_Xpath");

			logger1.info("'received' affiliate clicked");
			click("ReceivedAffiliate_Xpath");

			logger1.info("'requested' affiliate clicked");
			click("RequestedAffiliate_Xpath");
			back();
			back();
			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 0, description = "notification preferences")
	public void NotificationPreferences() throws Exception {

		logger1 = extent.createTest("notification preferences");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'notification preferences' clicked");
			click("NotificationPreferences_Id");
			Thread.sleep(1000);

			logger1.info("turn off notifications clicked");
			new TouchAction(driver).tap(983, 295).perform();
			Thread.sleep(2000);
			logger1.info("turn on notifications clicked");
			new TouchAction(driver).tap(983, 295).perform();

			Thread.sleep(1000);
			logger1.info("turn off 'messages'");
			new TouchAction(driver).tap(979, 454).perform();
			Thread.sleep(2000);
			logger1.info("turn on 'messages'");
			new TouchAction(driver).tap(979, 454).perform();
			Thread.sleep(1000);
			logger1.info("turn off 'Likes and Comments'");
			new TouchAction(driver).tap(979, 605).perform();
			Thread.sleep(2000);
			logger1.info("turn on 'Likes and Comments'");
			new TouchAction(driver).tap(979, 605).perform();
			Thread.sleep(1000);
			logger1.info("turn off 'Friend Request Received'");
			new TouchAction(driver).tap(975, 760).perform();
			Thread.sleep(2000);
			logger1.info("turn on 'Friend Request Received'");
			new TouchAction(driver).tap(975, 760).perform();
			Thread.sleep(1000);
			logger1.info("turn off 'Friend Request Accepted'");
			new TouchAction(driver).tap(979, 915).perform();
			Thread.sleep(2000);
			logger1.info("turn on 'Friend Request Accepted'");
			new TouchAction(driver).tap(979, 915).perform();
			back();

			logger1.info("turn on 'private account'");
			new TouchAction(driver).tap(1018, 1680).perform();
			Thread.sleep(1000);
			logger1.info("turn off 'private account'");
			new TouchAction(driver).tap(1018, 1680).perform();

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 14, description = "change password")
	public void ChangePassword() throws Exception {

		logger1 = extent.createTest("change password");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'PrivateAccount' clicked");
			click("PrivateAccount_Xpath");
			
			Thread.sleep(1000);
			logger1.info("'change password' clicked");
			click("ChangePassword_Xpath");
			
			logger1.info("current password '123456' typed");
			type("CurrentPassword_Xpath", "123456");
			Thread.sleep(1000);
			logger1.info("new password '123457' typed");
			type("NewPassword_Xpath", "123457");

			logger1.info("confirm new password '123457' typed");
			type("ConfirmNewPassword_Xpath", "123457");

			back();

			logger1.info("'change password' button clicked");
			click("ChangePasswordClicked_Xpath");

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 15, description = "Accept any request in notification screen")
	public void notification() throws Exception {

		Thread.sleep(1000);
		logger1 = extent.createTest("Accept any request in notification screen");
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			logger1.info("'notification' icon clicked");
			click("NotificationIcon_Xpath");
			Thread.sleep(1000);
			logger1.info("accept incoming request 1");
			click("IncomingRequest_Xpath");
			Thread.sleep(1000);
			logger1.info("'ok' clicked");
			click("CommonOK_Xpath");
			
			logger1.info("accept incoming request 2");
			click("IncomingRequest2_Xpath");
			
			logger1.info("'ok' clicked");
			click("CommonOK_Xpath");
			
			logger1.info("accept incoming request 3");
			click("IncomingRequest2_Xpath");
			
			logger1.info("'ok' clicked");
			click("CommonOK_Xpath");
			/*
			 * Thread.sleep(1000); logger1.info("accept incoming request 2");
			 * click("IncomingRequest2_Xpath");
			 * 
			 * logger1.info("'ok' clicked"); click("CommonOK_ID");
			 * 
			 * Thread.sleep(1000);
			 */

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}
	
	
	@Test(enabled = false, priority = 16, description = "create shopping list and add participants")
	public void createList() throws Exception {

		logger1 = extent.createTest("Create List");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("chat icon clicked");
			click("ChatIcon_Xpath");

			logger1.info("'shopping list' add symbol clicked");
			click("ShoppingList_Xpath");

			logger1.info("First shopping title 'Item List 1' is typed");
			type("ShoppingListTitle_Xpath", "Item List 1");
			done();

			logger1.info("'create list' clicked");
			click("CreateList_Xpath");

			logger1.info("'ok' clicked");
			click("OKAddress_Xpath");
			Thread.sleep(1000);
			back();

			logger1.info("'shopping list' add symbol clicked");
			click("ShoppingList_Xpath");

			logger1.info("Second shopping title 'Item List 2' typed");
			type("ShoppingListTitle_Xpath", "Item List 2");
			done();

			logger1.info("'create list' clicked");
			click("CreateList_Xpath");

			logger1.info("'ok' clicked");
			click("OKAddress_Xpath");
			back();

			Thread.sleep(1000);

			logger1.info("'shopping list' add symbol clicked");
			click("ShoppingList_Xpath");

			logger1.info("Third shopping title 'Item List 3' typed");
			type("ShoppingListTitle_Xpath", "Item List 3");
			
			done();

			logger1.info("'add participant' clicked");
			click("AddParticipant_Xpath");

			logger1.info("added first participant");
			click("Participant_Xpath");

			logger1.info("added second participant");
			click("Participant_Xpath");

			logger1.info("'search icon' clicked");
			click("Search_Xpath");

			logger1.info("'Ironman' name searched and clicked");
			type("NameSearched_Xpath", "Third");

			Thread.sleep(1000);
			logger1.info("'add' option clicked");
			point(317,101);
			logger1.info("'cancel' option clicked");
			point(327,47);
			Thread.sleep(1000);
			logger1.info("'done' option clicked");
			click("Done3_Xpath");
			logger1.info("'create list' clicked");
			click("CreateList_Xpath");

			logger1.info("'ok' clicked");
			click("OKAddress_Xpath");
			back();

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 17, description = "rename and quit already added shopping list")
	public void renameQuitList() throws Exception {
		Thread.sleep(1000);

		logger1 = extent.createTest("Rename_Quit_List");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("top most shopping list clicked");
			click("TopShoppingList_Xpath");
			Thread.sleep(1000);

			logger1.info("'rename' text clicked");
			click("RenameList_Xpath");

			logger1.info("'Renamed Item List' typed");
			clear("EditRename_Xpath");
			type("EditRename_Xpath", "Renamed Item List");

			logger1.info("'rename' icon clicked");
			click("Rename_Xpath");
			Thread.sleep(1000);

			logger1.info("'menu options' id 'com.app.jeebo:id/iv_menu' clicked");
			click("Options_Xpath");

			logger1.info("'turn on notifications' text clicked");
			point(177,563);

			logger1.info("'options' clicked");
			click("Options_Xpath");

			logger1.info("'turn off notifications' text clicked");
			point(177,563);

			logger1.info("'menu options' id 'com.app.jeebo:id/iv_menu' clicked");
			click("Options_Xpath");

			logger1.info("'quit the list' clicked");
			point(184,523);

			logger1.info("'ok' clicked");
			point(253,379);

			Thread.sleep(1000);
			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}

	@Test(enabled = true, priority = 18, description = "delete the already added shopping list")
	public void deleteList() throws Exception {

		Thread.sleep(1000);
		logger1 = extent.createTest("delete List");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'top shopping list' clicked");
			click("TopShoppingList_Xpath");

			Thread.sleep(1000);
            logger1.info("'options' clicked");
            click("Options_Xpath");

			logger1.info("'cancel' clicked");
			click("Cancel_Xpath");

			logger1.info("'options' clicked");
			click("Options_Xpath");

			logger1.info("'delete list' clicked");
			point(185,602);
			Thread.sleep(1000);
			logger1.info("'ok' clicked");
			point(251,378);
			
            Thread.sleep(1000);
			logger1.info("'ok' clicked");
			point(187,371);

			Thread.sleep(1000);
			logger1.info("go to messages window");
			click("MessagesWindow_Xpath");

			logger1.info("'add option' clicked");
			click("ShoppingList_Xpath");

			logger1.info("first name clicked");
			click("FirstNameMsg_Xpath");

			logger1.info("'Hi' message send to name Anshul");
			type("ChatMessage_Xpath", "Hi");

			logger1.info("'send' clicked");
			click("Send_Xpath");
			done();
			back();

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}



	@Test(enabled = false, priority = 20, description = "Go to restaurants category and search and add products")
	public void RestaurantsCategory() throws Exception {

		logger1 = extent.createTest("Indian category functionality in Restaurants");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		click("Home_ID");
		try {
			logger1.info("'restaurants' category clicked");
			driver.findElement(By.id("com.app.jeebo:id/iv_category")).click();

			Category("Category_ID");

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

}
