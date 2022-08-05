package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationUsage {
	WebDriver driver1;
	static int count=0;

	@BeforeMethod
	public void launch() {
		// WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Data\\chromedriver_win32\\chromedriver.exe");
		this.driver1 = new ChromeDriver();
		driver1.get("https://demo.guru99.com/test/newtours/");
		// driver.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(dataProvider = "userData")
	public void validateFunctionality(String user,String pass) {
		count++;
		driver1.findElement(By.xpath("//input[@name='userName']")).sendKeys(user);
		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver1.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@DataProvider(name = "userData")
	public String[][] dataProvide() {
		String[][] array = { { "user1", "Pass1" }, { "user2", "pass2" },{"user3","pass3"} };
		return array;
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		if(count!=3)
			driver1.quit();
		else
		{
			String str=driver1.findElement(By.linkText("SIGN-OFF")).getText();
			
			Assert.assertEquals(str, "SIGN-OFF");
			if(str.equals("SIGN-OFF"))
			{
				driver1.findElement(By.linkText("SIGN-OFF")).click();
				Thread.sleep(5);
				driver1.quit();
			}
		
		}
	}

}
