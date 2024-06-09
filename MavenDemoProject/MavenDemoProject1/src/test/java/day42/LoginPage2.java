package day42;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	
	
	//constructors
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	
	
	@CacheLookup
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement text_username;
	
	@CacheLookup
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	@CacheLookup
	@FindBy(tagName="a")
	List<WebElement> links;
	
	
	//action method
	public void setUserName(String user)
	{
		text_username.sendKeys(user);
	}
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
		
	}
	
	public void clickButton()
	{
		btn_login.click();
	}

	public int getTotalLinks()
	{
		return links.size();
	}
	
}
