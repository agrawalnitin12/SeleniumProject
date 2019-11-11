package gridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		//1. define des cap
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//Chrome option definition 
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubURL = "http://192.168.43.89:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), options);

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
