package com.zohocrmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp.entities.Contact;

public interface ContactsRepository extends JpaRepository<Contact, Long> {

}
