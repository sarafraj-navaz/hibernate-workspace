 package file_handling;

import java.io.File;
import java.io.IOException;

public class Program3_ReadThenApplyPermissionFalse {

	public static void main(String[] args) {
		File f1 =new File("D:\\abcd.txt");
		
		try {
			f1.createNewFile();
			System.out.println("file is created ");
			
		}
		catch (IOException e) {
			System.out.println("file is not created ");
			System.out.println("path is wrong or extension is wrong");
		}
		
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		
		//i am not allowing to write anything inside this file
		f1.setWritable(false);
		System.out.println(f1.canWrite());
		
	}

}
