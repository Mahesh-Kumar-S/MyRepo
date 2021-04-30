package com.testng;

import static org.testng.Assert.fail;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	WebDriver driver;

	@BeforeSuite
	public void A() // 1
	{
		System.out.println("A-Before Suite");
	}

	@BeforeTest
	public void B() // 2
	{
		System.out.println("B-Before Test");
	}

	@BeforeClass
	public void C() // 3
	{
		System.out.println("C-BeforeClass");
	}

	@BeforeMethod
	public void D() // 4
	{
		System.out.println("D-Before Method");
	}

	@Test(priority=1, groups="1")
	public void testMethod1() {
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
	public void E() {
		System.out.println("E-After Method");
	}

	// Before & After suite will execute 1, then Before & After test as 2, Before &
	// After Class as 3, Before & After Method as 4
	// Before Method and After method will execute every time when every test method
	// gets executed
	// Suite and Test will execute only once
}
