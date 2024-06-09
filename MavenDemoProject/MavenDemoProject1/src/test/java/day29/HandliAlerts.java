package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandliAlerts {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	//	System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert alrt = driver.switchTo().alert();
		//alrt.accept();
		alrt.dismiss();
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alrt1 = driver.switchTo().alert();
		
		System.out.println("Alert msg frm 3rd click..:"+alrt1.getText());
		alrt1.dismiss();
		
		
		
		
	
		
		
	}

}
