package revision.day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class EmpStatusHiddingDropDown {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click(); //PIM
		
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@role='option']//span"));

		System.out.println(element.size());
		
		
	/*	for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getText());
		}  */
		
		for(int i=0;i<element.size();i++)
		{
			if(element.get(i).getText().equals("Part-Time Contract"))
				
			{
				System.out.println(element.get(i).getText());
			    element.get(i).click();
			    break;
			}
		System.out.println(driver.getTitle());
		
		} 
		
		//driver.quit();
	}

}
