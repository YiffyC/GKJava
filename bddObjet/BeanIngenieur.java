package bddObjet;

import java.io.Serializable;
import java.util.Date;

public class BeanIngenieur implements Serializable
{
	int mle;
	String nom;
	String prenom;
	String noss;
	Date datnais;
	String notel;
	String adresse;
	String codpos;
	String ville;
	String sexe;
	String situatuion;
	double cpt;
	
	
	
	
	//getset
	public int getMle() {
		return mle;
	}
	public void setMle(int mle) {
		this.mle = mle;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNoss() {
		return noss;
	}
	public void setNoss(String noss) {
		this.noss = noss;
	}
	public Date getDatnais() {
		return datnais;
	}
	public void setDatnais(Date datnais) {
		this.datnais = datnais;
	}
	public String getNotel() {
		return notel;
	}
	public void setNotel(String notel) {
		this.notel = notel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodpos() {
		return codpos;
	}
	public void setCodpos(String codpos) {
		this.codpos = codpos;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getSituatuion() {
		return situatuion;
	}
	public void setSituatuion(String situatuion) {
		this.situatuion = situatuion;
	}
	public double getCpt() {
		return cpt;
	}
	public void setCpt(double cpt) {
		this.cpt = cpt;
	}
	
	
	
	
}
