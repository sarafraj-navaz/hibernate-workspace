package constructor_All_Program;

public class Car {
	String name;
	String color;
	String cName;
	Car(){
		
	}
	Car(String name,String color,String cName){
		this.name=name;
		this.color=color;
		this.cName=cName;
		
	}
	/**
	 * i am designing copy constructor 
	 */
	Car(Car c1){
		this.cName=c1.cName;
		this.color=c1.color;
		this.name=c1.name;
		
	}
	public void display() {
		System.out.println(name+" "+color+" "+cName);
	}
}
