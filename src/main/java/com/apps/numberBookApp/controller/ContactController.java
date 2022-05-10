package com.apps.numberBookApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.apps.numberBookApp.repository.ContactRepository;
import com.apps.numberBookApp.model.Contact;


@RestController
@RequestMapping("/contacts")
public class ContactController {
	@Autowired
	private ContactRepository contactRepository;
	
	@PostMapping
	public void ajouter(@RequestBody Contact contact)
	{
		System.out.print("Projet "+contact.getNom());
		contactRepository.save(contact);
	}
	@GetMapping
	public List<Contact> get()
	{
		return contactRepository.findAll();
	}
	@PutMapping
	public void modifier(@RequestBody Contact contact)
	{
		Contact pp = contactRepository.findById(contact.getIdContact()).get();
		if(pp!=null)
		{
			pp.setNom(contact.getNom());
			contactRepository.save(pp);
		}
		
	}
	@DeleteMapping("/{id}")
	public void suppr(@PathVariable int id)
	{
		contactRepository.deleteById(id);
		
	}
	@GetMapping("/{id}")
	public Contact get(@PathVariable int id)
	{
		return contactRepository.findById(id).get();
		
	}
}
