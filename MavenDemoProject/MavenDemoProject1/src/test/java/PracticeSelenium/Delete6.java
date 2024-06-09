package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Delete6 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		
		
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		
		
		driver.findElement(By.id("email")).sendKeys("shashi@Gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.println(alt.getText());
		
		alt.accept();
		
		driver.quit();
		
	}
}
