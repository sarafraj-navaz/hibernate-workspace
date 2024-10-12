package rivision;

public class Question4{
	public static void main(String[] args) {
		int[] a= {42,123,675,87,111};
		countThreeDigitNumber(a);
	}
	public static void countThreeDigitNumber(int[] a) {
		int totalCount3DigitNumber=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			int n=a[i];
			while(n>0) {
				count++;
				n=n/10;
			}
			if(count==3) {
				totalCount3DigitNumber++;
			}
		}
		System.out.println("Total element of the 3 digit number is "+totalCount3DigitNumber);
	}
}
