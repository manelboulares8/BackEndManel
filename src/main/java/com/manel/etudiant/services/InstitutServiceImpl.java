package com.manel.etudiant.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.manel.etudiant.entities.Institut;
import com.manel.etudiant.repos.InstitutRepository;
import com.manel.etudiant.*;
@Service
public class InstitutServiceImpl implements InstitutService {
	@Autowired
	InstitutRepository institutRepository;
	@Override
	public Institut saveInstitut(Institut e) {
		return institutRepository.save(e)	;
	}

	@Override
	public Institut updateInstitut(Institut e) {
		// TODO Auto-generated method stub
		return institutRepository.save(e)	;
	}

	@Override
	public void deleteInstitut(Institut e) {	
		institutRepository.delete(e);
	}

	@Override
	public void deleteInstitutById(Long id) {
		institutRepository.deleteById(id);
	}
	

}
