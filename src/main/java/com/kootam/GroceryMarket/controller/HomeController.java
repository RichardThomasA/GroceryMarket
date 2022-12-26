package com.kootam.GroceryMarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kootam.GroceryMarket.dao.UserDAO;
import com.kootam.GroceryMarket.model.User;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private UserDAO userDAO;
	
	@GetMapping("/")
	public String homePage(Model model) {
		
		return "login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="login-username") String username,
			@RequestParam(value="login-password") String password,
			Model model) {
		
		User user = userDAO.getUserByUsernameAndPassword(username,password);
		//User user = null;
		if(user!=null) {
			
			System.out.println("user found");
			if(user.getUsertype().equals(User.USERTYPE_ADMIN)) {
				model.addAttribute("AdminName", user.getUsername());
				return "forward:/admin/";
			}
			else if(user.getUsertype().equals(User.USERTYPE_BACKOFFICE)) {
				return "redirect:/admin/";
			}
		}else {
			System.out.println("inside else");
			return "redirect:/";
		}
		System.out.println("outside else");
		return "redirect:/";
		//return "AdminHome";		
		//return "/admin";
	}

}
