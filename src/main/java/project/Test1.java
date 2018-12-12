package project;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Base.Capabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Test1 extends Capabilities {

	Logger log = Logger.getLogger(Test1.class);

	@Test(enabled =false, priority = 1, description = "perform login functionality of 1st user to send request to jeebo")
	public void signUp1stUser() throws Exception {
		logger1 = extent.createTest("Login1stUser");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			logger1.info("'continue' clicked");
			click("Continue_ID");

			Thread.sleep(1000);
			logger1.info("'login' clicked");
			click("Login1_ID");

			logger1.info("'firstrequest@gmail.com' is typed");
			type("Email_ID", "firstrequest@gmail.com");

			logger1.info("password '123456' typed");
			type("Password_ID", "123456");

			logger1.info("back pressed");
			back();

			Thread.sleep(2000);
			logger1.info("'login' clicked");
			click("Login2_ID");
		



			/*
			 * Thread.sleep(1000);
			 * logger1.info("click on allow for access location");
			 * click("LocationAcess_ID");
			 */

			/*
			 * logger1.info("sign up is clicked"); click("SignUp_ID");
			 * 
			 * Thread.sleep(1000);
			 * logger1.info("phone number '123456' is typed in phone text");
			 * type("PhoneNumber_ID", "123456789"); back();
			 * 
			 * logger1.info("Finish text is clicked"); click("Finish_ID");
			 */

			logger1.info("newsfeed is clicked");
			click("Newsfeed_ID");

			logger1.info("search id is clicked");
			click("Search_ID");

			logger1.info("search people text is clicked");
			click("SearchPeople_ID");

			logger1.info("navigated to next searched box and 'jeebo' name is /'typed/'");
			type("NameSearched_ID", "jeebo");

			logger1.info("click on searched 'jeebo' id");
			click("AcceptRequest_ID");

			logger1.info("click on connect");
			click("EditProfile_ID");

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 1, description = "perform signup functionality")
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
			 * logger1.info("'Logout' clicked"); getObject("Logout_ID");
			 * click("Logout_ID");
			 */

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}

	@Test(enabled = false, priority = 2, description = "perform login functionality")
	public void LoginScreen() throws Exception {

		logger1 = extent.createTest("Login_Test");

		/*
		 * String name = getObject("Name"); System.out.println(name); String
		 * xpath =getObject("Continue_xpath"); System.out.println(xpath);
		 */
		// driver.findElement(By.xpath(getObject("Skip_Xpath"))).click();
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			// log.info("==========found xpath===========");
			// log.debug("=====found xpath=====");

//			logger1.info("'continue' clicked");
//			click("Continue_ID");
//
//			Thread.sleep(1000);
//			logger1.info("'login' clicked");
//			click("Login1_ID");

			logger1.info("email id 'producttesting111@gmail.com' typed");
			type("Email_Xpath", "producttesting111@gmail.com");

			logger1.info("password '123456' typed");
			type("Password_Xpath", "123457");

			logger1.info("done clicked");
			click("Done_Xpath");

			Thread.sleep(1000);
			logger1.info("'login' clicked");
			click("Login2_Xpath");

//			logger1.info("click on allow for access location");
//			click("LocationAcess_Xpath");

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}

	@Test(enabled = false, priority = 3, description = "updating profile by capture image from camera")
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

	@Test(enabled = true, priority = 4, description = "updating profile by taking image from gallery")
	public void edit_profile_gallery() throws Exception {

		logger1 = extent.createTest("edit_profile_gallery");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			logger1.info("'profile' clicked");
			click("Profile_Xpath");

			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\'ellipse3\'][1]")).click();
			logger1.info("'my profile' clicked");
			click("MyProfile_Xpath");
			Thread.sleep(3000);
			logger1.info("'edit profile' clicked");
			click("EditProfile_Xpath");

			logger1.info("'edit' option clicked");
			click("Image_Xpath");

			logger1.info("'remove' clicked");
			click("Remove_Xpath");

			logger1.info("'edit' clicked");
			click("Image_Xpath");

			logger1.info("'gallery' clicked");
			click("Gallery_Xpath");

			logger1.info("'gallery profile' clicked");
			click("GalleryProfile_Xpath");

			logger1.info("'gallery sub profile' clicked");
			click("GallerySubProfile_Xpath");

			/*
			 * logger1.info("'save' option for gallery clicked");
			 * click("SaveClickCamera_ID");
			 * 
			 * logger1.info("'ok' option for gallery clicked");
			 * click("CommonOK_ID");
			 */

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 5, description = "Setup profile information")
	public void SetInfoInProfile() throws Exception {

		logger1 = extent.createTest("Set Info In Profile");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			logger1.info("remove already present text and type 'Jeebo' text");
			clear("Name_ID");
			type("Name_ID", "Jeebo");
			back();

			logger1.info("phone number '123456789' typed");
			clear("PhoneNumber_ID");
			type("PhoneNumber_ID", "123456789");
			back();

			logger1.info("email id 'producttesting111@gmail.com' already given");
			MobileElement d = driver.findElement(By.id("com.app.jeebo:id/tv_edit_profile_email_id"));
			System.out.println(d);

			SwipeUpWindow();

			logger1.info("'male' clicked");
			click("Male_ID");

			logger1.info("'This is Jeebo app' typed in 'About'");
			clear("About_ID");
			type("About_ID", "This is Jeebo app");
			back();

			logger1.info("'save' clicked");
			click("SaveClickCamera_ID");

			logger1.info("'ok' clicked");
			Thread.sleep(1000);
			click("CommonOK_ID");

			back();

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 6, description = "Manage address")
	public void ManageAddress() throws Exception {

		logger1 = extent.createTest("Manage address");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			logger1.info("'manage address' clicked");
			click("ManageAddress_ID");

			logger1.info("'add new address' clicked");
			click("NewAddress_ID");

			logger1.info("'use my current location' clicked");
			click("CurrentLocation_ID");
			Thread.sleep(1000);

			/*
			 * logger1.info("'allow access to location' clicked");
			 * click("LocationAcess_ID");
			 * 
			 * Thread.sleep(2000); logger1.info("'201301' zipcode typed");
			 * type("Zipcode_ID","201301");
			 * 
			 * logger1.info("'Noida' city typed"); type("City_ID","Noida");
			 * 
			 * back();
			 * 
			 * logger1.info( "'U.P' state typed"); type("State_ID","U.P");
			 * 
			 * back();
			 */

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

	@Test(enabled = false, priority = 7, description = "Editting Text")
	public void EdittingText() throws Exception {

		logger1 = extent.createTest("Editting Text");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			logger1.info("'edit option' clicked");
			click("EditOption_ID");

			logger1.info("'edit' text clicked");
			click("EditText_ID");

			logger1.info("'Changed name' typed in name textbox");
			// change name
			clear("EditName_ID");
			type("EditName_ID", "Changed Name");

			back();

			logger1.info("'save' clicked");
			click("CommonSave_ID");

			Thread.sleep(1000);
			logger1.info("'ok' clicked");
			click("CommonOK_ID");

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 8, description = "addNewAddress")
	public void addNewAddress() throws Exception {

		logger1 = extent.createTest("addNewAddress");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'new address' clicked");
			click("NewAddress_ID");

			logger1.info("flat address 'A61/B4' typed");
			Thread.sleep(1000);
			type("FlatAddress_ID", "A61/B4");

			logger1.info("locality 'First Floor Spring Meadows Business Park' clicked");
			type("Locality_ID", "First Floor Spring Meadows Business Park");

			logger1.info("zipcode '201301' typed");
			type("Zipcode_ID", "201301");

			logger1.info("city 'noida' typed");
			type("City_ID", "Noida");
			back();

			logger1.info("state 'uttar pradesh' typed");
			type("State_ID", "Uttar Pradesh");

			logger1.info("country 'india' typed");
			type("Country_ID", "India");
			back();

			logger1.info("name 'Jeebo app' typed");
			type("EditName_ID", "Jeebo app");
			back();

			logger1.info("'other' option clicked");
			click("OtherOption_ID");

			logger1.info("'save' clicked");
			// click on save
			click("CommonSave_ID");

			logger1.info("'ok' clicked");
			Thread.sleep(1000);
			click("CommonOK_ID");
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
			click("EditOption_ID");

			logger1.info("'delete' clicked");
			click("Delete_ID");

			logger1.info("'ok' clicked");
			click("CommonOK_ID");
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
			click("Affiliates_ID");

			logger1.info("'Add new Affiliates' clicked");
			click("AddNewAffiliates_ID");
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
			click("SavedCard_ID");

			logger1.info("'add new card' option clicked");
			click("NewAddress_ID");

			logger1.info("card holder name 'Jeebo' typed");
			type("CardHolderName_ID", "Jeebo");

			logger1.info("card number '4111111111111111' typed");
			type("CardNumber_ID", "4111111111111111");

			Thread.sleep(1000);
			logger1.info("expiry date of card entered successfully");

			/*
			 * WebDriverWait wait = new WebDriverWait(driver, 15);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
			 * "ExpiryDate_ID")));
			 */

			click("ExpiryDate_ID");
			// driver.findElement(By.id("com.app.jeebo:id/edt_expiry")).click();

			logger1.info("'set' is clicked ");
			click("SetClick_ID");

			logger1.info("CVV number '123' typed ");
			type("CVV_ID", "123");
			back();

			logger1.info("'add' option clicked");
			click("AddClick_ID");

			Thread.sleep(1000);
			logger1.info("'ok' option clicked");
			click("CommonOK_ID");
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
			SwipeLeft();

			Thread.sleep(1000);
			logger1.info("'delete' option clicked");
			click("DeleteOption_ID");

			logger1.info("'ok' option clicked");
			click("CommonOK_ID");

			Thread.sleep(1000);
			logger1.info("'confirm ok' option clicked");
			click("CommonOK_ID");
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
			click("PurchaseHistory_ID");

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

	@Test(enabled = false, priority = 14, description = "notification preferences")
	public void NotificationPreferences() throws Exception {

		logger1 = extent.createTest("notification preferences");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'notification preferences' clicked");
			click("NotificationPreferences_ID");
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

	@Test(enabled = false, priority = 15, description = "change password")
	public void ChangePassword() throws Exception {

		logger1 = extent.createTest("change password");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'change password' clicked");
			click("ChangePassword_ID");

			logger1.info("current password '123456' typed");
			type("CurrentPassword_ID", "123456");

			logger1.info("new password '123457' typed");
			type("NewPassword_ID", "123457");

			logger1.info("confirm new password '123457' typed");
			type("ConfirmNewPassword_ID", "123457");

			back();

			logger1.info("'change password' button clicked");
			click("ChangePasswordClicked_ID");

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
			click("ChatIcon_ID");

			logger1.info("'shopping list' add symbol clicked");
			click("ShoppingList_ID");

			logger1.info("First shopping title 'Item List 1' is typed");
			type("ShoppingListTitle_ID", "Item List 1");
			back();

			logger1.info("'create list' clicked");
			click("CreateList_ID");

			logger1.info("'ok' clicked");
			click("CommonOK_ID");
			Thread.sleep(1000);
			back();

			logger1.info("'shopping list' add symbol clicked");
			click("ShoppingList_ID");

			logger1.info("Second shopping title 'Item List 2' typed");
			type("ShoppingListTitle_ID", "Item List 2");
			back();

			logger1.info("'create list' clicked");
			click("CreateList_ID");

			logger1.info("'ok' clicked");
			click("CommonOK_ID");
			back();

			Thread.sleep(1000);

			logger1.info("'shopping list' add symbol clicked");
			click("ShoppingList_ID");

			logger1.info("Third shopping title 'Item List 3' typed");
			type("ShoppingListTitle_ID", "Item List 3");
			back();

			logger1.info("'add participant' clicked");
			click("AddParticipant_ID");

			logger1.info("added first participant");
			click("Participant_ID");

			logger1.info("added second participant");
			click("Participant_ID");

			logger1.info("'search icon' clicked");
			click("Search_ID");

			logger1.info("'Ironman' name searched and clicked");
			type("NameSearched_ID", "Ironman");

			Thread.sleep(1000);
			logger1.info("'add' option clicked");
			click("Participant_ID");

			logger1.info("'done' option clicked");
			click("Done_ID");

			logger1.info("'create list' clicked");
			click("CreateList_ID");

			logger1.info("'ok' clicked");
			click("CommonOK_ID");
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
			click("TopShoppingList_ID");
			Thread.sleep(1000);

			logger1.info("'rename' text clicked");
			clear("RenameList_ID");

			logger1.info("'Renamed Item List' typed");
			type("EditName_ID", "Renamed Item List");

			logger1.info("'rename' icon clicked");
			click("CommonOK_ID");
			Thread.sleep(1000);

			logger1.info("'menu options' id 'com.app.jeebo:id/iv_menu' clicked");
			click("MenuOptions_ID");

			logger1.info("'turn on notifications' text clicked");
			click("Notifications_ID");

			logger1.info("'options' clicked");
			click("MenuOptions_ID");

			logger1.info("'turn off notifications' text clicked");
			click("Notifications_ID");

			logger1.info("'menu options' id 'com.app.jeebo:id/iv_menu' clicked");
			click("MenuOptions_ID");

			logger1.info("'quit the list' clicked");
			click("QuitList_ID");

			logger1.info("'ok' clicked");
			click("CommonOK_ID");

			Thread.sleep(1000);
			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}

	}

	@Test(enabled = false, priority = 18, description = "delete the already added shopping list")
	public void deleteList() throws Exception {

		Thread.sleep(1000);
		logger1 = extent.createTest("delete List");

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger1.info("'top shopping list' clicked");
			click("TopShoppingList_ID");

			Thread.sleep(1000);

			logger1.info("'options' clicked");
			click("MenuOptions_ID");

			logger1.info("'cancel' clicked");
			click("Cancel_ID");

			logger1.info("'options' clicked");
			click("MenuOptions_ID");

			logger1.info("'delete list' clicked");
			click("DeleteList_ID");

			logger1.info("'ok' clicked");
			click("CommonOK_ID");

			logger1.info("'ok' clicked");
			click("CommonOK_ID");

			Thread.sleep(1000);
			logger1.info("go to messages window");
			click("MessagesWindow_Xpath");

			logger1.info("'add option' clicked");
			click("ShoppingList_ID");

			logger1.info("first name clicked");
			click("FirstNameMsg_ID");

			logger1.info("'Hi' message send to name Anshul");
			type("ChatMessage_ID", "Hi");

			logger1.info("'send' clicked");
			click("Send_ID");
			back();
			back();

			logger1.pass("Pass");
		} catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
	}

	@Test(enabled = false, priority = 19, description = "Accept any request in notification screen")
	public void notification() throws Exception {

		Thread.sleep(1000);
		logger1 = extent.createTest("Accept any request in notification screen");
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			logger1.info("'notification' icon clicked");
			click("NotificationIcon_ID");

			logger1.info("accept incoming request 1");
			click("IncomingRequest_Xpath");

			logger1.info("'ok' clicked");
			click("CommonOK_ID");
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
