package mytestNGClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass1 {
	
	@BeforeSuite
	public void beforeSuitemethod() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void aftyerSuitemethod() {
		System.out.println("after suite");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Befor emethod ");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After emethod ");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("before test ");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After test ");
	}
	
	
	
	@BeforeClass
	public void beforeclassMethod()	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterclassMethod()	{
		System.out.println("after class");
	}
	
	@BeforeGroups
	public void beforegrpmethod() {
		System.out.println("before group");
	}
	
	@AfterGroups
	public void Aftergrpmethod() {
		System.out.println("after group");
	}
	
	@Test(groups= "z")
	public void TestNGClass1_method1() {
		System.out.println("TestNGClass1_method1");
	}
	
	@Test
	public void TestNGClass1_method2() {
		System.out.println("TestNGClass1_method2");
	}

}
