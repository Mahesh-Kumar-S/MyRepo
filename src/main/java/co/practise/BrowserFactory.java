package co.practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	public static void openBrowser() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./Config/config.properties");
		prop.load(fis);
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		String browserName = prop.getProperty("browsername");
		System.out.println(browserName);
		
		if(browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase(null) )
		{
			
			System.setProperty("webdriver.chrome.driver","./BrowserDrivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./BrowserDrivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		
		driver.get(url);
	}
	

}
