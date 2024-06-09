package day42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
	
	WebDriver driver;
	
	
	//constructors
	LoginPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By text_username_loc=By.xpath("//input[@placeholder='Username']");
	By text_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
	
	//action method
	public void setUserName(String user)
	{
		driver.findElement(text_username_loc).sendKeys(user);
	}
	public void setPassword(String pwd)
	{
		driver.findElement(text_password_loc).sendKeys(pwd);
		
	}
	
	public void clickButton()
	{
		driver.findElement(btn_login_loc).click();
	}


	
	
}
