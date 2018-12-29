package sn.objis.livrable06test.presentation;

import sn.objis.livrable06test.domaine.Agence;
import sn.objis.livrable06test.service.IServiceAgenceImp;

public class MainTest {

	public static void main(String[] args) {
		// Creation d'une instance de la classe IServiceAgenceImp
		
		IServiceAgenceImp service = new IServiceAgenceImp();
		
		// Ajout d'une agence
		Agence a = new Agence();
		a.setNumeroAgence(1021);
		a.setDateCreation("2018-12-30");
		service.creer(a);
		System.out.println("Merci beaucoup!!!");

	}

}
