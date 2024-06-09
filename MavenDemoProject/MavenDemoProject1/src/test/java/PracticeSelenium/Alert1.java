package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testers World!!!']")).getText();
		System.out.println("Text of the page..:"+text);
		
		driver.findElement(By.id("email")).sendKeys("shashi123@gamil.com");
		driver.findElement(By.id("pwd")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Login']")).click();
		
		Alert art = driver.switchTo().alert();
		//art.accept();
		
		System.out.println(art.getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='link1']")).click();
		
		driver.quit();
	}
}
