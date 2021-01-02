package com.shehan.javaRest;

import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class StudentRepository {
	
	
	
	Connection con = null;
	
//	public StudentRepository()
//	{
//		students = new ArrayList<>(); //set the initial value for the students object
//		
//		Student s1 = new Student();
//		s1.setId(1);
//		s1.setName("shehan");
//		s1.setAge(23);
//		
//		Student s2 = new Student();
//		s2.setId(2);
//		s2.setName("Sandeepa");
//		s2.setAge(21);
//		
//		students.add(s1);
//		students.add(s2);
//	}
	
	public StudentRepository() throws ClassNotFoundException
	{
		String url = "jdbc:mysql://localhost/restdb";
		String userName = "root";
		String password = "";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
			
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		
	}
	
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<>();
		String query = "select * from students";
		Statement st;
		try 
		{
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				Student stu = new Student();
				stu.setId(rs.getInt(1));
				stu.setName(rs.getString(2));
				stu.setAge(rs.getInt(3));
				
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
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
