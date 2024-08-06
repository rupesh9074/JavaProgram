package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {

		File src = new File("D:\\Selenium\\Example_1\\Repository\\object_repo.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("Testdata1"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("Testdata2"));

	}

}
