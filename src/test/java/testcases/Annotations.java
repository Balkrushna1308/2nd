package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	@Test
	public void annotation1()
	{
		System.out.println("Test Case 1");
	}
	@Test
	public void annotation2()
	{
		System.out.println("TestCase 2");
	}

}
