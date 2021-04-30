package co.practise;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InitialLearnings extends BrowserFactory {
	
	//public static WebDriver driver;
	
	
	public void googleTitleTest() throws IOException 
	{
		System.out.println("Entered into Method");
		try
		{
	
		openBrowser();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Google");
		
		}
		catch(Exception e) {
			System.out.println("Exception"+" "+e.getMessage());
			//System.out.println(e.printStackTrace());
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("main method");
		InitialLearnings il = new InitialLearnings();
		il.googleTitleTest();
		
	}
 
}
