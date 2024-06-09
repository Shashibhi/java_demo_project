import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demos2 {
	public static void main(String[] args) throws IOException {

		//print prime number till 100
		
		
		int total=0;
		for(int i=2;i<=100;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)  
				{
				 	flag=1;
				}
			}
			if(flag==0)
			{
				total++;
				System.out.println(i);
			}
		}
		
		System.out.println("Toatal...:"+total);
	}
}
