package javaPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		List<WebElement> list = driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		System.out.println("total number of links:" + list.size());

		List<WebElement> ActiveLinks = new ArrayList<WebElement>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAttribute("href") != null && ! (list.get(i).getAttribute("href").contains("Javascript"))) {
				ActiveLinks.add(list.get(i));
			}
		}
		System.out.println("Total number of Active links: " + ActiveLinks.size());

		for (int j = 0; j < ActiveLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(ActiveLinks.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(ActiveLinks.get(j).getAttribute("href")+"----->"+response);
		}

	}

}
