package revision.day35;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShots {
	public static void main(String[] args) throws IOException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		//Capture full page
		TakesScreenshot sc = (TakesScreenshot)driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user dir")+"//Screenshot1//full.pgm");
		FileUtils.copyFile(source, target);
	}

}
