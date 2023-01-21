package com.mysql.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysql.crud.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
