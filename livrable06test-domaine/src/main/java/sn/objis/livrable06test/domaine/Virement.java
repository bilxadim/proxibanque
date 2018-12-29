package sn.objis.livrable06test.domaine;

import java.util.Date;

public class Virement extends Transaction {
	
	private int numeroCompteDebiteur;
	
	private int numeroCompteCrediteur;

	public Virement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Virement(int numeroTransaction, Date dateTransaction, double montantTransaction, Compte compte,
			Conseiller conseiller, int numeroCompteDebiteur, int numeroCompteCrediteur) {
		super(numeroTransaction, dateTransaction, montantTransaction, compte, conseiller);
		this.numeroCompteDebiteur = numeroCompteDebiteur;
		this.numeroCompteCrediteur = numeroCompteCrediteur;
	}

	public int getNumeroCompteDebiteur() {
		return numeroCompteDebiteur;
	}

	public void setNumeroCompteDebiteur(int numeroCompteDebiteur) {
		this.numeroCompteDebiteur = numeroCompteDebiteur;
	}

	public int getNumeroCompteCrediteur() {
		return numeroCompteCrediteur;
	}

	public void setNumeroCompteCrediteur(int numeroCompteCrediteur) {
		this.numeroCompteCrediteur = numeroCompteCrediteur;
	}
	
	

}
