package javaPackage;

import org.testng.annotations.*;


public class testNG2 {
	
	@Test
	public void a2() {
		System.out.println("Hello a2 method");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("h ello b methoda");
	}
	
	@BeforeSuite
	public void c() {
		System.out.println("hello c method");
	}
	
	@AfterMethod
	public void d() {
		System.out.println("hello d method");
	}
	
	@BeforeClass
	public void e() {
		System.out.println("hello e method");
	}

	@AfterTest
	public void f() {
		System.out.println("hello f method");
	}
	
	@AfterClass
	public void g() {
		System.out.println("hello g method");
	}
	
	@BeforeMethod
	public void h() {
		System.out.println("hello h method");
	}
	
	@AfterSuite
	public void i() {
		System.out.println("hello i method");
	}
	
	@Test
	public void a1() {
		System.out.println("hello a1 methoda");
	}
	
}
