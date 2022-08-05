package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locators {
	WebDriver driver1;
	//static int count=0;

	@BeforeMethod
	public void launch() {
		// WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Data\\chromedriver_win32\\chromedriver.exe");
		this.driver1 = new ChromeDriver();
		driver1.get("http://automationpractice.com/index.php");
		// driver.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test
	public void test() throws InterruptedException
	{
		driver1.findElement(By.className("login")).click();
		//driver1.findElement(By.id("email_create")).sendKeys("krushna1308@gmail.com");
		driver1.findElement(By.linkText("Women")).click();
		driver1.findElement(By.cssSelector("a.sf-with-ul")).click();
		
		
	}

}
