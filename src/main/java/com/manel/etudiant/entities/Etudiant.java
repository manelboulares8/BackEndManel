package com.manel.etudiant.entities;
import java.util.Date; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne; 
@Entity
public class Etudiant {
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	 
	private String nom;
	private String prenom;
	private long cin;
	private String dateNaissance;
	private String classe;
	private String email;
	
	@ManyToOne //optionnel
	private Institut institut;
	
	
	public Etudiant() {
		super();
		
	}
	public Etudiant( String nom, String prenom, long cin, String dateNaissance, String classe, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.dateNaissance = dateNaissance;
		this.classe = classe;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public long getCin() {
		return cin;
	}
	public void setCin(long cin) {
		this.cin = cin;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", dateNaissance="
				+ dateNaissance + ", classe=" + classe + ", email=" + email + "]";
	}
	public Institut getInstitut() {
		return institut;
	}
	public void setInstitut(Institut institut) {
		this.institut = institut;
	}
	


}