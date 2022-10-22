package com.gestionetudiants.repository;


import com.gestionetudiants.entities.GestionetudiantsEntities;

public interface GestionEtudiantsRepository {
	GestionetudiantsEntities getAllEtudiants();
	GestionetudiantsEntities getEtudiantsbyID(Long id);
	void saveEtudiants(GestionetudiantsEntities etudiants);
	void deleteEtudiantsby(GestionetudiantsEntities etudiants);
}
