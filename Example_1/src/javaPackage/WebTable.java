package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]/a"));
		System.out.println("Total listed complies are = " + allCompanies.size());
		
		String expCompneyName = "REC";
				for(int i = 0; i<allCompanies.size(); i++) {
					if(allCompanies.get(i).getText().equalsIgnoreCase(expCompneyName)) {
						allCompanies.get(i).click();
						System.out.println("Click on  " + allCompanies.get(i));
						break;
					}
				}

	}

}
