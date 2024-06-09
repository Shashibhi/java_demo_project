package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	driver.manage().window().maximize();
	
	
	//frame 1
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	
	//frame 2
	
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	
	//frame 3
	
	driver.switchTo().frame("classFrame");
	driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click();
	
	driver.quit();
}
}
