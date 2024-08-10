package javaPackage;

import org.testng.annotations.Test;

public class DataProviderExcel_4 {
	
	@Test(priority=1, dataProvider="datapro", dataProviderClass=DataProviderExcel_3.class)
	public void feedData(String userName, String pwd) {
		
		System.out.println(userName+"   "+pwd);
		
	}
	
	@Test(priority=2)
	public void hi()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	@Test(priority=3, dataProvider= "datapro1", dataProviderClass= DataProviderExcel_3.class)
		public void feedData2(String uname, String pwd, String email) {
			
			System.out.println(uname+"    "+pwd+"    "+email);
			
		}

}
