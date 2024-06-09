package revision.day42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
	
	
	WebDriver driver;
	//constructor
	
	LoginPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	
	By text_Username=By.xpath("//input[@placeholder='Username']");
	By text_Password=By.xpath("//input[@placeholder='Password']");
	By text_LoginClick=By.xpath("//button[normalize-space()='Login']");

	
	
	public void SetUserName(String name)
	{
		driver.findElement(text_Username).sendKeys(name);
	}
	
	public void SetPassword(String pwd)
	{
		driver.findElement(text_Password).sendKeys(pwd);
	}
	
	public void SetClick()
	{
		driver.findElement(text_LoginClick).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
