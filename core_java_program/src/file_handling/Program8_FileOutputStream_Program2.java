package file_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program8_FileOutputStream_Program2 {
	public static void main(String[] args) {
		
		//this line which is used for declaration purpase
		File f1 =new File("D:\\FileOutputStream7.txt");  
		
		FileOutputStream fos=null;
		
		try {
		     fos =new FileOutputStream(f1);
	// write method take only ascii value then after that it converts into character
	    /**
	     * 3 write method of FileOutputStram 
	     * first one takes bytes and return type of the this method is void 
	     * second methods takes byte[] array and the return type of the method is Byte[]
	     * third takes 3 arguments at its parameters
	     */
		     
		     
		     
		     
		     byte[] b = {97,98,99,100,101,102};
		     //it will save a ,b,c,d,e,f
//		     fos.write(b);
		     
		     fos.write(b, 0, 4);
		     
		     
		     fos.write("\n Program is running at the lines".getBytes());
		     
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
