package gestionBanquaire.q1_3;

public class Compte {
	
	
	//init
	private double sommeDepots, sommeRetraits;






	public Compte() {
		// TODO Auto-generated constructor stub
		
		sommeDepots = 0;
		sommeRetraits = 0;
		
	}
	
	
	
	
	
	// get set
	
	
	
	public double getSommeDepots() {
		return sommeDepots;
	}





	public void setSommeDepots(double sommeDepots) {
		this.sommeDepots = sommeDepots;
	}





	public double getSommeRetraits() {
		return sommeRetraits;
	}





	public void setSommeRetraits(double sommeRetraits) {
		this.sommeRetraits = sommeRetraits;
	}

	

	/* Ajout du montant en parametre */
	public void depotDe(double montant)
	{
		this.setSommeDepots(this.getSommeDepots()+montant);
	}
	
	
	/* retrait du montant en parametre */
	public void retraitDe(double montant)
	{
		this.setSommeRetraits(this.getSommeRetraits()+montant);
	}


	//retourne le solde actuel, soit depots- ce qui a ete retire
	public double getSolde()
	{
		return sommeDepots-sommeRetraits;
	}
}
