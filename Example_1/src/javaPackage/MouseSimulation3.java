package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		WebElement electro = driver.findElement(By.xpath("//*[text()= 'Electronics']"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(electro).build().perform();

	}

}
