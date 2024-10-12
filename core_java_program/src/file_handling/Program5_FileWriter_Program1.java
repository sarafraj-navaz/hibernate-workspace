package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Program5_FileWriter_Program1 {

	public static void main(String[] args) {
		
		System.out.println("Start the Program");
		FileWriter fw=null;
		try {
		  fw =new FileWriter("D:\\abcd1_With_FileWriter.txt");
			System.out.println("file is created ");
			fw.write("Hi My name is sarafraj navaz");
			System.out.println("writting is successfully");
		} catch (IOException e) {
			System.out.println("file is not created ");
			System.out.println("extension is wrong or Path is not found");
			
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
