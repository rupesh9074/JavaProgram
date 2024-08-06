package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterView1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("Java Automation");
		Thread.sleep(2000);
		
		
		////*[@role='presentation']/div/div/ul/li
		
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("allSuggestion are : " + allSuggestion.size());
	

	}

}
