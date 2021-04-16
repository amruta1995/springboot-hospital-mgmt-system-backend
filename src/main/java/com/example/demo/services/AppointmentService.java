package com.example.demo.services;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.demo.entities.Appointment;
import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;
import com.example.demo.entities.Slot;
import com.example.demo.entities.User;
import com.example.demo.repositories.AppointmentRepository;
import com.example.demo.repositories.SlotRepository;

@Service
@Transactional
public class AppointmentService {
	@Autowired
	AppointmentRepository arepo;

		public List<Appointment> getAll()
		{
			return arepo.findAll();
		}
		
		
		public Appointment save(Appointment a)
		{
			return arepo.save(a);
		}
		
		public Appointment getAppointment(Patient p)
		{
			return arepo.getAppointment(p);
		}
		
		
		
		
		public List<Slot> getAvailble(Doctor doc_id,Date dt) {
			// TODO Auto-generated method stub
			return arepo.getAvailable(doc_id, dt);
		}

		public List<Slot> getBookedSlots(Doctor doc_id,Date dt)
		{
			return arepo.getBooked(doc_id,dt);
		}
		
		public Boolean deleteAppointment(Appointment app) {
			int app_id = app.getApp_id();
			arepo.delete(app);
			System.out.println("Updated status of Appointment: " + app_id + " is - " + arepo.existsById(app_id));
			return arepo.existsById(app_id);
		}
		
		public void deleteAppointmentById(Appointment app) {
			int app_id = app.getApp_id();
			arepo.deleteAppointment(app_id, "cancelled");
		}
		
		public Appointment getAppointmentById(int app_id)
		{
			return arepo.getOne(app_id);
		}
		
		public List<Appointment> getAllAppointmentsByPatientId(Patient p_id) {
			return arepo.getAllAppointmentsByPatientId(p_id);
		}

}