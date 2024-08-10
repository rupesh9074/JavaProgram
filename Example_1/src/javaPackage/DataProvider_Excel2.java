package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider_Excel2 {
	public WebDriver driver;
	
	@Test(priority=1, dataProvider="datap", dataProviderClass=DataProvider_Excel1.class)
	public void rediff(String username, String password) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.rediff.com/");
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
//		driver.quit();
	}

}
