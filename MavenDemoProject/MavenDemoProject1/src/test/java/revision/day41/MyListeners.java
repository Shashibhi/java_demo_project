package revision.day41;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test started....");
	}
	
	 public void onTestSuccess(ITestResult result) 
	  {
		  System.out.println(" test passed....");
	  }
	  
	  public void onTestFailure(ITestResult result) 
	  {
		  System.out.println(" test failed....");
	  }

	  public void onTestSkipped(ITestResult result) 
	  {
		  System.out.println(" test skipped....");
	  }
	  
	/*  public void onFinish(ITestContext context)
		{
			System.out.println("Test finish....");
		}  */

}
