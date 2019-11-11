package naveenSeleniumClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapconcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
//		
//		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]")).click();
//		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
//		System.out.println(list.size());
//		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i).getText());
//			list.get(i).click();
//		}
//	
		
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		driver.findElement(By.id("dropdownMenuButton")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = 'dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
		System.out.println(list.size());
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	}

}
