package file_handling;

import java.io.File;
import java.io.IOException;

public class Program2_CreateFileByFileClass {

	public static void main(String[] args) throws IOException{
		System.out.println("Program start");
		File f1 =new File("D:\\abcd1.txt"); // this is only declaration line
//		try {
//			f1.createNewFile();
//			System.out.println("File is created !");
//		} catch (IOException e) {
//			System.out.println("file is not created");
//			System.out.println("Either location is not found or extension is wrong");
//		}
		
		System.out.println("=============we can also handled this exception by throws keyword==========");
		
		f1.createNewFile(); // i am handling this exception by using throws keyword
		
	}

}
