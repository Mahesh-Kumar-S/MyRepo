package com.testng;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./BrowserDrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void googleTitleTest()
	{
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Google1", "Title is not matched");
	}
	
	@Test
	public void mailLinkTest()
	{
		boolean b = driver.findElement(By.xpath(".//*[contains(text(),'Gmail')]")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
