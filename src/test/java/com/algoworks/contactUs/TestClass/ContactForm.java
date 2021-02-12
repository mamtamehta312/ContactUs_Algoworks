package com.algoworks.contactUs.TestClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import com.algoworks.contactUs.PageObjects.BaseClass;
import com.algoworks.contactUs.TestData.excelReader;
import com.algoworks.contactUs.Utilities.TestUtils;


public class ContactForm extends BaseClass {

	@Test(dataProvider = "ContactForm")                        
	public void contactForm( String testName,String locType,String loc ,String scroll,String waitNeeded,String name,String email,String phone,String message,String expected_res) throws InterruptedException, IOException
	{ 
		driver.get(url);
		rlog=extent.startTest(testName);
		rlog.setDescription(testName);
		TestUtils.contactButtonValidation(driver, testName, locType, waitNeeded, loc, scroll, rlog, log);
		TestUtils.submitDetails(driver, extent, rlog, log, name, email, phone, message, expected_res);	
	}
	
	@Test(dataProvider = "ServicesContactForm")
	public void servicesContactForm(String TestName , String service_locator ,String scroll_locator, String contact_locator , String exp_res,String waitNeeded) throws InterruptedException, IOException
	{
		
		
		driver.get(url);
		rlog=extent.startTest(TestName);
		rlog.setDescription(TestName);	
		TestUtils.servicesValidation(driver, rlog, log, TestName, service_locator, scroll_locator);		
		TestUtils.contactButtonValidation(driver, TestName, "xpath", waitNeeded, contact_locator, scroll_locator, rlog, log);
	
		
	}
	@Test
	public void NewUserTesting() throws InterruptedException, IOException
	{

	 TestUtils.getNewUserTesting(driver, url, rlog, log, extent);
	}
	
	@DataProvider(name="ServicesContactForm")
	public Object[][] getData1() throws IOException
	{
		int row=excelReader.RowCount(excelPath, 1);
		int cell=excelReader.CellCount(excelPath, 1,0);
		Object[][] data = new Object[row][cell];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				data[i-1][j]=excelReader.getData(excelPath, 1, i, j);
			}
		}
		return data;
	}

	@DataProvider(name="ContactForm")
	public Object[][] getData() throws IOException
	{
		int row=excelReader.RowCount(excelPath, 2);
		int cell=excelReader.CellCount(excelPath, 2,0);
		Object[][] data = new Object[row][cell];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				data[i-1][j]=excelReader.getData(excelPath, 2, i, j);
			}
		}
		return data;
	}

	
}





