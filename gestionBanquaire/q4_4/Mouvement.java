package gestionBanquaire.q4_4;

import java.time.LocalDate;

public abstract class Mouvement {
	
	private double montant;
	private LocalDate date;
	

	public Mouvement(double montant)
	{
		// TODO Auto-generated constructor stub
		this.montant = montant;
		this.date = LocalDate.now();
	
	}

	public double getPlus()
	{
		return 0;
	}

	public double getMoins()
	{
		return 0;
	}
	
	

	public double getMontant() {
		return montant;
	}



	public LocalDate getDate() {
		return date;
	}
	

	

}
