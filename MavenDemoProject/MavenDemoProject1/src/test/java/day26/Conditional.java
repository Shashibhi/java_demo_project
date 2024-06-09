package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Thread.sleep(5000);
		
		//1)isdisplayed()
		//boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(logo);
		
		//2)isEnabled()
		//WebElement element=driver.findElement(By.id("small-searchterms"));
		//boolean en = element.isEnabled();
		//System.out.println(en);
		
		//3)isSelected()
		
		WebElement Male = driver.findElement(By.id("gender-male"));
		WebElement Female = driver.findElement(By.id("gender-female"));
		System.out.println(Male.isSelected());
		System.out.println(Female.isSelected());
		
		System.out.println("After selection check box");
		
		//Male.click();
		//System.out.println(Male.isSelected());
		//System.out.println(Female.isSelected());
		
		Female.click();
		System.out.println(Male.isSelected());
		System.out.println(Female.isSelected());
		
	}

}
