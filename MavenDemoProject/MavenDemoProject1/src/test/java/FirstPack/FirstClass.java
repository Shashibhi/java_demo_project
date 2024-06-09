package FirstPack;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstClass {

	WebDriver driver;

	@BeforeClass
	public void login() throws InterruptedException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");

		driver.findElement(By.id("email")).sendKeys("shashibh@gmail.com");

		driver.findElement(By.id("pwd")).sendKeys("123456");

		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/form/button")).click();

		Alert alrt = driver.switchTo().alert();

		String alrtmsg = alrt.getText();

		System.out.println(alrtmsg);

		alrt.accept();

		Thread.sleep(5000);

	}

	@Test
	public void SwitchWindow() throws InterruptedException {

		driver.findElement(By.id("link2")).click();

		Thread.sleep(5000);

		driver.quit();

	}

}
