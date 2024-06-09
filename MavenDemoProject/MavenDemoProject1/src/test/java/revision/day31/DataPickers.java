package revision.day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPickers {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);  // switch to frame
		
		//Appraoch1 - sendKeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/25/2023"); //mm/dd/yyyy
		
		//Appraoch2 - logic
		String Year="2025";
		String Month="March";
		String Date="24";
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true)
		{
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String mn = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(yr.equals(Year)&& mn.equals(Month))
			{
				break;
			}
		//	driver.findElement(By.xpath("//span[normalize-space()='Prev']")).click();
			
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		}
		
		
		
		
		//Date
		
		List<WebElement> Alldate = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//td"));
		
		System.out.println(Alldate.size());
		
		for(WebElement dt:Alldate)
		{
			if(dt.getText().equals(Date))
			{
				dt.click();
			}
		}
		
		
		
		
		
	}
	

}
