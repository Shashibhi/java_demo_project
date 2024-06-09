package day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//1)get() -command
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//2)getTitle()
		
	/*	String pagr_title = driver.getTitle();
		System.out.println(pagr_title);
		String exp_titlt = "OrangeHRM";
		if(pagr_title.equals(exp_titlt))
		{ 
			System.out.println("both are matched");
		} */
		
		//3)getCurrentUrl()

		System.out.println(driver.getCurrentUrl());
		
	/*	//4)getPageSource()

		System.out.println("==="+driver.getPageSource());
	 */
		
		//4)getwindowHandle()
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> window = driver.getWindowHandles();
		
		
		for(String wn:window)
		{
			System.out.println(driver.switchTo().window(wn).getTitle());
			//System.out.println(driver.getTitle());
		}
		
		driver.quit();
		
		
}
}
