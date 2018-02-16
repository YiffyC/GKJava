package dao;

import java.util.Collection;

public interface IngenieurDAO {

	Collection findAll() throws DAOException;

	
	//le doute m'habite
	public int createIngenieur(Ingenieur unIngenieur) throws DAOException;
	public Ingenieur findIngenieur(int mle) throws DAOException;	
	public boolean updateIngenieur(int mle, String ville) throws DAOException;
	public boolean deleteIngenieur(int mle) throws DAOException;
}
