package file_handling_output_Stream_fileWriter_and_FileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) {
		File f1 = new File("D:\\RajFileWriterProgram1.txt"); 
		FileOutputStream fos = null;
		try {
			f1.createNewFile();
			fos = new FileOutputStream(f1);
			fos.write(97);
			/**
			 * it only takes ascii value from the user then after that ir will store the charactor in the file
			 */
			fos.write(98);
			fos.write(99);
			fos.write(100);
			System.out.println("Data has been stored in your file ");
		} catch (IOException e) {
			System.out.println("i think you should watch your file location ");
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
