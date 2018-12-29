package sn.objis.livrable06test.domaine;

import java.util.List;

public class Client {
	private int idClient;
	
	private String nomClient;
	
	private String prenomClient;
	
	private String emailClient;
	
	private String adresseClient;
	
	private int codePostalClient;
	
	private String ville;
	
	private long telephone;
	
	private String profession;
	
	private Conseiller conseiller;
	
	private List<Compte> listCompte;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(int idClient, String nomClient, String prenomClient, String emailClient, String adresseClient,
			int codePostalClient, String ville, long telephone, String profession, Conseiller conseiller,
			List<Compte> listCompte) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.emailClient = emailClient;
		this.adresseClient = adresseClient;
		this.codePostalClient = codePostalClient;
		this.ville = ville;
		this.telephone = telephone;
		this.profession = profession;
		this.conseiller = conseiller;
		this.listCompte = listCompte;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public int getCodePostalClient() {
		return codePostalClient;
	}

	public void setCodePostalClient(int codePostalClient) {
		this.codePostalClient = codePostalClient;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public List<Compte> getListCompte() {
		return listCompte;
	}

	public void setListCompte(List<Compte> listCompte) {
		this.listCompte = listCompte;
	}
	
	

}
