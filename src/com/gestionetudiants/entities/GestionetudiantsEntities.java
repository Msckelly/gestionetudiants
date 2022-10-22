package com.gestionetudiants.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class GestionetudiantsEntities {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY )
	private Integer id ;
	@Column
	private String nomcomplet ;
	@Column
	private String matricule ;
	@Column
	private String tuteur;
	
	public GestionetudiantsEntities(Integer id, String nomcomplet, String matricule, String tuteur) {
		super();
		this.id = id;
		this.nomcomplet = nomcomplet;
		this.matricule = matricule;
		this.tuteur = tuteur;
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
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getTuteur() {
		return tuteur;
	}
	public void setTuteur(String tuteur) {
		this.tuteur = tuteur;
	}
 ;

}
