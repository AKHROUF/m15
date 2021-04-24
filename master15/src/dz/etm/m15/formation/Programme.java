package dz.etm.m15.formation;

import java.util.Date;

import dz.etm.m15.formation.model.Enseignant;
import dz.etm.m15.formation.model.Personne;

public class Programme {

	public static void main(String[] args) {		
		Personne p = new Personne();
		Personne.ENTREPRISE = "";
		p.afficher();
		
		p.setMatricule(123); p.setNom("Mohamedi");p.setPrenom("Mohamed");
		p.afficher();
		
		Personne q = new Personne(123, "Mohamedi", "Mohamed", null, null);
		Enseignant.ENTREPRISE = "";
		q.afficher();
		
		System.out.println("p = q ?" + (p==q));
		
		Personne r = p;
		r.setMatricule(999);
		p.afficher();
		
		Enseignant e = new Enseignant(555,"Kamel", "Mehdi", new Date(),
								"05555555", 469756, new Date());
		e.afficher();
	}
}
