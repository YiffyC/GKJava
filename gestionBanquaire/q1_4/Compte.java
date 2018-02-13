package gestionBanquaire.q1_4;

public class Compte {
	
	
	//init
	private double sommeDepots, sommeRetraits;
	private double decouvert;






	public Compte() {
		// TODO Auto-generated constructor stub
		
		sommeDepots = 0;
		sommeRetraits = 0;
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
		this.sommeDepots = (this.getSommeDepots()+montant);
	}
	
	
	/* retrait du montant en parametre 
	 * 
	 * si verifDecouvert est vraie on fait le retrait sinon non
	 * */
	public boolean retraitDe(double montant)
	{
		if(verifDecouvert(montant))
		{
			this.sommeRetraits =this.getSommeRetraits()+montant;
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
	
	
	
	public double getSommeDepots() {
		return sommeDepots;
	}





	public double getSommeRetraits() {
		return sommeRetraits;
	}


	public double getDecouvert() {
		return decouvert;
	}

	
	
	

}
