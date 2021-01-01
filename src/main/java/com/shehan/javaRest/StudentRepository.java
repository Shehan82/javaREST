package com.shehan.javaRest;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	
	List<Student> students;
	
	public StudentRepository()
	{
		students = new ArrayList<>(); //set the initial value for the students object
		
		Student s1 = new Student();
		s1.setName("shehan");
		s1.setAge(23);
		
		Student s2 = new Student();
		s2.setName("Sandeepa");
		s2.setAge(21);
		
		students.add(s1);
		students.add(s2);
	}
	
	public List<Student> getStudents()
	{
		return students;
	}
	
	public Student getStudent(int id)
	{
		for(Student a : students)
		{
			if(a.getId()==id)  
				return a;
		}
		
		return null;
	}

	public void create(Student a) {
		
		students.add(a);
		
	}
}
