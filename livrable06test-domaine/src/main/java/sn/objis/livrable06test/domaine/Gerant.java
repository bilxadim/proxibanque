package sn.objis.livrable06test.domaine;

import java.util.Date;
import java.util.List;

public class Gerant extends Personnel {
	
	private Date dateEmbauche;
	
	private List<Conseiller> listConseiller;

	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerant(int idPersonnel, String nomPersonnel, String prenomPersonnel, int telPersonnel, String loginPersonnel,
			String passwordPersonnel, Date dateEmbauche, List<Conseiller> listConseiller) {
		super(idPersonnel, nomPersonnel, prenomPersonnel, telPersonnel, loginPersonnel, passwordPersonnel);
		this.dateEmbauche = dateEmbauche;
		this.listConseiller = listConseiller;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public List<Conseiller> getListConseiller() {
		return listConseiller;
	}

	public void setListConseiller(List<Conseiller> listConseiller) {
		this.listConseiller = listConseiller;
	}

	
	
		
}
