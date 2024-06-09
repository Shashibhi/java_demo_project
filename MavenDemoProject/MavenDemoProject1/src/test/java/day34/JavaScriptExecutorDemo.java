package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//JavascriptExecutor js=driver;    // ChromeDriver class
		JavascriptExecutor js=(JavascriptExecutor)driver;  // WebDriver
		
		
		//Inputbox
		//driver.findElement(By.id("RESULT_TextField-1")).sendKeys("welcome");
		WebElement firstname=driver.findElement(By.id("RESULT_TextField-1"));
		js.executeScript("arguments[0].setAttribute('value','john')",firstname );
		
		//radio button
		//driver.findElement(By.id("RESULT_RadioButton-7_0")).click();//ElementClickInterceptedException:
		WebElement radiobutton=driver.findElement(By.id("RESULT_RadioButton-7_0"));
		js.executeScript("arguments[0].click();",radiobutton );
		
		//checkbox
		//driver.findElement(By.id("RESULT_CheckBox-8_0")).click(); //ElementClickInterceptedException
		WebElement checkbox=driver.findElement(By.id("RESULT_CheckBox-8_0"));
		js.executeScript("arguments[0].click();",checkbox);
		
		//button
		//driver.findElement(By.id("FSsubmit")).click();
		WebElement button=driver.findElement(By.id("FSsubmit"));
		js.executeScript("arguments[0].click();",button);
		
	}

}
