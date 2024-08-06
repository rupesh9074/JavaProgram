package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total no. of frames are = " + allFrames);
		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("//*[text()='terms of use']")).click();
			

		}

	}

}
