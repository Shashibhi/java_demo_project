package day39.pack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class1 {
	
	@BeforeSuite
	void test()
	{
		System.out.println("Test passed");
	}
	
	@Test
	void main2()
	{
		System.out.println("Advance serach");
	}

}
