package numbers_All_programs;

public class CountNumberOf_0_And_1_Program2 {

	/*
	 * WAJP TO TAKE USER INPUT COUNT NUMBER of 0 and 1
	 */
	public static void main(String[] args) {
		countZeroAndOne(58);
	}

	public static void countZeroAndOne(int n) {
		int zeroCount=0;
		int oneCount=0;
		while(n>0) {
			int rem=n%2;
			if(rem==0) {
				zeroCount++;
			}else {
				oneCount++;
			}
			
			n=n/2;
		}
		System.out.println("o in number"+zeroCount);
		System.out.println("1 in number "+oneCount);
	}
}
