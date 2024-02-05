package Listeneres;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class StartListeners implements 	ITestListener
{

	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("on Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on skipp");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on failed with timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on Finish");
	}
	
	

}
