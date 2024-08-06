package javaPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel1 {

	public static void main(String[] args) throws Exception {

		File file = new File("D:\\notes\\exe.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook EB = new XSSFWorkbook(fis);
		XSSFSheet ES = EB.getSheet("Sheet1");

		int TotalRow = ES.getLastRowNum();
		int TotalCell = ES.getRow(1).getLastCellNum();

		for (int currentRow = 1; currentRow <= TotalRow; currentRow++) {

			System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/index.html");
			Thread.sleep(2000);
			
			driver.findElement(By.id("user-name")).sendKeys(ES.getRow(currentRow).getCell(0).toString());
			System.out.println("Total iterario:  " +currentRow);
			driver.findElement(By.id("password")).sendKeys(ES.getRow(currentRow).getCell(1).toString());
			driver.findElement(By.id("login-button")).click();
			System.out.println();
			driver.quit();
			
			

		}

	}

}
