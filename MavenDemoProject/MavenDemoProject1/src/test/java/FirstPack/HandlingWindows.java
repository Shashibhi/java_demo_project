package FirstPack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");

		driver.findElement(By.xpath("//a[normalize-space()='Open a popup window']")).click();

		Set<String> windows = driver.getWindowHandles();

		List<String> list = new ArrayList(windows);

		String parent = list.get(0);
		String child = list.get(1);

		driver.switchTo().window(child);

		driver.manage().window().maximize();

		String Text = driver.findElement(By.xpath("//h1[@class='display-1']")).getText();

		String Text2 = driver.findElement(By.xpath("//p[@class='display-1 font-weight-normal mb-0']")).getText();

		System.out.println(Text);
		System.out.println(Text2);

		driver.switchTo().window(parent);

		String PText = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testers World!!!']")).getText();
		System.out.println(PText);
		Thread.sleep(3000);

		driver.quit();

	}  

}
