package collection_Program;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveAllElementNotInteger {

	public static void main(String[] args) {
		int sum=0;
		Collection c1 =new ArrayList();
		c1.add(1);
		c1.add(2);
		c1.add("Navaz");
		c1.add(11);
		c1.add('@');
		System.out.println("befor the Collection element========");
		
		
		 Object[] a=c1.toArray();
		
		 
		 for(int i=0;i<a.length;i++) {
			 if(!(a[i] instanceof Integer)) {
				 c1.remove(a[i]);
			 }
		 }
		 System.out.println("after remove the All other element which is integer or int");
		 System.out.println(c1);
		 
		 
		 System.out.println("for the same all integer number");
		 for(Object x1:c1) {
			 sum=sum+(Integer)x1;
		 }
		 System.out.println("total sum is "+sum);
		
	}

}
