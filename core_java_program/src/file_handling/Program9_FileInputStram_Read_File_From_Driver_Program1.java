package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program9_FileInputStram_Read_File_From_Driver_Program1 {

	public static void main(String[] args) {

		File f1 = new File("D:\\Prime.java");

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(f1);

			// data it will come int form we have to downcast
			int x = fis.read();

			while (x != -1) {

				char p = (char) x;
				System.out.print(p);
				x = fis.read();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
