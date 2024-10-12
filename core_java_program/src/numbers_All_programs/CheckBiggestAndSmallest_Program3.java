package numbers_All_programs;

public class CheckBiggestAndSmallest_Program3 {

	/*
	 *  WAJP TO TAKE USER INPUT and print biggest and smallest
	 */
	public static void main(String[] args) {
		checkBiggestSmaller(12346);
	}
	public static void checkBiggestSmaller(int n) {
		int bigger =Integer.MIN_VALUE;
		int smaller =Integer.MAX_VALUE;
		while(n>0) {
			int rem=n%10;
			if(rem>bigger) {
				bigger =rem;
			}
			if(rem<smaller) {
				smaller =rem;
			}
			n=n/10;
		}
		System.out.println("bigger  "+bigger );
		System.out.println("smaller "+smaller);
	}

}
