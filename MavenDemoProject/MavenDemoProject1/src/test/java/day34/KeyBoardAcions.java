package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAcions {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("  ");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputText1")).sendKeys("Testing");
		
		Actions act = new Actions(driver);
		
		//ctr -a
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//ctr-c
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//ctr-tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//ctr-v
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}
