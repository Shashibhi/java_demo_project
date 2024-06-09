package revision.day42;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void login() throws InterruptedException
	{
		Thread.sleep(3000);
		LoginPage1 lp= new LoginPage1(driver);
		lp.SetPassword("Admin");
		lp.SetPassword("admin123");
		lp.SetClick();
	}
	
	@AfterClass
	void teardown()
	
	{
		driver.quit();
	}

}
