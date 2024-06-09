package PracticeSelenium;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys("shashibh@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("12345678");

		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Login']")).click();

		Thread.sleep(4000);
		

		Alert alrt = driver.switchTo().alert(); 

		String alrtmsg = alrt.getText();

		System.out.println(alrtmsg);


		Thread.sleep(5000);

		driver.quit();

	}
}
