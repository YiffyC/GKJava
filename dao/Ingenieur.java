/*
 * Créé le 9 nov. 06
 *
 * Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre&gt;Préférences&gt;Java&gt;Génération de code&gt;Code et commentaires
 */
package dao;
import java.util.Date;

/**
 * @author Administrateur
 *
 * Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre&gt;Préférences&gt;Java&gt;Génération de code&gt;Code et commentaires
 */
public class Ingenieur {
	private int mle ;
	private String nom;
	private String prenom;
	private Date datNais;
	private String ville;	

	public Ingenieur() {
		mle = 0; 
		nom = null; 
		prenom = null; 
		datNais = null;
		ville = null;	
	}

	public Ingenieur(int unMle, String unNom, String unPrenom, Date uneDatNais, String uneVille) {
		mle = unMle; 
		nom = unNom; 
		prenom = unPrenom; 
		datNais = uneDatNais;
		ville = uneVille;	
	}

	
	public Date getDatNais() {
		return datNais;
	}

	public int getMle() {
		return mle;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setDatNais(Date date) {
		datNais = date;
	}

	public void setMle(int decimal) {
		mle = decimal;
	}
	public void setNom(String string) {
		nom = string;
	}

	public void setPrenom(String string) {
		prenom = string;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String string) {
		ville = string;
	}
	public String toString()
	{  
	   return getClass().getName()
		  + "[mle =" + mle
		  + ",nom =" + nom.trim()
		  + ",prénom =" + prenom.trim()
		  + ",datNais=" + datNais
		  + ",ville=" + ville.trim()
		  + "]";
	}

}
