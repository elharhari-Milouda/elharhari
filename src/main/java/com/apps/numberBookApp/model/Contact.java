package com.apps.numberBookApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Contact {
	@Id
	private int idContact;
	private String nom;
	private String tel;
	public int getIdContact() {
		return idContact;
	}
	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
}
