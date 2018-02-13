package gestionBanquaire;

import java.time.LocalDate;

public class Mouvement {
	
	private double montant;
	private LocalDate date;
	private String type;
	

	public Mouvement(double montant, String type)
	{
		// TODO Auto-generated constructor stub
		this.montant = montant;
		this.type = type;
		this.date = LocalDate.now();
	
	}


	public double getMontant() {
		return montant;
	}



	public LocalDate getDate() {
		return date;
	}





	public String getType() {
		return type;
	}


	
	
	
	

}
