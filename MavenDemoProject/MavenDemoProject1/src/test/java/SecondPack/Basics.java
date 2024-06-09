package SecondPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//div[@class='nav float-end']//div[@class='dropdown']//span[@class='d-none d-md-inline']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	}

}
