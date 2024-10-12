package constructor_All_Program;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1 =new Car("maruti","blue","TATA");
		c1.display();
		Car c2 =new Car(c1);
		c2.display();
	}

}
