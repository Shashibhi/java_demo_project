package revision.day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmLogin {
	WebDriver driver;
	
	@Test(priority=1)
	void opeapp() throws InterruptedException
	{
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
	}
	
	@Test(priority=2)
	void logo() 
	{
		boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println(logo);
	}
	
	@Test(priority=3)
	void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@Test(priority=4)
	void close()
	{
		driver.quit();
	}

}
