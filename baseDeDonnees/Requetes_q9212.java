package baseDeDonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Date;



public class Requetes_q9212 {

	public static void main(String args[])
	{
	//Pilote
	
	try {
		
		//Chargement pilote dans la JVM
		
		Class.forName("com.mysql.jdbc.Driver"); //chargement statique
		
		String URL = "jdbc:mysql://localhost:3306/basesql";
		
		//Obtention d'une connexion sur la base basesql du serveur local MYSQL
		Connection connect = DriverManager.getConnection(URL, "root", "");
		
		// connect.setAutoCommit(false); //desactiver les autocommits
		
		String sql = "select nom, prenom, datnais, mle, notel from ingenieur" + " where ville = ?";
		System.out.println(sql);
		//creation de la requete en lecture
		PreparedStatement requete = connect.prepareStatement(sql);
		
		
		//envoi ordre sql
		// select --> executeQuerry  // autre --> executeUpdate
		
		requete.setString(1, "PARIS");
		ResultSet resu = requete.executeQuery();
		
		
		System.out.println("Affiche mle, nom, ntel, datn -- PARIS");
		
		//next() mets un pointeur sur la table tmp, lit, puis pointe sur le suivant
		while(resu.next())
		{
			int mle = resu.getInt("mle");
			String ntel = resu.getString("notel");
			String nom = resu.getString("nom");
			String prenom = resu.getString("prenom");
			Date dateN = resu.getDate("datnais");
			
			
			if(ntel==null)
				System.out.println("L'ingenieur est : " + nom + " " + prenom + " né le " + dateN +" son MLE est : " + mle);
			else
			System.out.println("L'ingenieur est : " + nom + " " + prenom + " né le " + dateN +" son MLE est : " + mle + " Son numero de tel : " + ntel);
		
		}	
		
		
		/////LYON
		
		requete.setString(1, "LYON");
		ResultSet resu2 = requete.executeQuery();
		
		
		System.out.println("Affiche mle, nom, ntel, datn -- LYON");
		
		//next() mets un pointeur sur la table tmp, lit, puis pointe sur le suivant
		while(resu2.next())
		{
			int mle = resu2.getInt("mle");
			String ntel = resu2.getString("notel");
			String nom = resu2.getString("nom");
			String prenom = resu2.getString("prenom");
			Date dateN = resu2.getDate("datnais");
			
			
			if(ntel==null)
				System.out.println("L'ingenieur est : " + nom + " " + prenom + " né le " + dateN +" son MLE est : " + mle);
			else
			System.out.println("L'ingenieur est : " + nom + " " + prenom + " né le " + dateN +" son MLE est : " + mle + " Son numero de tel : " + ntel);
		
		
		}
		
		
		
		
	/////LYON
		
			requete.setString(1, "LILLE");
			ResultSet resu3 = requete.executeQuery();
			
			
			System.out.println("Affiche mle, nom, ntel, datn -- LILLE");
			
			//next() mets un pointeur sur la table tmp, lit, puis pointe sur le suivant
			while(resu3.next())
			{
				int mle = resu3.getInt("mle");
				String ntel = resu3.getString("notel");
				String nom = resu3.getString("nom");
				String prenom = resu3.getString("prenom");
				Date dateN = resu3.getDate("datnais");
				
				
				if(ntel==null)
					System.out.println("L'ingenieur est : " + nom + " " + prenom + " né le " + dateN +" son MLE est : " + mle);
				else
				System.out.println("L'ingenieur est : " + nom + " " + prenom + " né le " + dateN +" son MLE est : " + mle + " Son numero de tel : " + ntel);
			
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
