package errorNotice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ClassCastExpection_Program1 {

	public static void main(String[] args) {
		Collection c1 = Arrays.asList(12,13,"navaz",7.5);
		int sum=0;
		for(Object x:c1) {
			
			sum=sum+(Integer)x; //when String will come then it will error give java.lang.ClassCastException
			
		}
		
//	or we can do this way
//		
//		Collection c2=new ArrayList();
//		c2.add(1);
//		c2.addAll(c1);
//		int sum1=0;
//		for(Object x:c1) {
//			
//			sum1=sum1+(Integer)x; //when String will come then it will error give java.lang.ClassCastException
//			
//		}
	}

}
