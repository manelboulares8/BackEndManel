package com.manel.etudiant.restcontrollers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manel.etudiant.entities.Etudiant;
import com.manel.etudiant.entities.Institut;
import com.manel.etudiant.repos.InstitutRepository;
import com.manel.etudiant.services.EtudiantService;

@RestController
@RequestMapping("/api/ins")
@CrossOrigin("*")
public class InstitutRestController {
	@Autowired
	InstitutRepository institutRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	List <Institut> getAllInstituts(){
		return institutRepository.findAll();
		
		
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Institut getInstitutById(@PathVariable("id") Long id) {
	return institutRepository.findById(id).get();
	}
	


}
