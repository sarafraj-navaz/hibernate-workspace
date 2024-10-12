package exam;

public class Polymorphism {

	public static void main(String[] args) {
		
		A a1 =new C();
		System.out.println(a1.f());
		
		B b1 =(B)a1;
		System.out.println(b1.f());
	}
}	
	class A{
		int f() {
			return 0;
		}
	}
	
	class B extends A{
		int f() {
			return 1;
		}
	}
	class C extends B{
		int f() {
			return 2;
		}
	}

