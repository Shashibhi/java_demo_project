import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame(frame1);
		
		WebElement f1 = driver.findElement(By.xpath("//input[@value='Hello World!']"));
		WebElement f2 = driver.findElement(By.id("field2"));
		WebElement f3 = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act = new Actions(driver);
		f1.clear();
		f1.sendKeys("welcome");
		act.doubleClick(f3);
		
		
		
	}

}
