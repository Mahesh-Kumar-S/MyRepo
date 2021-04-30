package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invocations {
	
	@BeforeMethod
	public void enterURL() 
	{
		System.out.println("enter url-Before Method");
	}

	@Test(priority=2)
	public void googleTitle() {
		System.out.println("Test Method1");
	}

	@Test(priority=1,invocationCount = 2,expectedExceptions = ArithmeticException.class)
	public void testMethod2() {
		System.out.println("Test MEthod2");
		int i = 9 / 0;
		
	}

	@Test(priority=3)
	public void testMethod3()
	{
		System.out.println("Test Method3");
	}
	
	//if you have more number of test methods and if your setting priority for only one test method then priority will not work
	
	
	@AfterMethod
	public void logout() {
		System.out.println("logout-After Method");
	}

}
