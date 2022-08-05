package testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
	public void onTestStart(ITestResult result) {
		// not implemented
		System.out.println("Starting of TestCase");
	}

	public void onTestSuccess(ITestResult result) {
		// not implemented
		System.out.println("Success of TestCase");
	}

	public void onTestFailure(ITestResult result) {
		// not implemented
		
	}

	public void onTestSkipped(ITestResult result) {
		// not implemented
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		// not implemented
		System.out.println("Starting of TestCase");
	}

	public void onFinish(ITestContext context) {
		// not implemented
		System.out.println("Finish of TestCase");
	}

}
