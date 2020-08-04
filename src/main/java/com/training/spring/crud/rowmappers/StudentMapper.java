package com.training.spring.crud.rowmappers;
	
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import org.springframework.jdbc.core.RowMapper;

import com.training.spring.crud.model.Student;

	public class StudentMapper implements RowMapper<Student> {
	   public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Student student = new Student();
	      student.setId(rs.getInt("id"));
	      student.setName(rs.getString("name"));
	      student.setPresentClass(rs.getString("presentClass"));
	      student.setCity(rs.getString("city"));
	      student.setContact(rs.getString("contact"));
	      student.setAge(rs.getInt("age"));
	      return student;
	   }
	}

