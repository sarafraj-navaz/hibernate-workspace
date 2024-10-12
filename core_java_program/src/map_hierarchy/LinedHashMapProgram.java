package map_hierarchy;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinedHashMapProgram {

	public static void main(String[] args) {
		 Map hm1=new LinkedHashMap();
		
		hm1.put(2, "Mohan");
		hm1.put("Sohan", "346");
		hm1.put(345, 346);
		hm1.put(2, "Mohan");
		hm1.put(2, "John");//value for key 2 is updated
		hm1.put(546, 456);
		System.out.println(hm1);

	}

}
