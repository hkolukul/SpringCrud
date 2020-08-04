package com.training.spring.crud.dao;

import java.util.List;

import com.training.spring.crud.model.Student;

public interface StudentDAOInterface {
	
	public int studentAdd(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public int updateStudent(Student student);
	public int deleteStudent(int id);
}
