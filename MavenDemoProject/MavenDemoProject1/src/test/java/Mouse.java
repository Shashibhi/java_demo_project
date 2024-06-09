import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		WebElement deskotop = driver.findElement(By.xpath("//body/div[@class='container']/nav[@class='navbar']/div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul[@class='nav navbar-nav']/li[1]/a[1]"));
		
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(deskotop).moveToElement(mac).click().perform();


		
	}

}
