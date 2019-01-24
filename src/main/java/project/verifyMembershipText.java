package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Capabilities;

public class verifyMembershipText extends Capabilities {
	
	
	
	public static void assertEquals(String actualResult, String expectedResult)
    {
	    String str = findElement(actualResult).getText();
	    
        if (str.equals(expectedResult))
        {logger1.pass(str + " matches with expected string");
        
        } else{
          	  logger1.fail(str + " does not matches with expected string"); 
            }    
}

	@Test()
	public void verifyMembershiptext() throws Exception {

		try {
		     Login.validLogin();

			logger1 = extent.createTest("Text verification in Membership option");
			logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
			click("MembershipOption_Xpath");
			
			Thread.sleep(1000);
			logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
			click("MembershipOption_Xpath");
			
			Thread.sleep(1000);
			assertEquals("MemberName_Xpath","Member Name: Gert Petrus Benjamin Myburgh");
			Thread.sleep(1000);
	       assertEquals("MembershipNumber_Xpath", "Membership Number: 02100100561"); 
	       Thread.sleep(1000);
	       assertEquals("PlanType_Xpath","Plan Type: STANDARD SELECT");
	  

	    Thread.sleep(1000);
	    logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
		click("MembershipOption_Xpath");
		
		Thread.sleep(1000);
		logger1.info("Benefits & Limits option is clicked");
		click("BenefitsAndLimitsOption_Xpath");
		
		
		Thread.sleep(1000);
		logger1.info("Family option is clicked");
		click("FamilyOption_Xpath");
		
		logger1.info("Benefits & Limits details of family");
		Thread.sleep(1000);
		assertEquals("AppliancesHearing_Xpath","Appliances-Hearing Aids");
		assertEquals("Rvalue1_Xpath","R 16,000.00");
		
		assertEquals("MentalHealthandSubstanceAbuse_Xpath","Mental Health and Substance Abuse");
		assertEquals("Rvalue2_Xpath","R 40,600.00");
		
		assertEquals("Appliances-Stoma&CPAPApparatus_Xpath","Appliances - Stoma & CPAP Apparatus");
		assertEquals("Rvalue3_Xpath","R 6,550.00");
		
		assertEquals("Oncology-SocialWorker_Xpath","Oncology - Social Worker");
		assertEquals("Rvalue4_Xpath","R 2,840.00");
		
		
//		for(int i=1;i<=11;i++) {
//			WebElement a = driver.findElement(By.xpath("//*[@id=\"benefitsFamilydetails\"]/table/tbody/tr[i]/td[1]"));
//			assertEquals(a.getText(),"Oncology - Social Worker");
//			
//			WebElement b = driver.findElement(By.xpath("//*[@id=\"benefitsFamilydetails\"]/table/tbody/tr[i]/td[2]"));
//			assertEquals("Oncology-SocialWorker_Xpath","Oncology - Social Worker");
//		}
//		WebElement table = driver.findElement(By.xpath("//*[@id=\"family\"]/div"));
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		for(WebElement a :rows) {
//		 List<WebElement> u = a.findElements(By.tagName("td"));
//		 for(WebElement i : u) {
//			 logger1.info("gdg : "+i.getText());
//			}
//		}
		
		
		    Thread.sleep(1000);
		    logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
			click("MembershipOption_Xpath");
			
			
			
			logger1.info("Contributions option is clicked");
			click("Contributions_Xpath");
			
		
			WebElement a1 = findElement("ContributionTable_Xpath");
			logger1.pass("Contributions table content:- " + a1.getText());
			
			Thread.sleep(1000);
			 logger1.info("Membership option \"//*[@id=\\\"header-navbar-collapse\\\"]/div[2]/ul/li[3]/a\" is clicked");
				click("MembershipOption_Xpath");
			
			Thread.sleep(1000);
			logger1.info("Membership status option is clicked");
			click("MembershipStatus_Xpath");
			
			logger1.info("Membership status table content");
			WebElement a2 = findElement("MembershipTable_Xpath");
			logger1.pass("Membership status table content:- " + a2.getText());
			
		
	
	
	logger1.pass("Testcase is Passed");
		}

		catch (Exception e) {
			logger1.fail(e);
			throw e;
		}
}}
