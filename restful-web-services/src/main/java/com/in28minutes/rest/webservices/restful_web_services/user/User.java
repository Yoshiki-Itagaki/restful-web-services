package com.in28minutes.rest.webservices.restful_web_services.user;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity(name="user_details")
public class User {

	public User(Integer id, String name, LocalDate birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthdate;
	}

	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=2, message = "Name should have at least 2 characters.")
	@JsonProperty("user_name")
	private String name;
	
	@Past(message = "Birth Date should be in the past.")
	@JsonProperty("birth_date")
	@Column(name="birth_date")
	private LocalDate birthDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthDate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthDate = birthdate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthdate=" + birthDate + "]";
	}

}
