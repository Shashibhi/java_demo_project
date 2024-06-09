package Pom_101;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	
	
	@BeforeClass()
	public void setup()
	
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	
	@Test()
	public void login() throws InterruptedException
	
	{
		
		Thread.sleep(3000);
		Login_Test lo= new Login_Test(driver);
		lo.username("Admin");
		lo.password("admin123");
		lo.clickbutton();
		lo.link();
	}
	
	@AfterClass()
	public void teardown()
	{
		driver.quit();
	}
	

}
