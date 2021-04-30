package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	
	@BeforeSuite
	public void setUp() // 1
	{
		System.out.println("setup system property for chrome-Before Suite");
	}

	@BeforeTest
	public void login() // 2
	{
		System.out.println("login-Before Test");
	}

	@BeforeClass
	public void launchBrowser() // 3
	{
		System.out.println("Launch Chrome Browser-Before class");
	}

	@BeforeMethod
	public void enterURL() // 4
	{
		System.out.println("enter url-Before Method");
	}

	@Test(priority=1, groups="1")
	public void googleTitle() {
		System.out.println("Test Method1");
	}

	@Test(priority=3, invocationCount = 2, expectedExceptions = ArithmeticException.class,groups="2")
	public void testMethod2() {
		System.out.println("Test MEthod2");
		int i = 9 / 0;
		
	}

	@Test(priority=2, groups="1")
	public void testMethod3()
	{
		System.out.println("Test Method3");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout-After Method");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close browser");
	}
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("deleteAllCookies");
	}
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Generate Report");
	}

	// Before & After suite will execute 1, then Before & After test as 2, Before & After Class as 3, Before & After Method as 4
	// Before Method and After method will execute every time when every test method gets executed
	// Suite and Test will execute only once

}
