package com.demo.dao;


import java.util.List;

import com.demo.bean.Students;

public interface StudentsDAO {

	
	int insertStudents(Students e);
	
	public String getStudentsName(int id);
	
	
	public int updateStudents(Students stud);
	public int deleteStudents(Students stud); 
	
	public List<Students> getAllStudents();



}
