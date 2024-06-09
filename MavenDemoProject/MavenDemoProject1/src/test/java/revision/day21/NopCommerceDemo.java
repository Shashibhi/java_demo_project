package revision.day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NopCommerceDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));

		email.clear();
		password.clear();

		email.sendKeys("admin@yourstore.com");
		password.sendKeys("admin");

		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		String act_text = driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();

		String exp_text = "Dashboard";

		if (act_text.equals(exp_text))
		{
			System.out.println("Text is matched");

		} 
		else 
		{
			System.out.println("Text is not matched");
		}

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Dashboard / nopCommerce administration")) 
		{
			System.out.println("Title is matched");
		}
		else
		{
			System.out.println("Title is not matched");
		}

		boolean Img = driver.findElement(By.xpath("//img[@class='brand-image-xl logo-xl']")).isDisplayed();
		System.out.println(Img);

		driver.quit();

	}

}
