package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testng.listeners.BaseClass;

public class ParameterInXML extends BaseClass {
	static WebDriver driver;
	
	@Test
	@Parameters({"url","emailid","password"})
	public void fbLogin(String url,String emailid,String password)
	{
		System.setProperty("webdriver.chrome.driver","./BrowserDrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(emailid);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(false, true);
		driver.quit();
	}

}
