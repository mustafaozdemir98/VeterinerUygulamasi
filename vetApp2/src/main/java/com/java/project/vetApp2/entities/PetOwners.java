package com.java.project.vetApp2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PETOWNER")
public class PetOwners {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="NAMESURNAME")
	private String nameSurname;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="TELEPHONE")
	private String telephone;
	@Column(name="EPOSTA")
	private String ePosta;
	
	public PetOwners(String nameSurname, String address, String telephone, String ePosta) {
		super();
		this.nameSurname = nameSurname;
		this.address = address;
		this.telephone = telephone;
		this.ePosta = ePosta;
	}

	public PetOwners() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}
	
	
}
