package file_handling_output_Stream;

import java.io.FileWriter;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) {
		try {
			FileWriter fw =new FileWriter("D:\\rajByFileWriter.txt");
			
			/**
			 *above it creates file if the file name and extension will be correct.
			 *it gives IOException we can handling by try catch block or throws keywords
			 */
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
