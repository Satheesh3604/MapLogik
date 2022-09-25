package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener{
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("onStart");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("onTestSuccess");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped");
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedWithTimeout");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish");
	}
	

}
