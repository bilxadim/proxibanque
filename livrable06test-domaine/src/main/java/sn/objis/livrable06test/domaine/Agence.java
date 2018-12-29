package sn.objis.livrable06test.domaine;

public class Agence {
	private int numeroAgence;
	
	private String dateCreation;
	
	private Gerant	gerant;

	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agence(int numeroAgence, String dateCreation, Gerant gerant) {
		super();
		this.numeroAgence = numeroAgence;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
	}

	public int getNumeroAgence() {
		return numeroAgence;
	}

	public void setNumeroAgence(int numeroAgence) {
		this.numeroAgence = numeroAgence;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String string) {
		this.dateCreation = string;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	
	

}
