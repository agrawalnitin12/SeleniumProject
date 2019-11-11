package naveenSeleniumClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

//		List<WebElement> list = driver.findElements(By.tagName("a"));
//		
//		System.out.println(list.size());
//		
//		for (int i=0;i<list.size();i++)
//		{
//			String linkText = list.get(i).getText();
//			System.out.println(linkText);
//		}

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File("D:\\Java Test Program\\SeleniumProject\\src\\naveenSeleniumClass\\image.png"));

	}

//	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
//		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
//		locator.click();
//	}
}
