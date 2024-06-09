package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
	
	String Year="2025";
	String Month="March";
	String Date="24";
	
	
	
	
	while(true)
	{
		String Mn=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String Yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(Mn.equals(Month) && Yr.equals(Year)) 
		{
			break;
		}
		driver.findElement(By.xpath("//a[@title='Next']")).click();
	}
	
	//Select data
	
	List<WebElement> Date1 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	
	for(WebElement dt:Date1)
	{
		if(dt.getText().equals(Date))
		{
			dt.click();
			break;
		}
			
	}
	
}
}
