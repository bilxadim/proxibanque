package sn.objis.livrable06test.domaine;

import java.util.Date;

public class Debit extends Transaction {
	
	private int numeroCompteDebiteur;

	public Debit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Debit(int numeroTransaction, Date dateTransaction, double montantTransaction, Compte compte,
			Conseiller conseiller, int numeroCompteDebiteur) {
		super(numeroTransaction, dateTransaction, montantTransaction, compte, conseiller);
		this.numeroCompteDebiteur = numeroCompteDebiteur;
	}

	public int getNumeroCompteDebiteur() {
		return numeroCompteDebiteur;
	}

	public void setNumeroCompteDebiteur(int numeroCompteDebiteur) {
		this.numeroCompteDebiteur = numeroCompteDebiteur;
	}
	
	

}
