package com.shehan.javaRest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent()
	{
		Student s1 = new Student();
		s1.setName("shehan");
		s1.setAge(23);
		
		return s1;
	}

}
