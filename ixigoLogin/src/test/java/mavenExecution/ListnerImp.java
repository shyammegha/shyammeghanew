package mavenExecution;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImp implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test onTestStart"); 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test onTestSuccess");	 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test onTestSkipped"); 
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("test onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test onFinish");
		 
	}

	 
}
