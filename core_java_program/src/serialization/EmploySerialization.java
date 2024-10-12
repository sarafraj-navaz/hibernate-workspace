package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class EmploySerialization  {
	public static void main(String[] args) throws Exception {
		Employ employ=new Employ(1,"Sarafraj","S@gmail.com",22);
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Serialization/serial.txt");
		ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employ);
		
	}

}