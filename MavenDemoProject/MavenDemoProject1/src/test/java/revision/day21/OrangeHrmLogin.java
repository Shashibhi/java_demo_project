package revision.day21;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHrmLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the browser name");
		String Brw=sc.next();
		WebDriver driver = null;
		
		if(Brw.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(Brw.equals("edge"))
		{
			driver= new EdgeDriver();
			
		}
		else
		{
			System.out.println("Entered wrong browser ");
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(3000);
		String Act_text = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		
		String Exp_text= "Dashboard";
		
		if(Act_text.equals(Exp_text))
		{
			System.out.println("Text is matched");
		}
		else
		{
			System.out.println("Text is not matched");
		}
		
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
}
