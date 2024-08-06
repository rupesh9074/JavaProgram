package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwate\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		Exp_2 e2 = new Exp_2();
		System.out.println(e2.a);
		e2.b();

		aMethod();
		bMethod();
	}

	public static void aMethod() {

		System.out.println("Hello aMethod");
	}

	public static void bMethod() {

		System.out.println("Hello bMethod");
	}

}
