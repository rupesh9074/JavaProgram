package javaPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandle1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		Thread.sleep(2000);
		
		Set<String> allTabID = driver.getWindowHandles();
		System.out.println("All tabs id : " +allTabID);
		Iterator<String> tab = allTabID.iterator();
		String tab1 = tab.next();
		String tab2 = tab.next();
		
		driver.switchTo().window(tab2);
		System.out.println("Tab 2 ID : " +tab2);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(tab1);
		System.out.println("tab 1 ID : "+tab1);
		System.out.println("tab 1 URL : " +driver.getCurrentUrl());
		

	}

}
