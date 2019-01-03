package sn.objis.livrable06test.presentation;

import sn.objis.livrable06test.domaine.Agence;
import sn.objis.livrable06test.domaine.Gerant;
import sn.objis.livrable06test.service.IServiceAgenceImp;

public class MainTest {

	public static void main(String[] args) {
		// Creation d'une instance de la classe IServiceAgenceImp
		
		IServiceAgenceImp service = new IServiceAgenceImp();
		
		// Ajout d'une agence
		Agence a = new Agence();
		Gerant g = new Gerant();
		g.setIdPersonnel(1);
		//a.setNumeroAgence(103);
		a.setNomAgence("Plateau");
		a.setDateCreation("2018-12-30");
		a.setGerant(g);
		service.creer(a);
		System.out.println("Merci beaucoup!!!");

	}

}
