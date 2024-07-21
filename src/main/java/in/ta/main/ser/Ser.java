package in.ta.main.ser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ta.main.repo.Repo;

@Service
public class Ser {

	@Autowired
	Repo repo;
	
	public boolean verify(String user,String pass) {
		return repo.verify(user, pass);
	}
}
