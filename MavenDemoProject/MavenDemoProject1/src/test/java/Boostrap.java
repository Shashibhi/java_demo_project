import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boostrap {
	public static void main(String[] args) {
		
		
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		
		 List<WebElement> dropdown = driver.findElements(By.xpath("//*[@class='multiselect-container dropdown-menu']//li"));
		
		System.out.println(dropdown.size());
		
		for(WebElement list:dropdown)
		{
			list.click();
		}
		
		
		
	}

}
