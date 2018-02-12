package gestionBanquaire.q1_2;

public class TestCompte {

	public TestCompte() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//On teste les depots retraits 
		Compte c = new Compte(1000);
		c.retraitDe(100);
		c.depotDe(200);
		c.depotDe(400);
		
		// 1000 - 100 + 200 + 400 = 1500
		System.out.println(c.getSolde());
		
		
		
	}

}
