package day39;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertDemo {
	
	@Test
	void Test()
	{
		//String s="Welcome";
		//Assert.assertEquals(s, "welcome");
		//Assert.assertNotEquals(s,"welcome123");
		
		//Assert.assertTrue(true);
		Assert.assertEquals(1,1);
		System.out.println("Started");
		
		Assert.assertEquals(1, 1);
		System.out.println("Completed");
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(1, 1);
		sa.assertAll();
		
		


}

}