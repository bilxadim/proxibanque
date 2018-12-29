package sn.objis.livrable06test.domaine;

public class Carte {
	private int numeroCarte;
	
	private boolean etatCarte;
	
	private Compte compte;

	public Carte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carte(int numeroCarte, boolean etatCarte, Compte compte) {
		super();
		this.numeroCarte = numeroCarte;
		this.etatCarte = etatCarte;
		this.compte = compte;
	}

	public int getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public boolean isEtatCarte() {
		return etatCarte;
	}

	public void setEtatCarte(boolean etatCarte) {
		this.etatCarte = etatCarte;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	
	
	

}
