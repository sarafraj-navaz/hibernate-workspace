package rivision;

public class Reverse_array_7 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		for(int num:getReverse(a)) {
			System.out.print(num+",");
		}
	}
	public static int[] getReverse(int[] a) {
		int n=a.length-1;
		int[] a1=new int[a.length];
		for(int i=0;i<a.length;i++) {
			a1[i]=a[n-i];
		}
		return a1;
	}
}
