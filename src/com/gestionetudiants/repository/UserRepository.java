package com.gestionetudiants.repository;

import com.gestionetudiants.entities.GestionUserEntities;

public interface UserRepository {

	GestionUserEntities getAllUser();
	GestionUserEntities getUserbyID(Long id);
	void saveUser(GestionUserEntities user);
	void deleteUserProfesseur(Long id);
}
 