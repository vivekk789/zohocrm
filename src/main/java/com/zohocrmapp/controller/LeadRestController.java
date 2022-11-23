package com.zohocrmapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zohocrmapp.entities.Lead;
import com.zohocrmapp.repository.LeadRepository;

@RestController
public class LeadRestController {
	
	@Autowired
	private LeadRepository repo;
	
	@RequestMapping("/search/{id}")
	public Lead getOneId(@PathVariable("id")long id , Model model){
		Optional<Lead> l= repo.findById(id);
		Lead lead = l.get();
		return lead ;
	}
	
	
}
