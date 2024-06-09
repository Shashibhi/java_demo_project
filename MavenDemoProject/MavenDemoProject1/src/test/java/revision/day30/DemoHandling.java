package revision.day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHandling {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	driver.manage().window().maximize();
	
	
	//country
	 driver.findElement(By.xpath("//select[@id='country-list']")).click();
	 
	List<WebElement> country_list = driver.findElements(By.xpath("//select[@id='country-list']//option"));
	 
	System.out.println(country_list.size());
	
	for(int i=1;i<country_list.size();i++)
	{
		if(country_list.get(i).getText().equals("India"))
		{
			country_list.get(i).click();
			break;
		}
	}
	
	 //state
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("state-list")).click();
	 
	 
	 driver.findElement(By.xpath("//select[@name='state']//option[4]")).click(); 
}

}
