package com.example.smallwebProj;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RegController {
	
	@Autowired
	 private UserRepository userRepository;
	
	
	@GetMapping("/")
	public String register() {
		return "index";
	}
	@GetMapping("/register")
	public String regform(Model model) {
		User user=new User();
		List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
		
		model.addAttribute("user", user);
	    model.addAttribute("professionList", professionList);
	     
	    return "register";
		
	}
	
//	@PostMapping ("/register")
//	public String showform(@ModelAttribute("user")User user) {
//		System.out.println(user);
//	     
//	    return "user_detail";
//	}
	
	@PostMapping(path="/register") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String name
	      , @RequestParam String email,@RequestParam Date birthday,@RequestParam String gender,@RequestParam boolean employed,@RequestParam String password) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    User n = new User();
	    n.setName(name);
	    n.setEmail(email);
	    n.setBirthday(birthday);
	    n.setGender(gender);
	    n.setEmployed(employed);
	    n.setPassword(password);
	    
	    
	    userRepository.save(n);
	    return "Saved";
	  }
	
	 
}
