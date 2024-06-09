package revision.day39;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	void main()
	{
		Assert.assertEquals(1, 2);
		System.out.println("Test1 Passed");
		
		Assert.assertEquals(1, 1);
		System.out.println("Test2 Passed");
		
	}

}
