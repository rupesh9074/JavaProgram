package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG4 {

	WebDriver driver;

	@BeforeClass
	public void setEnvironment() {

		System.setProperty("webdriver.chrome.driver", "D:\\\\Softwate\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@DataProvider
	public Object[][] datSet() throws Exception {

		File src = new File("D:\\Selenium\\Example_1\\Repository\\object_repo.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);

		Object arr[][] = new Object[3][2];
		arr[0][0] = pro.getProperty("Testdata1");
		arr[0][1] = pro.getProperty("Testdata2");

		arr[1][0] = "TestData2";
		arr[1][1] = "TestData2";

		arr[2][0] = "TestData3";
		arr[2][1] = "TestData3";

		return arr;

	}

	@Test(dataProvider = "datSet")
	public void enterData(String userName, String Password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(Password);
		
	}

}
