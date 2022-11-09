package com.zohocrmapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository repo;
	
	@Override
	public void saveBill(Billing bill) {
		repo.save(bill);
		
	}
	
}
