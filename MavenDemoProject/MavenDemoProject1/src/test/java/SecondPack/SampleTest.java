package SecondPack;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(priority=1)
	public void TestOne() {

		System.out.println("Inside TestOne");
	}

	@Test(priority=2)
	public void TestTwo() {

		System.out.println("Inside TestTwo");
	}

	@Test(priority=3)
	public void TestThree() {

		System.out.println("Inside TestThree");
	}

	@Test(priority=4)
	public void TestFour() {

		System.out.println("Inside TestFour");
	}

}
