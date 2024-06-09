import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"openApp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=3, dependsOnMethods= {"openApp","login"})
	void search()
	{
		Assert.assertTrue(true);
	}

	
	@Test(priority=4, dependsOnMethods= {"login"})
	void Advsearch()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=4, dependsOnMethods= {"Advsearch"})
	void logout()
	{
		Assert.assertTrue(true);
	}
	
}
