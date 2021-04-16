package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Integer>  {

	//@Query("select s from Slot s where s.s_id not in (:booked)")
	//@Query("select a.s_id from Appointment a  union select s.s_id from Slot s")
	
	
	//@Query("select a.s_id from Appointment a  union select s.s_id from Slot s")

   
//	@Query(value="select * from Slot s where flag=1", nativeQuery = true)
//    public List<Slot> getAvailables();
	
	@Query("select s from Slot s")
	public List<Slot> getAllSlots();
}
