package day33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement rom = driver.findElement(By.xpath("//div[@id='dropContent']//div[ @id='box6']"));
		WebElement italy = driver.findElement(By.xpath("//div[normalize-space()='Italy']"));
		
		act.dragAndDrop(rom, italy).perform();
	
		
		WebElement Washington = driver.findElement(By.xpath("//div[@dragableelement='2'][@id='box3']"));
		WebElement unitedstates = driver.findElement(By.xpath("//div[normalize-space()='United States']"));
		act.dragAndDrop(Washington, unitedstates).perform();
		
		}

}
