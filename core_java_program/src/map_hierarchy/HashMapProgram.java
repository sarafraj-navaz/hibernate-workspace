package map_hierarchy;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {
		Map m1 =new HashMap();
		m1.put(1,"abc");
		m1.put(2,"abc");
		m1.put(3,"sarfaraj");
		m1.put(4,"suhail");
		m1.put(2,"abcd");
		
		System.out.println(m1);
		
		for (Object o : m1.entrySet()) {
		
			System.out.println(o);
		}
	}

}
