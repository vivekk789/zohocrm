package com.zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.service.BillingService;
import com.zohocrmapp.service.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService b;
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id") long id , Model model ) {
		Contact data = contactService.findContactById(id);
		model.addAttribute("contact", data);
		return "generate_bill";
	}
	
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute("bill") Billing bill , Model model) {
		b.saveBill(bill);
		List<Contact> data = contactService.getConvertedLeads();
		model.addAttribute("contact", data);
		return "convert_Lead_List";
	}
	
	
}
