import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for( WebElement count:list)
		{
			System.out.println(count.getText() );
		}
		
		driver.quit();
	}

}
