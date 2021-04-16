package com.example.demo.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Appointment;
import com.example.demo.entities.AppointmentRegistration;
import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;
import com.example.demo.entities.Slot;
import com.example.demo.entities.User;
import com.example.demo.services.AppointmentService;
import com.example.demo.services.DoctorService;
import com.example.demo.services.PatientService;
import com.example.demo.services.SlotService;
import com.fasterxml.jackson.annotation.JsonFormat;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class AppointmentController {

	@Autowired
	AppointmentService  aservice;
	@Autowired
	DoctorService dservice;
	@Autowired
	SlotService sservice;
	@Autowired
	PatientService  pservice;

	@GetMapping("/appointment")
	public List<Appointment> getAll()
	{
		return aservice.getAll();

	}

	@PostMapping("/saveAppointment")
	public Appointment save(@RequestBody Appointment app)
	{
		return aservice.save(app);
	}


	@GetMapping("/showAvailable")
	public List<Slot> getAvalilable(@RequestParam("did")int doc_id,@RequestParam("date")@DateTimeFormat(pattern="yyyy-MM-dd")Date dt)
	{

		System.out.println("received");
		Doctor d = dservice.getOne(doc_id);
		List<Slot> available = aservice.getAvailble(d,dt);

		return available;
	}

	@GetMapping("/showBookSlots")
	public List<Slot> getBooked(@RequestParam("doc_id")Doctor doc_id,@RequestParam("app_date")@DateTimeFormat(pattern="yyyy-MM-dd")Date dt)
	{

		List<Slot> available = aservice.getBookedSlots(doc_id,dt);

		return available;
	}


	@RequestMapping(method =RequestMethod.POST,value="/confirmAppointment")
	public Appointment bookAppointment(@RequestBody AppointmentRegistration ar)
	{
		Patient patient = pservice.getOne(ar.getP_id());
		Doctor doctor = dservice.getOne(ar.getDoc_id());
		Slot slot = sservice.getOne(ar.getS_id());

		Date app_date = ar.getApp_date();

		Appointment bookAppointment = new Appointment("active",app_date,patient,doctor,slot);

		System.out.print(ar);

		return aservice.save(bookAppointment);

	}


	@RequestMapping(method =RequestMethod.POST,value="/deleteAppointment")
	public String deleteAppointmentById(@RequestBody Integer app_id)
	{
		Appointment app = aservice.getAppointmentById((app_id));
		aservice.deleteAppointmentById(app);
		return "Appointment with id: " + app_id + " has been successfully deleted.";
		
		//		if(!aservice.deleteAppointment(app))
		//			return "Appointment with id: " + app_id + " has been successfully deleted.";
		//		else
		//			return "An error occurred during the deleting of Appointment with id: " + app_id + ". Please try again later.";
	}


	@GetMapping("/getAllAppointmentsByPatientId")
	public List<Appointment> getAllAppointmentsByPatientId(@RequestParam("p_id") Patient p_id)
	{

		return  aservice.getAllAppointmentsByPatientId(p_id);
	}

}