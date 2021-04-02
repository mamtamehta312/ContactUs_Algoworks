package com.algoworks.contactUs.TestClass;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.algoworks.contactUs.PageObjects.BaseClass;
import com.algoworks.contactUs.PageObjects.CaseStudyPage;
import com.algoworks.contactUs.TestData.excelReader;
import com.algoworks.contactUs.Utilities.Retry;
import com.algoworks.contactUs.Utilities.TestUtils;
import com.relevantcodes.extentreports.LogStatus;

public class CaseStudy extends BaseClass{

	//@Test(dataProvider  = "Case_Study_Data_validation", retryAnalyzer = Retry.class)
	public void CaseStudyForm(String TestName,String scrollLocator,String case_study_locator,String name,String company_name,String email,String phone,String checkbox_needed,String expected_result, String testing_type) throws InterruptedException, IOException
	{
		
		driver.get(case_study_url);
		rlog=extent.startTest(TestName);
		rlog.setDescription(TestName);
		rlog.log(LogStatus.INFO, "Test Case Started !");
		log.info(TestName);
		log.info("Test Case Started !");
        TestUtils.CaseStudyFormValidation(driver, rlog, log, scrollLocator, case_study_locator);
        TestUtils.submitCaseStudyDetails(driver, rlog, log, name, company_name, email, phone, checkbox_needed, testing_type, expected_result);
		
		
	}
	@Test(dataProvider  = "Case_Study_form_validation", retryAnalyzer = Retry.class)
	public void CaseStudy(String TestName,String scrollLocator,String case_study_locator,String expected_result) throws IOException, Exception
	{
		
		driver.get(case_study_url);
		rlog=extent.startTest(TestName);
		rlog.setDescription(TestName);
		rlog.log(LogStatus.INFO, "Test Case Started !");
		log.info(TestName);
		log.info("Test Case Started !");
        TestUtils.CaseStudyFormValidation(driver, rlog, log, scrollLocator, case_study_locator);
        String actual_res=driver.findElement(By.id("myModalLabel")).getText();
        Assert.assertEquals(actual_res, expected_result);
		
	}
	
	
	
	@DataProvider(name="Case_Study_Data_validation")
	public Object[][] case_study_data() throws IOException
	{
		int row=excelReader.RowCount(excelPath, 5);
		int cell=excelReader.CellCount(excelPath, 5,0);
		Object[][] data = new Object[row][cell];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				data[i-1][j]=excelReader.getData(excelPath, 5, i, j);
			}
		}
		return data;
	}
	@DataProvider(name="Case_Study_form_validation")
	public Object[][] case_study_validation() throws IOException
	{
		int row=excelReader.RowCount(excelPath, 6);
		int cell=excelReader.CellCount(excelPath, 6,0);
		Object[][] data = new Object[row][cell];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				data[i-1][j]=excelReader.getData(excelPath, 6, i, j);
			}
		}
		return data;
	}
	
}
