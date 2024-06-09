package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(" //testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)find the number of rows
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("Total number of rows ..:"+row.size());
		
		//2)find the size of column
		List<WebElement> col = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		System.out.println("Total number of rows ..:"+col.size());
		
		//3) Read data from specific row and column
		String Text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
		System.out.println("Text is ..:"+Text);
		
		//4) Read all the rows and columns
		
	/*	for(int r=2;r<=row.size();r++)
		{
			for(int c=1;c<=col.size();c++)
			{
		String bookname = driver.findElement(By.xpath("//table[@Name='BookTable']//tr[]+r+]//th[+c+]")).getText();
			System.out.println(bookname);
			}
		} */
		
		//5) Print books names whose author is Amit ( conditional based)
		
		for(int r=2;r<=row.size();r++)
		{
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorname.equals("Amit"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookname+"    "+authorname);
			}
		}
		
	}

}
