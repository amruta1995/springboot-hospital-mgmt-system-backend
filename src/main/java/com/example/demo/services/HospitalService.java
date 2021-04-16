package com.example.demo.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.Hospital;
import com.example.demo.repositories.HospitalRepository;

@Service
public class HospitalService {
	@Autowired
	HospitalRepository  hrepo;
	public Hospital getOne(int hos_id)
	{
		Optional<Hospital> hd = hrepo.findById(hos_id);
		Hospital d = null;
		try
		{
			d = hd.get();
		}
		catch(NoSuchElementException e)
		{
			d=null;
		}
		return d;
	}
	

}