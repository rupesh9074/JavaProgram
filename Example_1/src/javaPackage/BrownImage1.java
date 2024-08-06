package javaPackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrownImage1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("total images are : " + images.size());
		for (int i = 0; i < images.size(); i++) {

			WebElement image = images.get(i);
			String imageName = image.getAttribute("src");

			URL url = new URL(imageName);
			HttpURLConnection getConnect = (HttpURLConnection) url.openConnection();
			getConnect.connect();

			int response = getConnect.getResponseCode();
			if (response >= 400) {
				System.out.println(imageName + " --> " + "Image is broken");
			} else {

				System.out.println(imageName + " --> " + "Image is valid");

			}

		}

	}

}
