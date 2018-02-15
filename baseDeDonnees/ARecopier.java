package baseDeDonnees;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ARecopier {

	public static void main(String[] args)
	{
		//Pilote
		
		try {
			
			//Chargement pilote dans la JVM
			
			Class.forName("com.mysql.jdbc.Driver"); //chargement statique
			
			String URL = "jdbc:mysql://localhost:3306/basesql";
			
			//Obtention d'une connexion sur la base basesql du serveur local MYSQL
			Connection connect = DriverManager.getConnection(URL, "root", "");
			
			// connect.setAutoCommit(false); //desactiver les autocommits
			
			
			//creation de la requete en lecture
			Statement requete = connect.createStatement();
			
			
			//envoi ordre sql
			// select --> executeQuerry  // autre --> executeUpdate
			String querry = "select * from ingenieur";
			ResultSet resu = requete.executeQuery(querry);
			
			
			
			System.out.println("Avant boucle");
			//next() mets un pointeur sur la table tmp, lit, puis pointe sur le suivant
			while(resu.next())
			{
				int mle = resu.getInt("mle");
				String nom = resu.getString("nom");
				String prenom = resu.getString("prenom");
				
				System.out.println("L'ingenieur est : " + nom + " " + prenom + " son MLE est : " + mle);
			}
			
			
			connect.close();
			
			
			
		
		}
		
		
		catch (ClassNotFoundException e) {
			
			System.out.println("Plantage driver : " + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Plantage connexion : " + e.getMessage());
		}
		
		
		
		
		
		
	}

}
