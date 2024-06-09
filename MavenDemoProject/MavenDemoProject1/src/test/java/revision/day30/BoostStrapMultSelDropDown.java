package revision.day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostStrapMultSelDropDown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//b[@class='caret']")).click();

		List<WebElement> options = driver
				.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));

		System.out.println(options.size());
		/*
		 * for(WebElement list:options) { System.out.println(list.getText()); }
		 */

		for (int i = 0; i < options.size(); i++) 
		{

			options.get(i).click();

		}
	}

}
