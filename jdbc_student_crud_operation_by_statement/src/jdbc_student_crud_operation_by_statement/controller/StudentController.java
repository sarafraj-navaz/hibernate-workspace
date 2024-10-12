package jdbc_student_crud_operation_by_statement.controller;

import java.util.List;
import java.util.Scanner;

import jdbc_student_crud_operation_by_statement.entity.Student;
import jdbc_student_crud_operation_by_statement.service.StudentService;

public class StudentController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		StudentService service = new StudentService();

		while (true) {
			System.out.println("1.insert\n 2.DeleteMethodBystudentID\n 3.updateEmail\n 4.display\n5.update all data \n 6.display Only one row");
			System.out.println("enter the choise");
			int choise = sc.nextInt();

			switch (choise) {
			case 1: {
				System.out.println("enter the student Id");
				int id=sc.nextInt();
				
				System.out.println("enter  the Student Name");
				String name =sc.next();
				
				System.out.println("enter the Student Email");
				String email =sc.next();
				
				System.out.println("enter the college Name");
				String college =sc.next();
				
				student.setStudentId(id);
				student.setStudentName(name);
				student.setStudentEmail(email);
				student.setStudentCollege(college);
				
		         	Student  s=	service.saveStudentService(student);
		         	
		         	if(s != null) {
		         		System.out.println("data has been saved");
		         	}
		         	else {
		         		System.out.println("please check your code");
		         	}
				
			}
				break;
			case 2:{
				System.out.println("enter the student Id");
				int  id =sc.nextInt();
				
				int sId= service.deleteStudentByStudentId(id);
				if(sId != 0) {
					System.out.println("data has been deleted ");
				}
				else {
					System.out.println("please check your Id");
				}
				
			}break;
			case 3:{
				System.out.println("enter the email update email which you want to update ");
				String email =sc.next();
				
				student.setStudentEmail(email);
				
				System.out.println("enter  the Student Id");
				int id =sc.nextInt();
				
				int sId= service.updateMethodService(email, id);
				
				if(sId != 0) {
					System.out.println("email has been update in the table");
				}
				else {
					System.out.println("please check your given Student Id");
				}
			}break;
			case 4:{
		       		List<Student> students= service.displayAllDataService();
		       		
		       		for(Student student2 :students) {
						/*
						 * if(student2.getstudentId()==2) {
						 * System.out.println(student2.getstudentId()+"  "+student2.getStudentName()
						 * +"  "+student2.getStudentEmail()+"  "+student2.getStudentCollege()); }
						 */
		       			System.out.println(student2.getstudentId()+"  "+student2.getStudentName()+"  "+student2.getStudentEmail()+"  "+student2.getStudentCollege());
		       		}
			}break;
			case 5:{
				System.out.println("enter the update name which name do you want to update");
				String name =sc.next();
				
				System.out.println("enter the email ");
				String email =sc.next();
				
				System.out.println("enter the College name ");
				String college =sc.next();
				
				System.out.println("enter the student Id");
				int id =sc.nextInt();
				
				student.setStudentName(name);
				student.setStudentEmail(email);
				student.setStudentCollege(college);
				student.setStudentId(id);
				
				System.out.println("enter the student Id");
				int id2 =sc.nextInt();
				int id1= service.updateNameEmailCollegeService(student, id2);
				
				if(id1 != 0) {
					System.out.println("data has been updated ");
				}
				else {
					System.out.println("please check your given id");
				}
				
			}break;
			case 6:{
				System.out.println("enter the Student Id");
				student= service.getOneRowDisplayService(sc.nextInt());
				System.out.println(student.getstudentId()+" "+student.getStudentName()+" "+student.getStudentEmail()+" "+student.getStudentCollege());
				
			}break;
			default:
				break;
			}

		}

	}

}
