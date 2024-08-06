package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseSimulation6 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@alt='close Modal']")).click();

		// int allFrames = driver.findElements(By.tagName("iframe")).size();
		// System.out.println("Total no. of frames are available : " + allFrames);
		// for (int i = 0; i < allFrames; i++) {
		// driver.switchTo().frame(i);
		// Thread.sleep(4000);
		// driver.findElement(By.xpath("//*[@alt='close Modal']")).click();
		// System.out.println("frame closed");
		//
		// }

	}

}
