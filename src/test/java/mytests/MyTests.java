package mytests;
import com.testng.*;
import com.testng.listeners.BaseClass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MyTests extends BaseClass{
	
	@BeforeMethod
	public void initialization()
	{
		BrowserInitialization();
	}
	
	@Test
	public void testMethod1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void testMethod2()
	{
		Assert.assertEquals(true, true);
	}
	
	@AfterMethod
	public void browserExit()
	{
		tearDown();
	}

}
