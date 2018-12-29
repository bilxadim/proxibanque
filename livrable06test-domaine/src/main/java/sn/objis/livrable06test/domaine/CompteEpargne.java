package sn.objis.livrable06test.domaine;

import java.util.Date;
import java.util.List;

public class CompteEpargne extends Compte {
	
	private float taux;

	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(int numeroCompte, double solde, Date dateOuverture, List<Transaction> listeTransaction,
			Client client, Carte carte, float taux) {
		super(numeroCompte, solde, dateOuverture, listeTransaction, client, carte);
		this.taux = taux;
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}
	
	

}
