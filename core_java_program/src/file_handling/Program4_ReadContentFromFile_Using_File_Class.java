package file_handling;

import java.io.File;

public class Program4_ReadContentFromFile_Using_File_Class {

	public static void main(String[] args) {
		File f1 =new File("D:\\");
		
		//i am accessing all file whatever it is present inside the D Drive
		File[] list= f1.listFiles();
		
		for(File x:list) {
			System.out.println(x);
		}
	}

}
