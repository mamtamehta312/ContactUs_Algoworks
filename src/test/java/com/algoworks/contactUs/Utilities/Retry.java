package com.algoworks.contactUs.Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	public static  int retryCount=1;
	public static int count=0;
 
	
	@Override
	public boolean retry(ITestResult result) {
		
		
		if(count<retryCount)
		{
			count++;
			return true;
		}
		
		return false;
	}
	
	
}
