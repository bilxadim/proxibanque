package sn.objis.livrable06test.domaine;

import java.util.Date;
import java.util.List;

public class CompteCourant extends Compte {
	private double decouvert;

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(int numeroCompte, double solde, Date dateOuverture, List<Transaction> listeTransaction,
			Client client, Carte carte, double decouvert) {
		super(numeroCompte, solde, dateOuverture, listeTransaction, client, carte);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	
}
