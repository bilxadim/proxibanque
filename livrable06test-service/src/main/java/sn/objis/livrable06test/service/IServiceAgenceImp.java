package sn.objis.livrable06test.service;

import sn.objis.livrable06test.dao.IDaoAgenceImp;
import sn.objis.livrable06test.domaine.Agence;

public class IServiceAgenceImp implements IServiceAgence {
	IDaoAgenceImp dao =new IDaoAgenceImp();

	@Override
	public void creer(Agence b) {
		// TODO Auto-generated method stub
		dao.create(b);

	}

}
