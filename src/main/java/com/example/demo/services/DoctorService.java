package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Appointment;
import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;
import com.example.demo.entities.User;
import com.example.demo.repositories.DoctorRepository;

@Service
@Transactional
public class DoctorService {
	@Autowired
DoctorRepository drepo;
	public List<Doctor> getAll()
	{
		return drepo.findAll();
	}
	public Doctor save(Doctor d)
	{
		return drepo.save(d);
	}
	
	public Doctor getDoctor(User u)
	{
		return drepo.getDoctor(u);
	}
	
	public Doctor getOne(int did)
	{
		Optional<Doctor> od = drepo.findById(did);
		Doctor d = null;
		try
		{
			d = od.get();
		}
		catch(NoSuchElementException e)
		{
			d=null;
		}
		return d;
		
		
	}
	public List<Doctor> getDoctoBySpec (String doc_spec)
	{
		return drepo.specificDoctor(doc_spec);
	}
	
	public List<String> distictDoctor()
	{
		return drepo.distictDoctorSpec();
	}
	
	public void updateDoctorEmailById(String email,int doc_id)
	{
		drepo.updateDoctorEmail(email, doc_id);	
		
	}
	
	public void updateDoctorAddressById(String address,int doc_id)
	{
		drepo.updateDoctorAddress(address, doc_id);	
		
	}
	
	public void updateDoctorContactNoById(String cnt_no,int doc_id)
	{
		drepo.updateDoctorContactNo(cnt_no, doc_id);	
		
	}
	
	public List<Appointment> AllAppointment(Doctor doc_id)
	{
		return drepo.AllAppointmentforDoctor(doc_id);
	}
	
	public Doctor doctorProfile(int doc_id)
	{
		return drepo.doctorProfile(doc_id);
	}
}