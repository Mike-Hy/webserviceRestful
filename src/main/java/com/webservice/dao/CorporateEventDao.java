package com.webservice.dao;

import java.util.List;

import com.webservice.pojo.Student;

public interface CorporateEventDao {

	public int getStudentCount();
	
	public List<Student>  getStudents();
	
	public Student getStudentById(int id);
}
