/*
 * Cr�� le 9 nov. 06
 *
 * Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre&gt;Pr�f�rences&gt;Java&gt;G�n�ration de code&gt;Code et commentaires
 */
package dao;



import java.sql.SQLException;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Iterator;


public class TestDAO {

	public static void main(String[] args) throws DAOException, SQLException {
		Ingenieur unIngenieur;
		int mle = 1;

		// R�cup�ration de la bonne DAO Factory
		DAOFactory maFactory = DAOFactory
				.getDAOFactory(DAOFactory.TypeDAO.MSACCESS);

		// Cr�ation du DAO Ing�nieur
		IngenieurDAO ingDAO = maFactory.getIngenieurDAO();

		// Cr�ation d'une date
		GregorianCalendar unCalendrier = new GregorianCalendar(1961, 06, 21);
		Date laDatNais = unCalendrier.getTime();

		// Ins�re un ing�nieur
		unIngenieur = new Ingenieur(mle, "FLAG ", "Alain ", laDatNais,
				"LA COMTE ");
		
		
		try{
				
			ingDAO.createIngenieur(unIngenieur);
		
		}
		catch(DAOException e)
		{
			System.out.println("pb insertion");
		}
		
		
		
		
		TestDAO.afficheIngenieur("cr�ation de " + mle, unIngenieur);

		// Recherche d'un ing�nieur
		unIngenieur = ingDAO.findIngenieur(286);
		TestDAO.afficheIngenieur("recherche du 286 ", unIngenieur);

		// Modif de la ville de ing�nieur
		ingDAO.updateIngenieur(mle, "PARIS");
		unIngenieur = ingDAO.findIngenieur(mle);
		TestDAO.afficheIngenieur("modif du " + mle, unIngenieur);

		ingDAO.deleteIngenieur(1);
		//unIngenieur = ingDAO.findIngenieur(mle); //Test de si il est bien delete

		
	}

	public static void afficheIngenieur(String msg, Ingenieur unIngenieur)
			throws DAOException {
		System.out.println(msg);
		System.out.print(unIngenieur.getMle() + "\t");
		System.out.print(unIngenieur.getNom());
		System.out.print(unIngenieur.getPrenom());
		System.out.print(unIngenieur.getVille());
		System.out.print(unIngenieur.getDatNais());
		System.out.println();

	}
}