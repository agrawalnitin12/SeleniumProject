package naveenSeleniumClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		list.add(driver.findElement(By.tagName("img")));
		System.out.println(list.size());

		ArrayList<WebElement> activeLinks = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getAttribute("href"));
			if (!(list.get(i).getAttribute("href") == null)
					&& !(list.get(i).getAttribute("href").contains("Javascript"))) {
				activeLinks.add(list.get(i));
			}
		}
		System.out.println(activeLinks.size());

		for (int j = 0; j < activeLinks.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") + "------>" + response);
		}

	}

}
