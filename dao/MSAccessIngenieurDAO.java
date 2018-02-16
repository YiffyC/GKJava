/*
 * Créé le 9 nov. 06
 *
 * Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre&gt;Préférences&gt;Java&gt;Génération de code&gt;Code et commentaires
 */
package dao;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class MSAccessIngenieurDAO implements IngenieurDAO {
	final private String INSERT = "insert into ingenieur (mle, nom, prenom, datNais, ville) values ";

	final private String INSERTP = " (?, ?, ?, ?, ?)";

	final private String UPDATE = "update ingenieur set ville = " ;
	final private String UPDATEP =  " ? where mle = ? ";

	final private String DELETE = "delete from ingenieur where mle = " ; 
	final private String DELETEP = 	"? ";

	final private String FINDBYREFERENCE = "select mle, nom, prenom, datNais, ville"
			+ " from ingenieur where mle = ?";

	final private String FINDALL = "select mle, nom, prenom, datNais, ville"
			+ " from ingenieur ";

	public MSAccessIngenieurDAO() {
		// initialization
	}

	public Connection getConnexion() throws DAOException
	{
		Connection conn = null;
		try {
			conn = MSAccessDAOFactory.createConnection();
		} catch (SQLException e) {
			throw new DAOException("Connexion impossible.", e);
		}
		return conn;
	}

	public void closeConnexion(Connection conn) throws DAOException {
		try {
			conn.close();
		} catch (SQLException e) {
			throw new DAOException("Fermeture connexion incorrecte.", e);
		}
	}

	// A ecrire	
	/* public boolean deleteIngenieur(int unMle) throws DAOException {
		
	} */
	//
	
	
	public boolean updateIngenieur(int mle, String ville) throws DAOException {

		boolean retour = false;

		Connection conn = getConnexion();
		try 
		{
			conn.setAutoCommit(false);
			PreparedStatement pst = conn.prepareStatement(UPDATE + UPDATEP);
			pst.setString(1, ville);
			pst.setInt(2, mle);

			int nb = pst.executeUpdate();
			if (nb != 1) 
			{
				conn.rollback();
				throw new DAOException(
						"Erreur Update. Aucun ingénieur n'a la référence "
								+ mle);
			}
			conn.commit();
			retour = true;
		} catch (SQLException ex) {
			try 
			{
				conn.rollback();
			}
			catch (SQLException e2) 
			{
				throw new DAOException("Problème pendant le rollback.", e2);
			}
			throw new DAOException(ex);
		} finally {
			closeConnexion(conn);
		}
		return retour;
	}
	

	public int createIngenieur(Ingenieur unIngenieur) throws DAOException {
		int retour = -1;
		Connection conn = getConnexion();
		
		try {
			conn.setAutoCommit(false);
			PreparedStatement pst = conn.prepareStatement(INSERT + INSERTP);
			pst.setInt(1, unIngenieur.getMle());
			pst.setString(2, unIngenieur.getNom());
			pst.setString(3, unIngenieur.getPrenom());
			pst.setDate(4, Date.valueOf(dateToSqlValues(unIngenieur
					.getDatNais())));
			pst.setString(5, unIngenieur.getVille());
			pst.executeUpdate();
			conn.commit();
			retour = unIngenieur.getMle();
		} catch (SQLException e) {
			try {

				conn.rollback();
			} catch (SQLException e2) {
				throw new DAOException("Problème pendant le rollback.", e2);
			}
			
			if (e.getErrorCode() == -1605) {
				// clé primaire déjà existante
				throw new DAOException("Ingénieur de matricule "
						+ unIngenieur.getMle() + " existe déjà dans la base", e);
			} else {
				throw new DAOException("Problème SQL pour sauver " + e.getMessage(), e);
			}

		} finally {
			closeConnexion(conn);
		}

		return retour;
	}

	public Ingenieur findIngenieur(int mle) throws DAOException {
		Connection conn = getConnexion();
		try {
			PreparedStatement pst = conn.prepareStatement(FINDBYREFERENCE);
			pst.setInt(1, mle);
			ResultSet rset = pst.executeQuery();
			if (rset.next()) {
				return new Ingenieur(mle, rset.getString("nom"), rset
						.getString("prenom"), rset.getDate("datNais"), rset
						.getString("ville"));
			} else {
				throw new DAOException(
						"Erreur Find. Aucun Ingénieur avec la référence" + mle);
			}

		} catch (SQLException ex) {
			throw new DAOException(ex);
		} finally {
			closeConnexion(conn);
		}
	}

	public boolean deleteIngenieur(int mle) throws DAOException {

		boolean retour = false;

		Connection conn = getConnexion();
		try 
		{
			conn.setAutoCommit(false);
			PreparedStatement pst = conn.prepareStatement(DELETE + DELETEP);
			pst.setInt(1, mle);

			int nb = pst.executeUpdate();
			if (nb != 1) 
			{
				conn.rollback();
				throw new DAOException(
						"Erreur Update. Aucun ingénieur n'a la référence "
								+ mle);
			}
			conn.commit();
			retour = true;
		} catch (SQLException ex) {
			try 
			{
				conn.rollback();
			}
			catch (SQLException e2) 
			{
				throw new DAOException("Problème pendant le rollback.", e2);
			}
			throw new DAOException(ex);
		} finally {
			closeConnexion(conn);
		}
		return retour;
	}

	public Collection findAll() throws DAOException {
		Connection conn = getConnexion();
		try {
			//conn = MSAccessDAOFactory.createConnection();
			PreparedStatement pst = conn.prepareStatement(FINDALL);
			ResultSet rset = pst.executeQuery();
			return resultSetToCollection(rset);
		} catch (SQLException ex) {
			throw new DAOException(ex);
		} finally {
			closeConnexion(conn);
		}
	}

	private Collection resultSetToCollection(ResultSet rset)
			throws SQLException {

		Collection<Ingenieur> collection = new ArrayList<Ingenieur>();
		while (rset.next()) {
			Ingenieur unIngenieur = new Ingenieur(rset.getInt("mle"), rset
					.getString("nom"), rset.getString("prenom"), rset
					.getDate("datNais"), rset.getString("ville"));
			collection.add(unIngenieur);
		}
		return collection;
	}

	public static String dateToSqlValues(java.util.Date date) {
		Locale dbLocale = Locale.US;
		DateFormat df;
		if (dbLocale.equals(Locale.FRANCE)) {
			df = new SimpleDateFormat("dd-MM-yyyy");
		} else {
			df = new SimpleDateFormat("yyyy-MM-dd");
		}
		return df.format(date);
	}


}