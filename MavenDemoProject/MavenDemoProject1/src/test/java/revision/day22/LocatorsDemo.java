package revision.day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		boolean logo = driver.findElement(By.xpath("//img[@title='Your Store']")).isDisplayed();
		
		System.out.println("Logo of the page..:"+logo);
		
		List<WebElement> Image = driver.findElements(By.xpath("//img[@class='img-fluid']"));
		
		System.out.println(Image.size());
		
		
		String Text=driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
		System.out.println("Captured text..:"+Text);
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("MacBook");
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
