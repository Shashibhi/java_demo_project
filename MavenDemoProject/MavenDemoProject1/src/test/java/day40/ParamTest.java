 package day40;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser", "url"})
	void setup(String br,String appurl)
	{
		
		if (br.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver= new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(appurl);
		driver.manage().window().maximize();
	
	}
	
	@Test
	void testLogo() throws InterruptedException
	{
		Thread.sleep(3000);
		try
		{
			boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			Assert.assertEquals(status, true);
			
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	
	@Test
	void testHomePageTitle() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}

	@Test
	@Parameters({"url"})
	void testAppUrl(String appurl)
	{
		
		Assert.assertEquals(driver.getCurrentUrl(),appurl);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
