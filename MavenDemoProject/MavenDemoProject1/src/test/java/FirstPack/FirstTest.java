package FirstPack;

import org.testng.annotations.Test;

public class FirstTest {
	@Test(priority = 1)
	public void FirstOne() {

		System.out.println("First method:");

	}

	@Test(priority = 2)
	public void SecondOne() {

		System.out.println("Second method:");

	}

	@Test(priority = 3)

	public void ThirddOne() {

		System.out.println("Third method:");

	}

	@Test(priority = 4)
	public void FourthOne() {

		System.out.println("Fourth method:");

	}

	@Test(priority = 5)
	public void FifthOne() {

		System.out.println("Fifth method:");

	}

}
