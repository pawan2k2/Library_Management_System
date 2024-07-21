package in.ta.main.ser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ta.main.entity.Book;
import in.ta.main.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	BookRepo repo;
	public Book check(String book_id) {
		return repo.checkBook(book_id);
	}
	public int add(Book book) {
		return repo.add(book);
	}
}
