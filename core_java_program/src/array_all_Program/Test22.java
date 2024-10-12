package array_all_Program;

public class Test22 {
	public static void main(String[] args) {
		int[] a= {25,34,12,45,23,28};
		 getSort(a);
		 for(int a1:a) {
			 System.out.print(a1+" ");
		 }
	}
	public static int[] getSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(j<a.length/2) {
					if(a[j]>a[j+1]) {
						a[j]=a[j]+a[j+1];
						a[j+1]=a[j]-a[j+1];
						a[j]=a[j]-a[j+1];
					}
				}else {
					if(a[j]<a[j+1]) {
//						a[j]=a[j]+a[j+1];
//						a[j+1]=a[j]-a[j+1];
//						a[j]=a[j]-a[j+1];
						a[j]=a[j]^a[j+1];
						a[j+1]=a[j]^a[j+1];
						a[j]=a[j]^a[j+1];
					}
				}
			}
		}
	return a;	
	}
}
