package revision.day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MacBook");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
	}

}
