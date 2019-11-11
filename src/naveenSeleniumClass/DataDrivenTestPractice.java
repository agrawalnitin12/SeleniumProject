package naveenSeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Xls_Reader;

public class DataDrivenTestPractice {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		Xls_Reader reader = new Xls_Reader("D:\\Java Test Program\\SeleniumProject\\src\\testData\\facebookuser.xlsx");
		int rowCount = reader.getRowCount("UserInfo");

		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {

			String fName = reader.getCellData("UserInfo", "Firstname", rowNum);

			String surname = reader.getCellData("UserInfo", "surname", rowNum);

			String email = reader.getCellData("UserInfo", "Email", rowNum);
			
			String r_email = reader.getCellData("UserInfo", "Re-EnterEmail", rowNum);

			String pwd = reader.getCellData("UserInfo", "Password", rowNum);

			String date = reader.getCellData("UserInfo", "Date", rowNum);
			String n_date = date.substring(0, 2);

			String month = reader.getCellData("UserInfo", "Month", rowNum);

			String year = reader.getCellData("UserInfo", "year", rowNum);
			String n_year = year.substring(0, 4);

			String gender = reader.getCellData("UserInfo", "gender", rowNum);
			
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
	}
}