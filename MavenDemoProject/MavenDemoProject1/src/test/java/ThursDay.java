import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThursDay {
	
	
	public static void main(String[] args) {
		
		
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		
		driver.findElement(By.id("email")).sendKeys("sdadbjsdb@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		
		
	}

}
