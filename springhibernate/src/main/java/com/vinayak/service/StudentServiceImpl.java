package com.vinayak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinayak.dao.StudentDao;
import com.vinayak.dao.StudentDaoImpl;
import com.vinayak.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentDaoImpl sd;

	public int addStudent(Student stu) {
		return sd.addStudent(stu);
	}

	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return sd.viewAllStudents();
	}

	public int updateStudent(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
