package com.zohocrmapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.repository.ContactsRepository;

@Service
public class ContactSeviceImpl implements ContactService {

	@Autowired
	private ContactsRepository contactRepo;
	
	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> getConvertedLeads() {
		List<Contact> data = contactRepo.findAll();
		return data;
	}

	@Override
	public Contact findContactById(long id) {
	 Optional<Contact> f = contactRepo.findById(id);
	 	Contact data = f.get();
		return data;
	}

	

}
