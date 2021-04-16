package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Hospital;
@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> 
{
	
}