/*
 * Cr�� le 9 nov. 06
 *
 * Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre&gt;Pr�f�rences&gt;Java&gt;G�n�ration de code&gt;Code et commentaires
 */
package dao;

// Abstract class DAO Factory
public abstract class DAOFactory {

 
 
  public enum TypeDAO {MSACCESS, ORACLE, DB2_AS400 };
//	
	
  // There will be a method for each DAO that can be 
  // created. The concrete factories will have to 
  // implement these methods.
  public abstract IngenieurDAO getIngenieurDAO();
  
  public static DAOFactory getDAOFactory(TypeDAO laFactory) {
  
	switch (laFactory) {
	  case MSACCESS	 : 
		  return new MSAccessDAOFactory();
	  case ORACLE    : 
		  //return new OracleDAOFactory();      
	  case DB2_AS400    : 
		  //return new DB2AS400DAOFactory();
	  default           : 
		  return null;
	}
  }
}