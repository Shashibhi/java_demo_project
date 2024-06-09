package PracticeSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopWIndow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		Thread.sleep(3000);

		driver.findElement(By.id("link1")).click();

		Set<String> windows = driver.getWindowHandles();
		List<String> list = new ArrayList(windows);

		String parentwindow = list.get(0);
		String childWindow = list.get(1);

		driver.switchTo().window(childWindow);

		System.out.println(driver.getTitle());
		String childtext = driver.findElement(By.xpath("//*[@id=\"post-4\"]/div/h2")).getText();
		System.out.println(childtext);

		Thread.sleep(5000);

		driver.quit();

	}

}
