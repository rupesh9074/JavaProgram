package javaPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Excel1 {
	
	@Test(dataProvider="datap")
	public void readExcelData(String uname, String pwd) {
		
			System.out.println(uname+"     "+pwd);
			System.out.println(uname+"     "+pwd);
		
	}
	
	@DataProvider(name="datap")
	public Object[][] setData() throws Exception {
		
		Object[][] data = getdataExcel();
		return data;
	}
	
	
	public static Object[][] getdataExcel() throws Exception {
		
		File file = new File("D:\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		int row = sh.getLastRowNum();
		int colm = sh.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[row][colm];
		
		for(int i= 0; i< row; i++) {
			for(int j = 0; j< colm; j++) {
				
				data[row][colm] = sh.getRow(i+1).getCell(j).toString();
			}
			
		}
		return data;
	}	
		
		
		

}
