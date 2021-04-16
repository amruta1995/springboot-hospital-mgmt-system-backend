package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;
import com.example.demo.entities.User;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
	
	@Query("select p from Patient p where user_id = ?1")
	public Patient getPatient(User u);

	@Modifying
	@Query("update Patient p set p.email = :email where p.p_id = :p_id")
	public void updatePatientEmail(String email,int p_id);
	
	@Modifying
	@Query("update Patient p set p.address = :address where p.p_id = :p_id")
	public void updatePatientAddress(String address,int p_id);
	
	
	@Modifying
	@Query("update Patient p set p.cnt_no = :cnt_no where p.p_id = :p_id")
	public void updatePatientContactNo(String cnt_no,int p_id);

	
	@Query("select p from  Patient p where p.p_id = :p_id")
	public Patient patientProfile(int p_id);
}