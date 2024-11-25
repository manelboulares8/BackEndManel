package com.manel.etudiant.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.manel.etudiant.entities.Institut;

@RepositoryRestResource(path = "ins")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular

public interface InstitutRepository extends JpaRepository<Institut, Long>{

}
