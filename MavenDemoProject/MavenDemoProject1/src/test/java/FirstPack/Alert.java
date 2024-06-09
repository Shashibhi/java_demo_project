package FirstPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		System.out.println("Current page Title..:"+driver.getTitle());
		
		String Text = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testers World!!!']")).getText();

		System.out.println("Text of the web page is ..:"+Text);
		driver.findElement(By.id("email")).sendKeys("Sbh123@gmail.com");

		driver.findElement(By.id("pwd")).sendKeys("123456");

		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Login']")).click();

		org.openqa.selenium.Alert alrt = driver.switchTo().alert();

		String alrtmsg = alrt.getText();

		System.out.println(alrtmsg);
		Thread.sleep(3000);

		driver.quit();

	}

}
