package com.jsp.spring_core_simple1.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.spring_core_simple1.entity.Student;

public class StudentController {

	public static void main(String[] args) {
		
		BeanFactory beanFactory= new ClassPathXmlApplicationContext("variable.xml");
		Student  student= (Student)beanFactory.getBean("myId");
		student.sum();
	}

}
