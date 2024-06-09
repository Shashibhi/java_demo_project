package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demo.opencart.com/");
		String Text = driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();

		System.out.println("Text of the page..:" + Text);

		String Title = driver.getTitle();

		System.out.println("Title of the webpage..:" + Title);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/form/div/div[1]/a/img")).click();
		Thread.sleep(5000);

		driver.quit();

	}

}
