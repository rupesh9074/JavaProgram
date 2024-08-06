package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);

		// 1st way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total months are = " + birthMonth.size());
		String expMonth = "Mar";
		for (int i = 0; i < birthMonth.size(); i++) {
			if (birthMonth.get(i).getText().equalsIgnoreCase(expMonth)) {
				birthMonth.get(i).click();
				System.out.println(expMonth + "  clicked");
				break;
			}
		}

//		2nd way (Select Class)

		WebElement dd = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(dd);

		month.selectByIndex(6);
		System.out.println("June");
		Thread.sleep(20000);
		month.selectByValue("2");
		System.out.println("Feb");
		Thread.sleep(2000);
		month.selectByVisibleText("Oct");
		System.out.println("oct");

	}

}
