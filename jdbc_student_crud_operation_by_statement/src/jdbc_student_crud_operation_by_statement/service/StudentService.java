package jdbc_student_crud_operation_by_statement.service;

import java.util.List;

import jdbc_student_crud_operation_by_statement.dao.StudentDao;
import jdbc_student_crud_operation_by_statement.entity.Student;

public class StudentService {

	StudentDao dao = new StudentDao();

	public Student saveStudentService(Student student) {

		return dao.saveStudentDao(student);

	}

	/**
	 * this is delete method of student
	 */

	public int deleteStudentByStudentId(int sId) {
		return dao.deleteStudentByStudentId(sId);
	}

	/**
	 * 
	 * this is update method of the student this method update email with the help
	 * of studentId
	 */
	public int updateMethodService(String sEmail, int sId) {
		return dao.updateMethodDao(sEmail, sId);
	}

	/**
	 * this is display method it will display all data whatever is present in the
	 * Student table
	 */
	public List<Student> displayAllDataService() {
		List<Student> ss = dao.displayAllDataDao();
		
		return ss;
	}
	/**
	 * update name and email and collage
	 */
	
	public int updateNameEmailCollegeService(Student student,int sId) {
		return dao.updateNameEmailCollege(student, sId);
	}
	
	//this is used to display only one row from the table 
	
	public Student getOneRowDisplayService(int sId) {
		return dao.getOneRowDisplayDao(sId);
	}

}
