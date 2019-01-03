package sn.objis.livrable06test.dao;

import java.util.List;

import sn.objis.livrable06test.domaine.Agence;

public interface IDaoAgence extends IDaoGenerique<Agence> {

	public void create(Agence e);

	public List<Agence> read();
	
	public void update(Agence e);
	
	public void delete(Agence e);	
	

}
