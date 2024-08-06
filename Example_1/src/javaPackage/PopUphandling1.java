package javaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUphandling1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.id("windowButton")).click();
		Set<String> AllWindowsID = driver.getWindowHandles();
		Iterator<String> abc = AllWindowsID.iterator();
		String win1 = abc.next();
		String win2 = abc.next();

		// Print the ID & name of parent window
		driver.switchTo().window(win1);
		System.out.println("Parent window ID : " + win1);
		System.out.println("Parent window name: " + driver.getTitle());

		// Print child window ID & name
		driver.switchTo().window(win2);
		System.out.println("Child window ID: " + win2);
		System.out.println("Child window name: " +driver.getTitle());
		
		
	}

}
