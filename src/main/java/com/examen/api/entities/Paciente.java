package com.examen.api.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "PRIMERNOMBRE")
	private String firstname;
	@Column(name = "SEGUNDONOMBRE")
	private String secondname;
	@Column(name = "APELLIDO")
	private String surname;
	@Column(name = "SEGUNDOAPELLIDO")
	private String secondsurname;
	@Column(name = "EDAD")
	private int age;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSecondsurname() {
		return secondsurname;
	}
	public void setSecondsurname(String secondsurname) {
		this.secondsurname = secondsurname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}















