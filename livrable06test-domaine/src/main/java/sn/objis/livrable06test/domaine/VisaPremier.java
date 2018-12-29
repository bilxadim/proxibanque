package sn.objis.livrable06test.domaine;

public class VisaPremier extends Carte {
	
	private String zone;

	public VisaPremier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisaPremier(int numeroCarte, boolean etatCarte, Compte compte, String zone) {
		super(numeroCarte, etatCarte, compte);
		this.zone = zone;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	

}
