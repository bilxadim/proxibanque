package sn.objis.livrable06test.dao;

import java.util.List;

public interface IDaoGeneriqueTrois<E, F, G> {

	public void create(E e, F f, G g);

	public List<E> read();
	
	public void update(E e);
	
	public void delete(E e);
	
	public E findById(int i);
	
	
}
