package map_hierarchy;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
        Map hm1=new TreeMap();
		
		hm1.put(2, "Mohan");
		hm1.put(78, 346);
		hm1.put(345, 346);
		hm1.put(56, "Mohan");
		hm1.put(2, "John");//value for key 2 is updated
		hm1.put(546, 456);
		System.out.println(hm1);
		for(Object o1:hm1.entrySet())
		{
			System.out.println(o1);
		}
	}

}
