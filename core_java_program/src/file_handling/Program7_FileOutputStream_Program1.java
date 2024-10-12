package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program7_FileOutputStream_Program1 {

	public static void main(String[] args) {
		
		//this line which is used for declaration purpase
		File f1 =new File("D:\\FileOutputStream1.txt");  
		
		FileOutputStream fos=null;
		
		try {
		     fos =new FileOutputStream(f1);
	// write method take only ascii value then after that it converts into character
			fos.write(97); 
			fos.write(98);
			fos.write(99);
			fos.write(100);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
