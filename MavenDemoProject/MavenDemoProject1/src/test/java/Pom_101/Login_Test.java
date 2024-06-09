package Pom_101;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Test {
	
	WebDriver driver;
	
	//constructor
	
	Login_Test(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//Locators/elements
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
	
	
	//Action methods
	public void username(String uname)
	{
		text_username.sendKeys(uname);
	}
	
	public void password(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clickbutton()
	{
		btn_login.click();
		
	}
	
	public void link()
	{
		System.out.println(links.size());
	}
}
