package loginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pageObject.LoginPage;

public class Logintest {
	
	@Test
	public void applictionLogin() {
	WebDriver driver = BrowserFactory.startBrowser("http://www.gcrit.com/build3/admin/login.php");
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	login.loginToApp("admin", "admin@123");
	}
}
