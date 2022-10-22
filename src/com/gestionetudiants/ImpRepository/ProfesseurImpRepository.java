package com.gestionetudiants.ImpRepository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;

import com.gestionetudiants.entities.GestionprofesseurEntities;
import com.gestionetudiants.repository.Gestionprofesseursrepository;

public class ProfesseurImpRepository implements Gestionprofesseursrepository{
	
	EntityManagerFactory entityManagerFactory = null ;
	EntityManager entityManager = null ;
	
	@Override
	public List<GestionprofesseurEntities> getAllProfesseur() {
		

		
		//creation d'une uniter de persistence
		entityManagerFactory = Persistence.createEntityManagerFactory("gestionetudiant");
		//creation d'une connection a la base
		entityManager = entityManagerFactory.createEntityManager();
		
		List<GestionprofesseurEntities> query = entityManager.createQuery("select e from GestionprofesseurEntities e ", GestionprofesseurEntities.class).getResultList();   

		return query;
				
	}

	@Override
	public GestionprofesseurEntities getProfesseurbyID(Long id) {
		//creation d'une uniter de persistence
				entityManagerFactory = Persistence.createEntityManagerFactory("gestionetudiant");
				//creation d'une connection a la base
				entityManager = entityManagerFactory.createEntityManager();
				
				GestionprofesseurEntities entities = entityManager.find(GestionprofesseurEntities.class, 1) ;
			
				return entities ;
	}

	@Override
	public void saveProfesseur(GestionprofesseurEntities prof) {
		//creation d'une uniter de persistence
		entityManagerFactory = Persistence.createEntityManagerFactory("gestionetudiant");
		//creation d'une connection a la base
		entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(prof);
	
		entityManager.flush();
		entityManager.close();
		entityManagerFactory.close();
		
	}

	@Override
	public void deleteProfesseurby(GestionprofesseurEntities prof) {
		//creation d'une uniter de persistence
				entityManagerFactory = Persistence.createEntityManagerFactory("gestionetudiant");
				//creation d'une connection a la base
				entityManager = entityManagerFactory.createEntityManager();
				
				entityManager.getTransaction().begin();
				
				entityManager.remove(prof);
			
				entityManager.flush();
				entityManager.close();
				entityManagerFactory.close();
	}


}
