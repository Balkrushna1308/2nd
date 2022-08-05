package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;

public class MoreAnnotations {
	@Test(groups= {"sanity","smoke"})
	@Parameters({"user","pass"})
	public void test1(String user, String pass)
	{
		System.out.println(user+"  "+pass);
		System.out.println("Smoke+Snaity");
	}
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("Smoke 1");
	}
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("Snaity 1");
	}
	@Test(groups= {"smoke"})
	public void test4()
	{
		System.out.println("Smoke 2");
	}

}
