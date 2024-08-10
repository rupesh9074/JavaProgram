package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		int row = sh.getLastRowNum();
		int colm = sh.getRow(0).getLastCellNum();
		
		System.out.println(row);
		System.out.println(colm);
		
		for(int i= 0; i< row; i++) {
			for(int j = 0; j< colm; j++) {
				
				System.out.println(sh.getRow(i+1).getCell(j).getStringCellValue());
			}
			
		}
		
		
	}

}
