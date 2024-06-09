import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hardaass {
	
	//@Test
	void main()
	{
		Assert.assertTrue(true);
		System.out.println("njsandjn");
	}
	
	@Test
	void soft()
	{
		System.out.println("Before softassertion");
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(true);
		System.out.println("After softassertion");
		sa.assertAll();
	}

}
