package com.training.spring.crud.dao;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.training.spring.crud.model.Student;
import com.training.spring.crud.rowmappers.StudentMapper;



public class StudentDAO implements StudentDAOInterface{
	
	private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

		public int studentAdd(Student student) {
			String sql = "insert into ogm_stage.Student(id,age,contact,name,presentclass,city) values(?,?,?,?,?,?)";
	        jdbcTemplate.update(sql, new Object[]
	        { student.getId(), student.getAge(), student.getContact(), student.getName(),student.getPresentClass(),student.getCity() });
			return 0;
		}

		public List<Student> getAllStudents() {
			String sql="select * from ogm_stage.Student";
			List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
			return students;
		}

		public Student getStudentById(int id) {
			String sql="select * from ogm_stage.Student where id=?";
			Student student = jdbcTemplate.queryForObject(sql,new Object[] {id}, new StudentMapper());
			return student;
		}

		public int updateStudent(Student student) {
			String sql="update ogm_stage.Student set age=? , contact=?, name=?, presentClass=?,city=? where id=?";
			jdbcTemplate.update(sql, new Object[]
			        { student.getAge(), student.getContact(), student.getName(),student.getPresentClass(),student.getCity(),student.getId() });
			return 0;
		}

		public int deleteStudent(int id) {
			String sql="delete from ogm_stage.Student where id=?";
			System.out.println("id to be deleted:"+id);
			jdbcTemplate.update(sql, new Object[] { id });
			return 0;
		}

}
