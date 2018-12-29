package sn.objis.livrable06test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import sn.objis.livrable06test.domaine.Agence;
import sn.objis.livrable06test.utils.ConnectionMyBDD;

public class IDaoAgenceImp implements IDaoAgence {
	// Obtention de l'unique instance de connexion avec la base
		Connection con = ConnectionMyBDD.getInstanceConnetionMyBDD();
	
	@Override
	public void create(Agence e) {
		// TODO Auto-generated method stub
		try {
			// Etape1 : Création de la zone de requête
			String sql="INSERT INTO agence(numeroAgence,dateCreation) VALUES(?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			// Etape2 : Transmission des valeurs aux parametres de la requete
			ps.setInt(1, e.getNumeroAgence());
			ps.setString(2, e.getDateCreation());
			// Etape3: Execution de la requete
			ps.execute();
			System.out.println("Agence cree avec succe");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Erreur d'insertion\n"+e1);
		}
		

	}

	@Override
	public List<Agence> read() {
		// TODO Auto-generated method stub
		return null;
	}

}
