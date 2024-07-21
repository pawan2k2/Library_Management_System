package in.ta.main.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import in.ta.main.entity.Issue;

@Repository
public class IssueRepo {

	@Autowired
	JdbcTemplate jdbc;
	public boolean check(String book_id,String student_id) {
		String sql="select * from issue where book_id=? and student_is=?";
		List<Issue> list=jdbc.query(sql, new RowMapper<Issue>() {

			@Override
			public Issue mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Issue issue=new Issue();
				issue.setBook_id(rs.getString("book_id"));
				issue.setStudent_id(rs.getString("student_id"));
				issue.setIssue_date(rs.getDate("issue_date"));
				return issue;
			}
			
		},book_id,student_id);
		if(list.isEmpty()) return false;
		return true;
	}
	public int issue(Issue issue) {
		String sql="insert into issue values(?,?,?)";
		return jdbc.update(sql,issue.getBook_id(),issue.getStudent_id(),issue.getIssue_date());
	}
	
	public List<Issue> get(String student_id){
		String sql="select * from issue where student_id=?";
		List<Issue> list=jdbc.query(sql, new RowMapper<Issue>() {

			@Override
			public Issue mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Issue issue=new Issue();
				issue.setBook_id(rs.getString("book_id"));
				issue.setStudent_id(rs.getString("student_id"));
				issue.setIssue_date(rs.getDate("issue_date"));
				return issue;
			}
			
		},student_id);
		return list;
	}
	
	public int returnBook(String book_id,String student_id) {
		String sql="delete from issue where book_id=? and student_id=?";
		return jdbc.update(sql,book_id,student_id);
	}
}
