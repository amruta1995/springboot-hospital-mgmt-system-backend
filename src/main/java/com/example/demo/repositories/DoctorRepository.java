package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Appointment;
import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;
import com.example.demo.entities.User;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	@Query("select d from Doctor d where user_id = ?1")
	public Doctor getDoctor(User u);
	
	@Query("select d from Doctor d where d.doc_spec = :doc_spec")
	public List<Doctor> specificDoctor(String doc_spec);

	@Query("select DISTINCT d.doc_spec from Doctor d")
	public List<String>distictDoctorSpec();
	
	@Modifying
	@Query("update Doctor d set d.email = :email where d.doc_id = :doc_id")
	public void updateDoctorEmail(String email,int doc_id);
	
	@Modifying
	@Query("update Doctor d set d.address = :address where d.doc_id = :doc_id")
	public void updateDoctorAddress(String address,int doc_id);
	
	
	@Modifying
	@Query("update Doctor d set d.cnt_no = :cnt_no where d.doc_id = :doc_id")
	public void updateDoctorContactNo(String cnt_no,int doc_id);

	
	@Modifying
	@Query("update Doctor d set d.email = :email where d.doc_id = :doc_id")
	public void updateDoctorEmail(int doc_id,String email);
	
	
	@Query("select a from Appointment a where a.doc_id = :doc_id")
	public List<Appointment> AllAppointmentforDoctor(Doctor doc_id);
	
	@Query("select d from Doctor d where d.doc_id = :doc_id")
	public Doctor doctorProfile(int doc_id);
}