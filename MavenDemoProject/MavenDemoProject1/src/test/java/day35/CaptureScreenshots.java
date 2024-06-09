package day35;

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

public class CaptureScreenshots {
	public static void main(String[] args) throws IOException{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Capture full page
	/*	TakesScreenshot ts = (TakesScreenshot)driver;	
		File source=ts.getScreenshotAs(OutputType.FILE);
		File Target=new File(System.getProperty("user.dir")+"//ScreenShot1//full.pgm");
		FileUtils.copyFile(source, Target); */
		
		//Capture screenshot of specific section
		WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targefile=new File(System.getProperty("user.dir")+"\\ScreenShot1\\featuredprods.png");
		FileUtils.copyFile(sourcefile, targefile); 
		
	/*	WebElement Logoelement = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File Source=Logoelement.getScreenshotAs(OutputType.FILE);
		File Target=new File(System.getProperty("user.dir")+"//ScreenShot1//LogoEle.pgm");
		FileUtils.copyFile(Source, Target); */
		
	}

}
