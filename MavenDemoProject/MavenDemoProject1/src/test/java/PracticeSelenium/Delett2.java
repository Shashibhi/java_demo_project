package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delett2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");

		driver.findElement(By.id("email")).sendKeys("shashi123456@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("12345667");
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Login']")).click();

		Alert alrt = driver.switchTo().alert();

		String artmsg = alrt.getText();

		System.out.println(artmsg);

		alrt.accept();

		driver.findElement(By.id("link1")).click();

		String Text = driver.findElement(By.xpath("//h2[normalize-space()='Automation Testers World !']")).getText();
		System.out.println("link text is..:" + Text);
		Thread.sleep(5000);

		driver.quit();

	}

}
