package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Appointment;
import com.example.demo.entities.Doctor;
import com.example.demo.entities.DoctorRegistration;
import com.example.demo.entities.Hospital;
import com.example.demo.entities.Patient;
import com.example.demo.entities.User;
import com.example.demo.services.DoctorService;
import com.example.demo.services.HospitalService;
import com.example.demo.services.UserService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class DoctorController {
	@Autowired
	DoctorService dservice;
	@Autowired
	HospitalService hservice;
	@Autowired
	UserService uservice;
	@GetMapping("/doctors")
	public List<Doctor> getAll()
	{
		return dservice.getAll();
	}
	
	@GetMapping("/getdoctor")
	public Doctor getdoctor(@RequestParam("userid") int user_id){
		User u=uservice.getOne(user_id);
		return dservice.getDoctor(u);
		
	}
	
	@PostMapping("/savedoctor")
	public Doctor save(@RequestBody DoctorRegistration dr )
	{
		User u =new User(dr.getUser_name(), dr.getUser_pwd() ,"doctor");
		User u1 = uservice.save(u);
		Hospital h =hservice.getOne(1);
		Doctor d = new Doctor(dr.getF_name(),dr.getL_name(),dr.getEmail(),dr.getAddress(),dr.getCnt_no(),dr.getDoc_spec(),dr.getConsultancy_fees(),u1,h);
		return dservice.save(d);
	}
	@GetMapping("/getDoctorBySpcification")
	public List<Doctor> getDoctorBySpcification (@RequestParam("sp")String doc_spec)
	{
		List<Doctor> available = dservice.getDoctoBySpec(doc_spec);
		return available;
	}
	
	@RequestMapping(method =RequestMethod.GET,value="/doctorSpecificationForDropDownList")
	public List<String> doctorSpecificationForDropDownList()
	{
		return dservice.distictDoctor();
	}

	
	
	@RequestMapping(method =RequestMethod.POST, value="/updateDoctorEmail")
	public void updateDoctorEmail(@RequestParam("doc_id")int doc_id,@RequestParam("email")String email)
	{
		dservice.updateDoctorEmailById(email, doc_id);
	}
	
	
	
	@RequestMapping(method =RequestMethod.POST, value="/updateDoctorAddress")
	public void updateDoctorAddress(@RequestParam("doc_id")int doc_id,@RequestParam("address")String address)
	{
		dservice.updateDoctorAddressById(address, doc_id);
	}
	
	
	
	@RequestMapping(method =RequestMethod.POST, value="/updateDoctorContactNo")
	public void updateDoctorContactNo(@RequestParam("doc_id")int doc_id,@RequestParam("cnt_no")String cnt_no)
	{
		dservice.updateDoctorContactNoById(cnt_no, doc_id);
	}
	
	@RequestMapping(method =RequestMethod.POST, value="/AllAppointmentforDoctor")
	public List<Appointment> AllAppointmentforDoctor(@RequestParam("doc_id")Doctor doc_id)
	{
		return (List<Appointment>) dservice.AllAppointment(doc_id);
	}
	@RequestMapping(method =RequestMethod.POST, value="/DoctorProfile")
	public Doctor DoctorProfile(@RequestParam("doc_id")int doc_id)
	{
		return dservice.doctorProfile(doc_id);
	}
	
	
}