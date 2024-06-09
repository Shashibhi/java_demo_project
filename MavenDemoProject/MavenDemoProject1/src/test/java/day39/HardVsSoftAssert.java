package day39;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssert {
	
	@Test
	void test()
	{
		
		System.out.println("testing....");
		System.out.println("testing....");
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(1, 2); //fail
		
		System.out.println("soft assertion completed.....");
		
		sa.assertEquals(1, 1); //pass
	
		System.out.println("completed");
		
		sa.assertAll(); // mandatory
	}

}
