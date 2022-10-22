package com.gestionetudiants.repository;

import com.gestionetudiants.entities.GestionClasseEntities;


public interface GestionClass {

	GestionClasseEntities getAllClasse();
	GestionClasseEntities getClassebyID(Long id);
	void saveClasseby(GestionClasseEntities Classe);
	void deleteClasseProfesseurby(Long id);
}
