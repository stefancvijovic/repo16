package dao;

import java.util.List;

public interface Dao <T>{

	public List<T> prikazSvih(List<T> t);
	public T prikazJednog(int id);
	public T izmena(T t);
	public T brisanje(int id);
	

	
}
