package page_Object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void login() throws InterruptedException
	{
		PomDemo login = new PomDemo(driver);
		login.setusername("Admin");
		login.setpassword("admin123");
		login.click();
		
		Thread.sleep(3000);
	}

	@AfterClass
	void tear_down()
	{
		driver.quit();
	}
}
