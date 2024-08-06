package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		// 1st way
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();

		// 2nd way
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("total radio buttons are:  " + radios.size());

		// 3rd way
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total available radios button text = " + radios1.size());
		String expResult = "Female";
		
		for(int i =0; i<radios1.size(); i++) {
			if(radios1.get(i).getText().equalsIgnoreCase(expResult)) {
				radios1.get(i).click();
				System.out.println(expResult + " clicked ");
				break;
			}
			
		}

	}

}
