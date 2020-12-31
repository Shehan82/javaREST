package com.shehan.javaRest;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
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

}
