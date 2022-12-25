package com.kootam.GroceryMarket.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kootam.GroceryMarket.model.User;
import com.kootam.GroceryMarket.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	
	/*
	 * All get methods
	 * ********************************
	 * 
	 */
	@GetMapping(value="/getAllUserTypesAsJson", 
			produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String,String> getAllUserTypes() {
		
		Map<String,String> jsonResponse = new HashMap<String,String>();
		
		jsonResponse.put(User.USERTYPE_ADMIN,User.USERTYPE_ADMIN);
		jsonResponse.put(User.USERTYPE_BACKOFFICE,User.USERTYPE_BACKOFFICE);
		
		return jsonResponse;
	}
	
	@GetMapping("/getAllUsers")
	public String getAllUsers(Model model) {
		
		List<User> usersList = userRepository.findAll();
		
		model.addAttribute("usersList",usersList);
		
		return "ViewAllUsers";
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable long id) {
		
		User user = userRepository.getReferenceById(id);
		return user;
	}

	/*
	 * All create methods
	 * **************************
	 */
	@RequestMapping(value="/saveUser", method=RequestMethod.POST)
	public String updateUser(User user,Model model) {
		
		User user1 = userRepository.save(user);
		if(user1.getId()!=null) {
			//if succssfully saved
			return "AdminHome";
		}
		else {
			//if error,display error page
			model.addAttribute("error","Error creating user.Please try again.");
			model.addAttribute("prevPage","/admin/");
			return "error";
		}
		
	}
	
	@GetMapping("/addUser")
	public String addUser(Model model) {
		return "AddUser";
	}
	
	/*
	 * All delete methods
	 * ************************
	 */
	
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable long id) {
		User user = userRepository.getReferenceById(id);
		userRepository.delete(user);
		return "forward:/admin/";
	}
	
	/*
	 * All UPDATE methods
	 * *****************************
	 */
	@GetMapping("/editUser/{id}")
	public String editUser(@PathVariable long id,Model model) {
		User user = userRepository.getReferenceById(id);
		model.addAttribute("user",user);
		
		String[] userTypes = new String [2];
		userTypes[0]=User.USERTYPE_ADMIN;
		userTypes[1]=User.USERTYPE_BACKOFFICE;
		//userTypes[2]="hello";
		model.addAttribute("userTypes",userTypes);
		return "EditUser";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(User user) {
		
		userRepository.save(user);
		return "forward:/admin/";
	}
	
}
