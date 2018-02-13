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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nbPattes;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nbPattes != other.nbPattes)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbPattes() {
		return nbPattes;
	}

	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}
	
	
	

}
