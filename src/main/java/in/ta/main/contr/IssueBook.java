package in.ta.main.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.*;

import in.ta.main.entity.Issue;
import in.ta.main.ser.IssueService;

@Controller
public class IssueBook {

	@Autowired
	IssueService ser;
	
	@GetMapping("/issueBook")
	public String issue() {
		return "issue1";
	}
	
	@GetMapping("/studentrecord/{id}")
	public String checkBookIssue(@PathVariable("id") String student_id,Model model) {
		List<Issue> list=ser.get(student_id);
		if(list.isEmpty()) {
			model.addAttribute("error","There no book issued");
			return "error";
		}
		model.addAttribute("bookIssued", list);
		return "issuedBooks";
		
	}
	
	@GetMapping("/studentrecord/returnbook/{student_id}/{book_id}")
		public String returnBook(@PathVariable("student_id") String student_id,@PathVariable("book_id") String book_id,Model model) {
			int res=ser.returnBook(book_id,student_id);
			if(res!=0) {
				model.addAttribute("error", "Return successfully");
			}
			else {
				model.addAttribute("error", "something wrong");
			}
			return "error";
		}
}
