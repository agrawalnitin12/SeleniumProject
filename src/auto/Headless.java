package auto;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Headless {
	
	@Test
	public void verifyGoogleTitle() {
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("window-size=1400,800");
//		options.addArguments("Headless");
		
//		WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
