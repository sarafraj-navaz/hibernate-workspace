package array_all_Program;

public class Test21_Desending_Order {
	public static void main(String[] args) {
		int[] a= {5,4,1,3,2};
		a=getSortArraybyDes(a);
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
	public static int[] getSortArraybyDes(int[] a) {
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					count++;
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
			if(count==0)
				return a;
		}
	return a;	
	}
}
