package com.jsp.spring_core_simple1.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.spring_core_simple1.entity.Student;

public class StudentDriverForSetter {

	public static void main(String[] args) {
		
		BeanFactory beanFactory= new ClassPathXmlApplicationContext("settterC.xml");
		Student student= (Student)beanFactory.getBean("settter");
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
		

	}

}
