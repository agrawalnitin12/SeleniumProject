package ecommerce;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;

public class DateTable {

	
	@Test
	public void dateTable() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/");
		
		driver.findElement(By.xpath("//input[@class='form input-lg dpd1']")).click();
		
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> cells =table.findElements(By.tagName("td"));
		int total_dates = cells.size();
		for (int i=0; i<total_dates; i++) {
			String data = cells.get(i).getText();
			if(data.equalsIgnoreCase("31"))
			{
				cells.get(i).click();
				break;
			}
		}
		
	}
}
