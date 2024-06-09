package revision.day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		WebElement search = driver.findElement(By.cssSelector("input.search-box-text[name=q]"));
		search.sendKeys("MacBook");
		
		WebElement clicking = driver.findElement(By.cssSelector("button[type=submit]"));
		clicking.click();
		
		driver.findElement(By.cssSelector("input#advs")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Books")).click();
		
		driver.findElement(By.xpath("//div[@class='picture']//img[@title='Show details for Fahrenheit 451 by Ray Bradbury']")).click();
		
		
		String text=driver.findElement(By.xpath("//div[@class='product-name']")).getText();
		System.out.println(text);
		
		
		
		//driver.quit();
		
		
		
		
		
	}

}
