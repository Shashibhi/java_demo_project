package page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomDemo {
	WebDriver driver1;

	//Constructor
	
		WebDriver driver;
		PomDemo (WebDriver driver)
		{
			this.driver1=driver;
			PageFactory.initElements(driver, this);
		}
		
		//Locators
		
		@FindBy (xpath="//input[@placeholder='Username']")
		WebElement text_username;
		
		
		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement text_password;
		
		
		@FindBy (xpath="//button[@type='submit']")
		WebElement click_button;
		
		//Action on methods

		
		public void setusername(String name)
		{
			text_username.sendKeys(name);
		}
		
		public void setpassword(String pwd)
		{
			text_password.sendKeys(pwd);
			
		}
		
		public void click()
		{
			click_button.click();
		}
		
		
		
	
}
