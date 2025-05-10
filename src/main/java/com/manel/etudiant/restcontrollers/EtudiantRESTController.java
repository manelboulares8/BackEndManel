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
import com.manel.etudiant.services.EtudiantService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class EtudiantRESTController {
	@Autowired
	EtudiantService etudiantService;
	
	@RequestMapping(path="all",method=RequestMethod.GET)
	List <Etudiant> getAllEtudiants(){
		return etudiantService.getAllEtudiants();
		
		
	}
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	@PreAuthorize("hasAuthority('ADMIN')")
	public Etudiant getEtudiantById(@PathVariable("id") Long id) {
	return etudiantService.getEtudiant(id);
	}
	
	@RequestMapping(path="/updateetud",method = RequestMethod.PUT)
	@PreAuthorize("hasAuthority('ADMIN')")
	public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
	return etudiantService.updateEtudiant(etudiant);
	}
	
	@RequestMapping(path="/addetud",method = RequestMethod.POST)
	@PreAuthorize("hasAuthority('ADMIN')")
	public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
	return etudiantService.saveEtudiant(etudiant);
	}
	
	@RequestMapping(value="/deleteetud/{id}",method = RequestMethod.DELETE)
	@PreAuthorize("hasAuthority('ADMIN')")
	public void deleteEtudiant(@PathVariable("id") Long id)
	{
	etudiantService.deleteEtudiantById(id);
	}
	@RequestMapping(value="/etudsIns/{idI}",method = RequestMethod.GET)
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<Etudiant> getEtudiantsByIdI(@PathVariable("idI") Long idI) {
	return etudiantService.findByInstitutIdI(idI);
	}
	@RequestMapping(value="/etud/{nom}",method = RequestMethod.GET)
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<Etudiant> findByNomContains(@PathVariable("nom") String nom) {
	return etudiantService.findByNomContains(nom);
	}
}
