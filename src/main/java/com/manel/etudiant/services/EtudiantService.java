package com.manel.etudiant.services;

import java.util.List;

import com.manel.etudiant.entities.Etudiant;
import com.manel.etudiant.entities.Institut;

public interface EtudiantService {
	Etudiant saveEtudiant(Etudiant e); 
	Etudiant updateEtudiant(Etudiant e); 
	void deleteEtudiant(Etudiant e); 
	void deleteEtudiantById(Long id); 
	Etudiant getEtudiant(Long id); 
	List<Etudiant> getAllEtudiants(); 
	List<Etudiant> findByNom(String nom);
	List<Etudiant> findByNomContains(String nom);
	List<Etudiant> findByNomPrenom(String nom, String prenom);
	List<Etudiant> findByInstitut (Institut institut);
	List<Etudiant> findByInstitutIdI(Long id);
	List<Etudiant> findByOrderByNomAsc();
	List<Etudiant> trierEtudiantsNomsPrenom();
}
