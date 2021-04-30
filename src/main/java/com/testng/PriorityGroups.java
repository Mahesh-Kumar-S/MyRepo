package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityGroups {
	
	@BeforeMethod
	public void enterURL() 
	{
		System.out.println("enter url-Before Method");
	}

	@Test(priority=1, groups="1")
	public void googleTitle() {
		System.out.println("Test Method1");
	}

	@Test(priority=3,groups="2")
	public void testMethod2() 
	{
		System.out.println("Test MEthod2");
				
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

}
