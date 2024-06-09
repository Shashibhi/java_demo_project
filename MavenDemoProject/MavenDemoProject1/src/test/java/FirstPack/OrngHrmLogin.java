package FirstPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrngHrmLogin {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Nombre de usuario']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Contraseña']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Ingresar']")).click();
		
	/*	String Exp_title = driver.getTitle();
		
		String Act_title= "h rangeHRM";
		
		if(Act_title.equals(Exp_title))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		System.out.println("Expected title of the page..:"+Exp_title);
		
		System.out.println("Actual title of the page..:"+Act_title); */ 
		
		driver.quit();
		
		
	}

}
