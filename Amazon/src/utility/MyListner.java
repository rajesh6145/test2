package utility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import pom.WebDriver.MyDriver;

public class MyListner implements ITestListener {
	public WebDriver driver = MyDriver.getDriver();
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case named-" + result.getName() + " --started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case named-" + result.getName() + " --passed successfully");
		Capture.screenShot_saveAt(driver,result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case named-" + result.getName() + " --Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case named-" + result.getName() + " --Skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Execution is being started");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Exceution has been finished");

	}

}
