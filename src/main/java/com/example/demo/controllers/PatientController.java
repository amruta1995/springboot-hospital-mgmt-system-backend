package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Patient;
import com.example.demo.entities.PatientRegister;
import com.example.demo.entities.User;
import com.example.demo.services.PatientService;
import com.example.demo.services.UserService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class PatientController {
	@Autowired
	UserService uservice;
	@Autowired
	PatientService pservice;
	
	@GetMapping("/patients")
	public List<Patient> getAll()
	{
		return pservice.getAll();
	}
	
	
	@GetMapping("/getpatient")
	public Patient getpatient(@RequestParam("userid") int user_id){
		User u=uservice.getOne(user_id);
		return pservice.getPatient(u);
		
	}
	
	@PostMapping("/savepatient")
	public Patient save(@RequestBody PatientRegister pr )
	{
		User u =new User(pr.getUser_name(), pr.getUser_pwd() ,"patient");
		User u1 = uservice.save(u);
		
		Patient p = new Patient(pr.getFull_name(),pr.getEmail(),pr.getCnt_no(),pr.getAddress(),pr.getCity(),pr.getGender(),pr.getDob(),u1 );
		return pservice.save(p);
	}
	
	@RequestMapping(method =RequestMethod.POST, value="/updatePatientEmail")
	public void updatePatientEmail(@RequestParam("pid")int p_id,@RequestParam("email")String email)
	{
		pservice.updatePatientEmailById(email, p_id);
	}
	
	
	
	@RequestMapping(method =RequestMethod.POST, value="/updatePatientAddress")
	public void updatePatientAddress(@RequestParam("pid")int p_id,@RequestParam("address")String address)
	{
		pservice.updatePatientAddressById(address,p_id);
	}
	
	
	
	@RequestMapping(method =RequestMethod.POST, value="/updatePatientContactNo")
	public void updatePatientContactNo(@RequestParam("pid")int p_id,@RequestParam("cnt_no")String cnt_no)
	{
		pservice.updatePatientContactNoById(cnt_no, p_id);
	}
	
	@RequestMapping(method =RequestMethod.POST, value="/patientProfile")
	public Patient  PatientProfile(@RequestParam("p_id")int p_id)
	{
		return pservice.patientProfile(p_id);
	}
}