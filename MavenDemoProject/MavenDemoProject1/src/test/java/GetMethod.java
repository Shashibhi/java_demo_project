import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		
		System.out.println("Current url ..:"+driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		
		 Set<String> wn = driver.getWindowHandles();
		 
		 for(String wind:wn)
		 {
			 driver.switchTo().window(wind);
			 System.out.println("Title of the pages..:"+driver.getTitle());
			 
		 }
		 
		 driver.quit();
		
		
	}

}
