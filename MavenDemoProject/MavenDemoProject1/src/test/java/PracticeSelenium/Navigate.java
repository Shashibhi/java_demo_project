package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-sm-12']//div[1]//div[1]//div[2]//h4[1]//a[1]")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
