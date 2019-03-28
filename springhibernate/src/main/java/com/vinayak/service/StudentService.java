package com.vinayak.service;

import java.util.List;

import com.vinayak.model.Student;

public interface StudentService {
	public int addStudent(Student stu);
	public List<Student> viewAllStudents();
	public int updateStudent(int id);

}
