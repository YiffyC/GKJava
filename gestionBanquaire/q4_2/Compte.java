package gestionBanquaire.q4_2;

import java.time.LocalDate;
import java.util.Vector;

public class Compte {
	
	
	//init
	//private Vector<Double> Depots, Retraits; //Deux vecteurs de Double
	private Vector<Mouvement> mouvements;
	private double decouvert;
	
	
	public Compte()
	{
		// TODO Auto-generated constructor stub
		mouvements = new Vector<Mouvement>();
		decouvert = 0;
		
		
		
		
	}
	
	
	//constructeur qui permet d'autoriser un decouvert
	public Compte(double decouvert)
	{
		this();
		this.decouvert = decouvert;
	}
	
	
	
	//methodes
	

	/* Ajout du montant en parametre */
	public void depotDe(double montant)
	{
		this.mouvements.addElement(new Mouvement(montant, "Depot"));
		
	}
	
	
	/* retrait du montant en parametre 
	 * 
	 * si verifDecouvert est vraie on fait le retrait sinon non
	 * */
	public boolean retraitDe(double montant)
	{
		if(verifDecouvert(montant))
		{
			this.mouvements.addElement(new Mouvement(montant, "Retrait"));
			return true;
		}
		
		else return false;
		
	}


	//retourne le solde actuel, soit depots- ce qui a ete retire
	public double getSolde()
	{
		return getSommeDepots()-getSommeRetraits();
	}
	

	
	//Si le montant du decouvert + le solde est > quele montant retire alors vrai sinon faux
	private boolean verifDecouvert(double montant)
	{
		if( (this.getDecouvert() + this.getSolde() ) >= montant)
		{
			return true;
		}
		
		else return false;
	}
	
	
	
	// get set
	
	
	
	public double getSommeDepots()
	{		
		double total = 0;
		for (Mouvement m : mouvements) {
			if(m.getType().equals("Depot"))
			total = total + m.getMontant();
		}
		return total;
	}





	public double getSommeRetraits()
	{		
		double total = 0;
		for (Mouvement m : mouvements) {
			if(m.getType().equals("Retrait"))
			total = total + m.getMontant();
		}
		return total;
	}
	


	public double getDecouvert()
	{		
		return decouvert;
	}


}
