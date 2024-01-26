package com.demo.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.demo.bean.Students;

public class StudentsDAOImpl implements StudentsDAO {
	@Autowired
	JdbcTemplate jt;

	public StudentsDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public int insertStudents(Students stud) {
		// TODO Auto-generated method stub
		
		
		String sql="Insert into emp123 values (?,?,?,?)";
		int i=jt.update(sql,new Object[] {stud.getId(),stud.getStd(),stud.getEname(),stud.getEmail()});
		
		return i;
	}

	@Override
	public String getStudentsName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStudents(Students stud) {
		// TODO Auto-generated method stub
		
		String sql="Update stud123 set std=? where id=?";
		int i=jt.update (sql,new Object[] {stud.getStd(),stud.getId()});
		
		return i;
	}

	@Override
	public int deleteStudents(Students studs) {
		
		String sql="delete from stud123 where id=?";
		int i=jt. update(sql,new Object[] {studs.getId()});
		
		return i;
	
	}
	
	//row -----object
	//select * from row column

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		
		String sql="select * from stud123";
		List<Students> studList=jt.query
				(sql,new RowMapper<Students>() {
					@Override
					public Students mapRow(ResultSet arg0, int arg1)
					throws SQLException{
						
						Students stud=new Students();
						stud.setId(arg0.getInt(1));
						stud.setEname(arg0.getString(2));
						stud.setEmail(arg0.getString(3));
					
					return stud;
					}
						
					});
		return studList;
	}

	

}



