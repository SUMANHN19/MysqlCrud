package com.mysql.crud.service;

import java.util.List;

import com.mysql.crud.entity.Student;

public interface StudentService {

	void insertStudent(Student student);
	
	Student getStudentDetailsById(int id);
	
	List<Student> getAllStudentDetails();
	
	Student updateStudentDetailsById(int id, Student student);
	
	void deletestudentDetailsById(int id);
}
