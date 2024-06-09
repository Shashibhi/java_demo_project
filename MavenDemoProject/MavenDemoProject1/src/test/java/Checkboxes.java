import java.time.Duration;
import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		
		//driver.findElement(By.xpath("//div[contains(text(),'Pen:')]//input[1]")).click();
		
		
		List<WebElement> Elements = driver.findElements(By.xpath("//div[contains(text(),'Pen:')]//input"));
		
		/*	for(int i=0;i<Elements.size();i++)
		{

			Elements.get(i).click();
		}
		 */
		
		
		for( WebElement ele:Elements)
		{
			ele.click();
		}
			
			
			
			
			
	}

}
