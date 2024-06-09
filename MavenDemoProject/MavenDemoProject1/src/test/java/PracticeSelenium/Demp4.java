package PracticeSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demp4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windid = driver.getWindowHandles();
		
		List<String> list = new ArrayList(windid);
		
		
		String Parent=list.get(0);
		String Child=list.get(1);
		
		
		driver.switchTo().window(Child);
		Thread.sleep(3000);
		
		System.out.println("Title of the page..:"+  driver.getTitle());
		System.out.println("Current url..:"+driver.getCurrentUrl());
		
		driver.quit();
		
		
	
	}

}
