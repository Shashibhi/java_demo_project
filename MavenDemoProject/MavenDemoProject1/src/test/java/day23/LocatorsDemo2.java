package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demo.opencart.com/");
		
		List<WebElement> List = driver.findElements(By.tagName("a"));
		System.out.println(List.size());
		
		for(WebElement list:List)
		{
			System.out.println(list.getText());
		}
		driver.quit();
	}

}
