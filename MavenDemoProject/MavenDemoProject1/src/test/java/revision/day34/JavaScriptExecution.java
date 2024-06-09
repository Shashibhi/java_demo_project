package revision.day34;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecution {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Inputbox
		// driver.findElement(By.id("RESULT_TextField-1")).sendKeys("welcome");

		WebElement firstname = driver.findElement(By.id("RESULT_TextField-0"));
		js.executeScript("arguments[0].setAttribute('value' ,'WelCome')", firstname);

		// radio button
		// driver.findElement(By.id("RESULT_RadioButton-7_0")).click();//ElementClickInterceptedException:
		WebElement radiobutton = driver.findElement(By.id("RESULT_RadioButton-1_0"));
		js.executeScript("arguments[0].click()", radiobutton);


		//checkbox
		//driver.findElement(By.id("RESULT_CheckBox-8_0")).click(); //ElementClickInterceptedException
		WebElement checkbox=driver.findElement(By.id("RESULT_CheckBox-8_0"));
		js.executeScript("arguments[0].click();",checkbox);

	}

}
