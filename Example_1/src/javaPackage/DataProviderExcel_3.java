package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel_3 {
	
	public static String str= "D:\\Book1.xlsx";

	// @Test(dataProvider = "datap")
	public void readExcelData(String uname, String pwd) {

		System.out.println(uname + "     " + pwd);

	}

	// UserName and Pwd
	@DataProvider(name = "datapro")
	public Object[][] setData() throws Exception {

		Object[][] data = getdataExcel();
		return data;
	}

	// Username and Pwd and Email
	@DataProvider(name = "datapro1")
	public Object[][] setData1() throws Exception {

		Object[][] data = getdataExcel();
		return data;
	}

	public Object[][] getdataExcel() throws Exception {

//		File file = new File("D:\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(str);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");

		int row = sh.getLastRowNum();
		int colm = sh.getRow(0).getLastCellNum();

		Object[][] data = new Object[row][colm];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colm; j++) {

				data[i][j] = sh.getRow(i + 1).getCell(j).toString();
				// System.out.println(data[i][j]);
			}

		}
		return data;
	}

}
