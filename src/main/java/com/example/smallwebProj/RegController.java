package com.example.smallwebProj;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegController {
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
	
	@PostMapping ("/register")
	public String showform(@ModelAttribute("user")User user) {
		System.out.println(user);
	     
	    return "user_detail";
	}
}
