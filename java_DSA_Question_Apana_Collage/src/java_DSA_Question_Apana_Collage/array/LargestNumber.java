package java_DSA_Question_Apana_Collage.array;

public class LargestNumber {

	public static int largest(int number[]) {
		int largerNumber =Integer.MIN_VALUE;
		int smallestValue=Integer.MAX_VALUE;
		for(int i=0;i<number.length;i++) {
			if(largerNumber<number[i]) {
				largerNumber=number[i];
			}
			if(smallestValue>number[i]) {
				smallestValue=number[i];
			}
		}
		System.out.println("smallest value is "+smallestValue);
		return largerNumber;
		
	}
	public static void main(String[] args) {
		int a[]= {2,2,6,3,5,1};
		
		System.out.println(largest(a));
	}

}
