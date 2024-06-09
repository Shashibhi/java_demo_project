package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		Actions act = new Actions(driver);
		
		WebElement Desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement Mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		
		act.moveToElement(Desktop).moveToElement(Mac).click().perform();
		
		}

}
