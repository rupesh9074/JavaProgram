package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		// driver.findElement(By.xpath("//span[@role='button']")).click();

		WebElement electro = driver.findElement(By.xpath("//*[text()= 'Electronics']"));

		// Mouse Simulation

		Actions act = new Actions(driver);

		// MouseHover event on Electronics
		Thread.sleep(5000);
		 act.moveToElement(electro).build().perform();

		// Right Click on page
//		 act.contextClick().build().perform();

		// Right click on specific WebElement
//		act.contextClick(electro).build().perform();

	}

}
