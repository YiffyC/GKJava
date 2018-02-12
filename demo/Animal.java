package demo;

public class Animal {
	
	private String nom;
	private int nbPattes;

	public Animal() {
		// TODO Auto-generated constructor stub
		nom = "Quadripede";
		nbPattes = 4;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", nbPattes=" + nbPattes + "]";
	}

}
