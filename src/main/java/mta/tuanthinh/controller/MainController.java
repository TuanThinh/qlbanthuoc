package mta.tuanthinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	@GetMapping
	public String Default() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String Home() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String Login() {
		return "login";
	}
	
	@RequestMapping("/403")
	public String AccessDeny() {
		return "403";
	}
	
	@RequestMapping("/chat-message")
	public String AccessDeni() {
		return "chat-message";
	}
	
	@RequestMapping("/map")
	public String map() {
		return "map";
	}
	
	@RequestMapping("/manager-user")
	public String ManagerUser() {
		return "manager-user";
	}
	@RequestMapping("/thuoc")
	public String ManagerDrug() {
		return "quan-ly-thuoc";
	}
	@RequestMapping("/caching")
	public String Caching() {
		return "caching";
	}
}
