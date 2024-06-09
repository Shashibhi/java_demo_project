package revision.day33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement f1 = driver.findElement(By.xpath("//input[@value='Hello World!']"));
		WebElement f2 = driver.findElement(By.xpath("//body/input[2]"));
		WebElement copybutton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		
		f1.clear();
		f1.sendKeys("Welcome");
		
		
		Actions act = new Actions(driver);
		act.doubleClick(copybutton).perform();
		
		String text = f2.getAttribute("value");
		
		System.out.println(text);
		
		if(text.equals("Welcome"))
		{
			System.out.println("Copied");
		}
		else
		{
			System.out.println("Not copied");
		}
		
		
		
		
		
		
		
		
	}

}
