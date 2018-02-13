package gestionBanquaire.q3;

import java.util.Vector;

public class Compte {
	
	
	//init
	private Vector<Double> Depots, Retraits; //Deux vecteurs de Double
	private double decouvert;

	
	
	public Compte()
	{
		// TODO Auto-generated constructor stub
		Depots = new Vector<Double>();
		Retraits = new Vector<Double>();
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
		this.Depots.addElement(montant);
	}
	
	
	/* retrait du montant en parametre 
	 * 
	 * si verifDecouvert est vraie on fait le retrait sinon non
	 * */
	public boolean retraitDe(double montant)
	{
		if(verifDecouvert(montant))
		{
			this.Retraits.addElement(montant);
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
		for (double d : Depots) {
			total = total + d;
		}
		
		return total;
	}





	public double getSommeRetraits()
	{		
		double total = 0;
		for (double d : Retraits)
		{
			total = total + d;
		}
		return total;
	}


	public double getDecouvert()
	{		
		return decouvert;
	}


}
