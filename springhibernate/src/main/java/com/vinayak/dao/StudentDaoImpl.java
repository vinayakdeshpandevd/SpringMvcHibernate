package com.vinayak.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vinayak.model.Student;
 
@Repository
public class StudentDaoImpl implements StudentDao{
@Autowired
SessionFactory sf;
	public int addStudent(Student stu) {
		// TODO Auto-generated method stub
		Session session = null;
		session = sf.openSession();
		
		
		Transaction trnx = session.beginTransaction();
		
		session.save(stu);
		
		trnx.commit();
		
		session.close();
		
		return 0;
		 
	}

	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		Session session = null;
		session = sf.openSession();
		Transaction trnx = session.beginTransaction();
		List<Student> list=new ArrayList<Student>();
	 Query q=session.createQuery("from Student");
		list=q.list();
		trnx.commit();
		
		session.close();
		return list;
	}

	public int updateStudent(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
