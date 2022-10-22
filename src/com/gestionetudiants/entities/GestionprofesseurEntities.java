package com.gestionetudiants.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "professeur")
public class GestionprofesseurEntities {
	public GestionprofesseurEntities() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GestionprofesseurEntities(Integer id, String nomcomplet, String nci, String grade) {
		super();
		this.id = id;
		this.nomcomplet = nomcomplet; 
		this.nci = nci;
		this.grade = grade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomcomplet() {
		return nomcomplet;
	}
	public void setNomcomplet(String nomcomplet) {
		this.nomcomplet = nomcomplet;
	}
	public String getNci() {
		return nci;
	}
	public void setNci(String nci) {
		this.nci = nci;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY )
	private Integer id ;
	@Column
	private String nomcomplet ;
	@Column
	private String nci ;
	@Column
	private String grade;
}
