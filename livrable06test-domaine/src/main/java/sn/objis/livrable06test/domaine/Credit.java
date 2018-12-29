package sn.objis.livrable06test.domaine;

import java.util.Date;

public class Credit extends Transaction {
	
	private int numeroCompteCrediteur;

	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Credit(int numeroTransaction, Date dateTransaction, double montantTransaction, Compte compte,
			Conseiller conseiller, int numeroCompteCrediteur) {
		super(numeroTransaction, dateTransaction, montantTransaction, compte, conseiller);
		this.numeroCompteCrediteur = numeroCompteCrediteur;
	}

	public int getNumeroCompteCrediteur() {
		return numeroCompteCrediteur;
	}

	public void setNumeroCompteCrediteur(int numeroCompteCrediteur) {
		this.numeroCompteCrediteur = numeroCompteCrediteur;
	}
	
	
}
