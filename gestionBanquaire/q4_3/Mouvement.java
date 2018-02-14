package gestionBanquaire.q4_3;

import java.time.LocalDate;

public class Mouvement {
	
	private double montant;
	private LocalDate date;
	

	public Mouvement(double montant)
	{
		// TODO Auto-generated constructor stub
		this.montant = montant;
		this.date = LocalDate.now();
	
	}


	public double getMontant() {
		return montant;
	}



	public LocalDate getDate() {
		return date;
	}

	


	
	
	
	

}
