package gestionBanquaire.q1_2;

public class Compte {
	
	private int solde;
	

	public Compte(int montant) {
		// TODO Auto-generated constructor stub
		
		solde = montant;
		
	}
	
	
	
	
	
	public int getSolde() {
		return solde;
	}





	public void setSolde(int solde) {
		this.solde = solde;
	}




	/* Ajout du montant en parametre */
	public void depotDe(int montant)
	{
		this.setSolde(this.getSolde()+montant);
	}
	
	
	/* retrait du montant en parametre */
	public void retraitDe(int montant)
	{
		this.setSolde(this.getSolde()-montant);
	}
}
