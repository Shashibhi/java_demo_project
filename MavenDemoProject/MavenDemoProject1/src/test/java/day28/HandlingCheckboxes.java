 package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		
		//1)Selectone checkbox
		//driver.findElement(By.id("monday")).click();
		
		//input[@class='form-check-input'  and @type='checkbox']]
		
		
		//2)selct all blocks
		
		List<WebElement> webelement = driver.findElements(By.xpath("//input[@class='form-check-input'  and @type='checkbox']"));
		
		System.out.println(webelement.size());
		
	/*	for(int i=0;i<webelement.size();i++)
		{
			webelement.get(i).click();
		} */
		
	/*	for(WebElement checkbox:webelement)
		{
			checkbox.click();
		} */
		
	/*	for(int i=5;i<webelement.size();i++)
		{
			webelement.get(i).click();
		}  */
		
	/*	for(int i=0;i<2;i++)
		{
			webelement.get(i).click();
		} */
		
		for(int i=0;i<3;i++)
		{
			webelement.get(i).click();
		} 
		
		Thread.sleep(5000);
		for( WebElement element:webelement)
		{
			if(element.isSelected())
			{
				element.click();
				
				
			}
		}
		
	}

}
