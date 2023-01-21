package com.mysql.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.crud.entity.Student;
import com.mysql.crud.repo.StudentRepo;


@Service
public class StudentServiceImp implements StudentService{

	@Autowired StudentRepo studentRepo;
	
	@Override
	public void insertStudent(Student student) {
		studentRepo.save(student);
		
	}

	@Override
	public Student getStudentDetailsById(int id) {
		
		return studentRepo.findById(id).orElseThrow();
	}

	@Override
	public List<Student> getAllStudentDetails() {
		return studentRepo.findAll();
	}

	@Override
	public Student updateStudentDetailsById(int id, Student student) {
		Student studentFromDb = studentRepo.findById(id).get();
		
		studentFromDb.setName(student.getName());
		studentFromDb.setFatherName(student.getFatherName());
		studentFromDb.setAddress(student.getAddress());
		studentFromDb.setAge(student.getAge());
		
		return studentRepo.save(studentFromDb);
	}

	@Override
	public void deletestudentDetailsById(int id) {
		studentRepo.deleteById(id);
		
	}

}
