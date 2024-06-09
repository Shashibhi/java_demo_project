package day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OrangeHrmLogin {
	WebDriver driver;
	
	@Test(priority=1)
	void openapp() throws InterruptedException
	{
		 driver = new EdgeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		
	}
	
	@Test(priority=2)
	void testlogo()
	{
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println(status);
	}

	@Test(priority=3)
	
	void testlogin()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}
	
	@Test(priority=4)
	void logout()
	{
		driver.quit();
	}
	
	
}
