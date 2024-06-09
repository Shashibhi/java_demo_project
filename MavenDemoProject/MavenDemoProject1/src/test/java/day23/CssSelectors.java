package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1)tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");
		
		//2)tag Attributes
		
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"")).sendKeys("T-shirt");
		
		//3)tag class
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");
		
		
		//4)tag class attributes
		
		//driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("T-shirts");
	}

}
