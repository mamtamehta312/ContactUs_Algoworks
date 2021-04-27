package com.algoworks.contactUs.Utilities;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.relevantcodes.extentreports.ExtentReports;

public class reports extends TestListenerAdapter	 {
		
	ExtentReports ex= new ExtentReports("");
	public void onStart(ITestContext it) {
   System.out.println(" Started");
   
		

	}

	
	public void onTestStart(ITestResult it) {

		System.out.println("Test Started");

	}

	
	public void onTestSuccess(ITestResult it) {

		System.out.println("Test Success");

	}

	
	public void onTestFailure(ITestResult it) {

		System.out.println("Test failure");

	}

	
	public void onTestSkipped(ITestResult it) {

		System.out.println("Test skipped");

	}


	public void onFinish(ITestContext it) {

		System.out.println("Test finished");

	}

	
}
