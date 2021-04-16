package com.example.demo.controllers;

import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Slot;

import com.example.demo.services.SlotService;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class SlotController {
	
	@Autowired
	SlotService sservice;
	@GetMapping("/checkSlot")
	public Slot checkSlot(@RequestParam ("s_from") Time  s_from , @RequestParam("s_to")Time s_to)
	{
		return sservice.checkSlot(s_from, s_to);
	}
	
	@PostMapping("/saveslot")
	public Slot save(@RequestBody Slot st)
	{
		return sservice.save(st);
	}
	
	@GetMapping("/getAllSlots")
	public List<Slot> getSlots()
	{
		return sservice.getSlots();
		
	}
	
}