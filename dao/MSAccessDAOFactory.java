/*
 * Cr�� le 9 nov. 06
 *
 * Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre&gt;Pr�f�rences&gt;Java&gt;G�n�ration de code&gt;Code et commentaires
 */
package dao;

/*
 * Cr�� le 22 mars 06
 *
 * Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre&gt;Pr�f�rences&gt;Java&gt;G�n�ration de code&gt;Code et commentaires
 */

// Access concrete DAO Factory implementation
import java.sql.*;

public class MSAccessDAOFactory extends DAOFactory {
  public static final String DRIVER= "com.mysql.jdbc.Driver";
  public static final String DBURL=  "jdbc:mysql://localhost:3306/basesql";
  //
  // method to create Access connections
  public static Connection createConnection() throws SQLException {
	System.setProperty("jdbc.drivers", DRIVER);
	return DriverManager.getConnection(DBURL, "root", "");
  }
  public IngenieurDAO getIngenieurDAO()  {
	// Access IngenieurDAO implements CustomerDAO
	return new MSAccessIngenieurDAO();
  }
 }