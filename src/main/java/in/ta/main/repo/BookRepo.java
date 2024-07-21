package in.ta.main.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.ta.main.entity.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
@Repository
public class BookRepo {

	@Autowired
	JdbcTemplate jdbc;
	
	public Book checkBook(String book_id) {
		String sql="select * from book where book_id=?";
		List<Book> list = jdbc.query(sql, new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Book book=new Book();
				book.setBook_id(rs.getString("book_id"));
				book.setBook_name(rs.getString("book_name"));
				book.setBook_author(rs.getString("book_author"));
				book.setBook_edition(rs.getInt("book_edition"));
				return book;
			}
			
		},book_id);
		
		if(list.isEmpty()) return null;
		return list.get(0);
		
	}
	public int add(Book book) {
		String sql="insert into book values(?,?,?,?)";
		return jdbc.update(sql,book.getBook_id(),book.getBook_name(),book.getBook_author(),book.getBook_edition());
	}
}
