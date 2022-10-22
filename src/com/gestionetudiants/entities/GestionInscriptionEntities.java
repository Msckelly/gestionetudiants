package com.gestionetudiants.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class GestionInscriptionEntities {

	public GestionInscriptionEntities(Integer id, String annee, String etat) {
		super();
		this.id = id;
		this.annee = annee;
		this.etat = etat;
	}
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY )
	private Integer id ;
	@Column
	private String annee ;
	@Column
	private String etat ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
}
