package sn.objis.livrable06test.dao;

import java.util.List;

public interface IDaoGenerique<E> {
	
	public void create(E e);
	
	public List<E> read();
}