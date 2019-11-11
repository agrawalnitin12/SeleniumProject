package naveenSeleniumClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindowPopup {
	
	@Test
	public void popupTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #4']")).click();
		
		Set<String> windowid = driver.getWindowHandles();
		
		Iterator<String> itr = windowid.iterator();
		
		String parentWindowID = itr.next();
		
		System.out.println("parent window ID is: "+parentWindowID);
		
		String childWindowID1 = itr.next();
		
		System.out.println("child window ID1 is: "+childWindowID1);
		
		driver.switchTo().window(childWindowID1);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		String childWindowID2 = itr.next();
		
		System.out.println("child window ID2 is: "+childWindowID2);
		
		driver.switchTo().window(childWindowID2);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
