package com.testng.listeners;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	
	static WebDriver driver;
	
	public void BrowserInitialization()
	{
		System.setProperty("webdriver.chrome.driver","./BrowserDrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	public void takeScreenshot(String methodName){
		
		long millis=System.currentTimeMillis();  
		java.util.Date date=new java.util.Date(millis);  
		System.out.println(date); 
		TakesScreenshot sh = (TakesScreenshot)driver;
		File srcFile = sh.getScreenshotAs(OutputType.FILE);
		try
		{
		FileUtils.copyFile(srcFile, new File("./Screenshot/"+methodName+".png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		
	
	public void tearDown()
	{
		driver.quit();
		
	}
	
}
	


