package in.ta.main.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import in.ta.main.ser.Ser;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	@Autowired
	Ser ser;
	

	@GetMapping("/")
	public String openIndex() {
		return "index";
	}
	
	@PostMapping("/adminlogin")
	public String log(HttpServletRequest req,Model model) {
		String user=req.getParameter("user");
		String pass=req.getParameter("pass");
		boolean res=ser.verify(user, pass);
		if(res) {
			return "home";
		}
		
		model.addAttribute("error","user name or password was wrong !");
		
		return "error";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "index";
	}
	
	
	@GetMapping("/newRegistration")
	public String openReg() {
		return "register";
	}
	
	
	@GetMapping("/searchStudent")
	public String openSearch() {
		return "search";
	}
}
