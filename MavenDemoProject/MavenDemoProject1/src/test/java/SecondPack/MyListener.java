package SecondPack;

import org.testng.ITestResult;

public class MyListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("On test start....");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		
		System.out.println("On test succes....");
	}
	public void onTestFailure(ITestResult result)
	{
		
		System.out.println("On test failure....");
	}
	public void onTestSkipped(ITestResult result)
	{
		
		System.out.println("On test skipped....");
	}
	public void onTestFinish(ITestResult result)
	{
		
		System.out.println("On test finish....");
	}
}
