package array_all_Program;

public class Test31ButLeetCode1187_Strictly_Increases {
	public static void main(String[] args) {
		int[] a= {2,3,1,8,9};
		if(isStrictlyOrNot(a)) {
			System.out.println("It is strictly Arrays ");
			for(int a1:a) {
				System.out.print(a1+" ");
			}
		}
		else {
			System.out.println("it is not strictly array because it is increasing ");
		}
	}
	public static boolean isStrictlyOrNot(int[] a) {
		for(int i=1;i<a.length;i++) {
			if(a[i-1]>a[i])
				return false;
		}
	return true;	
	}
}
