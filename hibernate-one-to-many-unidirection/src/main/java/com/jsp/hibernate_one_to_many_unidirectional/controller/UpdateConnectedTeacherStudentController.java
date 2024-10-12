package com.jsp.hibernate_one_to_many_unidirectional.controller;

import com.jsp.hibernate_one_to_many_unidirectional.service.TeacherService;

public class UpdateConnectedTeacherStudentController {

	public static void main(String[] args) {
		
		
		TeacherService service = new TeacherService();
		
		service.updateConnectTeacherStudentDao(420, 2222);

	}

}
