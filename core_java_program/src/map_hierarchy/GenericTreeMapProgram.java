package map_hierarchy;

import java.util.Map;
import java.util.TreeMap;

public class GenericTreeMapProgram {

	public static void main(String[] args) {
	 Map<Integer,String> t1= new TreeMap<Integer,String>();
	 
	 t1.put(4,"raj");
	 t1.put(3,"Nehal");
	 t1.put(1,"sakshi");
	 t1.put(5,"mahek");
	 t1.put(2,"raj");
	 
	 System.out.println(t1);
	 for (Map.Entry<Integer,String> entry : t1.entrySet()) {
		 int key = entry.getKey();
		 String value = entry.getValue();
		 System.out.println(key);
		 System.out.println(value);
		
	}
	}

}
