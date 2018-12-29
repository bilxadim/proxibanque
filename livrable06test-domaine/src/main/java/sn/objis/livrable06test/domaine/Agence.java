package sn.objis.livrable06test.domaine;

public class Agence {
	private int numeroAgence;
	
	private String nomAgence;
	
	private String dateCreation;
	
	private Gerant	gerant;

	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agence(int numeroAgence, String nomAgence, String dateCreation, Gerant gerant) {
		super();
		this.numeroAgence = numeroAgence;
		this.nomAgence = nomAgence;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
	}

	public int getNumeroAgence() {
		return numeroAgence;
	}

	public void setNumeroAgence(int numeroAgence) {
		this.numeroAgence = numeroAgence;
	}

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	
	
	

}
