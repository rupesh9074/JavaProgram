package javaPackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are : " + links.size());

		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link= new URL(url);
			HttpURLConnection httpconn= (HttpURLConnection) link.openConnection();
			Thread.sleep(2000);
			
			httpconn.connect();
			
			int rescode=httpconn.getResponseCode();
			if(rescode>=400) {
				System.out.println(url + " - "+ "is broken link");
				
			}
			
			else {
				System.out.println(url + " - "+ "is valid link");
				
			}
			

		}

	}

}
