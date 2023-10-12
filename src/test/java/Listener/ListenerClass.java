package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestStart Method");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestSuccess Method");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestFailure Method");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestSkipped Method");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TestTestFailedButWithinSuccessPercentage Method");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("TestFailedWithTimeout Method");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Start Method");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finish Method");
	}
	

}
