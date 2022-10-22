package com.gestionetudiants.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class GestionUserEntities {

	public GestionUserEntities(Integer id, String nomcomplet, String logi, String pwd, String role) {
		super();
		this.id = id;
		this.nomcomplet = nomcomplet;
		this.logi = logi;
		this.pwd = pwd;
		this.role = role;
	}
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY )
	private Integer id ;
	@Column
	private String nomcomplet ;
	@Column
	private String logi ;
	@Column
	private String pwd;
	@Column
	private String role;
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
	public String getLogi() {
		return logi;
	}
	public void setLogi(String logi) {
		this.logi = logi;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
