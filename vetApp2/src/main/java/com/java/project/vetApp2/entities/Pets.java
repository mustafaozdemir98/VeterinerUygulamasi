package com.java.project.vetApp2.entities;

import javax.persistence.*;

@Entity
@Table(name="PET")
public class Pets {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="PETOWNER")
	private String petowner;
	
	@Column(name="KIND")
	private String kind;
	@Column(name="BREED")
	private String breed;
	@Column(name="NAME")
	private String name;
	@Column(name="AGE")
	private String age;
	@Column(name="EXPLANATION")
	private String explanation;
	
	


	
	public Pets(String petowner, String kind, String breed, String name, String age, String explanation) {
		super();
		this.petowner = petowner;
		this.kind = kind;
		this.breed = breed;
		this.name = name;
		this.age = age;
		this.explanation = explanation;
	}
	public Pets() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getPetowner() {
		return petowner;
	}
	public void setPetowner(String petowner) {
		this.petowner = petowner;
	}
	
	
}
