package file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program6_write_DynamicInput_ByFileWriter_Class_Program2 {

	public static void main(String[] args) {
		System.out.println("Start the Program");
		Scanner sc=new Scanner(System.in);
		FileWriter fw=null;
		try {
		fw =new FileWriter("D:\\abdd2_By_FileWriter.txt");
		System.out.println("file is created ");
		
		System.out.println("enter the employeeId");
		int id =sc.nextInt();
		System.out.println("enter the employeeName");
		String name =sc.next();
		System.out.println("enter  the address of the employee");
		sc.nextLine();
		String address=sc.nextLine();
		fw.write(id+"\n");
		fw.write(name+"\n");
		fw.write(address+"\n");
		System.out.println("writting is successfully");
		
		} catch (IOException e) {
			System.out.println("file is not created or extension is wrong");
			e.printStackTrace();
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
