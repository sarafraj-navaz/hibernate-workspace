package rivision;

public class Program11 {
	public static void main(String[] args) {
		int[] a= {1,2,3,2,1,5};
		printFrequency(a);
	}
	public static void printFrequency(int[] a) {
		int n=a.length-1;
		for(int i=0;i<=n;i++) {
			int count=1;
			for(int j=i+1;j<=n;j++) {
				if(a[i]==a[j]) {
					count++;
					int temp=a[n-i];
					a[n-i]=a[j];
					a[j]=temp;
					j--;
					n--;
				}
			}
			System.out.println(a[i]+" Frequiency is "+count);
		}
	}
}
