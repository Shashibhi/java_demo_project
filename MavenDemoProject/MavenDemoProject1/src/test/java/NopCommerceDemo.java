import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerceDemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
		
		WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));
		
		
		email.clear();
		
		password.clear();
		
		Thread.sleep(3000);
		
		
		email.sendKeys("admin@yourstore.com");
		
		password.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		String ExpText = driver.findElement(By.xpath("//div[@class='content-header']//h1")).getText();
		String ActText = "Dashboard";
		
		if (ExpText.equals(ActText))
		{
			System.out.println("Both are matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
		
		
		Thread.sleep(3000);
		
		String acttitle = driver.getTitle();
		String exptitle = "Dashboard / nopCommerce administration";
		
		if (acttitle.equals(exptitle))
		{
			System.out.println("Both title matched");
		}
		else
		{
			System.out.println("Not matched title");
		}
		
		
		driver.quit();
		
		
	}

}
