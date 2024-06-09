import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		WebElement checkele = driver.findElement(By.id("country-list"));
		
		
		Select checklist= new Select(checkele);
		//checklist.selectByVisibleText("USA");
		//checklist.selectByIndex(4);
		
		
		List<WebElement> list = checklist.getOptions();
		
		System.out.println(list.size());
		
		for(WebElement option:list)
		{
			System.out.println(option.getText());
		}


	}

}
