package array_all_Program;

public class Car {
	String carName;
	double carPrice;
	String carColor;
	
	Car(){
		
	}
	Car(String name,double price,String color){
		this.carName=name;
		this.carPrice=price;
		this.carColor=color;
	}
	public void display() {
		System.out.println("CarName :"+carName+" CarPrice "+carPrice+" CarColor "+carColor);
	}
	
}
