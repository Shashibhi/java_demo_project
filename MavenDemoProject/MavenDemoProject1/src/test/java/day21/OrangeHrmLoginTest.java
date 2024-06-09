package day21;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHrmLoginTest {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the browser here");
		String Brw=sc.next();
		WebDriver driver=null;
		
		if(Brw.equals("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(Brw.equals("edge"))
		{
			 driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Enetr proper browser name");
		}
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		
		String Actual_text = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		String Expexted_text = "Dashboard";
		System.out.println(Actual_text);   
		if(Actual_text.equals(Expexted_text))
		{
			System.out.println("Text is matched");
		}
		else
		{
			System.out.println("Text is not matched");
		}
		driver.quit();
		
		
	}

}
