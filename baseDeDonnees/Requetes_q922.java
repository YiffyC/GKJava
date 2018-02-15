package baseDeDonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Requetes_q922 {
	
	public static void main(String args[])
	{
	//Pilote
	
	try {
		
		//Chargement pilote dans la JVM
		
		Class.forName("com.mysql.jdbc.Driver"); //chargement statique
		
		String URL = "jdbc:mysql://localhost:3306/basesql";
		
		//Obtention d'une connexion sur la base basesql du serveur local MYSQL
		Connection connect = DriverManager.getConnection(URL, "root", "");
		
		connect.setAutoCommit(false); //desactiver les autocommits
		
		
		//creation de la requete en lecture
		Statement requete = connect.createStatement();
		
		
		//envoi ordre sql
		// select --> executeQuerry  // autre --> executeUpdate
		String sql = "update ingenieur set ville='MONTGERON'  where mle=753";
		
		String sql2 = "select ville from ingenieur where ville='MONTGERON'";
		System.out.println("Affiche mle, nom, ntel, datn");
		//next() mets un pointeur sur la table tmp, lit, puis pointe sur le suivant
		int nbVilles = requete.executeUpdate(sql);
		System.out.println(nbVilles);
		
		ResultSet resu2 = requete.executeQuery(sql2);
		while(resu2.next())
		{
			String ville = resu2.getString("ville");
			System.out.println( ville);
			System.out.println("//");
		
		}
		
		connect.rollback();
		
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
