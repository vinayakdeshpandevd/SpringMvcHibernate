package com.vinayak.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vinayak.model.Student;
import com.vinayak.service.StudentServiceImpl;

@Controller
public class StudentController {
	@Autowired
StudentServiceImpl ss;
@RequestMapping("/add")
 public String addStudent(Model m) {
 
	Student s=new Student();
	m.addAttribute("Student", s);
	return "add.jsp";
}
	@RequestMapping(value="/added", method=RequestMethod.POST)
	public String added(@ModelAttribute("Student") Student stu) {
		ss.addStudent(stu);
		return "added.jsp";
}
	@RequestMapping("/view")
	public List<Student> viewAllStudents(Model m) {
		 List<Student> list=new ArrayList<Student>();
		 list=ss.viewAllStudents();
		return list;
		
	}


}
