package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminSmoke {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
  @Test (priority = 1)
  public void launchApp() {
	  driver.get("http://www.gcrit.com/build3/admin/login.php");
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "GCR Shop");
  }
  @Test (priority = 2)
  public void elementExistence() {
	  driver.get("http://www.gcrit.com/build3/admin/login.php");
	  boolean login = driver.findElement(By.name("username")).isDisplayed();
	  boolean pwd = driver.findElement(By.name("password")).isDisplayed();
	  boolean submit = driver.findElement(By.id("tdb1")).isDisplayed();
	  boolean catalog = driver.findElement(By.linkText("Online Catalog")).isDisplayed();
	  Assert.assertEquals(login, true);
	  Assert.assertEquals(pwd, true);
	  Assert.assertEquals(submit, true);
	  Assert.assertEquals(catalog, true);
  }
  @Test (priority = 3)
  public void verifyRedirect() {
	  driver.get("http://www.gcrit.com/build3/admin/login.php");
	  driver.findElement(By.linkText("Online Catalog")).click();
	  String url = driver.getCurrentUrl();
	  Assert.assertEquals(url, "http://www.gcrit.com/build3/");
  }
  @Test (priority = 4)
  public void verifyAdminLogin() {
	  driver.get("http://www.gcrit.com/build3/admin/login.php");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin@123");
	  driver.findElement(By.id("tdb1")).click();
	  boolean logoff = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[2]/a")).isDisplayed();
	  Assert.assertEquals(logoff, true);
  }
    }
