package revision.day28;

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
		Set<String> window = driver.getWindowHandles();
		
		List<String> list = new ArrayList(window);
		
		String parent = list.get(0);
		String child = list.get(1);
		
		
		for (String List:list)
		{
			System.out.println(driver.switchTo().window(List).getTitle());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
