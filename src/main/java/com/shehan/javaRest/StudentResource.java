package com.shehan.javaRest;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	
	StudentRepository students = new StudentRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent()
	{
		return students.getStudents(); 
	}
	
	@GET
	@Path("student/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("id") int id)
	{
		return students.getStudent(id);
	}
	
	@POST
	@Path("create")
	@Produces(MediaType.APPLICATION_JSON)
	public Student createStudent(Student a)
	{
		System.out.println("how are you");
		students.create(a);
		return a;
	}

}
