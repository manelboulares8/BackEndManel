package com.manel.etudiant.restcontrollers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
import com.manel.etudiant.services.InstitutService;

@RestController
@RequestMapping("/api/ins")
@CrossOrigin("*")
public class InstitutRestController {
	@Autowired
	InstitutRepository institutRepository;
	@Autowired
	InstitutService institutService;
	//@RequestMapping(method=RequestMethod.GET)
	@RequestMapping(path="/allIns",method = RequestMethod.GET)
	List <Institut> getAllInstituts(){
		return institutRepository.findAll();
		
		
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	@PreAuthorize("hasAuthority('ADMIN')")
	public Institut getInstitutById(@PathVariable("id") Long id) {
	return institutRepository.findById(id).get();
	}
	
	@RequestMapping(path="/addInstitut",method = RequestMethod.POST)
	@PreAuthorize("hasAuthority('ADMIN')")
	public Institut createInstitut(@RequestBody Institut institut) {
	return institutService.saveInstitut(institut);
	}
	@RequestMapping(path="",method = RequestMethod.PUT)
	@PreAuthorize("hasAuthority('ADMIN')")
	public Institut updateEtudiant(@RequestBody Institut institut) {
	return institutService.updateInstitut(institut);
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	@PreAuthorize("hasAuthority('ADMIN')")
	public void deleteEtudiant(@PathVariable("id") Long id)
	{
		institutService.deleteInstitutById(id);
	}

}
