package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInnerFrames {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");

		// frame 1
		// WebElement frm1 =driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		// driver.switchTo().frame("frm1");
		// driver.findElement(By.name("mytext1")).sendKeys("welcome");
		// driver.switchTo().defaultContent();

		// frame3
		// WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']"))); // direct

		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Testing");

		// frme3--inner iframe
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();

	}
}
