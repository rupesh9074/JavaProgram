package javaPackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		driver.get("https://tutorialsninja.com/demo/");
		driver.get("https://www.javatpoint.com/java-programs");
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total link are : " + links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement link = links.get(i);
			String linkName = link.getAttribute("href");

			URL url = new URL(linkName);
			HttpURLConnection strConnect = (HttpURLConnection) url.openConnection();
			strConnect.connect();

			int response = strConnect.getResponseCode();
			if (response >= 400) {
				System.out.println(linkName + " ---> " + "Broken link");

			}

			else {

				System.out.println(linkName + " ---> " + "link is valid");
			}

		}

	}

}
