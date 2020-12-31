package com.shehan.javaRest;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent()
	{
		Student s1 = new Student();
		s1.setName("shehan");
		s1.setAge(23);
		
		Student s2 = new Student();
		s2.setName("Sandeepa");
		s2.setAge(21);
		
		List<Student> studentList = Arrays.asList(s1,s2);
		
		return studentList;
	}

}
