package expection_handling;

public class Program10 {
	public static void main(String[] args) {
		System.out.println("main Starts");
		try {
			test();
		}catch(Exception e)
		{
			System.out.println(e);
//			e.printStackTrace();
		}
		System.out.println("Main Ends");
		
	}
	
	public static void test() throws Exception
	{
//		throw new ArithmeticException();
		throw new NullPointerException();
	}

}
