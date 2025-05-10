package com.manel.etudiant.services;

import com.manel.etudiant.entities.Etudiant;
import com.manel.etudiant.entities.Institut;

public interface InstitutService {
	Institut saveInstitut(Institut e); 
	Institut updateInstitut(Institut e); 
	void deleteInstitut(Institut e); 
	void deleteInstitutById(Long id); 
}
