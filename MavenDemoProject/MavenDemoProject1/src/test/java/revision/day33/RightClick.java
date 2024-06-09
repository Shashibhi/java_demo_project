package revision.day33;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement Right_click = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions  act = new Actions(driver);
		act.contextClick(Right_click).perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Thread.sleep(3000);
		Alert dr = driver.switchTo().alert();
		System.out.println(dr.getText());
		dr.accept();
		
	}

}
