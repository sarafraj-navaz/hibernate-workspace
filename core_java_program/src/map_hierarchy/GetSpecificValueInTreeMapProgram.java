package map_hierarchy;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class GetSpecificValueInTreeMapProgram {

	public static void main(String[] args) {
		 TreeMap<Integer,String> t1= new TreeMap<Integer,String>();
		 
		 t1.put(4,"raj");
		 t1.put(3,"Nehal");
		 t1.put(1,"sakshi");
		 t1.put(5,"mahek"); 
		 t1.put(2,"raj");
		 t1.put(1,"Shaikh");
		 
		 System.out.println(t1);
		 for(Entry<Integer, String> entry : t1.entrySet()) {
			 
			 if(entry.getValue().equals("raj") && (entry.getKey() ==2)) {
				 System.out.println(entry);
			 }
		 }
	}

}
