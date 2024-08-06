package javaPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {

	public static void main(String[] args) throws Exception {

		File file = new File("D:\\notes\\exe.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");

		int row = sh.getLastRowNum()+1;
		int cell = sh.getRow(0).getLastCellNum();
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= cell; j++) {
				
				System.out.print(sh.getRow(i).getCell(j).toString());
				System.out.print("\t");

			}
		}

	}

}
