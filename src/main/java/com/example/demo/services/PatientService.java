package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;
import com.example.demo.entities.User;
import com.example.demo.repositories.PatientRepository;


@Service
@Transactional
public class PatientService {
	@Autowired
PatientRepository prepo;
	
	public Patient getOne(int pid) {
		Optional<Patient> p = prepo.findById(pid);
		Patient pa = null;
		try
		{
			pa = p.get();
		}
		catch(NoSuchElementException e)
		{
			pa=null;
		}
		return pa;
	}
	
	
	public List<Patient> getAll()
	{
		return prepo.findAll();
	}
	
	public Patient save(Patient p)
	{
		return prepo.save(p);
	}
	
	
	public Patient getPatient(User u)
	{
		return prepo.getPatient(u);
	}


	public void updatePatientEmailById(String email,int p_id)
	{
		prepo.updatePatientEmail(email, p_id);	
		
	}
	
	public void updatePatientAddressById(String address,int p_id)
	{
		prepo.updatePatientAddress(address, p_id);	
		
	}
	
	public void updatePatientContactNoById(String cnt_no,int p_id)
	{
		prepo.updatePatientContactNo(cnt_no, p_id);	
		
	}
	
	public Patient patientProfile(int p_id)
	{
		return prepo.patientProfile(p_id);
	}
}