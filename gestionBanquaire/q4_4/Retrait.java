package gestionBanquaire.q4_4;

public class Retrait extends Mouvement {

	public Retrait(double montant) {
		super(montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMoins() {
		// TODO Auto-generated method stub
		return super.getMontant();
	}
	
	

}
