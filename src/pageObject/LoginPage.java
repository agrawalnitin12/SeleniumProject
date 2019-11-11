package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(id="tdb1")
	WebElement submit;
	
	public void loginToApp(String user, String pass)
	{
		uname.sendKeys(user);
		pwd.sendKeys(pass);
		submit.click();
	}
}
