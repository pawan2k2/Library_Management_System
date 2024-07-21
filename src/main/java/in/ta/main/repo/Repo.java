package in.ta.main.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.ta.main.entity.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Repository
public class Repo {

	@Autowired
	JdbcTemplate jdbc;
	
	public boolean verify(String user,String pass) {
		String sql="select * from admin where username=? and password=?";
		List<Admin>list=jdbc.query(sql,new RowMapper<Admin>() {

			@Override
			public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Admin ad=new Admin();
				ad.setUsername(rs.getString("username"));
				ad.setPassword(rs.getString("password"));
				return ad;
			}
			
		},user,pass);
		if(list.isEmpty()) return false;
		return true;
	}
	
}
