package com.webservice.service;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.google.gson.Gson;
import com.webservice.dao.JdbcCorporateEventDao;
import com.webservice.pojo.Student;

/*
@Consumes({ MediaType.APPLICATION_JSON}) */
@Produces({ MediaType.APPLICATION_XML}) 
public class StudentService {

	@Autowired
	private JdbcCorporateEventDao evenDao;	
	
	
	@GET
	@Path("/getStudents/")
	@Produces({"application/xml;charset=utf-8",MediaType.APPLICATION_XML})
	public Student getStudents(){
		/*List<Student> students =  evenDao.getStudents();
		Gson gson = new Gson();
		return gson.toJson(students);*/
		
		Student student = new Student("100","101","michael", "192100200", "北京");
		return student;
	}
	
	@GET
	@Path("/getStudentsToJson")
	@Produces({"application/json;charset=utf-8",MediaType.APPLICATION_JSON})
	public String getStudnetToJson(){
		List<Student> students =  evenDao.getStudents();
		Gson gson = new Gson();
		return gson.toJson(students);
	}
	
	@GET
	@Path("/getStudent/{studentId}")
	public String getStudentById(@PathParam("studentId") int id){
		Gson gson = new Gson();
		return gson.toJson(evenDao.getStudentById(id));
	}
}
