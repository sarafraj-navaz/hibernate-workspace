package rivision;

public class Print_Prime_And_Count_Program6 {
    public static void main(String[] args) {
        int[] a = {2, 6, 5, 7, 8, 11};
        print(a);
    }

    public static void print(int[] a) {
        int totalPrimeCount = 0;
        for (int num : a) {
            if (isPrime(num)) {
                System.out.println("Prime Number " + num);
                totalPrimeCount++;
            }
        }
        System.out.println("Total prime numbers are " + totalPrimeCount);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        int count=0;
        for(int i=2;i<=n/2;i++) {
        	if(n%i==0) {
        		count++;
        	}
        }
        
        if(count>=1) {
        	return false;
        }
       return true;
    }
}
