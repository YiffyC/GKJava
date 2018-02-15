package bddObjet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestBddObjet
{
	public static void main (String args[])
	{
		
		IngenieurSQL i = new IngenieurSQL();

		System.out.println(i.getNom() + " " + i.getPrenom());
		
		
		
		i.setIngenieurFromDb(i, 25);
		
		System.out.println(i.getNom() + " " + i.getPrenom() + " " + i.getVille());
	}
	
}
