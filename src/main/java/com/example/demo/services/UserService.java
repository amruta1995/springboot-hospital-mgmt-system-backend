package com.example.demo.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository urepo;
	
	public User checkUser(String user_name , String user_pwd)
	{
		return urepo.checkUser(user_name, user_pwd);
	}
	
	public  User save(User st)
	{
		 return urepo.save(st);
	}
	
	public User getOne(Integer user_id)
	{
		Optional<User> u = urepo.findById(user_id);
	
		User us = null;
		try
		{
			us = u.get();
		}
		catch(NoSuchElementException e)
		{
			us=null;
		}
		return us;
	}
}