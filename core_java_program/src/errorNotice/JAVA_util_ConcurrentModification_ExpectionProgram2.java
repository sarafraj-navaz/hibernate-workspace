package errorNotice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class JAVA_util_ConcurrentModification_ExpectionProgram2 {
	public static void main(String[] args) {
//		Collection c1 = Arrays.asList(12,13,"navaz",7.5);
		
		Collection c1 =new ArrayList();
		c1.add(12);
		c1.add(13);
		c1.add("Navaz");
		c1.add(6.4);
		c1.add('@');
		for(Object x:c1) {
			
			if(!(x instanceof Integer))
				c1.remove(x);
		}
	}

}
