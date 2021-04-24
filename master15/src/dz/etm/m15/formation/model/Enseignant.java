package dz.etm.m15.formation.model;

import java.util.Date;

public class Enseignant extends Personne {

	private long nSS;
	private Date dateRecrutement;
	
	public Enseignant() {
		// appel implicite à : super()
	}
	
	public Enseignant(int matricule, String nom, String prenom, Date dateNaissance, 
			String numeroTelephone, long nSS, Date dateRecrutement) {
//		this.matricule = matricule; 
//		this.nom = nom;
//		this.prenom = prenom;
//		this.dateNaissance = dateNaissance;
//		this.numeroTelephone = numeroTelephone;
		super(matricule, nom, prenom, dateNaissance, numeroTelephone);
		this.nSS = nSS;
		this.dateRecrutement = dateRecrutement;
	}

	public long getnSS() {
		return nSS;
	}
	public void setnSS(long nSS) {
		this.nSS = nSS;
	}
	public Date getDateRecrutement() {
		return dateRecrutement;
	}
	public void setDateRecrutement(Date dateRecrutement) {
		this.dateRecrutement = dateRecrutement;
	}
	
	@Override
	public void afficher() {
		//System.out.println(matricule + " " + nom + " " + prenom + " " + dateRecrutement);
		super.afficher();
		System.out.println( " " + dateRecrutement);
	}

	@Override
	public void sabsenter() {
		// TODO Auto-generated method stub
		
	}
	
}