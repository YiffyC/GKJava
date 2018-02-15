package baseDeDonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Requetes_q921
{
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
		
		
		//creation de la requete en lecture
		Statement requete = connect.createStatement();
		
		
		//envoi ordre sql
		// select --> executeQuerry  // autre --> executeUpdate
		String sql = "select * from ingenieur order by mle";
		ResultSet resu = requete.executeQuery(sql);
		
		
		System.out.println("Affiche mle, nom, ntel, datn");
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
