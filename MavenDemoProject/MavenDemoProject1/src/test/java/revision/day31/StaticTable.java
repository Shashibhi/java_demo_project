package revision.day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.internal.org.jline.terminal.Size;

public class StaticTable {
public static void main(String[] args) {
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("//testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//1)rows
	List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	System.out.println("Row size..:"+rows.size());
	
	//2) column
	
	List<WebElement> column = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
	System.out.println("Column size..:"+column.size());
	
	//3)Read data from specific row and column
	String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
	
	System.out.println(text);
	
	
	
	
	
	
	
}
}
