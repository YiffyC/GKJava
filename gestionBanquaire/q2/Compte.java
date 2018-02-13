package gestionBanquaire.q2;

public class Compte {
	
	
	//init
	private int iDep, iRet;
	private double Depots[], Retraits[];
	private double decouvert;






	public Compte() {
		// TODO Auto-generated constructor stub
		iDep = 0;
		iRet = 0;
		Depots = new double[20];
		Retraits = new double[20];
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
		this.Depots[iDep] = montant;
		iDep++;
	}
	
	
	/* retrait du montant en parametre 
	 * 
	 * si verifDecouvert est vraie on fait le retrait sinon non
	 * */
	public boolean retraitDe(double montant)
	{
		if(verifDecouvert(montant))
		{
			this.Retraits[iRet] = montant;
			iRet++;
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


	public double getDecouvert() {
		return decouvert;
	}

	
	
	

}
