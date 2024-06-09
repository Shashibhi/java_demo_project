package revision.day39;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	
	
	@BeforeMethod
	void login()
	
	{
		Assert.assertTrue(true);
	}
	
	
	
	@Test(priority=1)
	void search()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=2)
	void Advsearch()
	{
		Assert.assertTrue(true);
	}
	

	@AfterMethod
	void logout()
	{
		Assert.assertTrue(true);
	}
}
