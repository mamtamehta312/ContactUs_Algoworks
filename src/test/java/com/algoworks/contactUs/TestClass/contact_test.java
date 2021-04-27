package com.algoworks.contactUs.TestClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import com.algoworks.contactUs.PageObjects.BaseClass;
import com.algoworks.contactUs.PageObjects.contact_btn_page;
import com.algoworks.contactUs.PageObjects.contact_page;
import com.algoworks.contactUs.TestData.excelReader;
import com.algoworks.contactUs.Utilities.screenshot;
import com.algoworks.contactUs.Utilities.scrollDown;
import com.relevantcodes.extentreports.LogStatus;

public class contact_test extends BaseClass {
	
	      public static String use_case1;
	      public static String exp_res;
	
	    @Test(dataProvider = "contactUsData")
		 public   void contact_Test(String use_case,String name,String email,String phone,String message,String expected_res) throws InterruptedException, IOException
		 { 
	    	 
		     use_case1=use_case;
		     rlog=extent.startTest(use_case);
		     contact_btn_page bt= new contact_btn_page();
		     contact_page cp= new contact_page();
		     bt.clickContactButton();
		     rlog.log(LogStatus.INFO, " Contact Us Form Opened Successfully ! ");
			 log.info("Contact Us Form Opened Successfully ! ");
			 switch_driver_to_next_window("Contact Us - Algoworks");
             scrollDown.scroll();  //scroll the window 
	// All details filled
			 cp.setName(name);
			 cp.setEmail(email);
			 cp.setPhone(phone);
			 cp.setMessage(message); 
			 log.info("All Details entered Successfully !");
			 rlog.log(LogStatus.INFO, " All Details entered Successfully !");
			 rlog.log(LogStatus.INFO, rlog.addScreenCapture( "."+screenshot.shots(driver,use_case+"-1")));
	
			 Thread.sleep(1000);
			 cp.clickSubmit();
			 Thread.sleep(3000);
		// verfify Result
			 Assert.assertEquals(driver.getTitle(),expected_res);
		 }
	   
	   @DataProvider(name="contactUsData")
	     public Object[][] getData() throws IOException
	  {
		   int row=excelReader.RowCount(excelPath, sheetIndex);
		   int cell=excelReader.CellCount(excelPath, sheetIndex,1);
		   
		   Object[][] data = new Object[row][cell];
		   
		   for(int i=1;i<=row;i++)
		   {
			   for(int j=0;j<cell;j++)
			   {
				   data[i-1][j]=excelReader.getData(excelPath, sheetIndex, i, j);
			   }
		   }
		   
		   return data;
	  }
	
		 
}
