package revision.day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//1)geturl
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//2)getTitle
		String Act_Title=driver.getTitle();
		String Exp_Title="OrangeHRM";
		System.out.println(Act_Title);
		
		if(Act_Title.equals(Exp_Title))
		{
			System.out.println("Both are matched");
			
		}
		else
		{
			System.out.println("Not matched");
		}
		
		
		
		//3)getCurrenturl of the page
		System.out.println(driver.getCurrentUrl());
		
		//4)getpagesourec
		
		//System.out.println(driver.getPageSource());
		
		
		//5)getWindowhandles
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> Window = driver.getWindowHandles();
		List<String> list = new ArrayList(Window);
		String parent = list.get(0);
		String child = list.get(1);
		
		System.out.println(driver.switchTo().window(child).getTitle());
		System.out.println(driver.switchTo().window(parent).getTitle());
		
		
	/*	for(String br:Window)
		{
			String title = driver.switchTo().window(br).getTitle();
			System.out.println(title);
		} */
	}

}
