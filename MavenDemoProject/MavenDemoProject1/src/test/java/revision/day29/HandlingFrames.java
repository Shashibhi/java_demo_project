package revision.day29;

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
		
		//1)frame1
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//2)frame2
		
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//3)frame3
		
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		
	}

}
