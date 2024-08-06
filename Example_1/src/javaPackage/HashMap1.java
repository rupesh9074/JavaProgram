package javaPackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Ram");
		hm.put(2, "Shyam");
		hm.put(3, "Aam");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		
		
		for(Entry<Integer, String> e : hm.entrySet()) {
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		
	}

}
