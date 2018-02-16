package dao;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;



public class TestDAOList {

	public static void main(String[] args) throws DAOException, SQLException {
		// Récupération de la bonne DAO Factory
		DAOFactory maFactory = DAOFactory
				.getDAOFactory(DAOFactory.TypeDAO.MSACCESS);
		// Creation du DAO Ingénieur
		IngenieurDAO ingDAO = maFactory.getIngenieurDAO();

		// Affichage de la liste
		Ingenieur unIngenieur;
		Collection listIngenieur = ingDAO.findAll();
		Iterator iter = listIngenieur.iterator();
		while (iter.hasNext()) {
			unIngenieur = (Ingenieur) iter.next();
			System.out.print(unIngenieur.getMle() + "\t");
			System.out.print(unIngenieur.getNom());
			System.out.print(unIngenieur.getPrenom());
			System.out.print(unIngenieur.getVille());
			System.out.print(unIngenieur.getDatNais());
			System.out.println();

		}
	}
}