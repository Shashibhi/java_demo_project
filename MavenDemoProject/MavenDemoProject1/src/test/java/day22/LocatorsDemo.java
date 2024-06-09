package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(" ");
		// driver.findElement(By.name("search")).sendKeys("Mac");

		// driver.findElement(By.xpath("//button[@class='btn btn-light
		// btn-lg']")).click();

		boolean LogoDisplayed = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println("logo displayed:" + LogoDisplayed);

		// driver.findElement(By.linkText("Tablets")).click();
		// Thread.sleep(5000);

		List<WebElement> Links = driver.findElements(By.className("img-fluid"));
		System.out.println(Links.size());
		driver.quit();

	}
}
