package com.kootam.GroceryMarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/")
	public String getAdminHome(Model model) {
		
		return "AdminHome";
	}
	@PostMapping("/")
	public String adminHome(Model model) {
		
		return "AdminHome";
	}
	
}
