package dz.etm.m15.formation.model;

import java.util.Date;

/**
 * Cette classe représente une personne d'une façon générale
 * 
 * @author Student
 * @version 1.0 (2021-04-24)
 *
 */
// 1 .
public abstract class Personne {
	public static final String IP = "192.168.1.1";
	public static String ENTREPRISE = "Ibn Rochd";
    // 2.
	protected final  int matricule;
	protected String nom;
	protected String prenom;
	protected Date  dateNaissance;
	protected String numeroTelephone;
	
	//5. 
	/**
	 * Créer une nouvelle personne sans matricule ni nom ni ....
	 */
	public Personne() {	
//		this.matricule = 1;
//		this.nom = "";
//		this.prenom = "";
//		this.dateNaissance = new Date();
//		this.numeroTelephone = "";
		this(1,"","",new Date(),"");
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

	//3.
	/**
	 * récupérer le matricule de la personne actuelle
	 * @return le matricule
	 */
	public int getMatricule() {
		return matricule;
	}

//	public void setMatricule(int matricule) {
//		this.matricule = matricule;
//	}

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
//4.
	public void demande(String message) {
		System.out.println(">>>>> " + message);
	}
	
	public final void afficher() {
		System.out.println(matricule + " " + nom + " " + prenom);
	}
	
	public abstract void sabsenter();
}
