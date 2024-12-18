package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.entity.User;
import com.tcs.service.UserService;

@Controller
public class FormCapturing {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/Form16")
	public String showForm(Model model)
	{
		model.addAttribute("user",new User());
		
		return "user-form";
	}
	
	@PostMapping("/Form16")
	public String saveUser(@ModelAttribute User user,Model model)
	{
		boolean saveData = userService.saveData(user);
		
		if(saveData==true)
		
		{
			model.addAttribute("msg", "User Saved Successfully");
			
			return "user-form";
		}
		
		else 
		{
			model.addAttribute("msg", "User Not Saved , Sorry!");
			
			return "user-form";
		}
			
	}
	
	@GetMapping("/getForm16")
	public String displayUsers(Model model)
	{
	   model.addAttribute("users", userService.getData());
	   
	   return "userList";
	}

}
