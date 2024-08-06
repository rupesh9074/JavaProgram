package javaPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid1 {
	
	@Test
	public void test1() throws MalformedURLException  {
		
			DesiredCapabilities dc= new DesiredCapabilities();
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WIN10);
			
			WebDriver driver = new RemoteWebDriver(new URL("http://10.121.52.164:4444/wd/hub"),dc);
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			System.out.println("Title of the page is : " +driver.getTitle());
			driver.quit();
	
		
	}

}
