package testNG_FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {
	
	@Test	
	public void titlePage() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
		
		String ExpectedTitle = driver.getTitle();
		String ActualTile = "Google";
		Assert.assertEquals(ExpectedTitle, ActualTile);
		driver.quit();
 	}

}
