package expection_handling;

public class Program9 {
	public static void main(String[] args) {
			try
			{
				System.out.println("This is try block");
				System.out.println(10/0);
			}
			catch(NullPointerException e)
			{
				System.out.println("catch block");
				System.out.println(20/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("catch block---");
				try {
				System.out.println(20/0);
				}catch(Exception e1) {
					System.out.println("Aritm. exception from inside catch block");
				}
			}
			finally
			{
				System.out.println("FInally block starts");
				try {
					System.out.println(10/0);
				}catch(ArithmeticException e1) {
					System.out.println("Excep. handled from finally block");
				}
				System.out.println("finally block ends!!");
			}
			System.out.println("Program ENds!!");
		}
}