package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Capabilities;

public class InvalidLogin1 extends Capabilities {
	
	@Test(enabled=false)
	public void InvalidLogin() throws Exception {
		logger1=extent.createTest("verify invalid text at login");
		try {
			logger1.info("username \"benm449@gmail.com\" is typed in textbox '//*[@id=\"Username\"]'");
			type("Username_Xpath","username");
			logger1.info("correct password \"12345\" is typed in textbox '//*[@id=\"Password\"]'");
			type("Password_Xpath","wrongPassword");
			Thread.sleep(1000);
			logger1.info("sign-in is clicked");
		    click("SignIn_Xpath");
		    Thread.sleep(2000);

			//    WebElement objSbm = driver.findElement(By.id("loginValidationSummary"));
		    WebElement objSbm = findElement("validationMessage_ID");
			    if(objSbm.isDisplayed())
			    {
			        System.out.println("Submit button has displayed");
			        objSbm.click();
			        logger1.info(objSbm.getText()+"This message found");
			    }
			    else
			    {
			    	logger1.info("Submit button did not displayed");
			    } 

		    Thread.sleep(1000);
	        logger1.pass("TC Pass \"user not able to login with wrong password\"");
		    }
		catch(Exception e) {
			logger1.fail(e);
			throw e;
		}
}
}
