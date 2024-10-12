package array_all_Program;

public class Question16 {
	public static void main(String[] args) {
	        int[] array = {1, 3, 2, 2, 3, 3};
	        getMaximumFrequency(array);
	}

	public static void getMaximumFrequency(int[] a) {
		int n=a.length-1;int maxElement=0,maxCount=0;
		for(int i=0;i<=n;i++) {
			int count=1;
			for(int j=i+1;j<=n;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j--]=a[n--];
				}
			}
			if(count>maxCount) {
				maxCount=count;
				maxElement=a[i];
			}
		}
		System.out.println("Max Value "+maxElement+" frequency "+maxCount);
	}
}
