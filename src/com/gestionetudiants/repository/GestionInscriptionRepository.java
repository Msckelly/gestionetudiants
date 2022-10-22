package com.gestionetudiants.repository;

import com.gestionetudiants.entities.GestionInscriptionEntities;


public interface GestionInscriptionRepository {
	GestionInscriptionEntities getAllInscription();
	GestionInscriptionEntities getInscriptionbyID(Long id);
	void saveInscriptionby(GestionInscriptionEntities inscription);
	void deleteInscriptionby(GestionInscriptionEntities inscription);

}
