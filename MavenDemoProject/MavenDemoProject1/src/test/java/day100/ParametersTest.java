package day100;

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

import com.beust.jcommander.Parameter;

public class ParametersTest {
	WebDriver driver;
	
	
	@BeforeClass()
	@Parameters({"browser" ,"url"})
	void OpenApp(String br,String appurl) throws InterruptedException
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
		Thread.sleep(3000);
	}
	
	
	@Test()
	@Parameters({"username","password"})
	void login(String uname,String pwd) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
	}
	
	@Test
	void title() throws InterruptedException
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(3000);
	}
	
	
	
	@Test
	@Parameters({"url"})
	void url(String appurl) throws InterruptedException
	{
		Assert.assertEquals(driver.getCurrentUrl(), appurl);
		Thread.sleep(3000);
	}
	
	
	
	@AfterClass()
	void teardown()
	{
		driver.quit();
	}
	
	

}
