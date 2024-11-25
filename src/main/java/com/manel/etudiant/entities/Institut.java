package com.manel.etudiant.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Institut {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long idI;
	private String nomI;
	private String localisation;
	private long  numTlf;
	
	@OneToMany(mappedBy="institut")
	@JsonIgnore
	private List<Etudiant> etudiants;
	
	public Institut() {
		super();
	}
	public long getIdI() {
		return idI;
	}
	
	public void setIdI(long idI) {
		this.idI = idI;
	}
	public String getNomI() {
		return nomI;
	}
	public void setNomI(String nomI) {
		this.nomI = nomI;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public long getNumTlf() {
		return numTlf;
	}
	public void setNumTlf(long numTlf) {
		this.numTlf = numTlf;
	}
	@Override
	public String toString() {
		return "Institut [idI=" + idI + ", nomI=" + nomI + ", localisation=" + localisation + ", numTlf=" + numTlf
				+ "]";
	}
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public Institut( String nomI, String localisation, long numTlf, List<Etudiant> etudiants) {
		super();
		this.nomI = nomI;
		this.localisation = localisation;
		this.numTlf = numTlf;
		this.etudiants = etudiants;
	}
	
	
}
