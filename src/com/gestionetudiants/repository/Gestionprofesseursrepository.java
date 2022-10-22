package com.gestionetudiants.repository;

import java.util.List;

import com.gestionetudiants.entities.GestionprofesseurEntities;

public interface Gestionprofesseursrepository {
	
	List<GestionprofesseurEntities> getAllProfesseur();
	GestionprofesseurEntities getProfesseurbyID(Long id);
	void saveProfesseur(GestionprofesseurEntities prof);
	void deleteProfesseurby(GestionprofesseurEntities prof);

}
