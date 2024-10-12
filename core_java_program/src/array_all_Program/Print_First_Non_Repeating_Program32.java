package array_all_Program;

public class Print_First_Non_Repeating_Program32 {
	public static void main(String[] args) {
		int[] a= {2,3,23,2,23,3,4,4};
		System.out.println(getFirstNonRepeatingElement(a));
	}
	public static int getFirstNonRepeatingElement(int[] a) {
		for(int i=0;i<a.length;i++) {
			int count=1;
			int j,n=a.length;
			for(j=0;j<a.length;j++) {
				if(i!=j && a[i]==a[j]) {
					count++;
					break;
				}
			}
		if(count==1) {
			return a[i];
		}
		}
	return -1;	
	}
	
}
