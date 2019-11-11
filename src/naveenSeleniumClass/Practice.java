package naveenSeleniumClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/lgeil/Desktop/Mywebpage.html");
		boolean status = driver.findElement(By.tagName("table")).isDisplayed();
		System.out.println(status);
		
		String cellValue= driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
		System.out.println(cellValue);
		
		WebElement table = driver.findElement(By.tagName("table"));
		
		List<WebElement> count = table.findElements(By.tagName("tr"));
		System.out.println(count.size());
		
		List<WebElement> cell_count = table.findElements(By.tagName("td"));
		System.out.println(cell_count.size());
	}

}
