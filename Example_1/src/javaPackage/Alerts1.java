package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Alerts1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		String strAlert = driver.switchTo().alert().getText();
		String expAlert = "Do you confirm action?";
		Assert.assertEquals(strAlert, expAlert);
		System.out.println("Alrert verified");
		driver.switchTo().alert().accept();
		System.out.println("Already accepted");
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");

	}

}
