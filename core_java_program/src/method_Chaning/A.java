package method_Chaning;

public class A {

	private int a;
	private float b;
	
	A(){
		
	}
	public A setInt(int a) {
		
		this.a =a;
		
		return this;
	}
	public A setfloat(float b) {
	
		this.b=b;
		return this;
	}
	
	public void display() {
		System.out.println("display method "+a+"  "+b);
	}
	
}
