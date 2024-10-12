package number_Based_Programming0;
import java.util.Scanner;
public class Covert_From_Decimal_to_Octal_Number_Program13 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number in the form of the Decimal");
		int n=sc.nextInt();
	 String a1=getOctalFromDecimal(n);
		System.out.println(n+"Octal number is "+a1);
		
	}
	public static String getOctalFromDecimal(int n) {
		String s1="";
		while(n>0) {
			int rem=n%8;
			s1=rem+s1;
			n=n/8;
		}
		return s1;
	}
}
