package revision.day39;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo {
	
	
	@BeforeClass
	void login()
	
	{
		System.out.println("Login ");
	}
	
	@Test
	void search()
	{
		System.out.println("Search");
	}
	
	
	@Test
	void Advsearch()
	{
		System.out.println("Advsearch");
	}

	@AfterClass
	void logout()
	{
		System.out.println("Logout");
	}

}
