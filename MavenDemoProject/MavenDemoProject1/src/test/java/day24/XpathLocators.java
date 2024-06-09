package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathLocators {
public static void main(String[] args) {
	
	
	ChromeOptions option = new ChromeOptions();
	option.setHeadless(true);
	
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	driver.get("https://demo.nopcommerce.com/");
	
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mac");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	System.out.println(driver.getTitle());
	driver.quit();
}
}
