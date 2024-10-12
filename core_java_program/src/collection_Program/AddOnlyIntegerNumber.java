package collection_Program;

import java.util.ArrayList;
import java.util.Collection;

public class AddOnlyIntegerNumber {

	public static void main(String[] args) {
		
		
		Collection c1 =new ArrayList();
		int sum=0;
		c1.add(12);
		c1.add(13);
		c1.add("Navaz");
		c1.add(6.4);
		c1.add('@');
		
		for(Object x:c1) {
			if(x instanceof Integer)
				sum=sum+(Integer)x;
		}
		System.out.println("total sum is "+sum);
	}

}
