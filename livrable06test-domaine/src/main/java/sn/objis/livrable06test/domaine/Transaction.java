package sn.objis.livrable06test.domaine;

import java.util.Date;

public class Transaction {

	private int numeroTransaction;

	private Date dateTransaction;

	private double montantTransaction;
	
	private Compte compte;
	
	private Conseiller conseiller;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int numeroTransaction, Date dateTransaction, double montantTransaction, Compte compte,
			Conseiller conseiller) {
		super();
		this.numeroTransaction = numeroTransaction;
		this.dateTransaction = dateTransaction;
		this.montantTransaction = montantTransaction;
		this.compte = compte;
		this.conseiller = conseiller;
	}

	public int getNumeroTransaction() {
		return numeroTransaction;
	}

	public void setNumeroTransaction(int numeroTransaction) {
		this.numeroTransaction = numeroTransaction;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public double getMontantTransaction() {
		return montantTransaction;
	}

	public void setMontantTransaction(double montantTransaction) {
		this.montantTransaction = montantTransaction;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	
	

}
