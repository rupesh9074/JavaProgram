package javaPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		Thread.sleep(1000);
		Set<String> allWindowsID= driver.getWindowHandles();
		System.out.println("All Windows are : " +allWindowsID);
		
		Iterator<String> itr = allWindowsID.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		System.out.println(win2);
		System.out.println("win 2 url : " + driver.getCurrentUrl());
		
		driver.switchTo().window(win1);
		System.out.println(win1);
		System.out.println("win1 URL : " +driver.getCurrentUrl());	

	}

}
