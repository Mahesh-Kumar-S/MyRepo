package com.testng.listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends BaseClass implements ITestListener{

//Whenever @test methods gets failed it will automatically call this below method and we have declare the screenshot method inside which will call the screenshot implementation to take the pics of failed cases
		
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Failed Tests");
		takeScreenshot(result.getMethod().getMethodName()); // this method is implemented in base class
	    
	 }
	
}
