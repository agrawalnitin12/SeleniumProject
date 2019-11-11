package auto;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestMethod {

	public static void main(String[] args) throws MalformedURLException {
		
//		String s1 = new String ("Hello");
//		String s2 = new String ("Hello");
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//		
//		System.out.println(10==20);
//		System.out.println('a'=='b');
//		System.out.println('a'==97.0);
//		System.out.println(true == true);
//		Thread t1 = new Thread();
//		Thread t2 = new Thread();
//		Thread t3 = t1;
//		
//		String s1 = new String("Geeks");
//		String s2 = new String("Geeks");
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(t1.equals(t2));
//		System.out.println(t1==t2);
//		System.out.println(t1==t3);
		
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("window-size=1400,800");
//		options.addArguments("Headless");
//		WebDriver driver = new ChromeDriver(options);
		
//		WebDriver driver = new HtmlUnitDriver();
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String URL ="http://wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(URL), options);
		
		
	}
}
