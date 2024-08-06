package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@data-testid, 'open-registration-form-button')]")).click();
		Thread.sleep(2000);

		List<WebElement> dropDown = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total no. of months count = " + dropDown.size());
		String expMonth = "Aug";
		for (int i = 0; i < dropDown.size(); i++) {
			if (dropDown.get(i).getText().equalsIgnoreCase(expMonth)) {
				dropDown.get(i).click();
				System.out.println("Clicked on = " + expMonth);
				break;
			}
		}

		// 2nd way
		Thread.sleep(3000);
		WebElement fbMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select mnth = new Select(fbMonth);
		mnth.selectByIndex(1);
		Thread.sleep(3000);
		mnth.selectByVisibleText("Dec");
		Thread.sleep(3000);
		mnth.selectByValue("2");
		
		
		
		
		

	}

}
