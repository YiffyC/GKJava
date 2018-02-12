package gestionBanquaire;

public class TestCompte {

	public TestCompte() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//On teste les depots retraits 
		Compte c = new Compte();
		Compte c2 = new Compte(100);
		//on ouvre un comptede 1000
		
		c.depotDe(1000);
		c.depotDe(500);
		c.depotDe(100);
		c.retraitDe(400);
		c.retraitDe(200);
		
		// 1000 + 500 + 100 + 500 - 600 = 1000
		// dep : 1600
		// ret : 600
		System.out.println("Total depot 1600?  : " + c.getSommeDepots());
		System.out.println("Total retrait de 600 normal 1000 : " + c.getSommeRetraits());
		System.out.println("Total : " + c.getSolde());
		
		
		
		c2.retraitDe(50);		
		c2.retraitDe(5);
		retraitVisuel(c2, 5);
		System.out.println("c2 : " + c2.getSolde());
		
		
		

	

	}
	
	
	
	static void retraitVisuel(Compte c, double montant)
	{
		if(c.retraitDe(montant))
			System.out.println("Retrait Ok");
		else
			System.out.println("Retrait Ko");
	}
	

}
