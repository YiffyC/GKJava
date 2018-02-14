package gestionBanquaire.q4_4;

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
		this.getMouvements().addElement(new Depot(montant));
		
	}
	
	
	/* retrait du montant en parametre 
	 * 
	 * si verifDecouvert est vraie on fait le retrait sinon non
	 * */
	public boolean retraitDe(double montant)
	{
		if(verifDecouvert(montant))
		{
			this.getMouvements().addElement(new Retrait(montant));
			return true;
		}
		
		else return false;
		
		
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
	
	//retourne le solde actuel, soit depots- ce qui a ete retire
	public double getSolde()
	{
		double d = 0;
		double r = 0;
		
		for (Mouvement m : getMouvements())
		{
			if (m instanceof Retrait)
				r += m.getMontant();
			else
				d +=  m.getMontant();	
				
		}
		
		return d-r;
	}
	

	
	
	public double getSommeDepots()
	{		
		double total = 0;
		for (Mouvement m : getMouvements())
		{
			total += m.getPlus();
		}
		return total;
	}





	public double getSommeRetraits()
	{		
		double total = 0;
		for (Mouvement m : getMouvements())
		{
			total += m.getMoins();
		}
		return total;
	}
	


	public double getDecouvert()
	{		
		return decouvert;
	}


	public Vector<Mouvement> getMouvements() {
		return mouvements;
	}




}
