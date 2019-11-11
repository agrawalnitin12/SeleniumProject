package naveenSeleniumClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fls = new FileInputStream("D:\\Java Test Program\\SeleniumProject\\config.properties");
		prop.load(fls);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String browserName = prop.getProperty("browser");
		
		String url = prop.getProperty("URL");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Set Up Files\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","D:\\Set Up Files\\Selenium\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		
		driver.findElement(By.name(prop.getProperty("fName_loc"))).sendKeys(prop.getProperty("first_Name"));
		driver.findElement(By.name(prop.getProperty("lName_loc"))).sendKeys(prop.getProperty("last_Name"));
	}

}
