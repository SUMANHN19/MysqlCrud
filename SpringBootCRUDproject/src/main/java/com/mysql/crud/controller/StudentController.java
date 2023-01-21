package com.mysql.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.crud.entity.Student;
import com.mysql.crud.service.StudentService;

@Controller
@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping
	public void insertData(@RequestBody Student student) {
		studentService.insertStudent(student);
	}
	
	@GetMapping("/{id}")
	public Student getData(@PathVariable int id) {
		return studentService.getStudentDetailsById(id);
	}
	
	@GetMapping
	public List<Student> getAllData(){
		return studentService.getAllStudentDetails();
	}
	
	@PutMapping("/{id}")
	public Student updateData(@RequestBody Student student , @PathVariable int id) {
		return studentService.updateStudentDetailsById(id, student);
	}
	
	@DeleteMapping(""
			+ "/{id}")
	public void deleteData(@PathVariable int id) {
		studentService.deletestudentDetailsById(id);
	}
}
