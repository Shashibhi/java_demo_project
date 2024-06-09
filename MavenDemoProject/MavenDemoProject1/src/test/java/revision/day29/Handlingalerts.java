package revision.day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalerts {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		// 1)accept
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		// System.out.println(alrt.getText());

		// 2)dismiss

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();

		// 3)
		WebElement web = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		web.click();
		
		driver.switchTo().alert().dismiss();
	}

}
