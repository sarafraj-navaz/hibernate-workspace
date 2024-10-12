package array_all_Program;

public class Sort_element_In_assending_order_Program20 {
	public static void main(String[] args) {
		int[] a= {1,2,1,3,5,6,7};
		a=getSortAscendingOrder(a);
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
	public static int[] getSortAscendingOrder(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		return a;
	}
}
