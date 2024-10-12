package metthodOverloading;

public class Calculater {
	 int number1;
	 double num1;
	
	 

	 Calculater(){
		 
	 }
	 public static void sum(int n1) {
		 System.out.println(n1);
	 }
	 
	 public static void sum(int n1,int n2) {
		 System.out.println(n1+n2);
	 }
	 public static void sum(double num1) {
		 System.out.println("double number"+num1);
	 }
	 public void sum(double num1,double num2) {
		 System.out.println(num1+num2);
	 }
}
