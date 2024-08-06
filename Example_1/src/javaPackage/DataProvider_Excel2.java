package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider_Excel2 {
	public WebDriver driver;
	
	@Test(priority=1, dataProvider="rediff", dataProviderClass=DataProvider_Excel1.class)
	public void rediff(String username, String password) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://m.rediff.com/");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys(username);
		
		
	}

}
