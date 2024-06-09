import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithInput {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert alrt = driver.switchTo().alert();
		
		alrt.sendKeys("welcome");
		alrt.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='result']")).getText();

		System.out.println(text);
		
		if(text.equals("You entered: welcome"))
		{
			System.out.println("Entered value printed");
		}
		else
		{
			System.out.println("Not Printed");
		}

		driver.quit();
		
	}

}
