import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		//Full page
	/*	TakesScreenshot ts = (TakesScreenshot)driver;	
		File source=ts.getScreenshotAs(OutputType.FILE);
		File Target=new File(System.getProperty("user.dir")+"//ScreenShot1//full.pgm");
		FileUtils.copyFile(source, Target);
		  */
		
		//Specific section
		WebElement Products = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File Source=Products.getScreenshotAs(OutputType.FILE);
		File Target= new File(System.getProperty("user.dir")+"//ScreenShot1//products.pgm");
		FileUtils.copyFile(Source, Target);
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
	}

}
