package interface_deep_understanding_heirarchy;

public interface A {

	public void test();
	default void display() {
		System.out.println("this is default method which is feature of java 8");
	}
	
	public static void static_display() {
		System.out.println("this is static method which is feature of java 8");
	}
}
