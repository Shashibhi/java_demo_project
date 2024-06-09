package revision.day39;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssert {
	
	//HardAssertion
	@Test
	void m1()
	{
		
		System.out.println("Testing  ");
		System.out.println("Testing  ");
		
		Assert.assertEquals(1, 2);
		System.out.println("Hard Assertion completed");
		
		Assert.assertEquals(1, 1);
		System.out.println("Completed");
		
	}
	
	
	//SoftAssert
	//@Test
	void m2()
	{
		System.out.println("Testing  ");
		System.out.println("Testing  ");
		SoftAssert sa= new SoftAssert();
		
		sa.assertEquals(1, 2);
		System.out.println("Soft assert completed");
		sa.assertEquals(1, 1);
		System.out.println("Completed");
		sa.assertAll();
	}

}
