package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete5 {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		
		driver.findElement(By.xpath("link1")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
	}

}
