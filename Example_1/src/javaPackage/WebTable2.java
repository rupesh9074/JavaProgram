package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> name= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td//a"));
		System.out.println("Total visible names are : " +name.size());
		
		String expName = "HFCL";
		for(int i=0;i<name.size();i++) {
			if(name.get(i).getText().equalsIgnoreCase(expName)) {
				name.get(i).click();
				System.out.println(expName+ " : clicked");
				break;
			}
		}

	}

}
