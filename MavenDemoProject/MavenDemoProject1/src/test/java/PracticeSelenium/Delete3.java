package PracticeSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> windows = driver.getWindowHandles();
		List<String> list = new ArrayList(windows);

		String parent = list.get(0);
		String child = list.get(1);

		driver.switchTo().window(child);
		System.out.println(driver.getTitle());

		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());

	}

}
