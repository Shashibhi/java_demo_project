package revision.day29;

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
		driver.manage().window().maximize();

/*		// frame1
		WebElement frm1 = driver.findElement(By.xpath("//body/center[1]"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		driver.switchTo().defaultContent();

		// frame2

		WebElement frm2 = driver.findElement(By.xpath("//body"));
		driver.switchTo().frame(frm2);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		driver.switchTo().defaultContent(); */

		// frame3

		WebElement frm3 = driver.findElement(By.xpath("//body"));

		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("TestNG");

		// frme3--inner iframe
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();

	}
}
