package day38;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(priority=1)
	void openapp()
	{
		System.out.println("open app");
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("Login page");
	}
	
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout page");
	}

}
