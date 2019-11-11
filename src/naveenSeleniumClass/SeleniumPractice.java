package naveenSeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumPractice {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test (priority = 2)
	public void launchBOFA() {
		driver.get("https://www.bankofamerica.com/");
		String title = driver.getTitle();
		Assert.assertEquals("Bank of America - Banking, Credit Cards, Loans and Investing", title);
	}
	
	@Test (priority = 1)
	public void launchSBI() {
		driver.get("https://www.sbi.co.in/");
		String title = driver.getTitle();
		Assert.assertEquals("State Bank of India", title);
	}
	
	@Test (priority = 3)
	public void launchHSBC() {
		driver.get("https://www.hsbc.co.in/");
		String title = driver.getTitle();
		Assert.assertEquals("HSBC India - Credit Cards, NRI Services, Loans, Mortgages", title);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
