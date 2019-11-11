package naveenSeleniumClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started: "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ "Test is Successful");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+ "Test is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+ "Test skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
