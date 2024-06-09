package PracticeSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Delete {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement checkele = driver.findElement(By.xpath("//select[@id='country-list']"));
		
		Select Options = new Select(checkele);
		
		List<WebElement> sel = Options.getOptions();
		
		for(int i=0;i>sel.size();i++)
		{
			System.out.println(sel.get(i).getText());
		}
	}

}
