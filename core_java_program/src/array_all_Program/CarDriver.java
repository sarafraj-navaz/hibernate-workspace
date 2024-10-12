package array_all_Program;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 =new Car("Maruti",8888.23,"blue");
		Car c2 =new Car("Hunda",786786.22,"yellow");
		
		Car[] list = {c1,c2,new Car("Tata",66666.23,"Aqua")};
		for(Car c:list) {
			c.display();
		}
		System.out.println(list);
		
	}
}
