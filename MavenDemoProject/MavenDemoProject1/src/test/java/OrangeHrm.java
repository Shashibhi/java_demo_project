import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHrm {
	public static void main(String[] args) {
		
	/*	Test case
		----------
		1) Launch browser( chrome)
		2) open URL
			https://opensource-demo.orangehrmlive.com/
		3) Provide username - Admin
		4) Provide password - admin123
		5) Click on login button
		6) Verify dashboard page display
		7) close browser  
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String Browser = sc.next();
		
		WebDriver driver = null;
		
		if(Browser.equals("Chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(Browser.equals("Edge"))
		{
			driver =new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
				
		


		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String Acttext = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		
		String Exptext = "Dashboard";
		
		if(Acttext.equals(Exptext))
		{
			System.out.println("Both are matched");
		}
		else
		{
			System.out.println("Not matched");
		}
		
		System.out.println("Current Tittle of the page .. :"+driver.getTitle());
		
		
		driver.quit();
		
	}

}
