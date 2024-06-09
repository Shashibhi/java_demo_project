package Saturday;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Practice {

	WebDriver driver;

	//constructor
	
	Practice(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//locators
	

	@CacheLookup
	@FindBy(name="username")
	WebElement text_username;
	
	@CacheLookup
	@FindBy(name="password")
	WebElement txt_password;
	

	@CacheLookup
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_login;
	
	@CacheLookup
	@FindBy(tagName="a")
	List<WebElement> links;
	
	//Action methods
	
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
