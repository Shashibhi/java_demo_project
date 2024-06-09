package day39;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	
	

	@BeforeMethod
	void login()
	{
		System.out.println("login method");
	}
	
	@Test
	void serach()
	{
		System.out.println("search");
		
	}
	@Test
	void avanceserach()
	{
		System.out.println("Advance search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logout");
	}
}

