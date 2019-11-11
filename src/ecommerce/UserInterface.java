package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserInterface {
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	@Test (priority = 1)
	public void launchApp() {
		driver.get("http://www.gcrit.com/build3/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "GCR Shop");
	}
	@Test (priority = 2)
	public void elementExistence() {
		driver.get("http://www.gcrit.com/build3/");
		boolean login = driver.findElement(By.linkText("login")).isDisplayed();
		boolean account = driver.findElement(By.linkText("create an account")).isDisplayed();
		Assert.assertEquals(login, true);
		Assert.assertEquals(account, true);
	}
	@Test 
	public void customerReg() {
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("firstname")).sendKeys("");
		driver.findElement(By.name("lastname")).sendKeys("");
		driver.findElement(By.id("dob")).sendKeys("");
	}
	
}
