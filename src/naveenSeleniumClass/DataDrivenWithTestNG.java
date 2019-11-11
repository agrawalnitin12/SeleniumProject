package naveenSeleniumClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.TestData;

public class DataDrivenWithTestNG {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestData.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void signUpPageTest(String fName, String surname, String email, String r_email, String pwd, String n_date,
			String month, String n_year, String gender) {
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(fName);

		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(surname);

		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys(email);

		driver.findElement(By.name("reg_email_confirmation__")).clear();
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(r_email);

		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);

		Select date_select = new Select(driver.findElement(By.id("day")));
		date_select.selectByVisibleText(n_date);

		Select month_select = new Select(driver.findElement(By.id("month")));
		month_select.selectByVisibleText(month);

		Select year_select = new Select(driver.findElement(By.id("year")));
		year_select.selectByVisibleText(n_year);

		if (gender.equalsIgnoreCase("Male"))
			driver.findElement(By.xpath("//label[contains(text(),\"Male\")]")).click();
		else if (gender.equalsIgnoreCase("Female"))
			driver.findElement(By.xpath("//label[contains(text(),\"Female\")]")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
