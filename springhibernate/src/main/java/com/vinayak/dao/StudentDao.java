package com.vinayak.dao;

import java.util.List;

import com.vinayak.model.Student;

public interface StudentDao {
	public int addStudent(Student stu);
	public List<Student> viewAllStudents();
	public int updateStudent(int id);

}
