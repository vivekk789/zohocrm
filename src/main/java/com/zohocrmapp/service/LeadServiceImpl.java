package com.zohocrmapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.entities.Lead;
import com.zohocrmapp.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository repo;	
	
	
	
	
	@Override
	public void saveOneLead(Lead lead) {
		repo.save(lead);
		
	}


	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> f = repo.findById(id);
		Lead lead = f.get();
		return lead;
	}


	@Override
	public void deleteLeadById(long id) {
		repo.deleteById(id);
		
	}


	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = repo.findAll();
		return leads;
	}


	@Override
	public List<Lead> getAllConvertedLeads() {
		List<Lead> leads = repo.findAll();
		return leads;
	}

}
