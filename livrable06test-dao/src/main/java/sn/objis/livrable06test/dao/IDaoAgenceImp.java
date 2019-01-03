package sn.objis.livrable06test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.livrable06test.domaine.Agence;
import sn.objis.livrable06test.domaine.Personnel;
import sn.objis.livrable06test.utils.ConnectionMyBDD;

public class IDaoAgenceImp implements IDaoAgence {
	// Obtention de l'unique instance de connexion avec la base
		Connection con = ConnectionMyBDD.getInstanceConnetionMyBDD();
	
	@Override
	public void create(Agence e) {
		// TODO Auto-generated method stub
		Personnel p = new Personnel();
		//p.setIdPersonnel(101);
		try {
			// Etape1 : Création de la zone de requête
			String sql="INSERT INTO agence(nomAgence,dateCreation,idPersonnel) VALUES(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			// Etape2 : Transmission des valeurs aux parametres de la requete
			//ps.setLong(1, e.getNumeroAgence());
			ps.setString(1, e.getNomAgence());
			ps.setString(2, e.getDateCreation());
			ps.setLong(3, p.getIdPersonnel());
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
		List<Agence> listAgence = new ArrayList<>();
		
		try {
			// Etape1: Creation de la zone de requete
			String sql="SELECT * FROM agence";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void update(Agence e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Agence e) {
		// TODO Auto-generated method stub
		
	}

}
