package com.testng.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int counter=0;
	int retryLimit=3;

	//If any test method gets fail, we are making it to iterate for max 3 times because if get fails for 1st time it will iterate for 2nd and 3rd time
	public boolean retry(ITestResult result) {
		
		
		if(counter<retryLimit)
		{
			counter++;
			return true;
		}
		
		return false; 
				
	}

}
