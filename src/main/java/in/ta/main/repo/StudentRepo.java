package in.ta.main.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.ta.main.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
@Repository
public class StudentRepo {

	@Autowired
	JdbcTemplate jdbc;
	
	public int register(Student std) {
		String sql="insert into student values(?,?,?,?,?)";
		return jdbc.update(sql,std.getStudent_id(),std.getStudent_name(),std.getDepartment(),std.getSection(),std.getRoll_num());
		
	}
	
	public Student getStd(String student_id) {
		String sql="select * from student where student_id=?";
		List<Student> list=jdbc.query(sql, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student std=new Student();
				std.setStudent_id(rs.getString("student_id"));
				std.setStudent_name(rs.getString("student_name"));
				std.setDepartment(rs.getString("department"));
				std.setSection(rs.getString("section"));
				std.setRoll_num(rs.getInt("roll_num"));
				return std;
			}
			
		},student_id);
		if(list.isEmpty()) return null;
		return list.get(0);
	}
}
