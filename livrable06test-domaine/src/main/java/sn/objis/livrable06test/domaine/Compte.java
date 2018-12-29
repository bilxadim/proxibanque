package sn.objis.livrable06test.domaine;

import java.util.Date;
import java.util.List;

public class Compte {
	private int numeroCompte;
	
	private double solde;
	
	private Date dateOuverture;
	
	private List<Transaction> listeTransaction;
	
	private Client client;
	
	private Carte carte;
	

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Compte(int numeroCompte, double solde, Date dateOuverture, List<Transaction> listeTransaction, Client client,
			Carte carte) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.listeTransaction = listeTransaction;
		this.client = client;
		this.carte = carte;
	}


	public int getNumeroCompte() {
		return numeroCompte;
	}


	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public Date getDateOuverture() {
		return dateOuverture;
	}


	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}


	public List<Transaction> getListeTransaction() {
		return listeTransaction;
	}


	public void setListeTransaction(List<Transaction> listeTransaction) {
		this.listeTransaction = listeTransaction;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Carte getCarte() {
		return carte;
	}


	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	
}
