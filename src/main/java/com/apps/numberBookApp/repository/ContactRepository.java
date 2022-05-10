package com.apps.numberBookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apps.numberBookApp.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
