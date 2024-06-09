package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php");
		String text = driver.findElement(By.xpath("//div[@class='col-sm-12']//div[1]//div[1]//div[2]//h4[1]//a[1]")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Mac");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		driver.close();
	}
}
