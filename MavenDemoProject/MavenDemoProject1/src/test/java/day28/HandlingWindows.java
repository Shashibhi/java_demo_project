package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		
		Set<String> windowIds = driver.getWindowHandles();
		
		List<String> list = new ArrayList(windowIds);
		
		String parent = list.get(0);
		String child = list.get(1);
		
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());  
		
		//Approach 2
		/*	for(String alllist:windowIds)
		{
			String str = driver.switchTo().window(alllist).getTitle();
			if(str.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
			{
				//System.out.println(driver.getCurrentUrl());
				driver.close();
			}
			
		}*/
	}
	
	
	
	

}
