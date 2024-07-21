package in.ta.main.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ta.main.entity.Book;
import in.ta.main.ser.BookService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BookController {
	@Autowired
	BookService ser;
	
	@GetMapping("/addBook")
	public String open() {
		return "addBook";
	}
	
	@PostMapping("/addBook")
	public String add(@ModelAttribute Book book,Model model) {
		String book_id=book.getBook_id();
		Book ans=ser.check(book_id);
		if(ans!=null) {
			model.addAttribute("error","This ID book already registerd");
			return "error";
		}
		int res=ser.add(book);
		if(res!=0) {
			model.addAttribute("error", "Book Added Successfully");
		}
		else {
			model.addAttribute("error", "Something went wrong");
		}
		return "error";
		
	}
	
	@PostMapping("/checkIssueBook")
	public String check(HttpServletRequest rq,Model model) {
		String book_id=rq.getParameter("book_id");
		Book ans=ser.check(book_id);
		if(ans==null) {
			model.addAttribute("error","This Id book not present in Library");
			return "error";
		}
		model.addAttribute("book",ans);
		return "issue2";
	}

}
