package javaPackage;

public class ExceptonHandling1 {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally handled");
		}	
		
	} 

}
