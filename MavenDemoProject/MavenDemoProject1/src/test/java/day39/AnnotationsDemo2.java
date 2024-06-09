package day39;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {
	
	

	@BeforeClass
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
	
	@AfterClass
	void logout()
	{
		System.out.println("Logout");
	}
}

