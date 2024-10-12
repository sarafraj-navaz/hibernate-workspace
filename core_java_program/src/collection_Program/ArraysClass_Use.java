package collection_Program;

import java.util.Arrays;
import java.util.Collection;

public class ArraysClass_Use {

	public static void main(String[] args) {
		Collection c1=Arrays.asList(12,13,14);
		System.out.println(c1);
		
	    /*
	     * we can also use this way
	     */
		
		for(Object a:Arrays.asList(12,"Mohan",14,12.2,'@')) {
			System.out.println(a);
		}
	}

}
