package auto;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Application {
	
	@Test
	public void app() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/create_account.php?");
//		WebElement country = driver.findElement(By.name("country"));
//		Select dd_Coun = new Select(country);
//		dd_Coun.selectByIndex(10);
//		dd_Coun.selectByValue("117");
//		dd_Coun.selectByVisibleText("India");
//		
//		List<WebElement> count = dd_Coun.getOptions();
//		System.out.println(count.size());
//		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.findElement(By.name("proceed")).click();
//		Alert win_Popup = driver.switchTo().alert();
//		win_Popup.accept();
		String win_handle = driver.getWindowHandle();
		System.out.println(win_handle);
		Set<String> all_win = driver.getWindowHandles();
		System.out.println(all_win.size());
		
	}
}
