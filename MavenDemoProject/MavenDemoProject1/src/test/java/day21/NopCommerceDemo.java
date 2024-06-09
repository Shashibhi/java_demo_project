package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerceDemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		WebElement clear = driver.findElement(By.id("Email"));
		clear.clear();
		clear.sendKeys("admin@yourstore.com");
		//driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(5000);
		
		String act = driver.getTitle();
		String exp = "Dashboard / nopCommerce administration";
		
		if(act.equals(exp))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Different");
		}
		
		Thread.sleep(5000);
		String Act_text = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		String Exp_text = "Dashboard";
		
		if(Act_text.equals(Exp_text))
		{
			System.out.println("Both are matched");
		}
		else
		{
			System.out.println("Not matched");
		}
		driver.quit();
		
		
	}

}
