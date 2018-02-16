/*
 * Créé le 9 nov. 06
 *
 * Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre&gt;Préférences&gt;Java&gt;Génération de code&gt;Code et commentaires
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

		// Récupération de la bonne DAO Factory
		DAOFactory maFactory = DAOFactory
				.getDAOFactory(DAOFactory.TypeDAO.MSACCESS);

		// Création du DAO Ingénieur
		IngenieurDAO ingDAO = maFactory.getIngenieurDAO();

		// Création d'une date
		GregorianCalendar unCalendrier = new GregorianCalendar(1961, 06, 21);
		Date laDatNais = unCalendrier.getTime();

		// Insère un ingénieur
		unIngenieur = new Ingenieur(mle, "FLAG ", "Alain ", laDatNais,
				"LA COMTE ");
		
		
		try{
				
			ingDAO.createIngenieur(unIngenieur);
		
		}
		catch(DAOException e)
		{
			System.out.println("pb insertion");
		}
		
		
		
		
		TestDAO.afficheIngenieur("création de " + mle, unIngenieur);

		// Recherche d'un ingénieur
		unIngenieur = ingDAO.findIngenieur(286);
		TestDAO.afficheIngenieur("recherche du 286 ", unIngenieur);

		// Modif de la ville de ingénieur
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