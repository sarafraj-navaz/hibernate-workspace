package file_handling_create_a_File_Program;

import java.io.File;
import java.io.IOException;

public class Program1 {
	
	public static void main(String[] args) {
		File f1 =new File("D:\\raj.txt");
		/**
		 * above line is only a declaration statement 
		 * file class will never create file 
		 */
		try {
			if (f1.createNewFile()) {
				/**
				 * createNewFile method creates file 
				 */
				System.out.println("file has created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
