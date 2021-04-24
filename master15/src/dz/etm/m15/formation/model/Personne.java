package dz.etm.m15.formation.model;

import java.util.Date;

/**
 * Cette classe représente une personne d'une façon générale
 * 
 * @author Student
 * @version 1.0 (2021-04-24)
 *
 */
public class Personne {

	private int matricule;
	private String nom;
	private String prenom;
	private Date  dateNaissance;
	private String numeroTelephone;
	
	/**
	 * Créer une nouvelle personne sans matricule ni nom ni ....
	 */
	public Personne() {	
	}

	/**
	 * Créer une nouvelle personne avec les informations en argument 
	 * @param matricule matricule de la nouvelle personne
	 * @param nom nom de la nouvelle personne
	 * @param prenom prénom de la nouvelle personne 
	 * @param dateNaissance
	 * @param numeroTelephone
	 */
	public Personne(int matricule, String nom, String prenom, Date dateNaissance, String numeroTelephone) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numeroTelephone = numeroTelephone;
	}

	/**
	 * récupérer le matricule de la personne actuelle
	 * @return le matricule
	 */
	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public void demande(String message) {
		System.out.println(">>>>> " + message);
	}
	
}
