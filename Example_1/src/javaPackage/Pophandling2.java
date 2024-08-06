package javaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pophandling2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.id("windowButton")).click();

		Set<String> allWindowID = driver.getWindowHandles();
		System.out.println("Open windows IDs are = " + allWindowID);

		Iterator<String> abc = allWindowID.iterator();
		 String win1 = abc.next();
		 String win2 = abc.next();

//		while (abc.hasNext()) {
//			System.out.println(abc.next());
//		}

		// Print the name of parent window
		 driver.switchTo().window(win2);
		 System.out.println(win2);// alphanumeric ID of parent window
		 System.out.println(driver.getTitle());// title of parent window

	}

}
