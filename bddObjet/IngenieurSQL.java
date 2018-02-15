package bddObjet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class IngenieurSQL extends BeanIngenieur
{
	public IngenieurSQL()
	{
		super();		
	}

	
	
	
	public void setIngenieurFromDb(IngenieurSQL i, int mle)
	{

		
		try {
			
			//Chargement pilote dans la JVM
			
			Class.forName("com.mysql.jdbc.Driver"); //chargement statique
			
			String URL = "jdbc:mysql://localhost:3306/basesql";
			
			//Obtention d'une connexion sur la base basesql du serveur local MYSQL
			Connection connect = DriverManager.getConnection(URL, "root", "");
			
			// connect.setAutoCommit(false); //desactiver les autocommits
			
			String sql = "select * from ingenieur" + " where mle = ?";
			//creation de la requete en lecture
			PreparedStatement requete = connect.prepareStatement(sql);
			
			
			//envoi ordre sql
			// select --> executeQuerry  // autre --> executeUpdate
			
			requete.setInt(1, mle);
			ResultSet resu = requete.executeQuery();
			
			//next() mets un pointeur sur la table tmp, lit, puis pointe sur le suivant
			while(resu.next())
			{
				i.notel = resu.getString("notel");
				i.nom = resu.getString("nom");
				i.prenom = resu.getString("prenom");
				i.datnais = resu.getDate("datnais");
				i.noss = resu.getString("noss");
				i.adresse = resu.getString("adresse");
				i.codpos = resu.getString("codepost");
				i.ville = resu.getString("ville");
				i.sexe = resu.getString("sexe");
				i.situatuion = resu.getString("situation");
				i.cpt  = resu.getDouble("cpt"); 							
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
