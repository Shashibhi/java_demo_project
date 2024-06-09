import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);

		// driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

		// org.openqa.selenium.Alert alt = driver.switchTo().alert();
		// System.out.println(driver.switchTo().alert().getText());

		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println("Priniting the statement..:" + text);
		driver.quit();
		
		

	}

}
