
package sn.objis.livrable06test.dao;

import java.util.List;

public interface IDaoGenerique<E> {
	
	public void create(E e);
	
	public List<E> read();
	
	public void update(E e);
	
	public void delete(E e);
	
}