package map_hierarchy;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapProgramGeneric {

	public static void main(String[] args) {
	Map<Integer, String> map1= new LinkedHashMap<Integer,String>();
	
	map1.put(1,"sarafraj");
	map1.put(2,"suhail");
	map1.put(3,"hasan");
	System.out.println(map1);
	for(Object o1:map1.entrySet()) {
		System.out.println(o1);
	}
	}

}
