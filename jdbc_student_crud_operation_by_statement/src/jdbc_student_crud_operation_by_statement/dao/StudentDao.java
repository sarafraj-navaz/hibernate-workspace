package jdbc_student_crud_operation_by_statement.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc_student_crud_operation_by_statement.connection.StudentConnection;
import jdbc_student_crud_operation_by_statement.entity.Student;

public class StudentDao {
	
	Connection con =StudentConnection.getStudentConnection();
	
	/**
	 * 
	 * this is save method of the student
	 */
	public Student saveStudentDao(Student student) {				
			try {
				Statement st = con.createStatement();
				
				String insert ="insert into student1 value("+student.getstudentId()+",'"+student.getStudentName()+"','"+student.getStudentEmail()+"','"+student.getStudentCollege()+"')";
				   st.execute(insert);
				   
				   return student;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}
	
	
	/**
	 * this is delete method of student 
	 */
	
	public int deleteStudentByStudentId(int sId) {
		
		try {
			Statement st =con.createStatement();
			
			String deleteQuery ="delete from student1 where id ="+sId;
			return st.executeUpdate(deleteQuery);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;	
	}
	
	/**
	 * 
	 * this is update method of the student 
	 * this method update email with the help of studentId
	 */
	public int updateMethodDao(String sEmail,int sId) {
		
		try {
			Statement st = con.createStatement();
			
			String update ="update student1 set email ='"+sEmail+"' where id ="+sId;
		   return 	st.executeUpdate(update);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return 0;	
	}
/**
 * this is display method
 * it will display all data whatever is present in the Student table
 */
	public List<Student> displayAllDataDao(){
	    	try {
				Statement st= con.createStatement();
				
				String display ="select * from student1";
				
				ResultSet  rs= st.executeQuery(display);
				
				List<Student> list =new ArrayList<Student>();
				
				while(rs.next()) {
					
					Student student =new Student();
					int id =rs.getInt("id");
					String name =rs.getString("name");
					String email =rs.getString("email");
					String coll =rs.getString("college");
					
					student.setStudentId(id);
					student.setStudentName(name);
					student.setStudentEmail(email);
					student.setStudentCollege(coll);
					
					list.add(student);
						
				}
				
				return list;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    return null;	
	}
	/**
	 * update name and email and collage as well as id 
	 */
	
	public int updateNameEmailCollege(Student student,int sId) {
		try {
			Statement st= con.createStatement();
			
			String updateQuery ="update student1 set name ='"+student.getStudentName()+"', email ='"+student.getStudentEmail()+"' ,college ='"+student.getStudentCollege()+"',id ="+student.getstudentId()+" where id="+sId;
			
		   return st.executeUpdate(updateQuery);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return 0;	
	}
	
	//this is used to display only one row from the table 
	
	public Student getOneRowDisplayDao(int sId) {
		
		try {
			Statement st= con.createStatement();
			
//			String displayOneRow  ="select * from student1 where id ="+sId;
			ResultSet rs= st.executeQuery("select * from student1 where id ="+sId);
			
			while(rs.next()) {
				
				Student s1 =new Student();
				
				int id=rs.getInt("id");
				String name =rs.getString("name");
				String email =rs.getString("email");
				String col =rs.getString("college");
				
				s1.setStudentId(sId);
				s1.setStudentName(name);
				s1.setStudentEmail(email);
				s1.setStudentCollege(col);
				
				return s1;
				
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return null;	
	}
}
