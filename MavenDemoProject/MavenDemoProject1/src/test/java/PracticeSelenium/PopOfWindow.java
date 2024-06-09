package PracticeSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopOfWindow {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");

		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/p/a")).click();

		Set<String> windows = driver.getWindowHandles();

		List<String> list = new ArrayList(windows);

		String parent = list.get(0);
		String child = list.get(1);

		driver.switchTo().window(child);

		driver.manage().window().maximize();

		Thread.sleep(5000);

		System.out.println("Title of the child page.:" + driver.getTitle());

		String Text = driver.findElement(By.xpath("//h1[@class='display-1']")).getText();

		System.out.println("Text of the child page..:" + Text);

		driver.switchTo().window(parent);

		String PText = driver.findElement(By.xpath("//h4[normalize-space()='Text Box with Preloaded Text']")).getText();
		System.out.println("Parenet text..:"+PText);

		Thread.sleep(5000);
		driver.quit();

	}

}
