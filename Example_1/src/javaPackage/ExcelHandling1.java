package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling1 {

	public static void main(String[] args) throws Exception {

		File src = new File("D:\\SeleniumCourse.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		System.out.println(sh.getSheetName());
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		

	}

}
