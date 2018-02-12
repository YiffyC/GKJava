package gestionBanquaire.q1_3;

public class TestCompte {

	public TestCompte() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//On teste les depots retraits 
		Compte c = new Compte();
		//on ouvre un comptede 1000
		
		c.depotDe(1000);
		c.depotDe(500);
		c.depotDe(100);
		c.retraitDe(600);
		
		
		// 1000 + 500 + 100 + 500 - 600 = 1000
		// dep : 1600
		// ret : 600
		System.out.println("Total depot : " + c.getSommeDepots());
		System.out.println("Total retrait : " + c.getSommeRetraits());
		System.out.println("Total : " + c.getSolde());
		
		
	}

}
