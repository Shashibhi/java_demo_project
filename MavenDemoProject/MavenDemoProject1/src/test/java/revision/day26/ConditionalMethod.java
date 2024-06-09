package revision.day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		
		//1) Isdisplay
		boolean Display = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(Display);
		
		
		//2) Isenabled
		
		boolean IsEnabled=driver.findElement(By.id("small-searchterms")).isEnabled();
		System.out.println(IsEnabled);
		
		
		//3)IsSelected
		
		WebElement Male = driver.findElement(By.xpath("//input[@value='M']"));
		WebElement Female = driver.findElement(By.xpath("//input[@value='F']"));
		
		Male.click();
		System.out.println("Male is selected..:"+Male.isSelected());
		System.out.println("Female is selected..:"+Female.isSelected());
		
		
		Female.click();
		System.out.println("Male is selected..:"+Male.isSelected());
		System.out.println("Female is selected..:"+Female.isSelected());
		
		
		driver.quit();
		
		
		
		
		
	}

}
