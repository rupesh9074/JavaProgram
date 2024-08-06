package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class List2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys("how stuff works");
		// driver.findElement(By.name("q")).sendKeys("how stuff works");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total suggestions are = " + list.size());
		String expList = "how stuff works videos";

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equalsIgnoreCase(expList)) {
				list.get(i).click();
				System.out.println(expList + " selected");
				break;
			}
		}

	}

}
