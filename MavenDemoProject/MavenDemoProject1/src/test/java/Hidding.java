import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidding {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		
		
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println(element.size());
		
		for(WebElement el:element)
		{
			if(el.equals("Full-Time Probation"))
			{
				el.click();
			}
			System.out.println(el.getText());
		}
		
		
		
	}

}
