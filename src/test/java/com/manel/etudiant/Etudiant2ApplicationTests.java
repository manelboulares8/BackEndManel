package com.manel.etudiant;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.manel.etudiant.entities.Etudiant;
import com.manel.etudiant.entities.Institut;
import com.manel.etudiant.repos.EtudiantRepository;

@SpringBootTest
class Etudiant2ApplicationTests {
	@Autowired 
	private EtudiantRepository etudiantRepository;
	
	@Test
	public void testCreateEtudiant() {
		Etudiant etu=new Etudiant("Kerkni","fatma",10067878,"02/05/1999","RSI","ker@gmail.com");
		etudiantRepository.save(etu);
		
	}
	@Test 
	public void testFindEtudiant() 
	{ 
	Etudiant e = etudiantRepository.findById(10L).get();     
	System.out.println(e); 
	} 
	@Test 
	public void testUpdateEtudiant() 
	{ 
	Etudiant e = etudiantRepository.findById(6L).get();     
	e.setNom("Jemaa"); 
	etudiantRepository.save(e); 
	} 
	@Test 
	 public void testDeleteEtudiant() 
	  { 
	   etudiantRepository.deleteById(25L);
	    
	  } 
	@Test 
	 public void testListerTousEtudiants() 
	  { 
	   List<Etudiant>  etuds =etudiantRepository.findAll();   
	   for (Etudiant p : etuds) 
	   { 
	    System.out.println(p); 
	   }   
	  } 
	@Test 
	public void testFindByNom() 
	{ 
	List<Etudiant> etuds = etudiantRepository.findByNom("kerkni");     
	for (Etudiant p : etuds) 
	   { 
	    System.out.println(p); 
	   } 
	} 
	public void testFindByNomContains() 
	{ 
	List<Etudiant> etuds = etudiantRepository.findByNomContains("iel");     
	for (Etudiant p : etuds) 
	   { 
	    System.out.println(p); 
	   } 
	} 
	@Test
	public void testfindByNomPrenom()
	{
	List<Etudiant> etuds = etudiantRepository.findByNomPrenom("boulares","feriel");
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}
	}
	@Test
	public void testfindByInstitut()
	{
	Institut ins= new Institut();
	ins.setIdI(1L);
	List<Etudiant> etuds = etudiantRepository.findByInstitut(ins);
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}
	}
	@Test
	public void findByInstitutIdI()
	{
	List<Etudiant> etuds = etudiantRepository.findByInstitutIdI(1L);
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}
	 }
	@Test
	public void testfindByOrderByNomAsc()
	{
	List<Etudiant> etuds  = etudiantRepository.findByOrderByNomAsc();
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testTrierEtudiantsNomsPrenom()
	{
	List<Etudiant> etuds = etudiantRepository.trierEtudiantsNomsPrenom();
	for (Etudiant e: etuds)
	{
	System.out.println(e);
	}
	}
}
