package SecondPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condition {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		String ActualText=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")).getText();
		
		Thread.sleep(5000);
		
		System.out.println("Actual text of the page is..:"+ActualText);
		
		String Expextedtext = "MacBook";
		System.out.println("Expected text of the page is..:"+Expextedtext);
		
		if(ActualText.equals(Expextedtext)) {
			
			System.out.println("Text is match");
			
		}
		else 
		{
			System.out.println("Text is not matched");
		}
		
		driver.quit();
		
	}

}
