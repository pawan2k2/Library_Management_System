package in.ta.main.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.ta.main.entity.Issue;
import in.ta.main.entity.Student;
import in.ta.main.ser.IssueService;
import in.ta.main.ser.StudentServe;
import jakarta.servlet.http.HttpServletRequest;
import java.sql.Date;
@Controller
public class StudentController {
	
	@Autowired
	StudentServe ser;
	
	@Autowired
	IssueService issueSer;

	@PostMapping("/formsubmit")
	public String submit(@ModelAttribute Student std,Model model) {
		String student_id=std.getStudent_id();
		Student s=ser.find(student_id);
		if(s!=null) {
			model.addAttribute("error", "Student Already Registered");
			return "error";
		}
		int res=ser.register(std);
		if(res!=0) {
			model.addAttribute("error", "Student Successfully registred");
		}
		else {
			model.addAttribute("error","Something went wrong");
		}
		return "error";
	}
	
	@PostMapping("/findstudent")
	public String findStd(HttpServletRequest rq,Model model) {
		String student_id=rq.getParameter("student_id");
		Student std=ser.find(student_id);
		if(std==null) {
			model.addAttribute("error","Student not registered yet.");
			return "error";
		}
		model.addAttribute("student", std);
		return "aftSearch";
	}
	
	@PostMapping("/checkIssueBook/{book_id}")
	public String issue(@PathVariable("book_id") String book_id,HttpServletRequest rq,Model model) {
		String student_id=rq.getParameter("student_id");
		Student s=ser.find(student_id);
		if(s==null) {
			model.addAttribute("error","Student Not Registered Yet first Register !");
			return "error";
		}
		String date=rq.getParameter("issue_date");
		Date issue_date=Date.valueOf(date);
		if(issueSer.check(book_id, student_id)) {
			model.addAttribute("error", "Book is already issue to this student");
			return "error";
		}
		Issue issue=new Issue();
		issue.setBook_id(book_id);
		issue.setStudent_id(student_id);
		issue.setIssue_date(issue_date);
		int res = issueSer.issue(issue);
		if(res!=0) {
			model.addAttribute("error","issued");
		}
		else {
			model.addAttribute("error", "Not issue");
		}
		return "error";
	}
}
