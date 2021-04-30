package com.testng.listeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListener.class)
public class ScreenshotTest extends BaseClass {

@BeforeMethod
public void setUp()
{
	BrowserInitialization();
	
}


//I have made Below test method to fail explicitly and whenever test method gets failed it automatically capture the screenshot method which is implemented in the CustomListner class 
@Test
public void takeScreenShotTest1() throws IOException
{
	Assert.assertEquals(false, true);
		
}

@Test
public void takeScreenShotTest2() throws IOException
{
	Assert.assertEquals(false, true);
		
}

@AfterMethod
public void tearDown()
{
	driver.quit();
}

}
