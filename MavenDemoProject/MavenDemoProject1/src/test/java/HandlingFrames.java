import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		
		WebElement frame = driver.findElement(By.id("iframe2"));
		driver.switchTo().frame(frame);
		
		String text = driver.findElement(By.xpath("//*[@id=\"masthead\"]/p[2]")).getText();
		
		System.out.println("Text of the frame is..:"+text);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("ta1")).sendKeys();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
