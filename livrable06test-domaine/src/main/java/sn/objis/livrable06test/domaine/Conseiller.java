package sn.objis.livrable06test.domaine;

import java.util.List;

public class Conseiller extends Personnel {
	
	private String typeContrat;
	
	private Gerant gerant;

	private List<Client> listClient;
	
	private List<Transaction> listTransaction;

	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conseiller(int idPersonnel, String nomPersonnel, String prenomPersonnel, int telPersonnel,
			String loginPersonnel, String passwordPersonnel, String typeContrat, Gerant gerant, List<Client> listClient,
			List<Transaction> listTransaction) {
		super(idPersonnel, nomPersonnel, prenomPersonnel, telPersonnel, loginPersonnel, passwordPersonnel);
		this.typeContrat = typeContrat;
		this.gerant = gerant;
		this.listClient = listClient;
		this.listTransaction = listTransaction;
	}

	public String getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public List<Client> getListClient() {
		return listClient;
	}

	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}

	public List<Transaction> getListTransaction() {
		return listTransaction;
	}

	public void setListTransaction(List<Transaction> listTransaction) {
		this.listTransaction = listTransaction;
	}
	
	

}
