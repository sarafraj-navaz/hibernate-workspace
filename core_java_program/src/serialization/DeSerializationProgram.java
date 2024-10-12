package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationProgram {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fileInputStream = new FileInputStream("C:/Serialization/serial.txt");
	ObjectInputStream inputStream  =new ObjectInputStream(fileInputStream);
	Object object= inputStream.readObject();
	System.out.println(object);

	}

}
