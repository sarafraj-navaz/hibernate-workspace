package collection_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Using_Lamda_expression {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		c1.add(12);
		c1.add(18);
		c1.add(30);
		c1.add(40);
		Collection c2 = new ArrayList<>(Arrays.asList(48,30,60,50));
		c2.addAll(c1);

		/*
		 * c2.addAll(c1); for(Object s:c2) { System.out.print(s+" "); }
		 */
		c2.forEach(a->System.out.print(a+" "));
		
		/* List<String> list = Arrays.asList("A", "B", "C", "D");
		 * or  */
			for (String s : Arrays.asList("A", "B", "C", "D")) {
				System.out.println(s);
			}
		}

}
