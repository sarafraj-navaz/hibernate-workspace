package array_all_Program;

public class Test23 {
	public static void main(String[] args) {
		int[] a= {25,34,12,45,23,28};
		a=getSortHalfDec(a);
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
	public static int[] getSortHalfDec(int[] a) {
		a=getSortAsc(a);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(j>=a.length/2) {
					if(a[j]<a[j+1]) {
						a[j]=a[j]+a[j+1];
						a[j+1]=a[j]-a[j+1];;
						a[j]=a[j]-a[j+1];
					}
				}
			}
		}
		return a;	
	}
	public static int[] getSortAsc(int[] a) {
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					count++;
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j]^a[j+1];
					a[j]=a[j]^a[j+1];
				}
			}
		if(count==0)
			return a;
		}
	return a;	
	}
}
