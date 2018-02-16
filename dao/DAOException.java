/*
 * Créé le 9 nov. 06
 *
 * Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre&gt;Préférences&gt;Java&gt;Génération de code&gt;Code et commentaires
 */
package dao;
import java.sql.SQLException;

@SuppressWarnings("serial")
public class DAOException extends Exception {
	

	public DAOException(SQLException ex) {
		
		super ();
	}

	public DAOException(String string, SQLException e2) {
		
		super (string);
	}

	public DAOException() {
		super();
	}

	public DAOException(String s) {
		super(s);
	}

}

