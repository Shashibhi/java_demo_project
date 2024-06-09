import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethosDemo {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		WebElement Display = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		System.out.println(Display.isDisplayed());
		
		//is enabled
		
		WebElement enabled = driver.findElement(By.xpath("//input[@placeholder='Search store']"));
		
		System.out.println(enabled.isEnabled());
		
		
		//select
		
		WebElement Male = driver.findElement(By.xpath("//input[@value='M']"));
		WebElement Female = driver.findElement(By.xpath("//input[@value='F']"));
		
		System.out.println("Before selecting ");
		System.out.println(Male.isSelected());
		System.out.println(Female.isSelected());
		
		System.out.println("After selecting");
		
		Male.click();
		System.out.println(Male.isSelected());
		System.out.println(Female.isSelected());
		
		Female.click();
		System.out.println(Male.isSelected());
		System.out.println(Female.isSelected());
		
		
		
	}

}
