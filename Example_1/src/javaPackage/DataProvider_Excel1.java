package javaPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class DataProvider_Excel1 {
	
	@DataProvider(name="rediff")
	public static Object[][] setData() throws Exception {
		
		Object[][] data = DataProvider_Excel1.test("Sheet1");
		return data;
	}
	
	public static Object[][] test(String sheetName) throws Exception {
		
		File file = new File("D:\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetName);
		
		int row = sh.getLastRowNum();
		int colm = sh.getRow(0).getLastCellNum();
		System.out.println(row + "      " + colm);
		
		Object[][] data = new Object[row][colm];
		
		for(int i= 1; i<row; i++) {
			XSSFRow rowValue = sh.getRow(i);
			for(int j=0;j<colm;j++) {
				XSSFCell colmValue = rowValue.getCell(j);
				
				
				CellType cellType = colmValue.getCellType();
				switch(cellType) {
				
				case STRING:
					data[i][j]= colmValue.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j]= colmValue.getNumericCellValue();
					break;
				case BOOLEAN:
					data[i][j]= colmValue.getBooleanCellValue();
					break;
				}		
				
			}
				
		}
		
		return data;
		
		
		
	}

}
