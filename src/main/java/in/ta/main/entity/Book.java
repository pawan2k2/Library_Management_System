package in.ta.main.entity;

public class Book {

	private String book_id;
	private String book_name;
	private String book_author;
	private int book_edition;
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public int getBook_edition() {
		return book_edition;
	}
	public void setBook_edition(int book_edition) {
		this.book_edition = book_edition;
	}
}
