package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement checkele = driver.findElement(By.xpath("//select[@id='country-list']"));
		
		
		Select checkbox = new Select(checkele);
		//checkbox.selectByVisibleText("USA");
		//checkbox.selectByValue("3");
		//checkbox.selectByIndex(1);
		
		
		List<WebElement> list = checkbox.getOptions();
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		} 
		
		/*	for(WebElement option:list)
		{
			System.out.println(option.getText());
		}*/
	}

}
