package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapMultiSelectDropDown {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		
		List<WebElement> option = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		
		System.out.println(option.size());
		
		/*for(WebElement text:option)
		{
			System.out.println(text.getText());
		} */
		
	/*	for(int i=0;i<option.size();i++)
		{
			
			System.out.println(option.get(i).getText());
		} */
		
		for(int i=0;i<option.size();i++)
		{
			if(option.equals("Java") || option.equals("Pythan"))
			{
				option.get(i).click();
			}
			
		}
		
	}

}
