package naveenSeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(naveenSeleniumClass.ListenersTest.class)

public class ListenersClass {
		
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test
	public void testFailed() {
		System.out.println("Failed test case started");
		Assert.assertTrue(false);
	}
	
	@Test (dependsOnMethods="testFailed")
	public void testSkipped() {
		System.out.println("Skipped Test case started");
	}

}
