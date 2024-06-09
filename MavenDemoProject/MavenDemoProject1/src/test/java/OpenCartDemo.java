import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.opencart.com/");

		// driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Mac");

		// Thread.sleep(3000);

		// driver.findElement(By.xpath("//button[@class='btn btn-light
		// btn-lg']")).click();

		boolean display = driver.findElement(By.xpath("//img[@title='Your Store']")).isDisplayed();

		System.out.println(display);

		List<WebElement> Imq = driver.findElements(By.className("img-fluid"));

		System.out.println(Imq.size());

	}

}
