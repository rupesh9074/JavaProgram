package javaPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShot1 {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		ScreenShow("FB Login");
		driver.get("https://www.google.com/");
		ScreenShow("Google Page");
	}

	public static void ScreenShow(String filename) throws Exception {

		// Date d = new Date();
		// String screenshotwithTime = d.toString().replace(" ", " ").replace(":", " ");
		// System.out.println("screenshotwithTime");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//screenshot//" + filename + ".png"));
	}

}
