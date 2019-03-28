package com.vinayak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

@Id
	//@Column(name="id")
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

@Column
private String name;

@Column
private String Dept;
	
@Column
private String Mentor;
	
@Column
private int age;
	
@Column
private String salary;

	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}
public String getMentor() {
	return Mentor;
}
public void setMentor(String mentor) {
	Mentor = mentor;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
}
