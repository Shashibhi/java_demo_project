package revision.day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(WebElement List:list)
		{
			System.out.println(List.getText());
		}
		
		
		driver.quit();
		
		
	}

}
