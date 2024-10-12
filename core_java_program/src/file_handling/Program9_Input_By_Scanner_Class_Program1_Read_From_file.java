package file_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Program9_Input_By_Scanner_Class_Program1_Read_From_file {

	public static void main(String[] args) {
		System.out.println("Program start");
		
		File f1 =new File("D:\\IMG_20230311_071217.jpg");
		
	    try {
	    	Scanner sc =new Scanner(f1); // it will take input file
	    	
	    	while(sc.hasNextLine()) {
	    		System.out.println(sc.nextLine());
	    	}
	    }
	    catch(FileNotFoundException e) {
	    	e.printStackTrace();
	    }
		
		

	}

}
