package naveenSeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		
		
		//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[1]
		
//		String before_xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr[";
//		String after_xpath = "]/td[";
//		
	//	if(int i = 0;)
		
	}
	

}
