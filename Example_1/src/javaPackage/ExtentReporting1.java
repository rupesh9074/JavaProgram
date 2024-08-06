package javaPackage;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporting1 {

	public static void main(String[] args) throws Exception {
		
		ExtentReports extent = new ExtentReports();
		File file = new File("report.html");
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(file);
		extent.attachReporter(sparkReport);
		
		extent.createTest("Test 1");
		
		extent.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
		

	}

}
