package day39.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Class2 {
	
	@AfterSuite
	void test1()
	{
		System.out.println("Test passed 2");
	}
	
	@Test
	void main()
	{
		System.out.println("Serach");
	}

}
