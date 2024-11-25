package com.manel.etudiant.services;

import java.util.List;
import com.manel.etudiant.services.EtudiantService;
import com.manel.etudiant.entities.Etudiant;
import com.manel.etudiant.entities.Institut;
import com.manel.etudiant.repos.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 


@Service
public class EtudiantServiceImpl implements EtudiantService {
	@Autowired 
	 EtudiantRepository etudiantRepository;
	
	@Override
	public Etudiant saveEtudiant(Etudiant e) {
		return etudiantRepository.save(e);
	}

	@Override
	public Etudiant updateEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return etudiantRepository.save(e);
	}

	@Override
	public void deleteEtudiant(Etudiant e) {
		etudiantRepository.delete(e);
	}

	@Override
	public void deleteEtudiantById(Long id) {
		etudiantRepository.deleteById(id);
		
	}

	@Override
	public Etudiant getEtudiant(Long id) {
		return etudiantRepository.findById(id).get();
	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		return etudiantRepository.findAll();
	}

	@Override
	public List<Etudiant> findByNom(String nom) {
		
		return etudiantRepository.findByNom(nom);
	}

	@Override
	public List<Etudiant> findByNomContains(String nom) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByNomContains(nom);
	}

	@Override
	public List<Etudiant> findByNomPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByNomPrenom(nom, prenom);
	}

	@Override
	public List<Etudiant> findByInstitut(Institut institut) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByInstitut(institut);
	}

	@Override
	public List<Etudiant> findByInstitutIdI(Long id) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByInstitutIdI(id);
	}

	@Override
	public List<Etudiant> findByOrderByNomAsc() {
		// TODO Auto-generated method stub
		return etudiantRepository.findByOrderByNomAsc();
	}

	@Override
	public List<Etudiant> trierEtudiantsNomsPrenom() {
		// TODO Auto-generated method stub
		return etudiantRepository.trierEtudiantsNomsPrenom();
	}

}
