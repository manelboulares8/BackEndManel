package com.manel.etudiant.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.manel.etudiant.entities.Etudiant;
import com.manel.etudiant.entities.Institut;

@RepositoryRestResource(path = "rest")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	
	List<Etudiant> findByNom(String nom);
	List<Etudiant> findByNomContains(String nom);
	List<Etudiant> findByInstitutIdI(Long id);
	List<Etudiant> findByOrderByNomAsc();
	
	
	@Query("select e from Etudiant e where e.nom like %?1 and e.prenom like %?2 ")
	List<Etudiant> findByNomPrenom (String nom, String prenom);
	
	//ou bien 
	/*@Query("select p from Etudiant p where p.nom like %:nom and p.prenom like %:prenom")
	List<Produit> findByNomPrenom (@Param("nom") String nom,@Param("prenom") String prenom);
*/
	@Query("select e from Etudiant e where e.institut = ?1")
	List<Etudiant> findByInstitut (Institut institut);
	
	@Query("select e from Etudiant e order by e.nom ASC, e.prenom DESC")
	List<Etudiant> trierEtudiantsNomsPrenom();
	
}
