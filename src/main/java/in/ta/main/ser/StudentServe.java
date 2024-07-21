package in.ta.main.ser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ta.main.entity.Student;
import in.ta.main.repo.StudentRepo;

@Service
public class StudentServe {

	@Autowired
	StudentRepo repo;
	
	public int register(Student std) {
		return repo.register(std);
	}
	
	public Student find(String student_id) {
		return repo.getStd(student_id);
	}
}
