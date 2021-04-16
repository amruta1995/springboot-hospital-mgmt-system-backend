package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	
	@Autowired
	UserService uservice;
	
	
	@GetMapping("/checkUser")
	public User checkUser(@RequestParam ("user_name") String user_name , @RequestParam("user_pwd")String user_pwd)
	{
		return uservice.checkUser(user_name, user_pwd);
		
	}
	
	@PostMapping("/save")
	public User save(@RequestBody User st)
	{
		return uservice.save(st);
	}
	
	@GetMapping("/getone/{user_id}")
	public User getOne(@RequestParam("user_id")int user_id)
	{
		return uservice.getOne(user_id);
	}
}