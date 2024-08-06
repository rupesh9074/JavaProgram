package javaPackage;

import java.util.HashMap;

public class HasMap1 {
	
	
	static HashMap<String, String> method1() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("user1", "pwd@pwd");
		
		return hm;
	}

	public static void main(String[] args) {
		
		System.out.println(method1().get("user1"));


	}

}
