package jdbc_student_crud_operation_by_statement.entity;

import java.time.LocalDateTime;

public class Student {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String studentCollege;
	private LocalDateTime time;
	
	public int getstudentId() {
		return studentId;
	}
	public void setStudentId(int sId) {
		this.studentId=sId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String sName) {
		this.studentName =sName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String sEmail) {
		 this.studentEmail =sEmail;
	}
	
	public String getStudentCollege() {
		return studentCollege;
	}
	public void setStudentCollege(String sCollege) {
		this.studentCollege =sCollege;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time=time;
	}
	

}
