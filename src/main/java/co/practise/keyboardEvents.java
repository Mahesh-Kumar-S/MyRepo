package co.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEvents {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./BrowserDrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//div[@class='_6ltg']//following-sibling::div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_2_')]")).click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		Actions act=new Actions(driver);
		act.moveToElement(firstname);
		act.sendKeys("Fname")
		.sendKeys(Keys.TAB)
		.sendKeys("Lname")
		.sendKeys(Keys.TAB)
		.build().perform();
		

	}

}
