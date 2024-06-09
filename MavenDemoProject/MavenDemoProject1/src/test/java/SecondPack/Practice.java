package SecondPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	WebDriver driver;

	@Test
	public void OpenChrome() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void OpenUrl() {

		driver.get("https://naveenautomationlabs.com/opencart/");

		String Title = driver.getTitle();

		System.out.println("Title of the page is..:" + Title);

	}

	@Test
	public void SelectProduct() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).click();
		String Text = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/h1")).getText();
		System.out.println("Text of the product is..:" + Text);

		Thread.sleep(5000);
		
	}

	@Test
	public void SelectPrice() throws InterruptedException {

		 boolean Price = driver.findElement(By.cssSelector("ul[class='list-unstyled'] li h2")).isDisplayed();

		//System.out.println("Price of the product is ..:" + Price);
		Thread.sleep(5000);
		
		driver.quit();
	}

}
