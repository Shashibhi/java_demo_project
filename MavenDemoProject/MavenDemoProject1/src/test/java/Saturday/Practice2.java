package Saturday;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice2 {

	WebDriver driver;

	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br, String appurl)
	{
		
		if (br.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else
		{
			driver = new EdgeDriver();
		}
		//driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@Test
	void login()
	{
		Practice pp= new Practice(driver);
		pp.setUserName("Admin");
		pp.setPassword("admin123");
		pp.clickButton();
		System.out.println(pp.getTotalLinks());
	}
	
	
	@AfterClass
	void teardown()
	{
		
		driver.quit();
	}
	
}
