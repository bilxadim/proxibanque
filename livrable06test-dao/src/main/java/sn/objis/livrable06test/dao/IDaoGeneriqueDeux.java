package sn.objis.livrable06test.dao;

import java.util.List;

public interface IDaoGeneriqueDeux<E,F> {
	
	public void create(E e, F f);
	
	public List<E> read();
	
	public void update(E e);
	
	public void delete(E e);
	
	public E findById(int i);

}
