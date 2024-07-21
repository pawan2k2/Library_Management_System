package in.ta.main.ser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ta.main.entity.Issue;
import in.ta.main.repo.IssueRepo;
import java.util.*;
@Service
public class IssueService {

	
	@Autowired
	IssueRepo repo;
	
	public int issue(Issue issue) {
		return repo.issue(issue);
	}
	
	public boolean check(String book_id,String student_id) {
		return repo.check(book_id, student_id);
	}
	
	public List<Issue> get(String student_id){
		return repo.get(student_id);
	}
	
	public int returnBook(String book_id,String student_id) {
		return repo.returnBook(book_id, student_id);
		}
}
