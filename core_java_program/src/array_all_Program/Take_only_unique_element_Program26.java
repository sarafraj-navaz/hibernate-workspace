package array_all_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Take_only_unique_element_Program26 {
	public static void main(String[] args) {
		int[] a= {12,23,12,45,24,45};
		getUniquiElement(a);
	}
	public static void getUniquiElement(int[] a) {
		int totalUniqui=0;
		int n=a.length;
		List<Integer> l1=new ArrayList<Integer>();
		for(int  i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=a[n-1];
					j--;
					n--;
				}
			}
			if(count==1) {
				totalUniqui++;
				l1.add(a[i]);
			}
		}
     for(int a1:l1) {
    	 System.out.print(a1+" ");
     }
	System.out.println("total uniqui element "+totalUniqui);	
	}
}
