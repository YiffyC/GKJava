package gestionBanquaire.q4_4;

import java.util.Vector;

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
		System.out.println("Apres retrait 400 c1 (=1600): " + c.getSommeDepots());
		c.retraitDe(200);
		System.out.println("Apres retrait 200 c1 (=1600): " + c.getSommeDepots());
		
		// 1000 + 500 + 100 + 500 - 600 = 1000
		// dep : 1600
		// ret : 600
		System.out.println("Total FINAL depot c1 (=1600): " + c.getSommeDepots());
		System.out.println("Total retrait c1 (=600) : " + c.getSommeRetraits());
		System.out.println("Total c1 (=1000): " + c.getSolde());
		
		c2.retraitDe(50);		
		c2.retraitDe(5);
		retraitVisuel(c2, 5);
		System.out.println("c2 (-60) : " + c2.getSolde());
		
		
		System.out.println("------- TEST ------");
		//Vector<Mouvement> v = c.getMouvements();

		
		
		


	}
	
	
	
	//permet de faire une retrait tout en affichant si le retrait c'est effectué ou pas
	static void retraitVisuel(Compte c, double montant)
	{
		if(c.retraitDe(montant))
			System.out.println("Retrait OK");
		else
			System.out.println("Retrait KO");
	}
	


}
